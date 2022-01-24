/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Consulta_Compras_Detalle_Compra;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Compra;
import VISTA.Formulario_Ver_Compras;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author GERMAN
 */
public class Controlador_Formulario_Ver_Compras_Selecciona_Compra implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        
        try {
            JTable tabla_compra = (JTable)me.getSource();
            
            Formulario_Ver_Compras marco=(Formulario_Ver_Compras)SwingUtilities.getWindowAncestor(tabla_compra);
                     
            DefaultTableModel datos_tabla_compra=(DefaultTableModel) tabla_compra.getModel();
            
            int indice_fila_seleccionada=tabla_compra.getSelectedRow();
            
            String numero_registro_fila_seleccionada=datos_tabla_compra.getValueAt(indice_fila_seleccionada,0).toString();
            
            ResultSet resultado=new Consulta_Compras_Detalle_Compra().Ejecuta_Consulta(numero_registro_fila_seleccionada);
            
            
            JTable tabla_detalle_compra= marco.getTabla_Detalle_Compra();
            DefaultTableModel datos_tabla_detalle_compra=(DefaultTableModel) tabla_detalle_compra.getModel();
            
            datos_tabla_detalle_compra.setRowCount(0);
            
            int numero_filas=0;
            
            while(resultado.next()){
                
                datos_tabla_detalle_compra.addRow(new Object[]{resultado.getString(4),
                    resultado.getString(5),
                    resultado.getString(6),
                    resultado.getString(7)});
                
                numero_filas++;
        } 
            
            marco.getTabla_Detalle_Compra().setPreferredSize(new Dimension(400, numero_filas*16));
            
          
        } catch (SQLException ex) {
            
        } 
           
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    
 
   
    
}
