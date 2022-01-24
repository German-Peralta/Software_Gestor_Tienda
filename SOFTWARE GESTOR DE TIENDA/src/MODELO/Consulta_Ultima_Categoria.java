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
 * consistente en obtener el id de la ultima categoria registrada
 * @author german
 */


public class Consulta_Ultima_Categoria {
    
      int ultimo_registro;
    
      
/**
    * Método para ejecutar la consulta descrita
    * @return objeto que encapsula el resultado de la consulta 
    */
      
     public int Ejecuta_consulta(){
       
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT MAX(`ID_CATEGORIA`) FROM `categoria`";
          
            Statement generador_consultas= conexion.createStatement();
            
            ResultSet resultado_consulta=generador_consultas.executeQuery(consulta);
            
            resultado_consulta.next();
            
            resultado_consulta.getString(1);
            
            if(resultado_consulta.wasNull()){
            
            ultimo_registro=0;
            
            }else{
            ultimo_registro=Integer.parseInt(resultado_consulta.getString(1));
            }
            
        } catch (SQLException ex) {
            System.out.println("No hay categorias registradas");
        }
        
        return ultimo_registro;
    }
    
    
}
