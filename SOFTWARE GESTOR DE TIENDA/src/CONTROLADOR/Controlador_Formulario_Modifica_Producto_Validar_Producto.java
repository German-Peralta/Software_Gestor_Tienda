/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Categoria;
import MODELO.Consulta_General;
import MODELO.Consulta_Producto;
import MODELO.Inserta_Producto;
import MODELO.Inserta_categoria;
import MODELO.Modifica_Producto;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *Esta clase controla la validación de la modificación de datos de un producto y su inserción en la base de datos
 * @author german
 */
public class Controlador_Formulario_Modifica_Producto_Validar_Producto implements ActionListener{
    
    /**
     * Se reinicia el contenido de los cuadros de texto del formulario
     * @param marco Formulario de cual se comprueban los datos
     */
    
    public void reiniciar_campos(Formulario_Modifica_Producto marco){
    
   
    marco.getTexto_nombre().setText("");
    marco.getTexto_descripcion().setText("");
    marco.getTexto_stock_inicial().setText("");
    marco.getTexto_precio_compra().setText("");
    marco.getTexto_precio_venta().setText("");
 

    }

  /**
   * Valida el formato del texto introducido en codigo de barras
   * @param texto texto a validar
   * @return True si el formato es correcto, False si tiene un formato erroeno
   */
    public boolean valida_texto_codigo_barras(String texto){
    
    //El codigo de barras ha de contener entre 7 y 10 digitos
        
    Pattern patron=Pattern.compile("^\\d{7,10}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    }
    
  
    
    /**
     * Valida el que el producto no este ya registrado en la base de datos
     * @param texto_codigo_barras codigo barras de producto a comprobar
     * @return True si el producto no esta duplicado, False en caso contrario
     */
    
    public boolean valida_producto_duplicado(String texto_codigo_barras){
        
        /*si el método devuelve false el producto está duplicado,
          si el método devuelve true el producto no está duplicado
          */ 
          
        boolean consulta_con_contenido=false;
        
        if(valida_texto_codigo_barras(texto_codigo_barras)){
            
        try {
            
            ResultSet consulta_producto= new Consulta_Producto().Ejecuta_Consulta(texto_codigo_barras);
            
            consulta_con_contenido=consulta_producto.next();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Controlador_Formulario_Registro_Producto_Validar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
          if(consulta_con_contenido==true){
        
            //duplicado
            return false;
        }else{
            
            //no duplicado
            return true;
        }  
          
        }else{
        
           return false;
        }
        
               
                
    }
    /**
     * Valida el formato del texto introducido en nombre
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_nombre(String texto){
    
     Pattern patron=Pattern.compile("^\\S(.){0,14}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    }
    /**
     * Valida el formato del texto introducido en precio compra
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroneo
     */
    
    public boolean valida_texto_precio_compra(String texto){
        
       
    Pattern patron=Pattern.compile("^(\\d+((,|\\.)\\d{1,2})?)$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    //el precio de compra es un numero decimal
    
    }
    /**
     * Valida el formato del texto introducido en venta
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroneo
     */
    public boolean valida_texto_precio_venta(String texto){
    
    Pattern patron=Pattern.compile("^(\\d+((,|\\.)\\d{1,2})?)$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Valida el formato del texto introducido en stock
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroneo
     */
    
    //El stock inicial es un numero entero
    public boolean valida_texto_stock_inicial(String texto){
    
    Pattern patron=Pattern.compile("\\d+$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    }
    /**
     * Valida el formato del texto introducido en categoria
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroneo
     */
    public boolean valida_texto_categoria(String texto){
     Pattern patron=Pattern.compile("^\\S(.){0,20}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Valida que la categoria este duplicada
     * @param texto Nombre de la categoria
     * @return True si la categoria no esta duplicada, False en caso contrario
     */
    public boolean valida_categoria_duplicada(String texto){
    
       boolean consulta_con_contenido=false;
        
        if(valida_texto_categoria(texto)){
            
        try {
            
            ResultSet consulta_categoria= new Consulta_Categoria().Ejecuta_Consulta(texto);
            
            consulta_con_contenido=consulta_categoria.next();
            
        } catch (SQLException ex) {
           
            Logger.getLogger(Controlador_Formulario_Modifica_Producto_Validar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
          if(consulta_con_contenido==true){
        
            //duplicado
            return false;
        }else{
            
            //no duplicado
            return true;
        }  
          
        }else{
        
           return false;
        }
        
    
    }
    /**
     * Muestra las etiquetas error de los campos que tengan un formato incorrecto  
     * @param marco Formulario de cual se comprueban los datos
     */
    public void muestra_etiquetas_error(Formulario_Modifica_Producto marco){
    
      
        
     
               
       JTextField texto_nombre=marco.getTexto_nombre();
               
       JTextField texto_precio_compra=marco.getTexto_precio_compra();
               
       JTextField texto_precio_venta=marco.getTexto_precio_venta();
               
       JTextField texto_stock_inicial=marco.getTexto_stock_inicial();
       
       JTextField texto_categoria=marco.getTexto_categoria_nueva();
       
       JLabel Etiqueta_error_precio_compra=marco.getEtiqueta_error_precio_compra();
               
       JLabel Etiqueta_error_precio_venta=marco.getEtiqueta_error_precio_venta();
               
       JLabel Etiqueta_error_stock_inicial=marco.getEtiqueta_error_stock_inicial();
       
       JLabel Etiqueta_error_nombre_categoria=marco.getEtiqueta_error_categoria_nombre();
       
       JLabel Etiqueta_error_categoria_duplicada=marco.getEtiqueta_error_categoria_duplicada();
       
       
        if(valida_texto_nombre(texto_nombre.getText())){
           
           marco.getEtiqueta_error_nombre().setVisible(false);
          
       }else{
           
          marco.getEtiqueta_error_nombre().setVisible(true); 

       }
         
       
       if(valida_texto_precio_compra(texto_precio_compra.getText())){
           
           Etiqueta_error_precio_compra.setVisible(false);
       }else{
            Etiqueta_error_precio_compra.setVisible(true);
       }
               
       if(valida_texto_precio_venta(texto_precio_venta.getText())){
           
           Etiqueta_error_precio_venta.setVisible(false);
           
       }else{
           
           Etiqueta_error_precio_venta.setVisible(true);
       }
       
       if(valida_texto_stock_inicial(texto_stock_inicial.getText())){
           Etiqueta_error_stock_inicial.setVisible(false);
       }else{
           Etiqueta_error_stock_inicial.setVisible(true);
       }
       
       
       //
       if(marco.Nueva_categoria()){
       
           
            if(valida_texto_categoria(texto_categoria.getText())){
           
            Etiqueta_error_nombre_categoria.setVisible(false);
            
                if(valida_categoria_duplicada(texto_categoria.getText())){
                
                    Etiqueta_error_categoria_duplicada.setVisible(false);
                    
                    
                }
                else{
                    Etiqueta_error_nombre_categoria.setVisible(false);
                    Etiqueta_error_categoria_duplicada.setVisible(true);
                }
           
            }else{
           Etiqueta_error_categoria_duplicada.setVisible(false);
            Etiqueta_error_nombre_categoria.setVisible(true);
       }
       
       
        
       }
       
 
    }
    /**
     * Realiza una modificación cuando se especifica una categoría ya existente
     * @param marco Formulario de cual se obtienen los datos
     */
    public void modificacion_con_categoria_existente(Formulario_Modifica_Producto marco){
        
        int resultado_insercion=new Modifica_Producto().Ejecuta_modificacion_producto(marco);
           
        if(resultado_insercion==1){
        
          
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Registro efectuado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
       
        
        }else{
        
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Ha ocurrido un error",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
           
        }
        
        }
 
    /**
     * Realiza una modificación cuando se especifica una categoría nueva
     * @param marco Formulario de cual se obtienen los datos
     */
    public void modificacion_con_categoria_nueva(Formulario_Modifica_Producto marco){
    
       
        int resultado_insercion_categoria=new Inserta_categoria().Ejecuta_inserccion_categoria(marco.getTexto_categoria_nueva().getText());
        
        System.out.println("inserta categoria "+resultado_insercion_categoria);
        
        int resultado_modificacion=new Modifica_Producto().Ejecuta_modificacion_producto(marco);
           
        System.out.println("modificacion "+resultado_modificacion);
        
        if(resultado_insercion_categoria==1 && resultado_modificacion==1){
        
          
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Modificacion efectuada existosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        marco.getTexto_categoria_nueva().setText("");
        
        }else{
        
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Ha ocurrido un error",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
           
        }
    
    
    
    }
    /**
     * Valida los datos introducidos y realiza la inserción correspondiente
     * @param marco Formulario de cual se obtienen los datos
     */
    public void valida_registro(Formulario_Modifica_Producto marco){
    

               
       JTextField texto_nombre=marco.getTexto_nombre();
               
       JTextField texto_precio_compra=marco.getTexto_precio_compra();
               
       JTextField texto_precio_venta=marco.getTexto_precio_venta();
               
       JTextField texto_stock_inicial=marco.getTexto_stock_inicial();
       
       JTextField texto_categoria=marco.getTexto_nueva_categoria();
       
       JTextArea texto_descripcion=marco.getTexto_descripcion();      
       
       JComboBox tipo_IVA_soportado=marco.getTipo_IVA_soportado();
               
       JComboBox tipo_IVA_repercutido=marco.getTipo_IVA_repercutido();
       
       
       
       boolean nombre=valida_texto_nombre(texto_nombre.getText());
       boolean precio_compra_valido=valida_texto_precio_compra(texto_precio_compra.getText());
       boolean precio_venta_valido=valida_texto_precio_venta(texto_precio_venta.getText());
       boolean stock_inicial_valido=valida_texto_stock_inicial(texto_stock_inicial.getText());
       boolean categoria=valida_texto_categoria(texto_categoria.getText());
       boolean categoria_duplicada=valida_categoria_duplicada(texto_categoria.getText());
       
       
       boolean condiciones_categoria_existente=nombre && precio_compra_valido && 
               precio_venta_valido && stock_inicial_valido;
       
       boolean condiciones_categoria_nueva=nombre && precio_compra_valido && 
               precio_venta_valido && stock_inicial_valido && categoria && categoria_duplicada;
       
       
       
       if( !marco.Nueva_categoria() && condiciones_categoria_existente){
                   
            modificacion_con_categoria_existente(marco);


       }else if(marco.Nueva_categoria()&& condiciones_categoria_nueva){
       
            modificacion_con_categoria_nueva(marco);
       
       }
       
       
               
               
                       
                 
                               
                               
                                       
                                       
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
       JButton  boton_registra_producto=(JButton)ae.getSource();
        
       Formulario_Modifica_Producto marco=(Formulario_Modifica_Producto)SwingUtilities.getWindowAncestor(boton_registra_producto);
        
       muestra_etiquetas_error(marco);
       
       valida_registro(marco);
       
      
    }
    
    
}
