/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *Esta clase sirve para limpiar el texto por defecto del campo de texto de la contraseña cuando nos situamos en él
 * @author GERMAN
 */
public class Controlador_Formulario_Login_Texto_Contraseña implements FocusListener {

    JPasswordField texto_contraseña;
    
    
    @Override
    public void focusGained(FocusEvent e) {
        
        
        texto_contraseña=(JPasswordField)e.getSource();
        
        texto_contraseña.setText("");
        
        
        
    }

    @Override
    public void focusLost(FocusEvent fe) {
        
        texto_contraseña=(JPasswordField)fe.getSource();
        
        if(texto_contraseña.getPassword().length==0){
            texto_contraseña.setText("Contraseña");
            
        
           }
    }
}
