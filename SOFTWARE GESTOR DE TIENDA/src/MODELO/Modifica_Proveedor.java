/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import VISTA.Formulario_Modifica_Proveedor;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *Esta clase sirve para modificar un proveedor existente
 * @author german
 */

public class Modifica_Proveedor {
    
    Connection conexion;

/**
     * Se obtiene una conexión con la base de datos
     */



    public Modifica_Proveedor() {
        
         conexion= new Conexion_Base_Datos().getConexion();
    }
    
    /**
     * Este método sirve para modificar un proveedor existente
     * @param marco Formulario del cual se obtienen los datos del proveedor
     * @return 1 si la inserción fue exitosa, 0 en caso contrario 
     */
    public int Ejecuta_modificacion_producto(Formulario_Modifica_Proveedor marco){
        
        String texto_cif=marco.getDesplegable_CIF().getSelectedItem().toString();
        String texto_razon_social=marco.getTexto_razon_social().getText();
        String texto_web=marco.getTexto_web().getText();
        String texto_telefono=marco.getTexto_telefono().getText();
        String texto_calle=marco.getTexto_calle().getText();
        String texto_numero=marco.getTexto_numero().getText();
        String texto_codigo_postal=marco.getTexto_codigo_postal().getText();
        String texto_ciudad=marco.getTexto_ciudad().getText();

         int resultado_insercion=0;
    
    try {
        
 
       
      String modificacion="UPDATE `proveedores` SET `RAZON SOCIAL` = '"+texto_razon_social+"', `TELEFONO` = '"+texto_telefono+"',"+
                           " `WEB` = '"+texto_web+"',"+ 
                           "`CALLE` = '"+texto_calle+"', `NUMERO` = '"+texto_numero+"', `CODIGO POSTAL` = '"+texto_codigo_postal+"',"+
                           " `CIUDAD` = '"+texto_ciudad+"'"+
                           "WHERE `proveedores`.`CIF` = '"+texto_cif+"'";
       
  
       
            
       Statement generador_modificacion= conexion.createStatement();
        
       resultado_insercion= generador_modificacion.executeUpdate(modificacion);
       
       
    
          } catch (SQLException ex) {
            resultado_insercion=0;
        }  
      
      return resultado_insercion;
 
    }
        
        
        
        
        
    }
    

