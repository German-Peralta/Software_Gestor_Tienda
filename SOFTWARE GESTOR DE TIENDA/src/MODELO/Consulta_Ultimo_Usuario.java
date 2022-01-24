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
 * consistente en obtener el numero de registro del ultimo usuario registrado
 * @author german
 */
public class Consulta_Ultimo_Usuario  {
    
    int ultimo_usuario;
    
    
/**
    * Método para ejecutar la consulta descrita
    * @return objeto que encapsula el resultado de la consulta 
    */
    
     public int Ejecuta_Consulta(){
       
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT MAX(ID_USUARIO) FROM usuario";
          
            Statement generador_consultas= conexion.createStatement();
            
            ResultSet resultado_consulta=generador_consultas.executeQuery(consulta);
            
            resultado_consulta.next();
            
            resultado_consulta.getString(1);

            if(resultado_consulta.wasNull()){
            
            System.out.println("fue null");
                
            ultimo_usuario=0;
            
            }else{
            
            ultimo_usuario=Integer.parseInt(resultado_consulta.getString(1));
            
            }
            
            
            
            resultado_consulta.close();
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ultimo_usuario;
    }
    
    
    
}

