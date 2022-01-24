/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Cliente;
import MODELO.Consulta_General;
import MODELO.Consulta_Ultimo_Registro_Venta;
import MODELO.Producto;
import VISTA.Formulario_Registro_Venta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Venta_Inicio extends WindowAdapter{
    
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Registro_Venta marco=(Formulario_Registro_Venta) e.getSource();
        
        JComboBox Desplegable_clientes=marco.getDesplegable_Clientes();
        JComboBox Desplegable_productos=marco.getDesplegable_Producto();
        JLabel Etiqueta_Registro_Compra=marco.getEtiqueta_Registro_Venta();
        
        int ultimo_registro=new Consulta_Ultimo_Registro_Venta().Ejecuta_Consulta();
       
        Etiqueta_Registro_Compra.setText(String.valueOf(ultimo_registro+1));
        
        Desplegable_clientes.removeAllItems();
        Desplegable_productos.removeAllItems();
        
        ResultSet resultado_1=new Consulta_General().Ejecuta_Consulta("clientes");
        ResultSet resultado_2=new Consulta_General().Ejecuta_Consulta("Productos");
       
    
        try {
            while(resultado_1.next()){
                
                Cliente cliente= new Cliente(resultado_1.getString(1), resultado_1.getString(2),resultado_1.getString(3));
                
                marco.getLista_clientes().add(cliente);
              
                Desplegable_clientes.addItem(cliente.getDNI());
                
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
