/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Compras;
import VISTA.Formulario_Ver_Productos;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Compras_filtro_fecha  implements PropertyChangeListener{
    
   
    
   @Override
   public void propertyChange(PropertyChangeEvent  ke){
       
      try{
       
      JDateChooser fecha_selector=(JDateChooser)ke.getSource();
       
      Formulario_Ver_Compras formulario = (Formulario_Ver_Compras) SwingUtilities.getWindowAncestor(fecha_selector);
      

      SimpleDateFormat fecha_formato=new SimpleDateFormat("yyyy-MM-dd");
      
      String fecha=fecha_formato.format(fecha_selector.getDate());
      
   
      
      JTable tabla=(JTable)formulario.getTabla_informe_compras(); 
       
      TableRowSorter organizador_tabla=new TableRowSorter(tabla.getModel()); 
      
    
      organizador_tabla.setRowFilter(RowFilter.regexFilter(fecha.trim(),2));
      
      tabla.setRowSorter(organizador_tabla);
      
      }catch(Exception e){};
      
      
   }

   
    
    
}

