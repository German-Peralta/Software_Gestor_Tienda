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
 *Esta clase sirve para insertar un proveedor nuevo
 * @author german
 */




public class Inserta_Proveedor  {
    
    Connection conexion;
    
/**
     * Se obtiene una conexión con la base de datos
     */


    public Inserta_Proveedor() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para ejecutar la insercción del proveedor
     * @param CIF CIF del proveedor a registrar 
     * @param Razon_Social Razon Social del proveedor a registrar
     * @param telefono telefono del proveedor a registrar
     * @param web web del proveedor a registrar
     * @param Calle Calle del proveedor a registrar
     * @param numero numero del  proveedor a registrar
     * @param codigo_postal  codigo postal del proveedor a registrar
     * @param ciudad ciudad del proveedor a registrar
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    public int Ejecuta_inserccion_proveedor(String CIF, String Razon_Social, String telefono,
            String web, String Calle, String numero, String codigo_postal, String ciudad){
   
    
    int resultado_insercion=0;
    
    try {
        
    
   //INSERT INTO `proveedores` (`CIF`, `RAZON SOCIAL`, `TELEFONO`, `WEB`, `CALLE`, `NUMERO`, `CODIGO POSTAL`, `CIUDAD`) 
   //VALUES ('asdfas', 'asdfsad', '234234', 'safdasdfsa', 'sdf', '23', '22331', 'sdf');
     
     
       
  String insercion="INSERT INTO `proveedores` (`CIF`, `RAZON SOCIAL`, `TELEFONO`, `WEB`, `CALLE`, `NUMERO`, `CODIGO POSTAL`, `CIUDAD`)"+ 
        "VALUES ('"+CIF+"', '"+Razon_Social+"', '"+telefono+"', '"+web+"', '"+Calle+"',"
          + " '"+numero+"', '"+codigo_postal+"', '"+ciudad+"')";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
