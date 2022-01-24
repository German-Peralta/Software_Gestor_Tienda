/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase sirve para insertar una venta nueva y el detalle de productos de la misma
 * @author german
 */




public class Inserta_Venta {
    
    Connection conexion;
    
/**
     * Se obtiene una conexión con la base de datos
     */

    public Inserta_Venta(){
    
    conexion= new Conexion_Base_Datos().getConexion();
    
    }
    
    /**
     * Este metodo ejecuta la inserción en la base de datos
     * @param numero_registro_venta numero de registro de la venta
     * @param cliente DNI del cliente de la venta
     * @param fecha fecha de la venta
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    
    public int Ejecuta_inseccion_venta(String numero_registro_venta,String cliente, String fecha){
    
  
    
    int resultado_insercion=0;
    
    try {
        
       
       
        String insercion="INSERT INTO `venta` (`REGISTRO VENTA`,`DNI`,`FECHA`, `ID_USUARIO`) "
                + "VALUES ("+numero_registro_venta+", '"+cliente+"','"+fecha+"',"+Usuario.getUsuario_en_curso().getId_usuario()+")";
            
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
     
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    /**
     * Este método sirve para insertar el detalle de la venta, es decir, el numero de venta y el producto que
     * se inserta en la misma, asi como la cantidad, el precio unitario y el tipo de IVA del producto
     * @param numero_registro_venta numero de registro de la venta
     * @param codigo_de_barras codigo de barras de producto que se inserta
     * @param cantidad cantidad del producto que se inserta
     * @param precio_unitario precio unitario e producto que se inserta
     * @param tipo_de_iva tipo de IVA del producto que se inserta
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    
     public int Ejecuta_inseccion_detalle_venta(String numero_registro_venta,String codigo_de_barras, String cantidad,
             String precio_unitario, String tipo_de_iva){
    
    
    
    int resultado_insercion=0;
    
    try {
        
        //INSERT INTO `detalle compra` (`REGISTRO COMPRA`,`CODIGO DE BARRAS`,`CANTIDAD`) VALUES (6, 1111,50)
       
        String insercion="INSERT INTO `detalle venta` (`REGISTRO VENTA`,`CODIGO DE BARRAS`,`CANTIDAD`,`PRECIO UNITARIO`,`TIPO DE IVA`) "
                + "VALUES ("+numero_registro_venta+", "+codigo_de_barras+","+cantidad+","+precio_unitario+","+tipo_de_iva+")";
            
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
     
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
}
