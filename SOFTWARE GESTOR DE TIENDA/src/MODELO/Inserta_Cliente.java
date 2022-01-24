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
 *Esta clase sirve para insertar una cliente nueva
 * @author german
 */




public class Inserta_Cliente  {
    
    Connection conexion;
    
/**
     * Se obtiene una conexión con la base de datos
     */


    public Inserta_Cliente() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para ejecutar la insercción del cliente
     * @param DNI DNI del cliente a registrar
     * @param nombre nombre del cliente a registrar
     * @param apellidos apellidos del cliente a registrar
     * @param telefono telefono del cliente a registrar
     * @param Calle Calle del cliente a registrar
     * @param numero numero del cliente a registrar
     * @param codigo_postal codigo postal del cliente a registrar
     * @param ciudad ciudad del cliente a registrar
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    public int Ejecuta_inserccion_cliente(String DNI, String nombre, String apellidos,
            String telefono, String Calle, String numero, String codigo_postal, String ciudad){
   
    
    int resultado_insercion=0;
    
    try {
        
    
    //INSERT INTO `clientes` (`DNI`, `NOMBRE`, `APELLIDOS`, `TELEFONO`, `CALLE`, `NUMERO`, `CODIGO POSTAL`, `CIUDAD`) 
        //VALUES ('42745125T', 'Lionel', 'Messi', '96879987', 'sdfsdf', '2', '3213', 'gijon');
     
     
       
  String insercion="INSERT INTO `clientes` (`DNI`, `NOMBRE`, `APELLIDOS`, `TELEFONO`, `CALLE`, `NUMERO`, `CODIGO POSTAL`, `CIUDAD`)"+ 
        "VALUES ('"+DNI+"', '"+nombre+"', '"+apellidos+"', '"+telefono+"', '"+Calle+"',"
          + " '"+numero+"', '"+codigo_postal+"', '"+ciudad+"')";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
