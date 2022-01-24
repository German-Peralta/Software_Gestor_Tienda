/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import MODELO.Conexion_Base_Datos;
import VISTA.Formulario_Liquidacion_IVA;
import VISTA.Formulario_Login;
import VISTA.Formulario_Login_Nuevo_Usuario;
import VISTA.Formulario_Menu_Principal_Encargado;
import VISTA.Formulario_Modifica_Cliente;
import VISTA.Formulario_Modifica_Producto;
import VISTA.Formulario_Modifica_Proveedor;
import VISTA.Formulario_Registro_Cliente;
import VISTA.Formulario_Registro_Compra;
import VISTA.Formulario_Registro_Producto;
import VISTA.Formulario_Registro_Proveedor;
import VISTA.Formulario_Registro_Venta;
import VISTA.Formulario_Ver_Clientes;
import VISTA.Formulario_Ver_Compras;
import VISTA.Formulario_Ver_Productos;
import VISTA.Formulario_Ver_Proveedores;
import VISTA.Formulario_Ver_Ventas;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author GERMAN
 */
public class Main {
    
    public static void main(String[] args) {
        
      
       
      new Formulario_Login().setVisible(true);
       
        
       
    };
    
    
}
