/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *Esta clase preselecciona del desplegable el tipo de iva correspondiente al producto seleccionado para modificar
 * @author german
 */
public class Controlador_Formulario_Modifica_Producto_Desplegable_Datos implements ActionListener {
    
    public void desplegable_tipo_iva( Producto producto,JComboBox desplegable ){
    
    String tipo_iva=String.valueOf(producto.getTipo_Iva_Soportado());
   
        switch(tipo_iva){
        
            case "21":
                desplegable.setSelectedIndex(0);
                break;
            case "10":
                desplegable.setSelectedIndex(1);
                break;
            case "4":
                desplegable.setSelectedIndex(2);
                break;
        }

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
          
        JComboBox  Desplegable_Producto=(JComboBox)e.getSource();
        
        Formulario_Modifica_Producto marco=(Formulario_Modifica_Producto)SwingUtilities.getWindowAncestor(Desplegable_Producto);
            
        Producto producto=(Producto)Desplegable_Producto.getSelectedItem();
        
        
        marco.getTexto_nombre().setText(producto.getNombre());
        marco.getTexto_descripcion().setText(producto.getDescripcion());
        marco.getTexto_stock_inicial().setText(String.valueOf(producto.getStock()));
        marco.getTexto_precio_compra().setText(String.valueOf(producto.getPrecio_Compra()));
        marco.getTexto_precio_venta().setText(String.valueOf(producto.getPrecio_Venta()));
        
        desplegable_tipo_iva( producto,marco.getTipo_IVA_soportado());
        desplegable_tipo_iva( producto,marco.getTipo_IVA_repercutido());
      
        
        
        
        
          
    }

        
        
        
    }
        
    

