/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Modifica_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de modificación del producto ante la pulsación de un botón
 * @author german
 */
public class Controlador_Formulario_Modifica_Producto_Abrir implements ActionListener{
    
     @Override
    public void actionPerformed(ActionEvent e) {
    
      JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       new Formulario_Modifica_Producto().setVisible(true);
       formulario.dispose();
    }
}
