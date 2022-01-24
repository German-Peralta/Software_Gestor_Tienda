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
 * consistente en consultar el detalle de compra de una determinada compra
 * @author german
 */
public class Consulta_Compras_Detalle_Compra {
    
    ResultSet resultado_consulta;
    
    public Consulta_Compras_Detalle_Compra() {
    
        
    }
    /**
     * Esta clase sirve para realizar una consulta a la base de datos
     * consistente en consultar el detalle de compra de una determinada compra
     * @param registro_compra numero de registro de la venta que se quiere consultar
     * @return objeto que encapsula el resultado de la consulta 
     */
    public ResultSet Ejecuta_Consulta(String registro_compra){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT  `detalle compra`.`REGISTRO COMPRA`, `CIF`, `FECHA`, `CODIGO DE BARRAS`,`CANTIDAD`,`PRECIO UNITARIO`,`TIPO DE IVA`"+	
            "FROM `detalle compra` INNER JOIN `compra` ON  `detalle compra`.`REGISTRO COMPRA`=`compra`.`REGISTRO COMPRA`"+ 
            "WHERE `detalle compra`.`REGISTRO COMPRA`="+registro_compra;
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
}

