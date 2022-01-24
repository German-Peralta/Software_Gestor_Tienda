/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Cliente;
import VISTA.Formulario_Registro_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *Esta clase rellena el dato del nombre del cliente en la etiqueta correspondiente cuando se selecciona el DNI en el desplegable del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Venta_Etiqueta_Cliente implements ActionListener{
    
    
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        JComboBox  Desplegable_Clientes=(JComboBox)ae.getSource();
        
        Formulario_Registro_Venta marco=(Formulario_Registro_Venta)SwingUtilities.getWindowAncestor(Desplegable_Clientes);
            
        String DNI_Cliente=(String) Desplegable_Clientes.getSelectedItem();
            
        Iterator<Cliente> it= marco.getLista_clientes(). iterator();
       
        while(it.hasNext()) {
      
        Cliente cliente=it.next();
            
         if (cliente.getDNI().equals(DNI_Cliente)){
         
             marco.getEtiqueta_Cliente().setText(cliente.getNombre()+" "+cliente.getApellidos());
             
            
             
         }
    }
            
        }

   

   
}
