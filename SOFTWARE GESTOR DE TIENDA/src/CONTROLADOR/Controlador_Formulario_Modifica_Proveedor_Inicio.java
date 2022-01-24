/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_General;
import MODELO.Proveedor;
import VISTA.Formulario_Modifica_Proveedor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author german
 */
public class Controlador_Formulario_Modifica_Proveedor_Inicio extends WindowAdapter {
    
     public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Modifica_Proveedor marco=(Formulario_Modifica_Proveedor)e.getSource();
        
        JComboBox Desplegable_selecciona_proveedor=marco.getDesplegable_CIF();
       
        

     
        ResultSet resultado_1=new Consulta_General().Ejecuta_Consulta("proveedores");

        try {
            
            while(resultado_1.next()){
                
               Proveedor proveedor= new Proveedor(resultado_1.getString(1), resultado_1.getString(2), 
               resultado_1.getInt(3), resultado_1.getString(4), resultado_1.getString(5), 
               resultado_1.getInt(6), resultado_1.getInt(7), resultado_1.getString(8));
                  
              
                
                Desplegable_selecciona_proveedor.addItem(proveedor);
               
                
            }
            
           
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
}

