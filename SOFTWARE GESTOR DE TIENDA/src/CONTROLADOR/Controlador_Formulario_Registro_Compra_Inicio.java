/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Compra_Inicio extends WindowAdapter{
    
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Registro_Compra marco=(Formulario_Registro_Compra)e.getSource();
        
        JComboBox Desplegable_proveedores=marco.getDesplegable_Proveedores();
        JComboBox Desplegable_productos=marco.getDesplegable_Producto();
        JLabel Etiqueta_Registro_Compra=marco.getNumero_Registro_Compra();
        
        int ultimo_registro=new Consulta_Ultimo_Registro_Compra().Ejecuta_Consulta();
       
        Etiqueta_Registro_Compra.setText(String.valueOf(ultimo_registro+1));
        
        Desplegable_proveedores.removeAllItems();
        Desplegable_productos.removeAllItems();
        
        ResultSet resultado_1=new Consulta_General().Ejecuta_Consulta("Proveedores");
        ResultSet resultado_2=new Consulta_General().Ejecuta_Consulta("Productos");
       
    
        try {
            while(resultado_1.next()){
                
                Proveedor proveedor= new Proveedor(resultado_1.getString(1), resultado_1.getString(2));
                
                marco.getLista_proveedores().add(proveedor);
              
                Desplegable_proveedores.addItem(proveedor.getCIF());
                
            }
            
            resultado_1.close();
            
            while(resultado_2.next()){
               
                Producto producto= new Producto(resultado_2.getString(1), resultado_2.getString(3),resultado_2.getDouble(5), resultado_2.getInt(7));
         
                marco.getLista_productos().add(producto);             
   
                Desplegable_productos.addItem(producto.getCodigo_de_barras());
                
            }
             resultado_2.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
    
}
