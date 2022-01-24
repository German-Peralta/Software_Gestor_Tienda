/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase se encarga de borrar un producto de la base de datos
 * @author GERMAN
 */
public class Borrar_Producto  {
    
    Connection conexion;
    /**
     * Constructor en el cual se genera una conexión con la base de datos
     */
    public Borrar_Producto() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    
    
    
    /**
     * Método para ejecutar el borrado de en la base de datos
     * @param codigo_de_barras codigo de barras del producto a borrar
     * @return 1 si el borrado fue exitoso, 0 cero si no pudo realizarse
     */
    public int Ejecuta_borrado_producto(String codigo_de_barras){
   

    int resultado_insercion=0;
    
    try {
        
    
    //DELETE FROM `productos` WHERE `productos`.`CODIGO DE BARRAS` = 654687321321
     
     
       
  String insercion="DELETE FROM `productos` WHERE `productos`.`CODIGO DE BARRAS` = "+codigo_de_barras+"";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}