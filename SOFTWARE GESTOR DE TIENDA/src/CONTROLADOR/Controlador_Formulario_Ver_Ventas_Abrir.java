/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Proveedores;
import VISTA.Formulario_Ver_Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de visualización de ventas ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Ventas_Abrir implements ActionListener {
    
     
    @Override
    public void actionPerformed(ActionEvent e) {
         
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       new Formulario_Ver_Ventas().setVisible(true);
       
       formulario.dispose();

        
        
        
    }
    
}
