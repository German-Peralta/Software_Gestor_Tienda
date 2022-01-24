/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Consulta_Categoria;
import MODELO.Consulta_Ultimo_Usuario;
import MODELO.Consulta_Usuarios;
import MODELO.Inserta_Usuario;
import MODELO.Modifica_Producto;
import MODELO.Tipo_Usuario;
import VISTA.Formulario_Login;
import VISTA.Formulario_Login_Nuevo_Usuario;
import VISTA.Formulario_Modifica_Producto;
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
 *Esta clase controla la validación de la modificación de datos de un usuario y su inserción en la base de datos
 * @author GERMAN
 */
public class Controlador_Formulario_Login_Nuevo_Usuario_validar implements ActionListener {
/**
     * Valida el formato del texto introducido texto usuario
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    
    public boolean valida_texto_usuario(String texto){
    
     Pattern patron=Pattern.compile("^\\S(.){0,30}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    }
    /**
     * Valida el formato del texto introducido en contraseña
     * @param texto texto a validar
     * @return True si el texto cumple el formato, False en caso contrario
     */
    public boolean valida_texto_contraseña(String texto){
    
     Pattern patron=Pattern.compile("^\\S(.){0,10}$");
    
    Matcher coincidencia=patron.matcher(texto);
    
    return coincidencia.matches();
    
    
    }
    
    
    
    public boolean valida_usuario_duplicado(String texto){
    
       boolean consulta_con_contenido=false;
        
        if(valida_texto_usuario(texto)){
            
        try {
            
            ResultSet consulta_usuario= new Consulta_Usuarios().Ejecuta_Consulta(texto);
            
            consulta_con_contenido=consulta_usuario.next();
            
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
     * Se despliegan las etiquetas de error de los campos con formato erroneo
     * @param marco Formulario de cual se comprueban los datos
     */
    public void muestra_etiquetas_error(Formulario_Login_Nuevo_Usuario marco){
        
       JTextField texto_nombre=marco.getTexto_nombre_usuario();
       
       JTextField texto_contraseña=marco.getTexto_contraseña();
    
       JLabel Etiqueta_error_nombre_usuario=marco.getEtiqueta_error_nombre_Incorrecto();
               
       JLabel Etiqueta_error_usuario_duplicado=marco.getEtiqueta_error_usuario_duplicado();
       
       JLabel Etiqueta_error_contraseña=marco.getEtiqueta_error_contraseña();
       
        
       if(valida_texto_usuario(texto_nombre.getText())){
           
           
           
            Etiqueta_error_nombre_usuario.setVisible(false);
            
                if(valida_usuario_duplicado(texto_nombre.getText())){
                    Etiqueta_error_nombre_usuario.setVisible(false);
                    Etiqueta_error_usuario_duplicado.setVisible(false);
                    
                    
                }
                else{
                    Etiqueta_error_nombre_usuario.setVisible(false);
                    Etiqueta_error_contraseña.setVisible(false);
                    Etiqueta_error_usuario_duplicado.setVisible(true);
                }
           
            }else{
           
            Etiqueta_error_nombre_usuario.setVisible(true);
            }
       
             if(valida_texto_contraseña(texto_contraseña.getText())){
           
             Etiqueta_error_contraseña.setVisible(false);
          
             }else{
           
             Etiqueta_error_contraseña.setVisible(true); 

       }
       
    }

    /**
     * Sirve para insertar un nuevo usuario en la base de datos
     * @param nombre_usuario nombre del usuario a introducir
     * @param contraseña contraseña a introducir
     * @param tipo_usuario tipo de usuario a introducir
     */
    public void inserta_nuevo_usuario(String nombre_usuario,String contraseña,int tipo_usuario){
        
        int ultimo_id_usuario=new Consulta_Ultimo_Usuario().Ejecuta_Consulta();
        
        int id_usuario=ultimo_id_usuario+1;
        
        
        
        int resultado_insercion=new Inserta_Usuario().Ejecuta_inserccion_usuario(id_usuario,nombre_usuario, contraseña, tipo_usuario);
           
        if(resultado_insercion==1){
        
          
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Usuario registrado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
  
        
        }else{
        
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Ha ocurrido un error",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
           
        }
        
        }
  
    /**
        * Se validan los datos introducidos y a introducirlos en la base de datos
     * @param marco Formulario de cual se comprueban los datos
     */
    public void valida_registro(Formulario_Login_Nuevo_Usuario marco){
    
     String nombre_usuario=marco.getTexto_nombre_usuario().getText();
       
     String contraseña=marco.getTexto_contraseña().getText();
       
     int tipo_usuario= ((Tipo_Usuario)marco.getDesplegable_tipo_usuario().getSelectedItem()).getId_Tipo_Usuario();
               
     
   
    
       boolean usuario_valido=valida_texto_usuario(nombre_usuario);
       boolean usuario_no_duplicado=valida_usuario_duplicado(nombre_usuario);
       boolean contraseña_valido=valida_texto_contraseña(contraseña);
       
    
   
       
       if( usuario_valido && usuario_no_duplicado && contraseña_valido ){
                   
            inserta_nuevo_usuario( nombre_usuario, contraseña, tipo_usuario);


       }
       
       
       
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       
       JButton  boton_valida_nuevo_usuario=(JButton)ae.getSource();
        
       Formulario_Login_Nuevo_Usuario marco=(Formulario_Login_Nuevo_Usuario)SwingUtilities.getWindowAncestor(boton_valida_nuevo_usuario);
        
       muestra_etiquetas_error(marco);
       
       valida_registro(marco);
        
    }
    
    
    
    
    
    
    
   
    
    
    
    
}
