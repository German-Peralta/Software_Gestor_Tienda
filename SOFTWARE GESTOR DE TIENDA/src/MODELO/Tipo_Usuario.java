/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *Clase que modela los regisros de la tabla tipo de usuario de la base de datos 
 * @author german
 */

public class Tipo_Usuario {
    
    int Id_Tipo_Usuario;
    
    String nombre_Tipo_usuario;

    /**
     * Crea un objeto tipo de usuario
     * @param Id_Tipo_Usuario id del tipo de usuario
     * @param nombre_Tipo_usuario nombre del tipo de usuario
     */
    
    public Tipo_Usuario(int Id_Tipo_Usuario, String nombre_Tipo_usuario) {
        this.Id_Tipo_Usuario = Id_Tipo_Usuario;
        this.nombre_Tipo_usuario = nombre_Tipo_usuario;
    }
    
    /**Crea un objeto tipo de usuario
     * 
     * @param Id_Tipo_Usuario id del tipo de usuario
     */
    
    public Tipo_Usuario(int Id_Tipo_Usuario) {
        this.Id_Tipo_Usuario = Id_Tipo_Usuario;
  
    }
    
    
   /**
    * retorna la identificación del tipo de usuario
    * @return identificación del tipo de usuario
    */
    public int getId_Tipo_Usuario() {
        return Id_Tipo_Usuario;
    }

    /**
    * retorna el nombre del tipo de usuario
    * @return nombre del tipo de usuario
    */
    
    public String getNombre_Tipo_usuario() {
        return nombre_Tipo_usuario;
    }

    @Override
    public String toString() {
        
        return nombre_Tipo_usuario;
    }

  
    
    
   
   
    
    
    
}
