/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import java.awt.event.ActionListener;
import MODELO.Producto;
import MODELO.Proveedor;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.*;
/**
 *Esta clase rellena el dato del nombre del producto en la etiqueta correspondiente cuando se selecciona el codigo de barras en el desplegable del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Compra_Etiqueta_Producto implements ActionListener {
    
         @Override
        public void actionPerformed(ActionEvent ae) {
            
        JComboBox  Desplegable_Producto=(JComboBox)ae.getSource();
        
        Formulario_Registro_Compra marco=(Formulario_Registro_Compra)SwingUtilities.getWindowAncestor(Desplegable_Producto);
            
        String Codigo_barras_producto=(String)Desplegable_Producto.getSelectedItem();
        
            
        Iterator<Producto> it= marco.getLista_productos(). iterator();
       
        while(it.hasNext()) {
      
        Producto producto=it.next();
            
      
        if (producto.getCodigo_de_barras().equals(Codigo_barras_producto)){
         
             marco.getEtiqueta_Producto().setText(producto.getNombre());
             
         }
    }
            
        }}
    
    

