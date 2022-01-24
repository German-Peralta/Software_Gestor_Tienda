/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *Clase que modela los regisros de la tabla categoría de la base de datos 
 * @author german
 */
public class Categoria {
    
    int id_Categoria;
    
    String nombre_categoria;

    /**
     * Crea un objeto categoría
     * @param id_Categoria id de categoría
     */
    
    public Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }
      /**
       * Crea un objeto categoría
       * @param id_Categoría id de categoría
       * @param nombre_categoría nombre de la categoría
       */
    public Categoria(int id_Categoría, String nombre_categoría) {
        this.id_Categoria = id_Categoría;
        this.nombre_categoria = nombre_categoría;
    }

    /**
     * Obtiene el id de la categoría del objeto categoría
     * @return id de la categoria
     */
    
    public int getId_Categoría() {
        return id_Categoria;
    }

    
    /**
     * Obtiene el nombre de la categoría del objeto categoría
     * @return nombre de la categoría
     */
    
    public String getNombre_categoría() {
        return nombre_categoria;
    }

    
    
    @Override
    public String toString() {
        return nombre_categoria;
    }
    
    
    
    
}
