/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Proveedor;
import VISTA.Formulario_Modifica_Proveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *Esta clase rellena con datos el formulario de modifica proveedor al seleccionar un proveedor en el desplegable
 * @author german
 */
public class Controlador_Formulario_Modifica_Proveedor_Desplegable_Datos implements ActionListener  {

    @Override
    public void actionPerformed(ActionEvent e) {
       
        JComboBox  Desplegable_Producto=(JComboBox)e.getSource();
        
        Formulario_Modifica_Proveedor marco=(Formulario_Modifica_Proveedor)SwingUtilities.getWindowAncestor(Desplegable_Producto);
            
        Proveedor proveedor=(Proveedor)Desplegable_Producto.getSelectedItem();
        
        
        marco.getTexto_razon_social().setText(proveedor.getRazon_social());
        marco.getTexto_web().setText(proveedor.getWeb());
        marco.getTexto_telefono().setText(String.valueOf(proveedor.getTelefono()));
        marco.getTexto_calle().setText(proveedor.getCalle());
        marco.getTexto_numero().setText(String.valueOf(proveedor.getNumero()));
        marco.getTexto_codigo_postal().setText(String.valueOf(proveedor.getCodigo_postal()));
        marco.getTexto_ciudad().setText(proveedor.getCiudad());
        
        
        
       
        
    
        
        
        
    }
    
}
