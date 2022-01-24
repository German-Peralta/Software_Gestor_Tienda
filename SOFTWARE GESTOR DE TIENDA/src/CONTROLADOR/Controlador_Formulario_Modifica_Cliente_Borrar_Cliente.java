/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Borrar_Cliente;
import VISTA.Formulario_Modifica_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *Esta clase se en carga de borrar un cliente especificado en un formulario cuando se pulsa un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Modifica_Cliente_Borrar_Cliente implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        JButton  boton_borrar_Cliente=(JButton)ae.getSource();
        
        Formulario_Modifica_Cliente marco=(Formulario_Modifica_Cliente)SwingUtilities.getWindowAncestor(boton_borrar_Cliente);
        
       
        
        int resultado_borrado=new Borrar_Cliente().Ejecuta_borrado_cliente(marco.getDesplegable_DNI().getSelectedItem().toString());
        
        if(resultado_borrado==1){
            
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "El cliente se ha borrado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        
        marco.getDesplegable_DNI().setSelectedIndex(0);
            
        }else{
            
             Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "No se puede borrar el cliente puesto que esta presente en una compra o venta",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        }
        
        ;
        
        
    }

  
    
    
    
}
