/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;




import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase sirve para realizar una consulta a la base de datos
 * consistente hacer una consulta de todos los datos de una tabla que se pasa por parametro
 * @author german
 */



public class Consulta_General {
    
    ResultSet resultado_consulta;
    
    public Consulta_General() {
    
        
    }
    
    /**
     * Método para ejecutar la consulta descrita
     * @param criterio tabla de la cual se quieren visualizar los datos
     * @return objeto que encapsula el resultado de la consulta
     */
    
    public ResultSet Ejecuta_Consulta(String criterio){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT * FROM "+criterio;
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
}

      
    
    
    

