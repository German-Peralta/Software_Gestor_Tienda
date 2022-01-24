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
 *Esta clase sirve para insertar una usuario nuevo
 * @author german
 */


public class Inserta_Usuario  {
    
    Connection conexion;
    
/**
     * Se obtiene una conexión con la base de datos
     */

    public Inserta_Usuario() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para ejecutar la insercción del usuario
     * @param id_usuario id del usario a registrar
     * @param nombre_usuario nombre del usuario a registrar
     * @param contraseña contraseña del usuario a registrar
     * @param tipo_usuario tipo de usuario  del usuario a registrar
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    public int Ejecuta_inserccion_usuario(int id_usuario, String nombre_usuario,String contraseña,int tipo_usuario){
   
    
    int resultado_insercion=0;
    
    try {
        
    
     
     
       
  String insercion="INSERT INTO `usuario` (`ID_USUARIO`, `NOMBRE_USUARIO`, `CONTRASEÑA`, `ID_TIPO_USUARIO`) "+
                    "VALUES ("+id_usuario+", '"+nombre_usuario+"', '"+contraseña+"', "+tipo_usuario+")";
     
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
