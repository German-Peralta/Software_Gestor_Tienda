/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Registro_Compra;
import VISTA.Formulario_Registro_Producto;
import VISTA.Formulario_Ver_Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de abrir un formulario de visualización de productos ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Productos_Abrir implements ActionListener {
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
     
       formulario.dispose();
       
       new Formulario_Ver_Productos().setVisible(true);
      
        
    }
    
}
