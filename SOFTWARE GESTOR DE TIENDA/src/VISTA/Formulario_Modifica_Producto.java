/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;


import CONTROLADOR.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




/**
 *Esta clase representa los formularios de modificacion de producto
 * @author GERMAN
 */




public class Formulario_Modifica_Producto extends javax.swing.JFrame {

     /**
   * Se obtiene un objeto que encapsula un nuevo formulario de modificacion de producto
   */
    
    FondoPanel fondo=new FondoPanel();
    
    boolean nueva_categoria=false;
    
    public Formulario_Modifica_Producto() {
        
        
        
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        añade_controladores();
      
        Etiqueta_error_precio_compra.setVisible(false);
        Etiqueta_error_precio_venta.setVisible(false);
        Etiqueta_error_stock_inicial.setVisible(false);
        Panel_Seleccione_Categoria.setVisible(true);
        Panel_Nueva_Categoria.setVisible(false);
        Etiqueta_error_categoria_nombre.setVisible(false);
        Etiqueta_error_categoria_duplicada.setVisible(false);
       
        Etiqueta_error_nombre.setVisible(false);
    }
    
    public void añade_controladores(){
    
    this.addWindowListener(new Controlador_Formulario_Modifica_Producto_Inicio());
    //Boton_registrar_modificar_producto.addActionListener(new Controlador_Formulario_Modificar_Producto_validar());
    Boton_Volver.addActionListener(new Controlador_Formulario_Producto_Abrir());
    Desplegabel_selecciona_producto.addActionListener(new Controlador_Formulario_Modifica_Producto_Desplegable_Datos());
    Desplegable_Tipo_Categoria.addActionListener(new Controlador_Formulario_Modifica_Producto_Desplegable_tipo_categoria());
    Boton_registrar_modificar_producto.addActionListener(new Controlador_Formulario_Modifica_Producto_Validar_Producto());
    Boton_borrar_producto.addActionListener(new Controlador_Formulario_Modifica_Producto_Borrar_Producto());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel_Marco = new javax.swing.JPanel();
        Panel_contenedor = new javax.swing.JPanel();
        Panel_Inferior = new javax.swing.JPanel();
        Boton_Volver = new javax.swing.JButton();
        Boton_registrar_modificar_producto = new javax.swing.JButton();
        Boton_borrar_producto = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        Panel_Cabecera = new javax.swing.JPanel();
        Cabecera = new javax.swing.JLabel();
        Panel_Datos = new javax.swing.JPanel();
        Panel_General = new javax.swing.JPanel();
        Etiqueta_codigo_de_barras = new javax.swing.JLabel();
        Etiqueta_Nombre = new javax.swing.JLabel();
        Etiqueta_descripcion = new javax.swing.JLabel();
        Etiqueta_Precio_Compra = new javax.swing.JLabel();
        Etiqueta_stock_inicial = new javax.swing.JLabel();
        Etiqueta_tipo_IVA_soportado = new javax.swing.JLabel();
        Etiqueta_Precio_Venta = new javax.swing.JLabel();
        Etiqueta_tipo_IVA_Repercutido = new javax.swing.JLabel();
        tipo_IVA_soportado = new javax.swing.JComboBox<>();
        tipo_IVA_repercutido = new javax.swing.JComboBox<>();
        texto_stock_inicial = new javax.swing.JTextField();
        texto_nombre = new javax.swing.JTextField();
        texto_precio_compra = new javax.swing.JTextField();
        texto_precio_venta = new javax.swing.JTextField();
        Etiqueta_error_precio_compra = new javax.swing.JLabel();
        Etiqueta_error_stock_inicial = new javax.swing.JLabel();
        Etiqueta_error_precio_venta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Texto_descripcion = new javax.swing.JTextArea();
        Etiqueta_error_nombre = new javax.swing.JLabel();
        Etiqueta_Categoría = new javax.swing.JLabel();
        Desplegabel_selecciona_producto = new javax.swing.JComboBox<>();
        Desplegable_Tipo_Categoria = new javax.swing.JComboBox<>();
        Etiqueta_Espacio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Panel_Nueva_Categoria = new javax.swing.JPanel();
        Etiqueta_nueva_categoria = new javax.swing.JLabel();
        texto_nueva_categoria = new javax.swing.JTextField();
        Etiqueta_error_categoria_duplicada = new javax.swing.JLabel();
        Etiqueta_error_categoria_nombre = new javax.swing.JLabel();
        Panel_Seleccione_Categoria = new javax.swing.JPanel();
        Etiqueta_Seleccione_Categoría = new javax.swing.JLabel();
        Desplegable_Selecciona_Categoria = new javax.swing.JComboBox<>();
        Panel_izquierdo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_derecho = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Panel_Marco.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Marco.setLayout(new java.awt.GridBagLayout());

        Panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_contenedor.setLayout(new java.awt.BorderLayout());

        Panel_Inferior.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Inferior.setPreferredSize(new java.awt.Dimension(760, 123));
        Panel_Inferior.setLayout(new java.awt.GridBagLayout());

        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_flecha_izquierda.png"))); // NOI18N
        Boton_Volver.setBorderPainted(false);
        Boton_Volver.setContentAreaFilled(false);
        Boton_Volver.setPreferredSize(new java.awt.Dimension(80, 81));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        Panel_Inferior.add(Boton_Volver, gridBagConstraints);

        Boton_registrar_modificar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_validar_compra_venta.png"))); // NOI18N
        Boton_registrar_modificar_producto.setText("Modificar producto");
        Boton_registrar_modificar_producto.setBorderPainted(false);
        Boton_registrar_modificar_producto.setContentAreaFilled(false);
        Boton_registrar_modificar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_registrar_modificar_producto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Boton_registrar_modificar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        Panel_Inferior.add(Boton_registrar_modificar_producto, gridBagConstraints);

        Boton_borrar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_borrar.png"))); // NOI18N
        Boton_borrar_producto.setText("Borrar producto");
        Boton_borrar_producto.setBorderPainted(false);
        Boton_borrar_producto.setContentAreaFilled(false);
        Boton_borrar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_borrar_producto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Boton_borrar_producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        Panel_Inferior.add(Boton_borrar_producto, gridBagConstraints);

        Etiqueta.setText("                                                       ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        Panel_Inferior.add(Etiqueta, gridBagConstraints);

        Panel_contenedor.add(Panel_Inferior, java.awt.BorderLayout.SOUTH);

        Panel_Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Cabecera.setLayout(new java.awt.BorderLayout());

        Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Cabecera.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_software_gestor_tienda_pequeño_min.png"))); // NOI18N
        Cabecera.setText("Software Gestor de Tienda");
        Cabecera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cabecera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabecera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Panel_Cabecera.add(Cabecera, java.awt.BorderLayout.CENTER);

        Panel_contenedor.add(Panel_Cabecera, java.awt.BorderLayout.NORTH);

        Panel_Datos.setLayout(new java.awt.BorderLayout());

        Panel_General.setBackground(new java.awt.Color(255, 255, 255));
        Panel_General.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modifica producto ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        Panel_General.setPreferredSize(new java.awt.Dimension(670, 483));
        Panel_General.setLayout(new java.awt.GridBagLayout());

        Etiqueta_codigo_de_barras.setText("Codigo de barras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_codigo_de_barras, gridBagConstraints);

        Etiqueta_Nombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_Nombre, gridBagConstraints);

        Etiqueta_descripcion.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_descripcion, gridBagConstraints);

        Etiqueta_Precio_Compra.setText("Precio de compra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_Precio_Compra, gridBagConstraints);

        Etiqueta_stock_inicial.setText("Stock inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_stock_inicial, gridBagConstraints);

        Etiqueta_tipo_IVA_soportado.setText("Tipo de IVA soportado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_tipo_IVA_soportado, gridBagConstraints);

        Etiqueta_Precio_Venta.setText("Precio de venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_Precio_Venta, gridBagConstraints);

        Etiqueta_tipo_IVA_Repercutido.setText("Tipo de IVA repercutido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_tipo_IVA_Repercutido, gridBagConstraints);

        tipo_IVA_soportado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "21%", "10%", "4%" }));
        tipo_IVA_soportado.setPreferredSize(new java.awt.Dimension(6, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(tipo_IVA_soportado, gridBagConstraints);

        tipo_IVA_repercutido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "21%", "10%", "4%" }));
        tipo_IVA_repercutido.setPreferredSize(new java.awt.Dimension(6, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(tipo_IVA_repercutido, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(texto_stock_inicial, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(texto_nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(texto_precio_compra, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(texto_precio_venta, gridBagConstraints);

        Etiqueta_error_precio_compra.setText("Debe introducir un numero decimal (máximo 2 decimales)");
        Etiqueta_error_precio_compra.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Panel_General.add(Etiqueta_error_precio_compra, gridBagConstraints);

        Etiqueta_error_stock_inicial.setText("Debe introducir un numero entero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Panel_General.add(Etiqueta_error_stock_inicial, gridBagConstraints);

        Etiqueta_error_precio_venta.setText("Debe introducir un numero decimal (máximo 2 decimales)");
        Etiqueta_error_precio_venta.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Panel_General.add(Etiqueta_error_precio_venta, gridBagConstraints);

        Texto_descripcion.setColumns(20);
        Texto_descripcion.setRows(5);
        Texto_descripcion.setPreferredSize(new java.awt.Dimension(6, 20));
        jScrollPane2.setViewportView(Texto_descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 117;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(jScrollPane2, gridBagConstraints);

        Etiqueta_error_nombre.setText("Debe introducir un nombre entre 1 y 15 caracteres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        Panel_General.add(Etiqueta_error_nombre, gridBagConstraints);

        Etiqueta_Categoría.setText("Categoría");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Etiqueta_Categoría, gridBagConstraints);

        Desplegabel_selecciona_producto.setPreferredSize(new java.awt.Dimension(15, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Desplegabel_selecciona_producto, gridBagConstraints);

        Desplegable_Tipo_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorías disponibles", "Nueva Categoría" }));
        Desplegable_Tipo_Categoria.setPreferredSize(new java.awt.Dimension(6, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        Panel_General.add(Desplegable_Tipo_Categoria, gridBagConstraints);

        Etiqueta_Espacio.setText("                                                                                                                     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Espacio, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Nueva_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Nueva_Categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Categoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Nueva_Categoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Etiqueta_nueva_categoria.setText("Nombre categoría: ");
        Panel_Nueva_Categoria.add(Etiqueta_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        Panel_Nueva_Categoria.add(texto_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, -1));

        Etiqueta_error_categoria_duplicada.setText("Categoría ya existente");
        Panel_Nueva_Categoria.add(Etiqueta_error_categoria_duplicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        Etiqueta_error_categoria_nombre.setText("Nombre incorrecto");
        Panel_Nueva_Categoria.add(Etiqueta_error_categoria_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(Panel_Nueva_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        Panel_Seleccione_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Seleccione_Categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoría existente ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Seleccione_Categoria.setPreferredSize(new java.awt.Dimension(250, 74));

        Etiqueta_Seleccione_Categoría.setText("Seleccione categoría:");
        Panel_Seleccione_Categoria.add(Etiqueta_Seleccione_Categoría);

        Panel_Seleccione_Categoria.add(Desplegable_Selecciona_Categoria);

        jPanel1.add(Panel_Seleccione_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        Panel_General.add(jPanel1, gridBagConstraints);

        Panel_Datos.add(Panel_General, java.awt.BorderLayout.CENTER);

        Panel_izquierdo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("           ");
        Panel_izquierdo.add(jLabel2);

        Panel_Datos.add(Panel_izquierdo, java.awt.BorderLayout.WEST);

        Panel_derecho.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("           ");
        Panel_derecho.add(jLabel4);

        Panel_Datos.add(Panel_derecho, java.awt.BorderLayout.EAST);

        Panel_contenedor.add(Panel_Datos, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        Panel_Marco.add(Panel_contenedor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(Panel_Marco, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Formulario_Modifica_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Modifica_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Modifica_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Modifica_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Formulario_Modifica_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Volver;
    private javax.swing.JButton Boton_borrar_producto;
    private javax.swing.JButton Boton_registrar_modificar_producto;
    private javax.swing.JLabel Cabecera;
    private javax.swing.JComboBox<String> Desplegabel_selecciona_producto;
    private javax.swing.JComboBox<String> Desplegable_Selecciona_Categoria;
    private javax.swing.JComboBox<String> Desplegable_Tipo_Categoria;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JLabel Etiqueta_Categoría;
    private javax.swing.JLabel Etiqueta_Espacio;
    private javax.swing.JLabel Etiqueta_Nombre;
    private javax.swing.JLabel Etiqueta_Precio_Compra;
    private javax.swing.JLabel Etiqueta_Precio_Venta;
    private javax.swing.JLabel Etiqueta_Seleccione_Categoría;
    private javax.swing.JLabel Etiqueta_codigo_de_barras;
    private javax.swing.JLabel Etiqueta_descripcion;
    private javax.swing.JLabel Etiqueta_error_categoria_duplicada;
    private javax.swing.JLabel Etiqueta_error_categoria_nombre;
    private javax.swing.JLabel Etiqueta_error_nombre;
    private javax.swing.JLabel Etiqueta_error_precio_compra;
    private javax.swing.JLabel Etiqueta_error_precio_venta;
    private javax.swing.JLabel Etiqueta_error_stock_inicial;
    private javax.swing.JLabel Etiqueta_nueva_categoria;
    private javax.swing.JLabel Etiqueta_stock_inicial;
    private javax.swing.JLabel Etiqueta_tipo_IVA_Repercutido;
    private javax.swing.JLabel Etiqueta_tipo_IVA_soportado;
    private javax.swing.JPanel Panel_Cabecera;
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JPanel Panel_General;
    private javax.swing.JPanel Panel_Inferior;
    private javax.swing.JPanel Panel_Marco;
    private javax.swing.JPanel Panel_Nueva_Categoria;
    private javax.swing.JPanel Panel_Seleccione_Categoria;
    private javax.swing.JPanel Panel_contenedor;
    private javax.swing.JPanel Panel_derecho;
    private javax.swing.JPanel Panel_izquierdo;
    private javax.swing.JTextArea Texto_descripcion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField texto_nombre;
    private javax.swing.JTextField texto_nueva_categoria;
    private javax.swing.JTextField texto_precio_compra;
    private javax.swing.JTextField texto_precio_venta;
    private javax.swing.JTextField texto_stock_inicial;
    private javax.swing.JComboBox<String> tipo_IVA_repercutido;
    private javax.swing.JComboBox<String> tipo_IVA_soportado;
    // End of variables declaration//GEN-END:variables

   

    public JTextField getTexto_nombre() {
        return texto_nombre;
    }

    public boolean Nueva_categoria() {
        return nueva_categoria;
    }

    public void setNueva_categoria(boolean nueva_categoria) {
        this.nueva_categoria = nueva_categoria;
    }
    

    public JTextField getTexto_precio_compra() {
        return texto_precio_compra;
    }

    public JTextField getTexto_precio_venta() {
        return texto_precio_venta;
    }

    public JTextField getTexto_stock_inicial() {
        return texto_stock_inicial;
    }

    public JComboBox<String> getDesplegabel_selecciona_producto() {
        return Desplegabel_selecciona_producto;
    }

    public JPanel getPanel_Seleccione_Categoria() {
        return Panel_Seleccione_Categoria;
    }

    public JTextField getTexto_categoria_nueva() {
        return texto_nueva_categoria;
    }

    public JPanel getPanel_Nueva_Categoria() {
        return Panel_Nueva_Categoria;
    }

    public JTextField getTexto_nueva_categoria() {
        return texto_nueva_categoria;
    }

    public JLabel getEtiqueta_error_categoria_duplicada() {
        return Etiqueta_error_categoria_duplicada;
    }

    public JLabel getEtiqueta_error_categoria_nombre() {
        return Etiqueta_error_categoria_nombre;
    }

   
 
    public JLabel getEtiqueta_error_precio_compra() {
        return Etiqueta_error_precio_compra;
    }

    public JLabel getEtiqueta_error_precio_venta() {
        return Etiqueta_error_precio_venta;
    }

    public JLabel getEtiqueta_error_stock_inicial() {
        return Etiqueta_error_stock_inicial;
    }

    public JTextArea getTexto_descripcion() {
        return Texto_descripcion;
    }

    public JComboBox<String> getTipo_IVA_repercutido() {
        return tipo_IVA_repercutido;
    }

    public JComboBox<String> getTipo_IVA_soportado() {
        return tipo_IVA_soportado;
    }



    public JLabel getEtiqueta_error_nombre() {
        return Etiqueta_error_nombre;
    }

    public JComboBox<String> getDesplegable_Categoria() {
        return Desplegable_Selecciona_Categoria;
    }
    
    
    
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
