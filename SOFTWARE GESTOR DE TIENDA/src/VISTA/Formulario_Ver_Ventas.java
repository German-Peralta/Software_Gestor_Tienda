/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.Controlador_Formulario_Compras_Abrir;
import CONTROLADOR.Controlador_Formulario_Menu_Principal_Encargado;
import CONTROLADOR.Controlador_Formulario_Producto_Abrir;
import CONTROLADOR.Controlador_Formulario_Registro_Compra_Inicio;
import CONTROLADOR.Controlador_Formulario_Ventas_Abrir;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_Digitacion_Registro_Compra;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_Digitacion_Total_Factura;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_Reiniciar_Filtros;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_Selecciona_Compra;
import CONTROLADOR.Controlador_Formulario_Ver_Compras_filtro_fecha;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Abrir;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_codigo_barras;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_nombre;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Digitacion_filtro_stock;
import CONTROLADOR.Controlador_Formulario_Ver_Productos_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_Digitacion_Registro_Venta;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_Digitacion_Total_Factura;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_Inicio;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_Reiniciar_Filtros;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_Selecciona_Venta;
import CONTROLADOR.Controlador_Formulario_Ver_Ventas_filtro_fecha;
import MODELO.Consulta_General;
import MODELO.Genera_Grafico;
import com.toedter.calendar.JDateChooser;
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
 *Esta clase representa los formularios de visualizaci??n de ventas 
 * @author GERMAN
 */

