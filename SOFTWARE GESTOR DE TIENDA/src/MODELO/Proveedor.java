/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *Clase que modela los regisros de la tabla proveedor de la base de datos 
 * @author german
 */

public class Proveedor {
    
    private String CIF;
    
    private String Razon_social;
    
    private int telefono;
    
    private String web;
    
    private String Calle;
    
    private int Numero;
    
    private int Codigo_postal;
    
    private String ciudad;

    /**
     * Crea un objeto proveedor
     * @param CIF CIF del proveedor
     * @param Razon_social Razon social del proveedor
     * @param telefono telefono del proveedor
     * @param web web del proveedor
     * @param Calle Calle del proveedor
     * @param Numero Numero del proveedor
     * @param Codigo_postal Codigo postal del proveedor
     * @param ciudad  ciudaddel proveedor
     */
    
    public Proveedor(String CIF, String Razon_social, int telefono, String web, String Calle, int Numero, int Codigo_postal, String ciudad) {
        this.CIF = CIF;
        this.Razon_social = Razon_social;
        this.telefono = telefono;
        this.web = web;
        this.Calle = Calle;
        this.Numero = Numero;
        this.Codigo_postal = Codigo_postal;
        this.ciudad = ciudad;
    }
    
    /**
     * Crea un objeto proveedor
     * @param CIF CIF del proveedor
     * @param Razon_social Razon social del proveedor
     */
    
    
    public Proveedor(String CIF, String Razon_social) {
        this.CIF = CIF;
        this.Razon_social = Razon_social;
        
    }

    
    
    @Override
    public String toString() {
        return  CIF;
    }

    /**
     * retorna el CIF del proveedor
     * @return  CIF del proveedor
     */
      
      
    public String getCIF() {
        return CIF;
    }
    
     /**
     * retorna la razon social del proveedor
     * @return  razon social del proveedor
     */
      

    public String getRazon_social() {
        return Razon_social;
    }
    
     /**
     * retorna el telefono del proveedor
     * @return  telefono del proveedor
     */
      

    public int getTelefono() {
        return telefono;
    }

     /**
     * retorna la web del proveedor
     * @return  web del proveedor
     */
      
    
    public String getWeb() {
        return web;
    }
    
     /**
     * retorna la calle del proveedor
     * @return  calle del proveedor
     */
      

    public String getCalle() {
        return Calle;
    }

     /**
     * retorna el numero del proveedor
     * @return  numero del proveedor
     */
      
    
    public int getNumero() {
        return Numero;
    }
    
     /**
     * retorna el codigo postal del proveedor
     * @return  codigo postal del proveedor
     */
      

    public int getCodigo_postal() {
        return Codigo_postal;
    }
    
     /**
     * retorna la ciudad del proveedor
     * @return  ciudad del proveedor
     */
      

    public String getCiudad() {
        return ciudad;
    }

    
    
   

    /**
     * Coloca el CIF del proveedor
     * @param CIF CIF del proveedor
     */
    
    
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

     /**
      * Coloca la razon social del proveedor
      * @param Razon_social razon social del proveedor
      */
    
    public void setRazon_social(String Razon_social) {
        this.Razon_social = Razon_social;
    }
    
    /**
     * Coloca el telefono del proveedor
     * @param telefono telefono del proveedor
     */

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Coloca la web del proveedor
     * @param web web del proveedor
     */
    
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Coloca la calle del proveedor
     * @param Calle la calle del proveedor
     */
    
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
    
    /**
     * Coloca el numero del proveedor
     * @param Numero el numero del proveedor
     */

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    /**
     * Coloca el codigo postal del proveedor
     * @param Codigo_postal codigo postal del proveedor
     */

    public void setCodigo_postal(int Codigo_postal) {
        this.Codigo_postal = Codigo_postal;
    }

    /**
     * Coloca la ciudad del proveedor
     * @param ciudad ciudad del proveedor
     */
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
