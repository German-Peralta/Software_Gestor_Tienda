/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Consulta_Fechas_Compras_Ventas;
import MODELO.Consulta_General;
import MODELO.Consulta_Ultimo_Registro_Compra;
import MODELO.Producto;
import MODELO.Proveedor;
import VISTA.Formulario_Liquidacion_IVA;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Liquidacion_IVA_Inicio extends WindowAdapter{
    
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Liquidacion_IVA marco=(Formulario_Liquidacion_IVA)e.getSource();
        
        JComboBox Desplegable_fecha=marco.getDesplegable_año();

        ResultSet resultado_1=new Consulta_Fechas_Compras_Ventas().Ejecuta_Consulta();
       
        try {
            
            while(resultado_1.next()){

                Desplegable_fecha.addItem(resultado_1.getString(1));
  
            }
            
            resultado_1.close();
                 
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
    
}
