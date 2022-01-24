/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Controlador_Formulario_Menu_Principal_Encargado;
import CONTROLADOR.Controlador_Formulario_Producto_Abrir;
import CONTROLADOR.Controlador_Formulario_Registro_Compra_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Abrir;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_codigo_barras;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_nombre;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_stock;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Inicio;
import MODELO.Consulta_General;
import MODELO.Genera_Grafico;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;


/**
 *Esta clase representa los formularios de visualización de productos 
 * @author GERMAN
 */



public class Formulario_Ver_Productos extends javax.swing.JFrame {

  
 /**
   * Se obtiene un objeto que encapsula un nuevo formulario de de visualización de productos
   */
  
    
    public Formulario_Ver_Productos() {
        
        FondoPanel fondo=new FondoPanel();
    
        
        
        this.setContentPane(fondo);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        
        
        initComponents();
        
        Genera_Grafico g=new Genera_Grafico();
        this.getImagen_grafico().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png")));
   
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

        Panel_Contenedor = new javax.swing.JPanel();
        Panel_General = new javax.swing.JPanel();
        Etiqueta_Ver_Productos = new javax.swing.JLabel();
        Cabecera = new javax.swing.JLabel();
        Boton_Volver = new javax.swing.JButton();
        Imagen_grafico = new javax.swing.JLabel();
        Panel_filtros = new javax.swing.JPanel();
        Etiqueta_filtrar_codigo_barras = new javax.swing.JLabel();
        texto_filtrar_codigo_barras = new javax.swing.JTextField();
        Etiqueta_filtrar_nombre = new javax.swing.JLabel();
        texto_filtrar_nombre = new javax.swing.JTextField();
        Etiqueta_filtrar_stock = new javax.swing.JLabel();
        texto_filtrar_stock = new javax.swing.JTextField();
        Panel_Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 102, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Panel_Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Contenedor.setPreferredSize(new java.awt.Dimension(1000, 1000));
        Panel_Contenedor.setLayout(new java.awt.GridBagLayout());

        Panel_General.setBackground(new java.awt.Color(255, 255, 255));
        Panel_General.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_General.setPreferredSize(new java.awt.Dimension(600, 1200));
        java.awt.GridBagLayout Panel_GeneralLayout = new java.awt.GridBagLayout();
        Panel_GeneralLayout.columnWidths = new int[] {0, 2, 0};
        Panel_GeneralLayout.rowHeights = new int[] {0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0};
        Panel_General.setLayout(Panel_GeneralLayout);

        Etiqueta_Ver_Productos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Etiqueta_Ver_Productos.setForeground(new java.awt.Color(204, 0, 255));
        Etiqueta_Ver_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta_Ver_Productos.setText("Ver Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Panel_General.add(Etiqueta_Ver_Productos, gridBagConstraints);

        Cabecera.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_software_gestor_tienda_pequeño_min.png"))); // NOI18N
        Cabecera.setText("Software Gestor de Tienda");
        Cabecera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cabecera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabecera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Panel_General.add(Cabecera, gridBagConstraints);

        Boton_Volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_flecha_izquierda.png"))); // NOI18N
        Boton_Volver.setBorder(null);
        Boton_Volver.setContentAreaFilled(false);
        Boton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_Volver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        Panel_General.add(Boton_Volver, gridBagConstraints);

        Imagen_grafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        Panel_General.add(Imagen_grafico, gridBagConstraints);

        Panel_filtros.setBackground(new java.awt.Color(255, 255, 255));
        Panel_filtros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        java.awt.GridBagLayout Panel_filtrosLayout = new java.awt.GridBagLayout();
        Panel_filtrosLayout.columnWidths = new int[] {0, 2, 0, 2, 0, 2, 0};
        Panel_filtrosLayout.rowHeights = new int[] {0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0};
        Panel_filtros.setLayout(Panel_filtrosLayout);

        Etiqueta_filtrar_codigo_barras.setText("Por codigo de barras:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        Panel_filtros.add(Etiqueta_filtrar_codigo_barras, gridBagConstraints);

        texto_filtrar_codigo_barras.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 93;
        Panel_filtros.add(texto_filtrar_codigo_barras, gridBagConstraints);

        Etiqueta_filtrar_nombre.setText("Por nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        Panel_filtros.add(Etiqueta_filtrar_nombre, gridBagConstraints);

        texto_filtrar_nombre.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 93;
        Panel_filtros.add(texto_filtrar_nombre, gridBagConstraints);

        Etiqueta_filtrar_stock.setText("Por nivel de stock:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        Panel_filtros.add(Etiqueta_filtrar_stock, gridBagConstraints);

        texto_filtrar_stock.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 93;
        Panel_filtros.add(texto_filtrar_stock, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        Panel_General.add(Panel_filtros, gridBagConstraints);

        Panel_Tabla.setPreferredSize(new java.awt.Dimension(426, 320));
        Panel_Tabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 402));

        Tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de barras", "Nombre", "Stock", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_productos.setPreferredSize(new java.awt.Dimension(426, 320));
        Tabla_productos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_productos);
        if (Tabla_productos.getColumnModel().getColumnCount() > 0) {
            Tabla_productos.getColumnModel().getColumn(0).setResizable(false);
            Tabla_productos.getColumnModel().getColumn(0).setPreferredWidth(40);
            Tabla_productos.getColumnModel().getColumn(1).setResizable(false);
            Tabla_productos.getColumnModel().getColumn(1).setPreferredWidth(40);
            Tabla_productos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_productos.getColumnModel().getColumn(2).setPreferredWidth(10);
            Tabla_productos.getColumnModel().getColumn(3).setResizable(false);
            Tabla_productos.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        Panel_Tabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 180));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        Panel_General.add(Panel_Tabla, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        Panel_Contenedor.add(Panel_General, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(Panel_Contenedor, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Añadir_Controladores(){
    
        this.addWindowListener(new Controlador_Formulario_Ver_Productos_Inicio());
 
        
        texto_filtrar_codigo_barras.addKeyListener(new Controlador_Formulario_Ver_Productos_Digitacion_filtro_codigo_barras());
        texto_filtrar_nombre.addKeyListener(new Controlador_Formulario_Ver_Productos_Digitacion_filtro_nombre());
        texto_filtrar_stock.addKeyListener(new Controlador_Formulario_Ver_Productos_Digitacion_filtro_stock());
        Boton_Volver.addActionListener(new Controlador_Formulario_Producto_Abrir());
        
    };

    public JTable getTabla_productos() {
        return Tabla_productos;
    }

    public JTextField getTexto_filtrar_nombre() {
        return texto_filtrar_nombre;
    }

    public JPanel getPanel_Contendedor() {
        return Panel_General;
    }

    public JLabel getImagen_grafico() {
        return Imagen_grafico;
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
            java.util.logging.Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Ver_Productos().setVisible(true);
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
    private javax.swing.JLabel Imagen_grafico;
    private javax.swing.JPanel Panel_Contenedor;
    private javax.swing.JPanel Panel_General;
    private javax.swing.JPanel Panel_Tabla;
    private javax.swing.JPanel Panel_filtros;
    private javax.swing.JTable Tabla_productos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField texto_filtrar_codigo_barras;
    private javax.swing.JTextField texto_filtrar_nombre;
    private javax.swing.JTextField texto_filtrar_stock;
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
