/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase sirve para realizar una consulta a la base de datos
 * consistente en obtener de una categoría concreta
 * @author german
 */



public class Consulta_Categoria {
    
      ResultSet resultado_consulta;
    
   

/**
      * Método para ejecutar la consulta descrita
      * @param criterio Nombre de la categoría de la que se quieren ver los datos
      * @return objeto que encapsula el resultado de la consulta 
      */
    
    public ResultSet Ejecuta_Consulta(String criterio){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            
            
            String consulta="SELECT * FROM `categoria` WHERE `NOMBRE_CATEGORIA`='"+criterio+"'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            System.out.println("Fallo consulta");
        }
        
        return resultado_consulta;
    }
    
    
}
