/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Categoria;
import MODELO.Consulta_General;
import MODELO.Consulta_Ultimo_Registro_Compra;
import MODELO.Producto;
import MODELO.Proveedor;
import VISTA.Formulario_Registro_Compra;
import VISTA.Formulario_Registro_Producto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author german
 */
public class Controlador_Formulario_Registro_Producto_Inicio extends WindowAdapter{
    
    public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Registro_Producto marco=(Formulario_Registro_Producto)e.getSource();
        
        JComboBox Desplegable_categoría=marco.getDesplegable_Categoria();
        

        ResultSet resultado_1=new Consulta_General().Ejecuta_Consulta("categoria");

        try {
            
            while(resultado_1.next()){
                
                Categoria categoria= new Categoria(resultado_1.getInt(1), resultado_1.getString(2));
              
                
                Desplegable_categoría.addItem(categoria);
                                 
            }
            
            resultado_1.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }}