/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Categoria;
import MODELO.Consulta_General;
import MODELO.Consulta_multitabla_producto_categoria;
import MODELO.Producto;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Producto;
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
public class Controlador_Formulario_Modifica_Producto_Inicio extends WindowAdapter {
    
     public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Modifica_Producto marco=(Formulario_Modifica_Producto)e.getSource();
        
        JComboBox Desplegable_selecciona_producto=marco.getDesplegabel_selecciona_producto();
        JComboBox Desplegable_selecciona_categoria=marco.getDesplegable_Categoria();
        

        ResultSet resultado_1=new Consulta_multitabla_producto_categoria().Ejecuta_Consulta();
        ResultSet resultado_2=new Consulta_General().Ejecuta_Consulta("categoria");

        try {
            
            while(resultado_1.next()){
                
                Categoria categoria= new Categoria(resultado_1.getInt(9), resultado_1.getString(11) );
                  
                Producto producto= new Producto(resultado_1.getString(1), resultado_1.getInt(2), resultado_1.getString(3), 
           resultado_1.getString(4), resultado_1.getDouble(5), resultado_1.getDouble(6), 
           resultado_1.getInt(7), resultado_1.getInt(8), categoria);
                
                Desplegable_selecciona_producto.addItem(producto);
               
                
            }
            
            resultado_1.close();
            
             while(resultado_2.next()){
                
                Categoria categoria= new Categoria(resultado_2.getInt(1), resultado_2.getString(2) );
               
                Desplegable_selecciona_categoria.addItem(categoria);
 
            }
            
            resultado_2.close();
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
}
