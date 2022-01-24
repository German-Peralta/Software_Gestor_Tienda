

package MODELO;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *Esta clase se encarga de realizar la conexión con la base de datos
 * mediante el driver JDBC
 * @author GERMAN
 */
public class Conexion_Base_Datos {
    
    private Connection conexion=null;
/**
 * Constructor en el cual se genera un objeto conexion que permite conectarnos con la base de datos
 */
    
    
    public Conexion_Base_Datos() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
                
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
            
            
        } catch (ClassNotFoundException ex) {
            
                 Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
       JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Error al conectar con la base de datos",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
           
        } catch (SQLException ex) {
           Icon icono=new ImageIcon(getClass().getResource("/Imagenes/icono_error.png"));    
       
       JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Error al conectar con la base de datos",
                "Mensaje",JOptionPane.PLAIN_MESSAGE,icono);
        }
        
        
    }

  /**
     * Este método sirve para obtener un objeto conexión con la base de datos
     * @return objeto que encapsula la conexion
     */
    
    public Connection getConexion() {
        return conexion;
    }
    
    
    
    
    
    
  
    
    
    
}
