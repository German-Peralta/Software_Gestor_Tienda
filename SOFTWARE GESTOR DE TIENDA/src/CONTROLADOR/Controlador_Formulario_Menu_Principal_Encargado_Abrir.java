/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Usuario;
import VISTA.Formulario_Menu_Principal_Encargado;
import VISTA.Formulario_Menu_Principal_Vendedor;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de menu principal del encargado ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Menu_Principal_Encargado_Abrir implements ActionListener {
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       formulario.dispose();
       
       if(Usuario.getUsuario_en_curso().getTipo_usuario().getId_Tipo_Usuario()==1){
       
       new Formulario_Menu_Principal_Encargado().setVisible(true);
       
       }else{
         new Formulario_Menu_Principal_Vendedor().setVisible(true);
       }
       
      
       
     
       
     
        
    }
    
    
}
