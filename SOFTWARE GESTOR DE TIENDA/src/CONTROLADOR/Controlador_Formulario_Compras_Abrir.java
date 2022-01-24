/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Usuario;
import VISTA.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de selección de opciones del compras ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Compras_Abrir implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       formulario.dispose();
       
       new Formulario_Compras().setVisible(true);
       
       
       
      
        
    }
    
}
