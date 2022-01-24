/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Categoria;
import MODELO.Consulta_General;
import MODELO.Consulta_Tipo_Usuario;
import MODELO.Consulta_multitabla_producto_categoria;
import MODELO.Producto;
import MODELO.Tipo_Usuario;
import VISTA.Formulario_Login_Nuevo_Usuario;
import VISTA.Formulario_Modifica_Producto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *Esta clase se encarga de rellenar con datos los desplegables del formulario cuando se abre la ventana del formulario
 * @author GERMAN
 */
public class Controlador_Formulario_Login_Nuevo_Usuario_Inicio  extends WindowAdapter {
    
     public void windowOpened(WindowEvent e){
    
        //CUANDO SE ABRE LA VENTANA CONSULTAMOS LOS PROVEEDORES Y PRODUCTOS 
        //EXISTENTES Y LOS GUARDAMOS EN UNA LISTA EN LA CLASE MARCO DEL FORMULARIO REGISTRO COMPRA DONDE LA VAMOS A USAR
        //PARA TRABAJAR CON ELLOS
        
        Formulario_Login_Nuevo_Usuario marco=(Formulario_Login_Nuevo_Usuario)e.getSource();
        
        JComboBox Desplegable_selecciona_tipo_usuario=marco.getDesplegable_tipo_usuario();
     
        

        ResultSet resultado_1=new Consulta_Tipo_Usuario().Ejecuta_Consulta();
     

        try {
            
            while(resultado_1.next()){
                
                Tipo_Usuario  tipo_usuario=new Tipo_Usuario(resultado_1.getInt(1),resultado_1.getString(2));
                  
                
                
                Desplegable_selecciona_tipo_usuario.addItem(tipo_usuario);
               
                
            }
            
            resultado_1.close();
            
        
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Formulario_Registro_Compra_Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
}
