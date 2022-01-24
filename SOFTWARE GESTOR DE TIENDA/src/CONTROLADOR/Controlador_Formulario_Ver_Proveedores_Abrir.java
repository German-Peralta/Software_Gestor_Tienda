/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Productos;
import VISTA.Formulario_Ver_Proveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de visualización de proveedores ante la pulsación de un botón
 * @author german
 */
public class Controlador_Formulario_Ver_Proveedores_Abrir implements ActionListener {
    
     
    @Override
    public void actionPerformed(ActionEvent e) {
         
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       new Formulario_Ver_Proveedores().setVisible(true);
       
       formulario.dispose();

        
        
        
    }
    
}
