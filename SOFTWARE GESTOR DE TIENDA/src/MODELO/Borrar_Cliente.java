/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase se encarga de borrar un producto de la base de datos
 * @author GERMAN
 */
public class Borrar_Cliente {
    
    Connection conexion;
    /**
     * Constructor en el cual se genera una conexión con la base de datos
     */
    public Borrar_Cliente() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    /**
     * Método para ejecutar el borrado de en la base de datos
     * @param dni DNI de cliente a borrar
     * @return 1 si el borrado fue exitoso, 0 cero si no pudo realizarse
     */
    public int Ejecuta_borrado_cliente(String dni){
   

    int resultado_insercion=0;
    
    try {
        
    
    
     
     
       
  String insercion="DELETE FROM `clientes` WHERE `clientes`.`DNI` = '"+dni+"'";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
