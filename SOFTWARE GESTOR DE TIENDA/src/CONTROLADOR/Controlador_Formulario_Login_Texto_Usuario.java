/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Login;
import VISTA.Formulario_Registro_Producto;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *Esta clase sirve para limpiar el texto por defecto del campo de texto del usuario cuando nos situamos en él
 * @author GERMAN
 */
public class Controlador_Formulario_Login_Texto_Usuario implements FocusListener {

    JTextField texto_usuario;
    
    @Override
    public void focusGained(FocusEvent e) {
               
        JTextField texto_usuario=(JTextField)e.getSource();
        
        texto_usuario.setText("");
  
    }

    @Override
    public void focusLost(FocusEvent e) {
        
        JTextField texto_usuario=(JTextField)e.getSource();
        
            if(texto_usuario.getText().length()==0){
            
                texto_usuario.setText("Usuario");
            
            }
        
        
           }
    
    
    
    
}
