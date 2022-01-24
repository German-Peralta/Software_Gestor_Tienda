/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Liquidacion_IVA;
import VISTA.Formulario_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de selección de liquidación de IVA ante la pulsación de un botóN
 * @author german
 */
public class Controlador_Formulario_Liquidacion_IVA_Abrir implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.setVisible(false);
       
       new Formulario_Liquidacion_IVA().setVisible(true);
       formulario.dispose();
        
    }
    
    
}