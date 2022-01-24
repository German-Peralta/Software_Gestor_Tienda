/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Ultimo_Registro_Venta;
import MODELO.Inserta_Venta;
import VISTA.Formulario_Registro_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/**
 *Esta clase se encarga de validar e insertar una venta ante la pulsación de un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Venta_Validar_Venta implements ActionListener{
/**
 * Reinicia los cuadros de texto del formulario
 * @param marco formulario
 */
    public void reiniciar_campos(Formulario_Registro_Venta marco){
    
    marco.getDesplegable_Clientes().setSelectedIndex(0);
    marco.getDesplegable_Producto().setSelectedIndex(0);
    marco.getjDateChooser1().setCalendar(null);
    marco.getCampo_cantidad().setText("");
    
    JTable tabla=marco.getjTable1();
    
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0);
    
    marco.getImporte_Base_Imponible().setText("0 €");
    marco.getImporte_IVA().setText("0 €");
    marco.getImporte_Total().setText("0 €");
    
    
    JLabel Etiqueta_Registro_Venta=marco.getEtiqueta_Registro_Venta();
        
    int ultimo_registro=new Consulta_Ultimo_Registro_Venta().Ejecuta_Consulta();
       
    Etiqueta_Registro_Venta.setText(String.valueOf(ultimo_registro+1));
        
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
       
       JButton  boton_venta=(JButton)ae.getSource();
        
       Formulario_Registro_Venta marco=(Formulario_Registro_Venta)SwingUtilities.getWindowAncestor(boton_venta);
       
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
              
       Inserta_Venta inserta_venta=new Inserta_Venta();
       
       int resultado_insercion_venta=0;
       int resultado_insercion_detalle_venta=0;
       
       System.out.println("registro "+marco.getEtiqueta_Registro_Venta().getText());
       System.out.println("cliente "+String.valueOf(marco.getDesplegable_Clientes().getSelectedItem()));
       System.out.println("fecha "+fecha_string );
       
       resultado_insercion_venta= inserta_venta.Ejecuta_inseccion_venta(marco.getEtiqueta_Registro_Venta().getText(), 
               String.valueOf(marco.getDesplegable_Clientes().getSelectedItem()),fecha_string );
       
    
       System.out.println("Insercion tabla venta"+resultado_insercion_venta);
     
       for (int i = 0; i < tabla.getRowCount(); i++) {
           
          resultado_insercion_detalle_venta= inserta_venta.Ejecuta_inseccion_detalle_venta(marco.getEtiqueta_Registro_Venta().getText(), 
                   String.valueOf(tabla.getValueAt(i, 0)),
                   String.valueOf(tabla.getValueAt(i, 2)),
                   String.valueOf(tabla.getValueAt(i, 3)),
                   String.valueOf(tabla.getValueAt(i, 4)));
      
       }
       
       
       if(resultado_insercion_venta==1 && resultado_insercion_detalle_venta==1){
       
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

