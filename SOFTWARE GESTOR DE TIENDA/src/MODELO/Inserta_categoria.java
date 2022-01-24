/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import VISTA.Formulario_Registro_Producto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase sirve para ejecutar una categoría nueva
 * @author german
 */
public class Inserta_categoria {
    
    Connection conexion;
    /**
     * Se obtiene una conexión con la base de datos
     */
    public Inserta_categoria() {
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este metodo ejecuta la inserción en la base de datos
     * @param categoria nombre de la categoría que se quiere insertar
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    
    public int Ejecuta_inserccion_categoria(String categoria){
   
    
    int resultado_insercion=0;
    
    try {
        
    
     
       int id_categoria= (new Consulta_Ultima_Categoria().Ejecuta_consulta())+1;
     
     
       
       String insercion="INSERT INTO `categoria` (`ID_CATEGORIA`, `NOMBRE_CATEGORIA`) VALUES ('"+id_categoria+"', '"+categoria+"')";
     

       
       
       Statement generador_insercion= conexion.createStatement();
        
       resultado_insercion= generador_insercion.executeUpdate(insercion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
    
    
    
    
    
    
}
