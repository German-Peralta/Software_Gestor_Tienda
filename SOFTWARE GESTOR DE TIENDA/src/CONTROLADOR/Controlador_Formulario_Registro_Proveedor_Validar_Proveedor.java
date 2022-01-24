/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Consulta_Proveedor;
import MODELO.Inserta_Proveedor;
import VISTA.Formulario_Registro_Cliente;
import VISTA.Formulario_Registro_Proveedor;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *Esta clase controla la validación de la modificación de datos de un proveedor y su inserción en la base de datos
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Proveedor_Validar_Proveedor implements ActionListener {
      /**
     * Se reinicia el contenido de los cuadros de texto del formulario
     * @param marco Formulario de cual se comprueban los datos
     */
    
   public void reiniciar_campos(Formulario_Registro_Proveedor marco){
    
   
    marco.getTexto_CIF().setText("");
    marco.getTexto_razon_social().setText("");
    marco.getTexto_web().setText("");
    marco.getTexto_telefono().setText("");
    marco.getTexto_calle().setText("");
    marco.getTexto_numero().setText("");
    marco.getTexto_codigo_postal().setText("");
    marco.getTexto_ciudad().setText("");
 

    }
    /**
   * Valida el formato del texto introducido en CIF
   * @param texto texto a validar
   * @return True si el formato es correcto, False si tiene un formato erroeno
   */
   public boolean valida_texto_CIF(String texto){
     
    Pattern patron=Pattern.compile("^[A-Z]\\d{8}$");
    
    Matcher coincidencia=patron.matcher(texto);

    return coincidencia.matches();
    
    }
            /**
     * Valida el que el proveedor no este ya registrado en la base de datos
     * @param texto_CIF CIF del proveedor a comprobar
     * @return True si el proveedor no esta duplicado, False en caso contrario
     */
    public boolean valida_proveedor_duplicado(String texto_CIF){
        
        /*si el método devuelve false el producto está duplicado,
          si el método devuelve true el producto no está duplicado
          */ 
          
        boolean consulta_con_contenido=false;
        
        if(valida_texto_CIF(texto_CIF)){
            
        try {
            
            ResultSet consulta_proveedor= new Consulta_Proveedor().Ejecuta_Consulta(texto_CIF);
            
            consulta_con_contenido=consulta_proveedor.next();
            
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
     * Valida el formato del texto introducido en una razon social
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_razon_social(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,29}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
     /**
     * Valida el formato del texto introducido en una web
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_web(String texto){
    Pattern patron=Pattern.compile("^\\S(.){0,29}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    } 
     /**
     * Valida el formato del texto introducido en telefono
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_telefono(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{9}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    }
     /**
     * Valida el formato del texto introducido en una calle
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_calle(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,14}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
     /**
     * Valida el formato del texto introducido en un numero
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_numero(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{1,5}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    } 
      /**
     * Valida el formato del texto introducido en un codigo postal
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_codigo_postal(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{5}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    }  
     /**
     * Valida el formato del texto introducido en una ciudad
     * @param texto texto a validar
     * @return True si el formato es correcto, False si tiene un formato erroeno
     */
    public boolean valida_texto_ciudad(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,14}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Muestra las etiquetas error de los campos que tengan un formato incorrecto  
     * @param marco Formulario de cual se comprueban los datos
     */
    public void muestra_etiquetas_error(Formulario_Registro_Proveedor marco){
     
     JTextField texto_CIF=marco.getTexto_CIF();
     JTextField texto_razon_social=marco.getTexto_razon_social();
     JTextField texto_web=marco.getTexto_web();
     JTextField texto_telefono=marco.getTexto_telefono();
     JTextField texto_calle=marco.getTexto_calle();
     JTextField texto_numero=marco.getTexto_numero();
     JTextField texto_codigo_postal=marco.getTexto_codigo_postal();
     JTextField texto_ciudad=marco.getTexto_ciudad();
     
     JLabel etiqueta_error_CIF=marco.getEtiqueta_error_CIF();
     JLabel etiqueta_error_CIF_duplicado=marco.getEtiqueta_error_CIF_duplicado();
     JLabel etiqueta_error_razon_social=marco.getEtiqueta_error_razon_social();
     JLabel etiqueta_error_web=marco.getEtiqueta_error_web();
     JLabel etiqueta_error_telefono=marco.getEtiqueta_error_telefono();
     JLabel etiqueta_error_calle=marco.getEtiqueta_error_calle();
     JLabel etiqueta_error_numero=marco.getEtiqueta_error_numero();
     JLabel etiqueta_error_codigo_postal=marco.getEtiqueta_error_codigo_postal();
     JLabel etiqueta_error_ciudad=marco.getEtiqueta_error_ciudad();
     
     if(valida_texto_CIF(texto_CIF.getText())){
     
         if(valida_proveedor_duplicado(texto_CIF.getText())){
            etiqueta_error_CIF.setVisible(false);
            etiqueta_error_CIF_duplicado.setVisible(false);
             
         
             
         }else{
            etiqueta_error_CIF.setVisible(false);
            
            etiqueta_error_CIF_duplicado.setVisible(true);
             
         
         }
         
     } else{
        etiqueta_error_CIF.setVisible(true);
       
           etiqueta_error_CIF_duplicado.setVisible(false);
         
     }
     
     
     if(valida_texto_razon_social(texto_razon_social.getText())){
     
         etiqueta_error_razon_social.setVisible(false);
     }else{
         etiqueta_error_razon_social.setVisible(true);
     }
     
     
     
     if(valida_texto_web(texto_web.getText())){
         etiqueta_error_web.setVisible(false);
     }else{
         etiqueta_error_web.setVisible(true);
     }
     
     /////////////////////////////////////////////////////////////
     if(valida_texto_telefono(texto_telefono.getText())){
         etiqueta_error_telefono.setVisible(false);
     }else{
         etiqueta_error_telefono.setVisible(true);
     }
     
     if(valida_texto_calle(texto_calle.getText())){
         etiqueta_error_calle.setVisible(false);
     }else{
         etiqueta_error_calle.setVisible(true);
     }
     
     if(valida_texto_numero(texto_numero.getText())){
     
         etiqueta_error_numero.setVisible(false);
         
     }else{
         etiqueta_error_numero.setVisible(true);
     }
     
     if(valida_texto_codigo_postal(texto_codigo_postal.getText())){
         etiqueta_error_codigo_postal.setVisible(false);
     }else{
         etiqueta_error_codigo_postal.setVisible(true);
     }
     
     if(valida_texto_ciudad(texto_ciudad.getText())){
     
        marco.getEtiqueta_error_ciudad().setVisible(false);
        
     }else{
     
        marco.getEtiqueta_error_ciudad().setVisible(true);
        
     }
     
     
     
    

    
    
    
}
 
    /**
     * Valida los datos introducidos y realiza la inserción en la base de datos
     * @param marco Formulario de cual se obtienen los datos
     */
    public void valida_registro(Formulario_Registro_Proveedor marco){
    
    boolean  cif=valida_texto_CIF  (marco.getTexto_CIF().getText());
    boolean  duplicado=valida_proveedor_duplicado  (marco.getTexto_CIF().getText());
    boolean  razon_social=valida_texto_razon_social  (marco.getTexto_razon_social().getText());
    boolean  web=valida_texto_web  (marco.getTexto_web().getText());
    boolean  telefono=valida_texto_telefono  (marco.getTexto_telefono().getText());
    boolean  calle=valida_texto_calle  (marco.getTexto_calle().getText());
    boolean  numero=valida_texto_numero  (marco.getTexto_numero().getText());
    boolean  codigo_postal=valida_texto_codigo_postal  (marco.getTexto_codigo_postal().getText());
    boolean  ciudad=valida_texto_ciudad  (marco.getTexto_ciudad().getText());


    if(cif && duplicado && razon_social && web && telefono && calle && numero && codigo_postal && ciudad){
    
    
        int resultado_insercion=new Inserta_Proveedor().Ejecuta_inserccion_proveedor(marco.getTexto_CIF().getText(), 
                marco.getTexto_razon_social().getText(), marco.getTexto_web().getText(), marco.getTexto_telefono().getText(),
                marco.getTexto_calle().getText(), marco.getTexto_numero().getText(), marco.getTexto_codigo_postal().getText(),
                marco.getTexto_ciudad().getText());
           
        if(resultado_insercion==1){
        
          
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Registro efectuado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        reiniciar_campos(marco);
       
        
        }else{
        
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Ha ocurrido un error",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
           
        }
    
    
    
    }

            
    
        
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
       JButton  boton_registra_cliente=(JButton)ae.getSource();
        
       Formulario_Registro_Proveedor marco=(Formulario_Registro_Proveedor)SwingUtilities.getWindowAncestor(boton_registra_cliente);
        
       muestra_etiquetas_error(marco);
       
       valida_registro(marco);
        
    }
}