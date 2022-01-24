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
 * consistente en obtener el numero de registro de la ultima compra registrada
 * @author german
 */

public class Consulta_Ultimo_Registro_Compra {
    
    int ultimo_registro;
    
    
/**
    * Método para ejecutar la consulta descrita
    * @return objeto que encapsula el resultado de la consulta 
    */
    
     public int Ejecuta_Consulta(){
       
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT MAX(`REGISTRO COMPRA`) FROM `compra`";
          
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
            System.out.println("No hay registros de compras");
        }
        
        return ultimo_registro;
    }
    
    
    
}
