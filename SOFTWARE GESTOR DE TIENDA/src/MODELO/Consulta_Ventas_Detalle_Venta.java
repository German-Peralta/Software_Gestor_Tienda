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
 * consistente en consultar el detalle de venta de una determinada venta
 * @author german
 */

public class Consulta_Ventas_Detalle_Venta {
    

    ResultSet resultado_consulta;
    
    public Consulta_Ventas_Detalle_Venta() {
    
        
    }
    /**
     * Esta clase sirve para realizar una consulta a la base de datos
     * consistente en consultar el detalle de venta de una determinada venta
     * @param registro_venta numero de registro de la venta que se quiere consultar
     * @return objeto que encapsula el resultado de la consulta 
     */
    public ResultSet Ejecuta_Consulta(String registro_venta){
        
        
        
        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            String consulta="SELECT  `detalle venta`.`REGISTRO VENTA`, `DNI`, `FECHA`, `CODIGO DE BARRAS`,`CANTIDAD`,`PRECIO UNITARIO`,`TIPO DE IVA`"+	
            "FROM `detalle venta` INNER JOIN `venta` ON  `detalle venta`.`REGISTRO VENTA`=`venta`.`REGISTRO VENTA`"+ 
            "WHERE `detalle venta`.`REGISTRO VENTA`="+registro_venta;
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
}

