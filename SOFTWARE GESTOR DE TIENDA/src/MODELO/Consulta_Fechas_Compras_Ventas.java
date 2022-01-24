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
 * consistente en obtener todos los años en los cuales se han producido compras o ventas
 * @author german
 */


public class Consulta_Fechas_Compras_Ventas {
    
    ResultSet resultado_consulta;
    
    public Consulta_Fechas_Compras_Ventas() {
    
        
        
    }
    
    
    
    /**
     * Método que ejecuta la consulta descrita
     * @return objeto que encapsula el resultado de la consulta
     */
    
    public ResultSet Ejecuta_Consulta(){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT YEAR(`compra`.FECHA) FROM compra "+ 
                            "UNION "+
                            "SELECT YEAR(`venta`.FECHA) FROM venta";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    

}