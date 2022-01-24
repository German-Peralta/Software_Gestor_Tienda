/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.Formulario_Ver_Compras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;

/**
 *Esta clase reinicia la tabla a su estado inicial sin la aplicación de ningun filtro
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Compras_Reiniciar_Filtros implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
     JButton texto_filtro_total_factura=(JButton)ae.getSource();
       
     Formulario_Ver_Compras formulario= (Formulario_Ver_Compras) SwingUtilities.getWindowAncestor(texto_filtro_total_factura);
      
     JTable tabla=(JTable)formulario.getTabla_informe_compras(); 
      
     TableRowSorter organizador_tabla=new TableRowSorter(tabla.getModel()); 
       
     organizador_tabla.setRowFilter(null);
      
     tabla.setRowSorter(organizador_tabla);
     
     formulario.getTexto_filtrar_registro_compra().setText("");
     formulario.getTexto_filtrar_total_factura().setText("");
     formulario.getSelector_filtro_fecha().setCalendar(null);
     
    }
       
}