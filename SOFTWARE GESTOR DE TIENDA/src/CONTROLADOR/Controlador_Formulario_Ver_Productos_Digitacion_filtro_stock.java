/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Productos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

/**
 *Esta clase se encarga de aplicar el fitro de stock de la tabla despues que el usuario libere la pulsación de una tecla en el cuadro de texto
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Productos_Digitacion_filtro_stock extends KeyAdapter{
    
   
    
   @Override
   public void keyReleased(KeyEvent ke){
       
      JTextField texto_filtro_nombre=(JTextField)ke.getSource();
       
      Formulario_Ver_Productos formulario = (Formulario_Ver_Productos) SwingUtilities.getWindowAncestor(texto_filtro_nombre);
      
      JTable tabla=(JTable)formulario.getTabla_productos(); 
       
      TableRowSorter organizador_tabla=new TableRowSorter(tabla.getModel()); 
     
      organizador_tabla.setRowFilter(RowFilter.regexFilter("(?i)"+texto_filtro_nombre.getText(), 2));
      
      tabla.setRowSorter(organizador_tabla);
      
   }
    
    
    
}
