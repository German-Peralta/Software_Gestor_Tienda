/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Registro_Producto;
import VISTA.Formulario_Ver_Compras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario visualización de compras ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Compras_Abrir  implements ActionListener {
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       new Formulario_Ver_Compras().setVisible(true);
       formulario.dispose();
        
    }
    
}