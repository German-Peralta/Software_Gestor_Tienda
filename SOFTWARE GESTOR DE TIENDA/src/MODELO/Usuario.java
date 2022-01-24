/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *Clase que modela los regisros de la tabla usuario e identifica el usuario en curso utilizando la aplicación
 * @author german
 */



public class Usuario {
    
    
    static Usuario Usuario_en_curso;
    
    int Id_usuario;
    
    String nombre_usuario;
    
    String contraseña;
    
    Tipo_Usuario tipo_usuario;

    /**
     * Crea un objeto usuario 
     * @param Id_usuario Id usuario del usuario
     * @param nombre_usuario nombre usuario del usuario
     * @param contraseña contraseña del usuario
     * @param tipo_usuario tipo usuario del usuario 
     */
    
    public Usuario(int Id_usuario, String nombre_usuario, String contraseña, Tipo_Usuario tipo_usuario) {
        this.Id_usuario = Id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.tipo_usuario = tipo_usuario;
    }

    /**
     * retorna el id del usuario
     * @return  id del usuario
     */
    
    public int getId_usuario() {
        return Id_usuario;
    }

    /**
     * retorna el nombre del usuario
     * @return nombre del usuario
     */
    
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * retorna la contraseña del usuario
     * @return contraseña del usuario
     */
    
    public String getContraseña() {
        return contraseña;
    }

     /**
     * retorna el tipo de usuario del usuario
     * @return tipo de usuario del usuario
     */
    
    
    public Tipo_Usuario getTipo_usuario() {
        return tipo_usuario;
    }

    
    
    
    
    /**
     * retorna el tipo de usuario en curso en la aplicación
     * @return tipo de usuario en curso en la aplicación
     */
    
    public static Usuario getUsuario_en_curso() {
        return Usuario_en_curso;
    }

     /**
      * coloca el tipo de usuario en curso en la aplicación
      * @param Usuario_en_curso tipo de usuario en curso en la aplicación
      */
    
    public static void setUsuario_en_curso(Usuario Usuario_en_curso) {
        Usuario.Usuario_en_curso = Usuario_en_curso;
    }
    
    

    @Override
    public String toString() {
        return nombre_usuario;
    }

    
    
    
    
    
}
