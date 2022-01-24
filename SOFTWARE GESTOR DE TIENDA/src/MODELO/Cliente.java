/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;


/**
 *Clase que modela los regisros de la tabla cliente de la base de datos 
 * @author german
 */


public class Cliente {
    
    private String DNI;
    
    private String Nombre;
    
    private String Apellidos;
    
    private int telefono;
      
    private String Calle;
    
    private int Numero;
    
    private int Codigo_postal;
    
    private String ciudad;

    /**
     * Crea un objeto cliente
     * @param DNI DNI del cliente
     * @param Nombre Nombre del cliente
     * @param Apellidos Apellidos del cliente
     * @param telefono Telefono del cliente
     * @param Calle Calle del cliente
     * @param Numero Numero del cliente
     * @param Codigo_postal Codigo postal del cliente
     * @param ciudad ciudad del cliente
     */
    
    public Cliente(String DNI, String Nombre, String Apellidos, int telefono, String Calle, int Numero, int Codigo_postal, String ciudad) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.telefono = telefono;
        this.Calle = Calle;
        this.Numero = Numero;
        this.Codigo_postal = Codigo_postal;
        this.ciudad = ciudad;
    }

    
    /**
     * Crea un objeto cliente
     * @param DNI  DNI del cliente
     * @param Nombre Nombre del cliente
     * @param Apellidos Apellidos del cliente
     */
    
    public Cliente(String DNI, String Nombre, String Apellidos) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }
    


    @Override
    public String toString() {
        return DNI;
    }

 /**
  * retorna el dni del cliente
  * @return dni
  */
    
    public String getDNI() {
        return DNI;
    }
    
     /**
  * retorna el nombre del cliente
  * @return nombre
  */
    
    public String getNombre() {
        return Nombre;
    }

  /**
  * retorna el apellidos del cliente
  * @return apellido
  */
    public String getApellidos() {
        return Apellidos;
    }
 /**
  * retorna el telefono del cliente
  * @return telefono
  */
     
    public int getTelefono() {
        return telefono;
    }
 /**
  * retorna la calle del cliente
  * @return calle
  */
    public String getCalle() {
        return Calle;
    }

     /**
  * retorna el numero del cliente
  * @return numero
  */
    public int getNumero() {
        return Numero;
    }

     /**
  * retorna el codigo postal del cliente
  * @return codigo postal
  */
    public int getCodigo_postal() {
        return Codigo_postal;
    }

     /**
  * retorna la ciudad del cliente
  * @return ciudad
  */
    
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Coloca el dni del cliente
     * @param DNI dni
     */
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Coloca el nombre del cliente
     * @param Nombre nombre 
     */
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
/**
 * Coloca el apellido del cliente
 * @param Apellidos apellidos
 */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
/**
 * Coloca el telefono del cliente
 * @param telefono telefono
 */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
/**
 * Coloca la calle del cliente
 * @param Calle calle
 */
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
/**
 * Coloca el numero del cliente
 * @param Numero numero
 */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
/**
 * Coloca el codigo postal del cliente
 * @param Codigo_postal codigo postal
 */
    public void setCodigo_postal(int Codigo_postal) {
        this.Codigo_postal = Codigo_postal;
    }

    /**
     * Coloca la ciudad del cliente
     * @param ciudad ciudad
     */
    
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   
    
}
