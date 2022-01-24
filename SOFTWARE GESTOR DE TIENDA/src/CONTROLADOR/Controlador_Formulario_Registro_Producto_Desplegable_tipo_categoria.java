/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Categoria;
import MODELO.Consulta_General;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Registro_Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *Esta clase se encarga de mostrar en un formulario la opcion de seleccionar una categoria o introducir una nueva al pulsar sobre el desplegable
 * @author german
 */
public class Controlador_Formulario_Registro_Producto_Desplegable_tipo_categoria implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JComboBox  Desplegable_tipo_categoria=(JComboBox)e.getSource();
        
        Formulario_Registro_Producto marco=(Formulario_Registro_Producto)SwingUtilities.getWindowAncestor(Desplegable_tipo_categoria);
            
        String seleccion=(String)Desplegable_tipo_categoria.getSelectedItem();
        
        
         switch(seleccion){
        
            case "Categorías disponibles":
                marco.getPanel_Seleccione_Categoria().setVisible(true);
                ResultSet resultado_2=new Consulta_General().Ejecuta_Consulta("categoria");
                JComboBox Desplegable_selecciona_categoria=marco.getDesplegable_Categoria();
            {
                try {
                     Desplegable_selecciona_categoria.removeAllItems();
                    while(resultado_2.next()){
                       
                        Categoria categoria= new Categoria(resultado_2.getInt(1), resultado_2.getString(2) );
                        
                        Desplegable_selecciona_categoria.addItem(categoria);
                         
                    }   
                    resultado_2.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador_Formulario_Modifica_Producto_Desplegable_tipo_categoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
           
                
                marco.getPanel_Nueva_Categoria().setVisible(false);
                marco.setNueva_categoria(false);
                break;

                
            case "Nueva Categoría":
                 marco.getPanel_Seleccione_Categoria().setVisible(false);
                marco.getPanel_Nueva_Categoria().setVisible(true);
                marco.setNueva_categoria(true);
                
                break;
            
        }
        
        
        
        
        
    }
    
    
}
