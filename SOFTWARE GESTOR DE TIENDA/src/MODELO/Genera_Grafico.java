/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import MODELO.Consulta_General;
import VISTA.Formulario_Ver_Productos;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
/**
 *Esta clase sirve para realizar consultar y generar un gráfico de la relación de productos y su stock
 * @author german
 */



public class Genera_Grafico {
/**
 * En el método constructor se genera el gráfico en formato ".png" en la siguiente ruta relativa a la carpeta del proyecto
 * "src/Imagenes/grafico.png"
 */
public Genera_Grafico() {
        
    
    
    ResultSet resultado= new Consulta_General().Ejecuta_Consulta("productos");
   
    DefaultPieDataset dataset = new DefaultPieDataset( ); 
   
   
       try {
           while(resultado.next()){

               dataset.setValue(resultado.getString(3),Integer.parseInt(resultado.getString(2)) );

              }
      
      JFreeChart chart = ChartFactory.createPieChart3D("Stock productos",dataset,true,true,false);
           
      final PiePlot3D plot = ( PiePlot3D ) chart.getPlot( );             
      plot.setStartAngle( 270 );             
      plot.setForegroundAlpha( 0.60f );             
      plot.setInteriorGap( 0.02 );
    
      int width = 426;   /* Width of the image */             
      int height = 320;  /* Height of the image */          
      
      
      
      File pieChart3D = new File( "src/Imagenes/grafico.png" );  
      
      pieChart3D.createNewFile();
      
      ChartUtilities.saveChartAsJPEG( pieChart3D , chart , width , height );
      
     
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(Level.SEVERE, null, ex);
       }
    
   }
        
        
        
    }
    
    
    

