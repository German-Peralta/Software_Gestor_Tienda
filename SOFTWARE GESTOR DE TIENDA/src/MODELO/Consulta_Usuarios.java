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
 * consistente en obtener todos los usuarios registrados
 * @author german
 */

public class Consulta_Usuarios {
    
    ResultSet resultado_consulta;
    

    /**para ejecutar la consulta descrita
     * 
     * @param criterio nombre del usuario del cual se quiere obtener los datos
     * @return objeto que encapsula el resultado de la consulta
     */
    
    public ResultSet Ejecuta_Consulta(String criterio){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            
            
            String consulta="SELECT * FROM `usuario` WHERE `NOMBRE_USUARIO`='"+criterio+"'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    
    
}
