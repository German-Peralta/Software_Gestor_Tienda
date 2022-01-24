/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *Clase que modela los regisros de la tabla producto de la base de datos 
 * @author german
 */




public class Producto {
    
    private String Codigo_de_barras;
    
    private int Stock;
    
    private String Nombre;
      
    private String Descripcion;
    
    private double Precio_Compra;
    
    private double Precio_Venta;
    
    private int tipo_Iva_Soportado;
    
    private int tipo_Iva_Repercutido;
    
    private Categoria categoria;

    /**
     * Crea un objeto producto
     * @param Codigo_de_barras Codigo de barras del producto
     * @param Stock Stock del producto
     * @param Nombre  Nombredel producto
     * @param Descripcion Descripcion del producto
     * @param Precio_Compra Precio compra del producto
     * @param Precio_Venta Precio venta del producto
     * @param tipo_Iva_Soportado tipo IVA Soportado del producto
     * @param tipo_Iva_Repercutido tipo IVA Repercutido del producto
     * @param categoria  categoria del producto
     */
    
    
    public Producto(String Codigo_de_barras, int Stock, String Nombre, 
           String Descripcion, double Precio_Compra, double Precio_Venta, 
           int tipo_Iva_Soportado, int tipo_Iva_Repercutido, Categoria categoria) {
        this.Codigo_de_barras = Codigo_de_barras;
        this.Stock = Stock;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio_Compra = Precio_Compra; 
        this.Precio_Venta = Precio_Venta;
        this.tipo_Iva_Soportado = tipo_Iva_Soportado;
        this.tipo_Iva_Repercutido = tipo_Iva_Repercutido;
        this.categoria=categoria;
    }

    /**
     * Crea un objeto producto
     * @param Codigo_de_barras Codigo de barras del producto
     * @param Nombre Nombre del producto
     * @param Precio_Compra Precio_Compra del producto
     * @param tipo_Iva_Soportado tipo IVA soportado del producto 
     */
    
    public Producto(String Codigo_de_barras, String Nombre, double Precio_Compra, int tipo_Iva_Soportado) {
        this.Codigo_de_barras = Codigo_de_barras;
        this.Nombre = Nombre;
        this.Precio_Compra = Precio_Compra;
        this.tipo_Iva_Soportado = tipo_Iva_Soportado;
    }
    
    /**
     * Crea un objeto producto
     * @param Codigo_de_barras Codigo de barras del producto
     * @param stock stock del producto
     * @param Nombre Nombre del producto
     * @param Precio_Compra Precio compra del producto
     * @param tipo_Iva_Soportado tipo IVA Soportado del producto
     */
    
    public Producto(String Codigo_de_barras,int stock, String Nombre, double Precio_Compra, int tipo_Iva_Soportado) {
        this.Codigo_de_barras = Codigo_de_barras;
        this.Stock = Stock;
        this.Nombre = Nombre;
        this.Precio_Compra = Precio_Compra;
        this.tipo_Iva_Soportado = tipo_Iva_Soportado;
    }

    /**
     * Crea un objeto producto
     * @param Codigo_de_barras Codigo de barras del producto
     * @param Stock Stock del producto
     * @param Nombre Nombre del producto
     * @param Descripcion Descripcion del producto
     */
    
    
    public Producto(String Codigo_de_barras, int Stock, String Nombre, String Descripcion) {
        this.Codigo_de_barras = Codigo_de_barras;
        this.Stock = Stock;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    
    
    
    @Override
    public String toString() {
        return Codigo_de_barras;
    }
    
    /**
     * retorna el codigo de barras del producto
     * @return  codigo de barras 
     */
    
    public String getCodigo_de_barras() {
        return Codigo_de_barras;
    }
    
    /**
     * retorna el stock del producto
     * @return stock
     */

    public int getStock() {
        return Stock;
    }

    /**
     * retorna el nombre del producto
     * @return nombre
     */
    
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * retorna el descripcion del producto
     * @return descripcion
     */

    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * retorna el precio de compra del producto
     * @return precio de compra
     */
    
    public double getPrecio_Compra() {
        return Precio_Compra;
    }
    
    /**
     * retorna el precio de venta del producto
     * @return precio de venta
     */

    public double getPrecio_Venta() {
        return Precio_Venta;
    }
    
    /**
     * retorna el tipo de iva soportado del producto
     * @return tipo de iva soportado
     */

    public int getTipo_Iva_Soportado() {
        return tipo_Iva_Soportado;
    }

    /**
     * retorna el tipo de iva repercutido del producto
     * @return tipo de iva repercutido
     */
    
    public int getTipo_Iva_Repercutido() {
        return tipo_Iva_Repercutido;
    }
    
    /**
     * retorna la categoria del producto
     * @return categoria
     */

    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Coloca el codigo de barras del producto
     * @param Codigo_de_barras codigo de barras del producto
     */
    
    public void setCodigo_de_barras(String Codigo_de_barras) {
        this.Codigo_de_barras = Codigo_de_barras;
    }

    /**
     * Coloca el codigo de stock del producto
     * @param Stock stock del producto
     */
    
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    /**
     * Coloca el nombre del producto
     * @param Nombre nombre del producto
     */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Coloca la descripcion del producto
     * @param Descripcion descripcion del producto
     */
    
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * Coloca el precio de compra del producto
     * @param Precio_Compra precio de compra del producto
     */
    
    
    public void setPrecio_Compra(double Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }

    /**
     * Coloca el precio de venta del producto
     * @param Precio_Venta precio de venta del producto
     */
    
    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    /**
     * Coloca el tipo de IVA soportado del producto
     * @param tipo_Iva_Soportado tipo de IVA soportado del producto
     */
    
    public void setTipo_Iva_Soportado(int tipo_Iva_Soportado) {
        this.tipo_Iva_Soportado = tipo_Iva_Soportado;
    }

    /**
     * Coloca el tipo de IVA repercutido del producto
     * @param tipo_Iva_Repercutido  tipo de IVA repercutido del producto
     */
    
    public void setTipo_Iva_Repercutido(int tipo_Iva_Repercutido) {
        this.tipo_Iva_Repercutido = tipo_Iva_Repercutido;
    }
    
    
    
}
