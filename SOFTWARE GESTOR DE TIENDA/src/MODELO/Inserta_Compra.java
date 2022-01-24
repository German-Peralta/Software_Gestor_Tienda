/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase sirve para insertar una compra nueva y el detalle de productos de la misma
 * @author german
 */

public class Inserta_Compra {
    
    Connection conexion;
    
    /**
     * Se obtiene una conexión con la base de datos
     */
    
    public Inserta_Compra(){
    
    conexion= new Conexion_Base_Datos().getConexion();
    
    }
    /**
     * Este metodo ejecuta la inserción en la base de datos
     * @param numero_registro_compra numero de registro de la compra
     * @param proveedor CIF del proveedor de la compra
     * @param fecha fecha de la compra
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    
    public int Ejecuta_inseccion_compra(String numero_registro_compra,String proveedor, String fecha){
    
  
    
    int resultado_insercion=0;
    
    try {
        
        //INSERT INTO `compra` (`REGISTRO COMPRA`, `CIF`, `FECHA`, `ID_USUARIO`) VALUES ('25', 'A08191827', '2021-11-01', '1');
       
        String insercion="INSERT INTO `compra` (`REGISTRO COMPRA`,`CIF`,`FECHA`, `ID_USUARIO`) "
                + "VALUES ("+numero_registro_compra+", '"+proveedor+"','"+fecha+"',"+Usuario.getUsuario_en_curso().getId_usuario()+")";
            
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
     
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    /**
     * Este método sirve para insertar el detalle de la compra, es decir, el numero de compra y el producto que
     * se inserta en la misma, asi como la cantidad, el precio unitario y el tipo de IVA del producto
     * @param numero_registro_compra numero de registro de la compra
     * @param codigo_de_barras codigo de barras de producto que se inserta
     * @param cantidad cantidad del producto que se inserta
     * @param precio_unitario precio unitario e producto que se inserta
     * @param tipo_de_iva tipo de IVA del producto que se inserta
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    
     public int Ejecuta_inseccion_detalle_compra(String numero_registro_compra,String codigo_de_barras, String cantidad,
             String precio_unitario, String tipo_de_iva){
    
    
    
    int resultado_insercion=0;
    
    try {
        
        //INSERT INTO `detalle compra` (`REGISTRO COMPRA`,`CODIGO DE BARRAS`,`CANTIDAD`) VALUES (6, 1111,50)
       
        String insercion="INSERT INTO `detalle compra` (`REGISTRO COMPRA`,`CODIGO DE BARRAS`,`CANTIDAD`,`PRECIO UNITARIO`,`TIPO DE IVA`) "
                + "VALUES ("+numero_registro_compra+", "+codigo_de_barras+","+cantidad+","+precio_unitario+","+tipo_de_iva+")";
            
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
     
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
}
