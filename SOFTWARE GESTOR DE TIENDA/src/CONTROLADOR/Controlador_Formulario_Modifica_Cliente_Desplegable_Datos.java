/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Cliente;
import VISTA.Formulario_Modifica_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Modifica_Cliente_Desplegable_Datos  implements ActionListener  {

    @Override
    public void actionPerformed(ActionEvent e) {
       
        JComboBox  Desplegable_Producto=(JComboBox)e.getSource();
        
        Formulario_Modifica_Cliente marco=(Formulario_Modifica_Cliente)SwingUtilities.getWindowAncestor(Desplegable_Producto);
            
        Cliente cliente=(Cliente)Desplegable_Producto.getSelectedItem();
        
        
        marco.getTexto_nombre().setText(cliente.getNombre());
        marco.getTexto_apellidos().setText(cliente.getApellidos());
        marco.getTexto_telefono().setText(String.valueOf(cliente.getTelefono()));
        marco.getTexto_calle().setText(cliente.getCalle());
        marco.getTexto_numero().setText(String.valueOf(cliente.getNumero()));
        marco.getTexto_codigo_postal().setText(String.valueOf(cliente.getCodigo_postal()));
        marco.getTexto_ciudad().setText(cliente.getCiudad());
        
        
        
       
        
    
        
        
        
    }

  
    
}
