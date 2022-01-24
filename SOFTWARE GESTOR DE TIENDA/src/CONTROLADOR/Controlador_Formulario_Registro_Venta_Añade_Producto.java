/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Producto;
import MODELO.Producto;
import VISTA.Formulario_Registro_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *Esta clase añade un producto a la tabla de detalle de venta cuando se pulsa un botón
 * @author GERMAN
 */
public class Controlador_Formulario_Registro_Venta_Añade_Producto implements ActionListener {
   
    /**
     * Este método valida que este en un formato correcto la cantidad introducida,
     * admintiendo numero negativos
     * @param texto cantidad 
     * @return True si el formato es valido, False en caso contrario
     */
    
      public boolean valida_campo_cantidad(String texto){
    
         Pattern patron=Pattern.compile("^-?\\d+$");
         
         Matcher coincidencia=patron.matcher(texto);
             
         return coincidencia.matches();
         
    }
/**
 * Este método valida que no al introducir una cantidad no se incurra en un stock negativo de un producto
 * @param producto producto a comprobar
 * @param cantidad cantidad a introducir
 * @return True si el stock resultante no es negativo, False en caso contrario
 */
      public boolean valida_stock(String producto, String cantidad){
    
        ResultSet resultado_consulta= new Consulta_Producto().Ejecuta_Consulta(producto);
        
        int resultado=0;
        try {
            resultado_consulta.next();
            int stock_actual=resultado_consulta.getInt(2);
            
            
            
            resultado=stock_actual-Integer.parseInt(cantidad);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Añade_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        if(resultado<0){
            return false;
        }else{
             
         return true;
        }
        
     }   
        /**
         * Este método actualiza el detalle de base imponible y total de factura cada vez que se añade un producto
         * @param marco Formulario en el cual se añade un producto
         * @param producto producto que se añade a la compra
         */
      public void actualiza_importes( Formulario_Registro_Venta marco, Producto producto){
    
         JLabel etiqueta_base_imponible=marco.getImporte_Base_Imponible();
         
         JLabel etiqueta_IVA=marco.getImporte_IVA();
         
         JLabel etiqueta_Total=marco.getImporte_Total();
         
         //Cogemos cantidades iniciales, les quitamos el simbolo de '€' y las transformamos
         //a double para operar con ellas
         
         Double cantidad=Double.parseDouble(marco.getCampo_cantidad().getText());
         
         Double base_imponible_inicial=Double.parseDouble(etiqueta_base_imponible.getText().replace('€', '\u0000').trim());
         
         Double IVA_inicial=Double.parseDouble(etiqueta_IVA.getText().replace('€', '\u0000').trim());
         
         Double Total_inicial=Double.parseDouble(etiqueta_Total.getText().replace('€', '\u0000').trim());
         
         
         Double base_imponible_añadir=producto.getPrecio_Compra()*cantidad;
                 
         Double IVA_añadir=(((double)(producto.getTipo_Iva_Soportado()))/100)*base_imponible_añadir;
                 
         Double Total_añadir=base_imponible_añadir+IVA_añadir;
                 
         
         
         Double base_imponible_final=base_imponible_inicial+base_imponible_añadir;
     
         Double IVA_final=IVA_inicial+IVA_añadir;
                 
         Double Total_final=Total_inicial+Total_añadir;
         
         
                 
         etiqueta_base_imponible.setText(String.format("%.2f",base_imponible_final).replace(',', '.')+" €");
         
         etiqueta_IVA.setText(String.format("%.2f",IVA_final).replace(',', '.')+" €");
         
         etiqueta_Total.setText(String.format("%.2f",Total_final).replace(',', '.')+" €");
         
         
      
         
    };
      
       
       
       
       
       
    @Override
    public void actionPerformed(ActionEvent e) {
             
       JButton  boton_añadir_producto=(JButton)e.getSource();
        
       Formulario_Registro_Venta marco=(Formulario_Registro_Venta)SwingUtilities.getWindowAncestor(boton_añadir_producto);
           
       String cantidad=marco.getCampo_cantidad().getText();
       
       com.toedter.calendar.JDateChooser fecha=marco.getjDateChooser1();
               
       if(fecha.getDate()==null && valida_campo_cantidad(cantidad)==false){
       
           marco.getEtiqueta_Error_fecha().setVisible(true);
           marco.getEtiqueta_Error_cantidad().setVisible(true);
       }
       
       else if(fecha.getDate()!=null && valida_campo_cantidad(cantidad)==false ){
           
           marco.getCampo_cantidad().setText("");
           marco.getEtiqueta_Error_fecha().setVisible(false);     
           marco.getEtiqueta_Error_cantidad().setVisible(true);
            marco.getCampo_cantidad().requestFocus();
           
       }
       
       else if(fecha.getDate()==null && valida_campo_cantidad(cantidad)==true ){
           
           marco.getEtiqueta_Error_cantidad().setVisible(false);    
           marco.getEtiqueta_Error_fecha().setVisible(true);
       }        
       else{
      
           
       marco.getEtiqueta_Error_fecha().setVisible(false);   
       marco.getEtiqueta_Error_cantidad().setVisible(false);
       
       
       // FORMA VALIDA COMPROBAMOS SI YA ESTABA EN EL JTABLE
        
               
       JComboBox Desplegable_productos=marco.getDesplegable_Producto();
       
       String producto_seleccionado=(String)Desplegable_productos.getSelectedItem();
       
       
       JTable tabla=marco.getjTable1();
       
       DefaultTableModel modelo_datos_tabla=(DefaultTableModel) tabla.getModel();
       
      
       //RECORREMOS JTABLE Y COMPROBAMOS SI ESTÁ O NO ESE PRODUCTO
       
       boolean producto_duplicado=false;
       
       for(int i=0;i<modelo_datos_tabla.getRowCount();i++){
       
           if(producto_seleccionado.equals(modelo_datos_tabla.getValueAt(i, 0))){              
               producto_duplicado=true;
               break;
           }
       }
       
       if(producto_duplicado==true){
           
           marco.getEtiqueta_Error_producto_duplicado().setVisible(true);
           
           
           
       }else{
           
           marco.getEtiqueta_Error_producto_duplicado().setVisible(false);
           marco.getEtiqueta_Error_no_seleccion().setVisible(false);
          
           if(valida_stock(producto_seleccionado,cantidad)==false){
               marco.getEtiqueta_Error_Stock().setVisible(true);
           
           }else{
                marco.getEtiqueta_Error_Stock().setVisible(false);
           //
           try {
               ResultSet resultado_consulta=new Consulta_Producto().Ejecuta_Consulta(producto_seleccionado);
               
               
               resultado_consulta.next();
               
               Producto producto=new Producto(resultado_consulta.getString(1),
                       Integer.parseInt(resultado_consulta.getString(2)),
                       resultado_consulta.getString(3),
                       Double.parseDouble(resultado_consulta.getString(5)),
                       Integer.parseInt(resultado_consulta.getString(7)));
               
               
               modelo_datos_tabla.addRow(new Object[]{producto.getCodigo_de_barras(),producto.getNombre(),
                   cantidad,
                   producto.getPrecio_Compra(),producto.getTipo_Iva_Soportado()}); 
               
               
               //actualizamos etiquetas
               
               actualiza_importes(marco,  producto);
               
           
           
           } catch (SQLException ex) {
               Logger.getLogger(Controlador_Formulario_Registro_Compra_Añade_Producto.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           //
           }
       }
       
       
       
          
           
           
       }
        
        
        
    }
    
    
    
    
}
