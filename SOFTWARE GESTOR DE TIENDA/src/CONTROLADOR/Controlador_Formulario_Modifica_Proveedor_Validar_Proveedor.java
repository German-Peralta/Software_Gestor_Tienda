/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Modifica_Proveedor;
import VISTA.Formulario_Modifica_Proveedor;
import VISTA.Formulario_Registro_Proveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 * @author german
 */
public class Controlador_Formulario_Modifica_Proveedor_Validar_Proveedor implements ActionListener {

    /**Este método reinicia los campos de texto del formulario
     * 
     * @param marco Formulario de cual se comprueban los datos
     */
    
    public void reiniciar_campos(Formulario_Modifica_Proveedor marco){
    
   
  
    marco.getTexto_razon_social().setText("");
    marco.getTexto_web().setText("");
    marco.getTexto_telefono().setText("");
    marco.getTexto_calle().setText("");
    marco.getTexto_numero().setText("");
    marco.getTexto_codigo_postal().setText("");
    marco.getTexto_ciudad().setText("");
 

    }
        
    /**
     * Valida el formato del texto introducido en razon social
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_razon_social(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,29}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Valida el formato del texto introducido en web
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_web(String texto){
    Pattern patron=Pattern.compile("^\\S(.){0,29}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    } 
    /**
     * Valida el formato del texto introducido telefono
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_telefono(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{9}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    }
    /**
     * Valida el formato del texto introducido en calle
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_calle(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,14}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Valida el formato del texto introducido en numero
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_numero(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{1,5}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    } 
     /**
      * Valida el formato del texto introducido en codigo postal
      * @param texto texto a validar
      * @return True si el texto cumple el formato, False en caso contrario
      */
    public boolean valida_texto_codigo_postal(String texto){
    
 
        
    Pattern patron=Pattern.compile("^\\d{5}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
   
    }  
    /**
     * Valida el formato del texto introducido en ciudad
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_ciudad(String texto){
    
    Pattern patron=Pattern.compile("^\\S(.){0,14}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    }
    /**
     * Se despliegan las etiquetas de error de los campos con formato erroneo
     * @param marco Formulario de cual se comprueban los datos
     */
    public void muestra_etiquetas_error(Formulario_Modifica_Proveedor marco){
     
     
     JTextField texto_razon_social=marco.getTexto_razon_social();
     JTextField texto_web=marco.getTexto_web();
     JTextField texto_telefono=marco.getTexto_telefono();
     JTextField texto_calle=marco.getTexto_calle();
     JTextField texto_numero=marco.getTexto_numero();
     JTextField texto_codigo_postal=marco.getTexto_codigo_postal();
     JTextField texto_ciudad=marco.getTexto_ciudad();
     
    
    
     JLabel etiqueta_error_razon_social=marco.getEtiqueta_error_razon_social();
     JLabel etiqueta_error_web=marco.getEtiqueta_error_web();
     JLabel etiqueta_error_telefono=marco.getEtiqueta_error_telefono();
     JLabel etiqueta_error_calle=marco.getEtiqueta_error_calle();
     JLabel etiqueta_error_numero=marco.getEtiqueta_error_numero();
     JLabel etiqueta_error_codigo_postal=marco.getEtiqueta_error_codigo_postal();
     JLabel etiqueta_error_ciudad=marco.getEtiqueta_error_ciudad();
     
    
     
     
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
        * Se validan los datos introducidos y se procede a modificarlos en la base de datos
     * @param marco Formulario de cual se comprueban los datos
     */
    public void valida_registro(Formulario_Modifica_Proveedor marco){
    
   
  
    boolean  razon_social=valida_texto_razon_social  (marco.getTexto_razon_social().getText());
    boolean  web=valida_texto_web  (marco.getTexto_web().getText());
    boolean  telefono=valida_texto_telefono  (marco.getTexto_telefono().getText());
    boolean  calle=valida_texto_calle  (marco.getTexto_calle().getText());
    boolean  numero=valida_texto_numero  (marco.getTexto_numero().getText());
    boolean  codigo_postal=valida_texto_codigo_postal  (marco.getTexto_codigo_postal().getText());
    boolean  ciudad=valida_texto_ciudad  (marco.getTexto_ciudad().getText());


    if(razon_social && web && telefono && calle && numero && codigo_postal && ciudad){
    
    
        int resultado_insercion=new Modifica_Proveedor().Ejecuta_modificacion_producto(marco);
           
        if(resultado_insercion==1){
        
          
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Modificacion efectuada exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        
       
        
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
        
       Formulario_Modifica_Proveedor marco=(Formulario_Modifica_Proveedor)SwingUtilities.getWindowAncestor(boton_registra_cliente);
        
       muestra_etiquetas_error(marco);
       
       valida_registro(marco);
        
    }
    
    
    
    
    
}
