/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Compras_Totales;
import MODELO.Consulta_General;
import MODELO.Proveedor;
import VISTA.Formulario_Ver_Compras;
import VISTA.Formulario_Ver_Proveedores;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author german
 */
public class Controlador_Formulario_Ver_Compras_Inicio extends WindowAdapter{
    
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Ver_Compras marco=(Formulario_Ver_Compras)e.getSource();
        
        JTable tabla_productos=(JTable) marco.getTabla_informe_compras();
        
        DefaultTableModel modelo_datos_tabla=(DefaultTableModel) tabla_productos.getModel();
           
        ResultSet resultado=new Consulta_Compras_Totales().Ejecuta_Consulta();
            
        try {
            
            int numero_filas=0;
            
            while(resultado.next()){
               
                modelo_datos_tabla.addRow(new Object[]{resultado.getString(1),
                resultado.getString(2),
                resultado.getString(3),
                resultado.getString(4),
                resultado.getString(5),
                resultado.getString(6)});
                
               numero_filas++;
                
           
            }
            
            tabla_productos.setPreferredSize(new Dimension(450,numero_filas*16 ));
            
            resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Ver_Proveedores_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
      
        
        
        
       
       
       
      
    
    }
    
    
    
}
