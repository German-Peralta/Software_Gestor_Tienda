/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Producto;
import VISTA.Formulario_Registro_Compra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *Esta clase elimina un producto a la tabla de detalle de compra cuando se pulsa un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Compra_Elimina_Producto implements ActionListener{
/**
 * Este método actualiza el detalle de base imponible y total de factura cada vez que se elimina un producto
 * @param marco Formulario
 */
    public void actualiza_importes( Formulario_Registro_Compra marco){
    
         JLabel etiqueta_base_imponible=marco.getImporte_Base_Imponible();
         
         JLabel etiqueta_IVA=marco.getImporte_IVA();
         
         JLabel etiqueta_Total=marco.getImporte_Total();
         
         JTable tabla=marco.getjTable1();
         
         int fila_seleccionada=tabla.getSelectedRow();
         
         TableModel datos_tabla=tabla.getModel();
         
         //Cogemos cantidades iniciales, les quitamos el simbolo de '€' y las transformamos
         //a double para operar con ellas
         
         //Double cantidad=Double.parseDouble(marco.getCampo_cantidad().getText());
         
         Double base_imponible_inicial=Double.parseDouble(etiqueta_base_imponible.getText().replace('€', '\u0000').trim());
         
         Double IVA_inicial=Double.parseDouble(etiqueta_IVA.getText().replace('€', '\u0000').trim());
         
         Double Total_inicial=Double.parseDouble(etiqueta_Total.getText().replace('€', '\u0000').trim());
         
         
         Double cantidad_tabla=Double.parseDouble(datos_tabla.getValueAt(fila_seleccionada, 2).toString());
         
         Double precio_unitario=Double.parseDouble(datos_tabla.getValueAt(fila_seleccionada, 3).toString());
         
         Double tipo_iva=Double.parseDouble(datos_tabla.getValueAt(fila_seleccionada, 4).toString());
         
        

         
         Double base_imponible_restar=cantidad_tabla*precio_unitario;
                 
         Double IVA_restar=base_imponible_restar*(tipo_iva/100);
                 
         Double Total_restar=base_imponible_restar+IVA_restar;
                 
         
         
         Double base_imponible_final=base_imponible_inicial-base_imponible_restar;
     
         Double IVA_final=IVA_inicial-IVA_restar;
                 
         Double Total_final=Total_inicial-Total_restar;
         
         
                 
         etiqueta_base_imponible.setText(String.format("%.2f",base_imponible_final).replace(',', '.')+" €");
         
         etiqueta_IVA.setText(String.format("%.2f",IVA_final).replace(',', '.')+" €");
         
         etiqueta_Total.setText(String.format("%.2f",Total_final).replace(',', '.')+" €");
         
         
      
         
    };
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    
        
      JButton  boton_elimina_producto=(JButton)ae.getSource();
        
      Formulario_Registro_Compra marco=(Formulario_Registro_Compra)SwingUtilities.getWindowAncestor(boton_elimina_producto);
       
      JTable tabla=marco.getjTable1();
       
      DefaultTableModel modelo_datos_tabla=(DefaultTableModel) tabla.getModel();
      
      if(tabla.getSelectedRow()!=-1){
          
      marco.getEtiqueta_Error_no_seleccion().setVisible(false);
          
       
      
      actualiza_importes(marco);
       
      modelo_datos_tabla.removeRow(tabla.getSelectedRow());
      
      
      }else{
      
      marco.getEtiqueta_Error_no_seleccion().setVisible(true);
      
      }
      
        
    }
    
}