public class Formulario_Ver_Ventas extends javax.swing.JFrame {


/**
 se obtiene un objeto que encapsula un nuevo formulario de de visualizaci??n de ventas 
 * @author GERMAN
 */
  
    
    public Formulario_Ver_Ventas() {
        
        FondoPanel fondo=new FondoPanel();
    
        
        
        this.setContentPane(fondo);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        
        
        initComponents();
        
        Genera_Grafico g=new Genera_Grafico();
        //this.getImagen_grafico().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico.png")));
   
        A??adir_Controladores();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollBar1 = new javax.swing.JScrollBar();
        Panel_Contenedor = new javax.swing.JPanel();
        Panel_Cabecera = new javax.swing.JPanel();
        Cabecera = new javax.swing.JLabel();
        Panel_filtros = new javax.swing.JPanel();
        Etiqueta_filtrar_registro_compra = new javax.swing.JLabel();
        texto_filtrar_registro_compra = new javax.swing.JTextField();
        Etiqueta_filtrar_fecha = new javax.swing.JLabel();
        Etiqueta_filtrar_total_factura = new javax.swing.JLabel();
        texto_filtrar_total_factura = new javax.swing.JTextField();
        selector_filtro_fecha = new com.toedter.calendar.JDateChooser();
        Boton_reiniciar_filtros = new javax.swing.JButton();
        Panel_Detalle_Compra = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Detalle_Compra = new javax.swing.JTable();
        Boton_Volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_informe_ventas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 102, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Panel_Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Contenedor.setPreferredSize(new java.awt.Dimension(700, 800));
        Panel_Contenedor.setLayout(new java.awt.GridBagLayout());

        Panel_Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Cabecera.setPreferredSize(new java.awt.Dimension(600, 100));
        Panel_Cabecera.setLayout(new java.awt.GridBagLayout());

        Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Cabecera.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_software_gestor_tienda_peque??o_min.png"))); // NOI18N
        Cabecera.setText("Software Gestor de Tienda");
        Cabecera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cabecera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabecera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        Panel_Cabecera.add(Cabecera, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        Panel_Contenedor.add(Panel_Cabecera, gridBagConstraints);

        Panel_filtros.setBackground(new java.awt.Color(255, 255, 255));
        Panel_filtros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        java.awt.GridBagLayout Panel_filtrosLayout = new java.awt.GridBagLayout();
        Panel_filtrosLayout.columnWidths = new int[] {0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0};
        Panel_filtrosLayout.rowHeights = new int[] {0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0};
        Panel_filtros.setLayout(Panel_filtrosLayout);

        Etiqueta_filtrar_registro_compra.setText("Por registro venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        Panel_filtros.add(Etiqueta_filtrar_registro_compra, gridBagConstraints);

        texto_filtrar_registro_compra.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 93;
        Panel_filtros.add(texto_filtrar_registro_compra, gridBagConstraints);

        Etiqueta_filtrar_fecha.setText("Por fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        Panel_filtros.add(Etiqueta_filtrar_fecha, gridBagConstraints);

        Etiqueta_filtrar_total_factura.setText("Por total factura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        Panel_filtros.add(Etiqueta_filtrar_total_factura, gridBagConstraints);

        texto_filtrar_total_factura.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 93;
        Panel_filtros.add(texto_filtrar_total_factura, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        Panel_filtros.add(selector_filtro_fecha, gridBagConstraints);

        Boton_reiniciar_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_recargar_formulario.png"))); // NOI18N
        Boton_reiniciar_filtros.setText("Reiniciar filtros");
        Boton_reiniciar_filtros.setBorderPainted(false);
        Boton_reiniciar_filtros.setContentAreaFilled(false);
        Boton_reiniciar_filtros.setFocusPainted(false);
        Boton_reiniciar_filtros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_reiniciar_filtros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 9;
        Panel_filtros.add(Boton_reiniciar_filtros, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        Panel_Contenedor.add(Panel_filtros, gridBagConstraints);

        Panel_Detalle_Compra.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Detalle_Compra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Detalle_Compra.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 100));

        Tabla_Detalle_Compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de barras", "Cantidad", "Precio unitario ???", "Tipo de IVA %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Detalle_Compra.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane2.setViewportView(Tabla_Detalle_Compra);
        if (Tabla_Detalle_Compra.getColumnModel().getColumnCount() > 0) {
            Tabla_Detalle_Compra.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Detalle_Compra.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Detalle_Compra.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Detalle_Compra.getColumnModel().getColumn(3).setResizable(false);
        }

        Panel_Detalle_Compra.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        Boton_Volver.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_flecha_izquierda.png"))); // NOI18N
        Boton_Volver.setBorder(null);
        Boton_Volver.setContentAreaFilled(false);
        Boton_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_Volver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Panel_Detalle_Compra.add(Boton_Volver, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        Panel_Contenedor.add(Panel_Detalle_Compra, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Tabla_informe_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro compra", "DNI", "Fecha", "B. Imponible ???", "IVA ???", "Total factura ???"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_informe_ventas.setFocusable(false);
        Tabla_informe_ventas.setPreferredSize(new java.awt.Dimension(450, 1000));
        Tabla_informe_ventas.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane4.setViewportView(Tabla_informe_ventas);

        jPanel1.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        Panel_Contenedor.add(jPanel1, gridBagConstraints);

        getContentPane().add(Panel_Contenedor, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void A??adir_Controladores(){
    
        this.addWindowListener(new Controlador_Formulario_Ver_Ventas_Inicio());
        
   
        
        selector_filtro_fecha.addPropertyChangeListener(new Controlador_Formulario_Ver_Ventas_filtro_fecha());
        
        texto_filtrar_registro_compra.addKeyListener(new Controlador_Formulario_Ver_Ventas_Digitacion_Registro_Venta());
        
        
        texto_filtrar_total_factura.addKeyListener(new Controlador_Formulario_Ver_Ventas_Digitacion_Total_Factura());
        
        Boton_reiniciar_filtros.addActionListener(new Controlador_Formulario_Ver_Ventas_Reiniciar_Filtros());
    
        Boton_Volver.addActionListener(new Controlador_Formulario_Ventas_Abrir());
        
        
       Tabla_informe_ventas.addMouseListener(new Controlador_Formulario_Ver_Ventas_Selecciona_Venta());
    };

    public JTable getTabla_informe_compras() {
        return Tabla_informe_ventas;
    }

    public JDateChooser getSelector_filtro_fecha() {
        return selector_filtro_fecha;
    }

    public JTextField getTexto_filtrar_registro_compra() {
        return texto_filtrar_registro_compra;
    }

    public JTable getTabla_Detalle_Compra() {
        return Tabla_Detalle_Compra;
    }

    public JTextField getTexto_filtrar_total_factura() {
        return texto_filtrar_total_factura;
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
            java.util.logging.Logger.getLogger(Formulario_Ver_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Ver_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Formulario_Ver_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Volver;
    private javax.swing.JButton Boton_reiniciar_filtros;
    private javax.swing.JLabel Cabecera;
    private javax.swing.JLabel Etiqueta_filtrar_fecha;
    private javax.swing.JLabel Etiqueta_filtrar_registro_compra;
    private javax.swing.JLabel Etiqueta_filtrar_total_factura;
    private javax.swing.JPanel Panel_Cabecera;
    private javax.swing.JPanel Panel_Contenedor;
    private javax.swing.JPanel Panel_Detalle_Compra;
    private javax.swing.JPanel Panel_filtros;
    private javax.swing.JTable Tabla_Detalle_Compra;
    private javax.swing.JTable Tabla_informe_ventas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser selector_filtro_fecha;
    private javax.swing.JTextField texto_filtrar_registro_compra;
    private javax.swing.JTextField texto_filtrar_total_factura;
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
