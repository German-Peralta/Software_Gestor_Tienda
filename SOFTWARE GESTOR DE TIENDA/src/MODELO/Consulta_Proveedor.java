/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * consistente en obtener los datos de un proveedor en concreto
 * @author german
 */


public class Consulta_Proveedor  {
    
    ResultSet resultado_consulta;
    
     /**
      * Método para ejecutar la consulta descrita
      * @param criterio numero del CIF del proveedor del que se quieren ver los datos
      * @return objeto que encapsula el resultado de la consulta 
      */
    
    public ResultSet Ejecuta_Consulta(String criterio){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            
            
            String consulta="SELECT * FROM `proveedores` WHERE `CIF`='"+criterio+"'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    
    
}
