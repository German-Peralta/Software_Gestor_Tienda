/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import VISTA.Formulario_Menu_Principal_Encargado;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Menu_Principal_Encargado implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
       
       JButton boton_pulsado=(JButton)e.getSource();
        
       JFrame formulario = (JFrame) SwingUtilities.getWindowAncestor(boton_pulsado);
       
       String texto_boton=boton_pulsado.getText();
       
       switch(texto_boton){
       
           case "COMPRAS":
               formulario.setVisible(false);
               new Formulario_Compras().setVisible(true);
               formulario.dispose();
               break;
           case "VENTAS":
               formulario.setVisible(false);
               System.out.println("ventas");
               formulario.dispose();
               break;
           case "PRODUCTOS":
               formulario.setVisible(false);
               new Formulario_Producto().setVisible(true);
               formulario.dispose();
               break;
           case "PROVEEDORES":
               formulario.setVisible(false);
               formulario.dispose();
               break;
           case "CLIENTES":
               formulario.setVisible(false);
               formulario.dispose();
               break;
       
       
       }
        
      
       
    }
    
}
