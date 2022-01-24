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
 *Esta clase sirve para realizar una consultas a la base de datos
 * consistentes en obtener el detalle del IVA acotado por trimestres
 * @author german
 */
public class Consulta_Compras_Trimestres {
    
   
    
    public Consulta_Compras_Trimestres() {
    
        
    }
    /**
     * Se obtiene el detalle del total del IVA Soportado agrupado 
     * por bases imponibles del 1º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_1T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT `detalle compra`.`TIPO DE IVA`,"+
            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE`,"+ 
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA`"+
            "FROM `detalle compra`"+ 
            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA`"+ 
            "WHERE `FECHA` BETWEEN '"+año+"-01-01' AND '"+año+"-03-31'"+
            "GROUP BY `detalle compra`.`TIPO DE IVA`";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    /**
     * Se obtiene el detalle del total del IVA Soportado agrupado 
     * por bases imponibles del 2º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_2T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT   `detalle compra`.`TIPO DE IVA`,"+
            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE`,"+ 
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA`"+
            "FROM `detalle compra`"+ 
            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA`"+ 
            "WHERE `FECHA` BETWEEN '"+año+"-04-01' AND '"+año+"-06-30'"+
            "GROUP BY `detalle compra`.`TIPO DE IVA`";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    /**
     * Se obtiene el detalle del total del IVA Soportado agrupado 
     * por bases imponibles del 3º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_3T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT   `detalle compra`.`TIPO DE IVA`,"+
            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE`,"+ 
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA`"+
            "FROM `detalle compra`"+ 
            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA`"+ 
            "WHERE `FECHA` BETWEEN '"+año+"-07-01' AND '"+año+"-09-30'"+
            "GROUP BY `detalle compra`.`TIPO DE IVA`";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
    /**
     * Se obtiene el detalle del total del IVA Soportado agrupado 
     * por bases imponibles del 4º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_4T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT   `detalle compra`.`TIPO DE IVA`,"+
            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE`,"+ 
            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA`"+
            "FROM `detalle compra`"+ 
            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA`"+ 
            "WHERE `FECHA` BETWEEN '"+año+"-10-01' AND '"+año+"-12-31'"+
            "GROUP BY `detalle compra`.`TIPO DE IVA`";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
      /**
     * Se obtiene el total de base imponible y de IVA Repercutido del 1º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_Totales_1T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT "+   
                            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE TOTAL`, "+ 
                            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA TOTAL` "+
                            "FROM `detalle compra` "+ 
                            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA` "+ 
                            "WHERE `FECHA` BETWEEN '"+año+"-01-01' AND '"+año+"-03-31'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }  
          /**
     * Se obtiene el total de base imponible y de IVA Repercutido del 2º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_Totales_2T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT "+   
                            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE TOTAL`, "+ 
                            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA TOTAL` "+
                            "FROM `detalle compra` "+ 
                            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA` "+ 
                            "WHERE `FECHA` BETWEEN '"+año+"-04-01' AND '"+año+"-06-30'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    } 
             /**
     * Se obtiene el total de base imponible y de IVA Repercutido del 3º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_Totales_3T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT "+   
                            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE TOTAL`, "+ 
                            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA TOTAL` "+
                            "FROM `detalle compra` "+ 
                            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA` "+ 
                            "WHERE `FECHA` BETWEEN '"+año+"-07-01' AND '"+año+"-09-30'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    } 
                /**
     * Se obtiene el total de base imponible y de IVA Repercutido del 4º Trimestre
     * @param año año que se quiere conocer
     * @return Objeto que contiene el resutlado de la consulta 
     */
    public ResultSet Ejecuta_Consulta_Totales_4T(String año){
        
        ResultSet resultado_consulta=null;
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT "+   
                            "ROUND(SUM(`CANTIDAD`*`PRECIO UNITARIO`),2) AS `BASE IMPONIBLE TOTAL`, "+ 
                            "ROUND(((SUM(`CANTIDAD`*`PRECIO UNITARIO`*`TIPO DE IVA`))/100),2) AS `IVA TOTAL` "+
                            "FROM `detalle compra` "+ 
                            "INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA` "+ 
                            "WHERE `FECHA` BETWEEN '"+año+"-10-01' AND '"+año+"-12-31'";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    } 


}
