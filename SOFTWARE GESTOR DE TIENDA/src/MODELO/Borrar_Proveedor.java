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
 *Esta clase se encarga de borrar un proveedor de la base de datos
 * @author GERMAN
 */
public class Borrar_Proveedor {
    
    Connection conexion;
    /**
     * Constructor en el cual se genera una conexión con la base de datos
     */
    public Borrar_Proveedor() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    /**
     * Método para ejecutar el borrado de en la base de datos
     * @param cif CIF del proveedor a borrar
     * @return 1 si el borrado fue exitoso, 0 cero si no pudo realizarse
     */
    public int Ejecuta_borrado_proveedor(String cif){
   

    int resultado_insercion=0;
    
    try {
        
    
    
     
     
       
  String insercion="DELETE FROM `proveedores` WHERE `proveedores`.`CIF` = '"+cif+"'";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
