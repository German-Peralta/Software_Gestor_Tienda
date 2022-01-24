/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Usuarios;
import MODELO.Tipo_Usuario;
import MODELO.Usuario;
import VISTA.Formulario_Compras;
import VISTA.Formulario_Login;
import VISTA.Formulario_Menu_Principal_Encargado;
import VISTA.Formulario_Menu_Principal_Vendedor;
import VISTA.Formulario_Modifica_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Esta clase se encarga de controlar el acceso a la aplicación de un usuario cuando este pulsa el botón de "Entrar"
 * @author GERMAN
 */
public class Controlador_Fomulario_Login_Entrar implements ActionListener {
   
   Usuario usuario;
   
   /**
    * Este método valida si el usuario introducido está presente en la base de datos
    * @param texto_usuario nombre del usuario a validar
    * @return True si el usuario esta presente en la base de datos, False si no lo está
    */
    
  public boolean valida_usuario_existe(String texto_usuario){
        
       
          
        boolean consulta_con_contenido=false;
        ResultSet consulta_usuario = null;
    
        try {
            
            consulta_usuario= new Consulta_Usuarios().Ejecuta_Consulta(texto_usuario);
            
            consulta_con_contenido=consulta_usuario.next();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Controlador_Formulario_Registro_Producto_Validar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
          if(consulta_con_contenido==true){
        
            try {
                
            
                usuario= new Usuario(consulta_usuario.getInt(1),consulta_usuario.getString(2),consulta_usuario.getString(3),
                        new Tipo_Usuario(consulta_usuario.getInt(4)));
                
                 
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Controlador_Fomulario_Login_Entrar.class.getName()).log(Level.SEVERE, null, ex);
            }
              
            return true;
            
        }else{
            
            return false;
        }  
          
        
        
               
                
    }  
  /**
   * Este método valida si la contraseña para un determinado usuario es correcta
   * @param texto_contraseña contraseña del usuario a validar
   * @return True si la contraseña es válida, False si es inválida
   */
  
  
  public boolean valida_contraseña(String texto_contraseña){
      
      if(texto_contraseña.equals(usuario.getContraseña())){
      
          return true;
          
      }else{
          
          return false;
      }
      
      
  };
  
 /**
  * Este método despliega las etiquetas de error si las hubiere ante los datos introducidos en el un formulario del usuario
  * @param marco Formulario del cual se quieren comprobar los errores
  */
  
  public void muestra_etiquetas_error(Formulario_Login marco){
   
       JTextField texto_usuario=marco.getTexto_usuario();
               
       JTextField texto_contraseña=marco.getTexto_Contraseña_usuario();
       
       
       JLabel Etiqueta_error_usuario=marco.getEtiqueta_error_usuario();
               
       JLabel Etiqueta_error_contraseña=marco.getEtiqueta_error_contraseña();
   
   
       if(valida_usuario_existe(texto_usuario.getText())){
           
            Etiqueta_error_usuario.setVisible(false);
            
                if(valida_contraseña(texto_contraseña.getText())){
                       
                    Etiqueta_error_usuario.setVisible(false);
                    Etiqueta_error_contraseña.setVisible(false);

                }
                else{
                    Etiqueta_error_usuario.setVisible(false);
                    Etiqueta_error_contraseña.setVisible(true);
                }
           
            }else{
           
            Etiqueta_error_usuario.setVisible(true);
            Etiqueta_error_contraseña.setVisible(false);
   
   }
    
    
}
  
  /**
   * Este método comprueba si los datos introducidos en el formulario
   * son correctos y permite o no la entrada del usuario a la aplicación conforme a su tipo de usuario
   * @param marco Formulario en el cual se introdujeron los datos del usuario
   * @param e Objeto evento que captura la pulsación del botón
   */
  public void valida_usuario(Formulario_Login marco, ActionEvent e){
    

               
       JTextField texto_usuario=marco.getTexto_usuario();
               
       JTextField texto_contraseña=marco.getTexto_Contraseña_usuario();
               
       
       
       boolean usuario_correcto=valida_usuario_existe(texto_usuario.getText());
       
       
      
 
       
       if(usuario_correcto==true){
       
            boolean contraseña=valida_contraseña(texto_contraseña.getText());
            
            if(contraseña==true){
            
            Tipo_Usuario tipo_usuario=usuario.getTipo_usuario();
           
            Usuario.setUsuario_en_curso(usuario);
           
           
           if(tipo_usuario.getId_Tipo_Usuario()==1){
               
                
                JButton boton_pulsado=(JButton)e.getSource();
        
                 JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
                formulario.setVisible(false);

                new Formulario_Menu_Principal_Encargado().setVisible(true);

                formulario.dispose();
           
           
               
           }else{
           
                JButton boton_pulsado=(JButton)e.getSource();
        
                 JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
                formulario.setVisible(false);

                new Formulario_Menu_Principal_Vendedor().setVisible(true);

                formulario.dispose();
               
               
           }
            
            
            }
           
       }else{
       
           System.out.println("No entra");
       
       }
       
       
       
     
               
               
                       
                 
                               
                               
                                       
                                       
       
    }
  
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton  boton_entra_usuario=(JButton)e.getSource();
        
       Formulario_Login marco=(Formulario_Login)SwingUtilities.getWindowAncestor(boton_entra_usuario);
        
       muestra_etiquetas_error(marco);
       
       valida_usuario(marco,e);
      
        
     
        
    }
}
