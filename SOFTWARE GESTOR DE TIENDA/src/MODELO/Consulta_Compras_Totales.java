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
 * consistente en  obtener todas las compras realizadas
 * @author german
 */
public class Consulta_Compras_Totales {
    
    ResultSet resultado_consulta;
    
    public Consulta_Compras_Totales() {
    
        
    }
     /**
    * Método para ejecutar la consulta descrita
    * @return objeto que encapsula el resultado de la consulta 
    */
    
    public ResultSet Ejecuta_Consulta(){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT  `detalle compra`.`REGISTRO COMPRA`, `CIF`, `FECHA`," +
            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE`," +
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA`," +
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*(`TIPO DE IVA`+100)))/100),2) AS `TOTAL FACTURA` " +
            "FROM `detalle compra` " +
            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA` " +
            "GROUP BY `detalle compra`.`REGISTRO COMPRA`";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
}
