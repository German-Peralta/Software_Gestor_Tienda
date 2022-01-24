/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import VISTA.Formulario_Modifica_Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase sirve para modificar un cliente existente
 * @author german
 */




public class Modifica_Cliente {
    
     Connection conexion;

     /**
     * Se obtiene una conexión con la base de datos
     */




     
    public Modifica_Cliente() {
        
         conexion= new Conexion_Base_Datos().getConexion();
    }
    /**
     * Este método sirve para modificar un cliente existente
     * @param marco Formulario del cual se obtienen los datos del cliente
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    public int Ejecuta_modificacion_cliente(Formulario_Modifica_Cliente marco){
        
        String texto_DNI=marco.getDesplegable_DNI().getSelectedItem().toString();
        String texto_nombre=marco.getTexto_nombre().getText();
        String texto_apellido=marco.getTexto_apellidos().getText();
        String texto_telefono=marco.getTexto_telefono().getText();
        String texto_calle=marco.getTexto_calle().getText();
        String texto_numero=marco.getTexto_numero().getText();
        String texto_codigo_postal=marco.getTexto_codigo_postal().getText();
        String texto_ciudad=marco.getTexto_ciudad().getText();

         int resultado_insercion=0;
    
    try {
        
 
       
      String modificacion="UPDATE `clientes` SET `NOMBRE` = '"+texto_nombre+"', `TELEFONO` = '"+texto_telefono+"',"+
                           " `APELLIDOS` = '"+texto_apellido+"',"+ 
                           "`CALLE` = '"+texto_calle+"', `NUMERO` = '"+texto_numero+"', `CODIGO POSTAL` = '"+texto_codigo_postal+"',"+
                           " `CIUDAD` = '"+texto_ciudad+"'"+
                           "WHERE `clientes`.`DNI` = '"+texto_DNI+"'";
       
  
       
            
       Statement generador_modificacion= conexion.createStatement();
        
       resultado_insercion= generador_modificacion.executeUpdate(modificacion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
        
        
        
        
        
    }
    
    

