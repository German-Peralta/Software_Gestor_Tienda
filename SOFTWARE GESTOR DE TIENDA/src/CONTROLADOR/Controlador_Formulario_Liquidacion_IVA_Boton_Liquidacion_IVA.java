/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Consulta_Compras_Trimestres;
import MODELO.Consulta_Ventas_Trimestres;
import VISTA.Formulario_Liquidacion_IVA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *Esta clase sirve para calcular el resultado de la liquidación cuando se pulsa un botón
 * @author german
 */
public class Controlador_Formulario_Liquidacion_IVA_Boton_Liquidacion_IVA implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
       JButton  boton_añadir_producto=(JButton)arg0.getSource();
        
       Formulario_Liquidacion_IVA marco=(Formulario_Liquidacion_IVA)SwingUtilities.getWindowAncestor(boton_añadir_producto);
           
       String año_seleccionado=marco.getDesplegable_año().getSelectedItem().toString();
               
       String trimestre_seleccionado=marco.getDesplegable_Trimestre().getSelectedItem().toString();
       
       JTable tabla_IVA_Soportado=marco.getTabla_IVA_Soportado();
       JTable tabla_IVA_Repercutido=marco.getTabla_IVA_Repercutido();
       
       DefaultTableModel modelo_datos_tabla_IVA_Soportado=(DefaultTableModel)tabla_IVA_Soportado.getModel();
       modelo_datos_tabla_IVA_Soportado.setRowCount(0);
       DefaultTableModel modelo_datos_tabla_IVA_Repercutido=(DefaultTableModel)tabla_IVA_Repercutido.getModel();
       modelo_datos_tabla_IVA_Repercutido.setRowCount(0);
       
       Consulta_Compras_Trimestres generador_consultas=new Consulta_Compras_Trimestres();
       
       Consulta_Ventas_Trimestres generador_consultas_1=new Consulta_Ventas_Trimestres();
       
      ResultSet resultado_compras = null;
      ResultSet resultado_ventas = null;
      
      ResultSet resultado_total_compras = null;
      ResultSet resultado_total_ventas = null;
   
      switch(trimestre_seleccionado){
 
        case "1º Trimestre" :
            resultado_compras=generador_consultas.Ejecuta_Consulta_1T(año_seleccionado);
            resultado_ventas=generador_consultas_1.Ejecuta_Consulta_1T(año_seleccionado);
            resultado_total_compras=generador_consultas.Ejecuta_Consulta_Totales_1T(año_seleccionado);
            resultado_total_ventas=generador_consultas_1.Ejecuta_Consulta_Totales_1T(año_seleccionado);
            break;
        case "2º Trimestre" :
            resultado_compras=generador_consultas.Ejecuta_Consulta_2T(año_seleccionado);
            resultado_ventas=generador_consultas_1.Ejecuta_Consulta_2T(año_seleccionado);
            resultado_total_compras=generador_consultas.Ejecuta_Consulta_Totales_2T(año_seleccionado);
            resultado_total_ventas=generador_consultas_1.Ejecuta_Consulta_Totales_2T(año_seleccionado);
            break; 
        case "3º Trimestre" :
            resultado_compras=generador_consultas.Ejecuta_Consulta_3T(año_seleccionado);
            resultado_ventas=generador_consultas_1.Ejecuta_Consulta_3T(año_seleccionado);
            resultado_total_compras=generador_consultas.Ejecuta_Consulta_Totales_3T(año_seleccionado);
            resultado_total_ventas=generador_consultas_1.Ejecuta_Consulta_Totales_3T(año_seleccionado);
            break; 
        case "4º Trimestre" :
            resultado_compras=generador_consultas.Ejecuta_Consulta_4T(año_seleccionado);
            resultado_ventas=generador_consultas_1.Ejecuta_Consulta_4T(año_seleccionado);
            resultado_total_compras=generador_consultas.Ejecuta_Consulta_Totales_4T(año_seleccionado);
            resultado_total_ventas=generador_consultas_1.Ejecuta_Consulta_Totales_4T(año_seleccionado);
            break; 
        }
      
         try {
            
            while(resultado_compras.next()){
               
                modelo_datos_tabla_IVA_Soportado.addRow(new Object[]{resultado_compras.getString(1),
                resultado_compras.getString(2),
                resultado_compras.getString(3)});
           
            }
            
            resultado_compras.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Ver_Proveedores_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            
            while(resultado_ventas.next()){
               
                modelo_datos_tabla_IVA_Repercutido.addRow(new Object[]{resultado_ventas.getString(1),
                resultado_ventas.getString(2),
                resultado_ventas.getString(3)});
           
            }
            
            resultado_ventas.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Ver_Proveedores_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        JLabel Base_Imponible_Soportada=marco.getImporte_BI_Soportado();
        JLabel Base_Imponible_Repercutido=marco.getImporte_BI_Repercutido();
        JLabel IVA_Soportado=marco.getImporte_IVA_Soportado();
        JLabel IVA_Repercutido=marco.getImporte_IVA_Repercutido();
        
        try {
            
   
        resultado_total_compras.next();
        
        resultado_total_compras.getString(1);//Antes de wasNull() hay que sacar el valor de la columna con get
        
        if(!resultado_total_compras.wasNull()){
            
               Base_Imponible_Soportada.setText(resultado_total_compras.getString(1)+" €");
               IVA_Soportado.setText(resultado_total_compras.getString(2)+" €");
         
        
        }else{
            
              
              
               Base_Imponible_Soportada.setText("0.00 €");
               IVA_Soportado.setText("0.00 €");  
        }
        
       } catch (SQLException ex) {
               
           }
        
         try {
        
        resultado_total_ventas.next();
        
         resultado_total_ventas.getString(1);//Antes de wasNull() hay que sacar el valor de la columna con get
        
        if(!resultado_total_ventas.wasNull()){
        
               Base_Imponible_Repercutido.setText(resultado_total_ventas.getString(1)+" €");
               IVA_Repercutido.setText(resultado_total_ventas.getString(2)+" €");
         
        
        }else{
             
            
               Base_Imponible_Repercutido.setText("0.00 €");
               IVA_Repercutido.setText("0.00 €");  
        }
        
        } catch (SQLException ex) {
            
                
           }
        
       
        Double IVA_Rep=Double.parseDouble(IVA_Repercutido.getText().replace('€', '\u0000').trim());
        
        Double IVA_Sop=Double.parseDouble(IVA_Soportado.getText().replace('€', '\u0000').trim());
         
        Double Resultado_liq=IVA_Sop-IVA_Rep;
        
        
        
        marco.getImporte_Liquidación().setText(String.format("%.2f",Resultado_liq).replace(',', '.')+" €");
                
        if(Resultado_liq>0){
        
            marco.getTexto_Resultado_Liquidacion().setText("A devolver por la Hacienda Publica");
            
        }else if(Resultado_liq==0){
            
            marco.getTexto_Resultado_Liquidacion().setText("Resultado neutro");
        
        }else{
            marco.getTexto_Resultado_Liquidacion().setText("A pagar a la Hacienda Publica");
        }
        
        
        
        
        
         
       
        
       
        

   
       
      
       
       
    }
    
}
