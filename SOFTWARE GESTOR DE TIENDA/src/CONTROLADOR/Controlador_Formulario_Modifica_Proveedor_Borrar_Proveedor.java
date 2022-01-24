/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Borrar_Proveedor;
import VISTA.Formulario_Modifica_Proveedor;
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
public class Controlador_Formulario_Modifica_Proveedor_Borrar_Proveedor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        JButton  boton_registra_producto=(JButton)ae.getSource();
        
        Formulario_Modifica_Proveedor marco=(Formulario_Modifica_Proveedor)SwingUtilities.getWindowAncestor(boton_registra_producto);
        
       
        
        int resultado_borrado=new Borrar_Proveedor().Ejecuta_borrado_proveedor(marco.getDesplegable_CIF().getSelectedItem().toString());
        
        if(resultado_borrado==1){
            
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "El producto se ha borrado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        
        marco.getDesplegable_CIF().setSelectedIndex(0);
            
        }else{
            
             Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "No se puede borrar el proveedor puesto que esta presente en una compra o venta",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        }
        
        ;
        
        
    }
    
    
    
    
}
