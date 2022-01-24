/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase sirve para modificar un producto existente
 * @author german
 */



public class Modifica_Producto {
    
        Connection conexion;

/**
     * Se obtiene una conexión con la base de datos
     */

    public Modifica_Producto() {
        
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para modificar un producto existente
     * @param marco Formulario del cual se obtienen los datos del producto
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    public int Ejecuta_modificacion_producto(Formulario_Modifica_Producto marco){
    
    String codigo_barras=marco.getDesplegabel_selecciona_producto().getSelectedItem().toString();
    
    System.out.println(codigo_barras);
               
    String nombre=marco.getTexto_nombre().getText();
               

    String precio_compra=(String.format( "%.2f", Double.parseDouble(marco.getTexto_precio_compra().getText()))).replace(',', '.');
               
    String precio_venta=(String.format( "%.2f", Double.parseDouble(marco.getTexto_precio_venta().getText()))).replace(',', '.');
    
               
    String stock_inicial=marco.getTexto_stock_inicial().getText();
       
    String descripcion=marco.getTexto_descripcion().getText();
       
    String tipo_IVA_soportado=marco.getTipo_IVA_soportado().getSelectedItem().toString().replaceAll("%", "");
               
    String tipo_IVA_repercutido=marco.getTipo_IVA_repercutido().getSelectedItem().toString().replaceAll("%", "");
        
    
    String categoria="";
    

    if(marco.Nueva_categoria()){
    
        ResultSet datos_categoria=new Consulta_Categoria().Ejecuta_Consulta(marco.getTexto_nueva_categoria().getText());
        
        try {
            datos_categoria.next();
            categoria=String.valueOf(datos_categoria.getInt(1));
            
        } catch (SQLException ex) {
            Logger.getLogger(Modifica_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }else{
        
        categoria=String.valueOf(((Categoria)marco.getDesplegable_Categoria().getSelectedItem()).getId_Categoría());
    }
    

    
    int resultado_insercion=0;
    
    try {
        
 
       
        String modificacion="UPDATE `productos` SET `STOCK` = '"+stock_inicial+"', `NOMBRE` = '"+nombre+"', `DESCRIPCION` = '"+descripcion+"', `PRECIO COMPRA` = '"+precio_compra+"', `PRECIO VENTA` = '"+precio_venta+"'," +
  "`TIPO IVA SOPORTADO` = '"+tipo_IVA_soportado+"', `TIPO IVA REPERCUTIDO` = '"+tipo_IVA_repercutido+"', `CATEGORIA` = "+categoria+" WHERE `productos`.`CODIGO DE BARRAS` ="+codigo_barras+"";
       
  
       
            
       Statement generador_modificacion= conexion.createStatement();
        
       resultado_insercion= generador_modificacion.executeUpdate(modificacion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
}