/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Controlador_Formulario_Menu_Principal_Encargado;
import CONTROLADOR.Controlador_Formulario_Producto_Abrir;
import CONTROLADOR.Controlador_Formulario_Proveedor_Abrir;
import CONTROLADOR.Controlador_Formulario_Registro_Compra_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Abrir;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_codigo_barras;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_nombre;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_stock;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_CIF;
import CONTROLADOR.Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_ciudad;
import CONTROLADOR.Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_razon_social;
import CONTROLADOR.Controlador_Formulario_Ver_Proveedores_Inicio;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *Esta clase representa los formularios de visualización de proveedores 
 * @author GERMAN
 */


public class Formulario_Ver_Proveedores extends javax.swing.JFrame {

  /**
   * Se obtiene un objeto que encapsula un nuevo formulario de de visualización de ventas
   */
    
    FondoPanel fondo=new FondoPanel();
    
    public Formulario_Ver_Proveedores() {
        
        this.setContentPane(fondo);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        initComponents();
        
        Añadir_Controladores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Panel_Contendedor = new javax.swing.JPanel();
        Etiqueta_Ver_Productos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_productos = new javax.swing.JTable();
        Cabecera = new javax.swing.JLabel();
        Boton_Volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Etiqueta_filtrar_nombre = new javax.swing.JLabel();
        texto_filtrar_razon_social = new javax.swing.JTextField();
        texto_filtrar_CIF = new javax.swing.JTextField();
        Etiqueta_filtrar_codigo_barras = new javax.swing.JLabel();
        texto_filtrar_ciudad = new javax.swing.JTextField();
        Etiqueta_filtrar_stock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 102, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Panel_Contendedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Contendedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Contendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Contendedor.setLayout(new java.awt.GridBagLayout());

        Etiqueta_Ver_Productos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Etiqueta_Ver_Productos.setForeground(new java.awt.Color(204, 0, 255));
        Etiqueta_Ver_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta_Ver_Productos.setText("Ver Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        Panel_Contendedor.add(Etiqueta_Ver_Productos, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 400));

        Tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIF", "Razon social", "Telefono", "Web", "Calle", "Numero", "Codigo postal", "Ciudad"
            }
        ));
        jScrollPane1.setViewportView(Tabla_productos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 70, 10, 70);
        Panel_Contendedor.add(jScrollPane1, gridBagConstraints);

        Cabecera.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_software_gestor_tienda_pequeño_min.png"))); // NOI18N
        Cabecera.setText("Software Gestor de Tienda");
        Cabecera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cabecera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabecera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        Panel_Contendedor.add(Cabecera, gridBagConstraints);

        Boton_Volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_flecha_izquierda.png"))); // NOI18N
        Boton_Volver.setBorder(null);
        Boton_Volver.setContentAreaFilled(false);
        Boton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_Volver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        Panel_Contendedor.add(Boton_Volver, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Etiqueta_filtrar_nombre.setText("Filtrar por razon social:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(Etiqueta_filtrar_nombre, gridBagConstraints);

        texto_filtrar_razon_social.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(texto_filtrar_razon_social, gridBagConstraints);

        texto_filtrar_CIF.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(texto_filtrar_CIF, gridBagConstraints);

        Etiqueta_filtrar_codigo_barras.setText("Filtrar por CIF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(Etiqueta_filtrar_codigo_barras, gridBagConstraints);

        texto_filtrar_ciudad.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(texto_filtrar_ciudad, gridBagConstraints);

        Etiqueta_filtrar_stock.setText("Filtrar por ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(Etiqueta_filtrar_stock, gridBagConstraints);

        jLabel1.setText("                                                                                     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Panel_Contendedor.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1177;
        gridBagConstraints.ipady = 373;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 39, 11, 10);
        getContentPane().add(Panel_Contendedor, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Añadir_Controladores(){
    
        this.addWindowListener(new Controlador_Formulario_Ver_Proveedores_Inicio());
 
        
        texto_filtrar_CIF.addKeyListener(new Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_CIF());
        texto_filtrar_razon_social.addKeyListener(new Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_razon_social());
        texto_filtrar_ciudad.addKeyListener(new Controlador_Formulario_Ver_Proveedores_Digitacion_filtro_ciudad());
        Boton_Volver.addActionListener(new Controlador_Formulario_Proveedor_Abrir());
        
    };

    public JTable getTabla_productos() {
        return Tabla_productos;
    }

    public JTextField getTexto_filtrar_nombre() {
        return texto_filtrar_razon_social;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Ver_Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Volver;
    private javax.swing.JLabel Cabecera;
    private javax.swing.JLabel Etiqueta_Ver_Productos;
    private javax.swing.JLabel Etiqueta_filtrar_codigo_barras;
    private javax.swing.JLabel Etiqueta_filtrar_nombre;
    private javax.swing.JLabel Etiqueta_filtrar_stock;
    private javax.swing.JPanel Panel_Contendedor;
    private javax.swing.JTable Tabla_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField texto_filtrar_CIF;
    private javax.swing.JTextField texto_filtrar_ciudad;
    private javax.swing.JTextField texto_filtrar_razon_social;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    
   class FondoPanel extends JPanel
   {
           private Image foto;
           
           @Override
           
           public void paint (Graphics g){
           
           foto=new ImageIcon(getClass().getResource("/Imagenes/almacen_2.jpg")).getImage();
               
           g.drawImage(foto, 0, 0,getWidth(),getHeight(), this);
           
           setOpaque(false);
           
           super.paint(g);
           
           }
           
           
           }


}