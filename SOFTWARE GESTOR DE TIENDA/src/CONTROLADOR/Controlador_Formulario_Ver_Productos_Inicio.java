/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Productos_Inicio extends WindowAdapter{
    
  
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Ver_Productos marco=(Formulario_Ver_Productos)e.getSource();
       
        
        //TABLA
        
        JTable tabla_productos=(JTable) marco.getTabla_productos();
        
        DefaultTableModel modelo_datos_tabla=(DefaultTableModel) tabla_productos.getModel();
        
        
        ResultSet resultado=new Consulta_General().Ejecuta_Consulta("Productos");
       
       
        int numero_filas=0;
            
        try {
            
            while(resultado.next()){
               
                Producto producto= new Producto(resultado.getString(1), resultado.getInt(2),
                        resultado.getString(3), resultado.getString(4));
                
                numero_filas++;
                
                modelo_datos_tabla.addRow(new Object[]{producto.getCodigo_de_barras(),producto.getNombre(),
                   String.valueOf(producto.getStock()),producto.getDescripcion()});
           
            }
            
            resultado.close();
            
            tabla_productos.setPreferredSize(new Dimension(450,numero_filas*16 ));
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Ver_Productos_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
      
        
        
        
       
       
       
      
    
    }
    
    
    
}
