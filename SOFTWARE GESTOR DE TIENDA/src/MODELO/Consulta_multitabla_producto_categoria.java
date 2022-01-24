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
 * consistente en obtener la información de la tabla productos obteniendo 
 * tambien el nombre de la categoría a la que pertenecen de la tabla categoria
 * @author german
 */
public class Consulta_multitabla_producto_categoria {
    
    ResultSet resultado_consulta;
   /**
    * Método para ejecutar la consulta descrita
    * @return objeto que encapsula el resultado de la consulta 
    */
    public ResultSet Ejecuta_Consulta(){
    

        try {
            Connection conexion= new Conexion_Base_Datos().getConexion();
            
            
            String consulta="SELECT `CODIGO DE BARRAS`, `STOCK`, "
                    + "`NOMBRE`, `DESCRIPCION`, `PRECIO COMPRA`, `PRECIO VENTA`, "
                    + "`TIPO IVA SOPORTADO`, `TIPO IVA REPERCUTIDO`, `CATEGORIA`, "
                    + "`ID_CATEGORIA`, `NOMBRE_CATEGORIA` FROM productos INNER "
                    + "JOIN categoria ON productos.CATEGORIA = categoria.ID_CATEGORIA;";
            
            Statement generador_consultas= conexion.createStatement();
            
            resultado_consulta=generador_consultas.executeQuery(consulta);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_General.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado_consulta;
    }
 
}
