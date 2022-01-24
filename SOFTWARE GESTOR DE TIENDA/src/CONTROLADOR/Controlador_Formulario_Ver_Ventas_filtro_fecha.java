/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Ventas;
import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Ventas_filtro_fecha implements PropertyChangeListener{
    
   
    
   @Override
   public void propertyChange(PropertyChangeEvent  ke){
       
      try{
       
      JDateChooser fecha_selector=(JDateChooser)ke.getSource();
       
      Formulario_Ver_Ventas formulario = (Formulario_Ver_Ventas) SwingUtilities.getWindowAncestor(fecha_selector);
      

      SimpleDateFormat fecha_formato=new SimpleDateFormat("yyyy-MM-dd");
      
      String fecha=fecha_formato.format(fecha_selector.getDate());
      
   
      
      JTable tabla=(JTable)formulario.getTabla_informe_compras(); 
       
      TableRowSorter organizador_tabla=new TableRowSorter(tabla.getModel()); 
      
    
      organizador_tabla.setRowFilter(RowFilter.regexFilter(fecha.trim(),2));
      
      tabla.setRowSorter(organizador_tabla);
      
      }catch(Exception e){};
      
      
   }

   
    
    
}
