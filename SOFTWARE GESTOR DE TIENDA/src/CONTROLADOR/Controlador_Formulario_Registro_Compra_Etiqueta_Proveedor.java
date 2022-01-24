/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Proveedor;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.*;

/**
 *Esta clase rellena el dato del nombre del proveedor en la etiqueta correspondiente cuando se selecciona el CIF en el desplegable del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Compra_Etiqueta_Proveedor implements ActionListener{
    
    
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        JComboBox  Desplegable_Proveedores=(JComboBox)ae.getSource();
        
        Formulario_Registro_Compra marco=(Formulario_Registro_Compra)SwingUtilities.getWindowAncestor(Desplegable_Proveedores);
            
        String CIF_proveedor=(String) Desplegable_Proveedores.getSelectedItem();
            
        Iterator<Proveedor> it= marco.getLista_proveedores(). iterator();
       
        while(it.hasNext()) {
      
        Proveedor proveedor=it.next();
            
         if (proveedor.getCIF().equals(CIF_proveedor)){
         
             marco.getEtiqueta_Proveedor().setText(proveedor.getRazon_social());
             
            
             
         }
    }
            
        }

   
}
