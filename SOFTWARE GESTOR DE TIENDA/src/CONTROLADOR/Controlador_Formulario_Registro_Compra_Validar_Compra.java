/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Consulta_Ultimo_Registro_Compra;
import MODELO.Inserta_Compra;
import VISTA.Formulario_Registro_Compra;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *Esta clase se encarga de validar una compra e insertarla en la base de datos ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Compra_Validar_Compra implements ActionListener{

    /**
     * Este metodo reinicia los cuadros de texto del formulario 
     * @param marco formulario
     */
    
    public void reiniciar_campos(Formulario_Registro_Compra marco){
    
    marco.getDesplegable_Proveedores().setSelectedIndex(0);
    marco.getDesplegable_Producto().setSelectedIndex(0);
    marco.getjDateChooser1().setCalendar(null);
    marco.getCampo_cantidad().setText("");
    
    JTable tabla=marco.getjTable1();
    
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0);
    
    marco.getImporte_Base_Imponible().setText("0 €");
    marco.getImporte_IVA().setText("0 €");
    marco.getImporte_Total().setText("0 €");
    
    
    JLabel Etiqueta_Registro_Compra=marco.getNumero_Registro_Compra();
        
    int ultimo_registro=new Consulta_Ultimo_Registro_Compra().Ejecuta_Consulta();
       
    Etiqueta_Registro_Compra.setText(String.valueOf(ultimo_registro+1));
        
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
       
       JButton  boton_añadir_producto=(JButton)ae.getSource();
        
       Formulario_Registro_Compra marco=(Formulario_Registro_Compra)SwingUtilities.getWindowAncestor(boton_añadir_producto);
       
       Date fecha=marco.getjDateChooser1().getDate();
       
       JTable tabla=marco.getjTable1();
       
       
       
     if(fecha==null || tabla.getRowCount()==0){
         
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
       JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Debe completar los campos para efectuar el registro",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
         
     }else{
     
     String pattern = "yyyy-MM-dd";
       
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

       String fecha_string = simpleDateFormat.format(fecha);
              
       Inserta_Compra inserta_compra=new Inserta_Compra();
       
       int resultado_insercion_compra=0;
       int resultado_insercion_detalle_compra=0;
       
       resultado_insercion_compra= inserta_compra.Ejecuta_inseccion_compra(marco.getEtiqueta_Registro_Compra().getText(), 
               String.valueOf(marco.getDesplegable_Proveedores().getSelectedItem()),fecha_string );
       
       //iterar para cada producto de la tabla
       
       
       //INSERT INTO `detalle compra` (`REGISTRO COMPRA`,`CODIGO DE BARRAS`,`CANTIDAD`) VALUES (6, 2222,50)
       
     
       for (int i = 0; i < tabla.getRowCount(); i++) {
           
          resultado_insercion_detalle_compra= inserta_compra.Ejecuta_inseccion_detalle_compra(marco.getEtiqueta_Registro_Compra().getText(), 
                   String.valueOf(tabla.getValueAt(i, 0)),
                   String.valueOf(tabla.getValueAt(i, 2)),
                   String.valueOf(tabla.getValueAt(i, 3)),
                   String.valueOf(tabla.getValueAt(i, 4)));
      
       }
       
       
       if(resultado_insercion_compra==1 && resultado_insercion_detalle_compra==1){
       
       Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_valido.png"));    
       
       JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Registro efectuado exitosamente",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        
        
       reiniciar_campos(marco);
        
        
           
       }else{
           
        Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
       JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Ha ocurrido un error",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
      
       }
     
     }
       
       
       
        
        
        
    }
    
}
