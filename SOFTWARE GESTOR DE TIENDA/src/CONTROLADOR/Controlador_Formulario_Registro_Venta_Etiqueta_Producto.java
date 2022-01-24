/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;
import VISTA.Formulario_Registro_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *Esta clase rellena el dato del nombre del producto en la etiqueta correspondiente cuando se selecciona el codigo de barras en el desplegable del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Venta_Etiqueta_Producto implements ActionListener {
    
         @Override
        public void actionPerformed(ActionEvent ae) {
            
        JComboBox  Desplegable_Producto=(JComboBox)ae.getSource();
        
        Formulario_Registro_Venta marco=(Formulario_Registro_Venta)SwingUtilities.getWindowAncestor(Desplegable_Producto);
            
        String Codigo_barras_producto=(String)Desplegable_Producto.getSelectedItem();
        
            
        Iterator<Producto> it= marco.getLista_productos(). iterator();
       
        while(it.hasNext()) {
      
        Producto producto=it.next();
            
      
        if (producto.getCodigo_de_barras().equals(Codigo_barras_producto)){
         
             marco.getEtiqueta_Producto().setText(producto.getNombre());
             
         }
    }
            
        }


}
    
