/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Ventas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

/**
 *Esta clase se encarga de aplicar el fitro de registro venta de la tabla despues que el usuario libere la pulsación de una tecla en el cuadro de texto
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Ventas_Digitacion_Registro_Venta extends KeyAdapter{
    
   
    
   @Override
   public void keyReleased(KeyEvent ke){
       
      JTextField texto_filtro_registro=(JTextField)ke.getSource();
       
      Formulario_Ver_Ventas formulario = (Formulario_Ver_Ventas) SwingUtilities.getWindowAncestor(texto_filtro_registro);
      
      JTable tabla=(JTable)formulario.getTabla_informe_compras(); 
       
      TableRowSorter organizador_tabla=new TableRowSorter(tabla.getModel()); 
       
   
   
      organizador_tabla.setRowFilter(RowFilter.regexFilter("^"+texto_filtro_registro.getText()+"$",0));
      tabla.setRowSorter(organizador_tabla);
   }
    
    
    
}
