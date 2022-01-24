/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import VISTA.Formulario_Registro_Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author german
 */
public class Inserta_Producto {
    /**
 *Esta clase sirve para insertar una producto nuevo
 * @author german
 */




    
    Connection conexion;

/**
     * Se obtiene una conexión con la base de datos
     */
    public Inserta_Producto() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para ejecutar la insercción del usuario
     * @param marco Formulario del cual se obtienen los datos del producto
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    public int Ejecuta_inseccion_producto(Formulario_Registro_Producto marco){
    
    String codigo_barras=marco.getTexto_codigo_barras().getText();
               
    String nombre=marco.getTexto_nombre().getText();
               
    
    
    String precio_compra=(String.format( "%.2f", Double.parseDouble(marco.getTexto_precio_compra().getText()))).replace(',', '.');
               
    String precio_venta=(String.format( "%.2f", Double.parseDouble(marco.getTexto_precio_venta().getText()))).replace(',', '.');
    
               
    String stock_inicial=marco.getTexto_stock_inicial().getText();
       
    String descripcion=marco.getTexto_descripcion().getText();
       
    String tipo_IVA_soportado=marco.getTipo_IVA_soportado().getSelectedItem().toString().replaceAll("%", "");
               
    String tipo_IVA_repercutido=marco.getTipo_IVA_repercutido().getSelectedItem().toString().replaceAll("%", "");
        
    String categoria = null;
    
    if(marco.getPanel_Nueva_Categoria().isVisible()){
    
      ResultSet resultado= new Consulta_Categoria().Ejecuta_Consulta(marco.getTexto_nueva_categoria().getText());
      
        try {
            resultado.next();
            Categoria nueva_categoria=new Categoria(resultado.getInt(1),resultado.getString(2));
             categoria=String.valueOf(nueva_categoria.getId_Categoría());
             
        } catch (SQLException ex) {
            Logger.getLogger(Inserta_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
    }else{
    
    categoria=String.valueOf(((Categoria)marco.getDesplegable_Categoria().getSelectedItem()).getId_Categoría());
    }
    
    
   
    System.out.println(categoria);
    
    
    int resultado_insercion=0;
    
    try {
        
        
       
        String insercion="INSERT INTO `productos` (`CODIGO DE BARRAS`, `STOCK`, `NOMBRE`, `DESCRIPCION`, "
                + "`PRECIO COMPRA`, `PRECIO VENTA`," 
                +  "`TIPO IVA SOPORTADO`, `TIPO IVA REPERCUTIDO`,`CATEGORIA`) "
                + "VALUES "
                + "('"+codigo_barras+"', '"+stock_inicial+"', '"+nombre+"', '"+descripcion+"',"
                + "'"+precio_compra+"', '"+precio_venta+"', '"+tipo_IVA_soportado+"', "
                + "'"+tipo_IVA_repercutido+"','"+categoria+"')";
            
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
    
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
}
