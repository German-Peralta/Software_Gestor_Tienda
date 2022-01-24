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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




/**
 *Esta clase representa los formularios de registro de cliente 
 * @author GERMAN
 */


public class Formulario_Registro_Cliente extends javax.swing.JFrame {

    
 /**
   * Se obtiene un objeto que encapsula un nuevo formulario de registro de cliente 
   */
    
    FondoPanel fondo=new FondoPanel();
    
   
    
    public Formulario_Registro_Cliente() {
        
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        añade_controladores();
      
        Etiqueta_error_DNI.setVisible(false);
        Etiqueta_error_apellidos.setVisible(false);
        Etiqueta_error_calle.setVisible(false);
        Etiqueta_error_codigo_postal.setVisible(false);
        Etiqueta_error_nombre.setVisible(false);
        Etiqueta_error_numero.setVisible(false);
        Etiqueta_error_ciudad.setVisible(false);
        Etiqueta_error_producto_duplicado.setVisible(false);
        Etiqueta_error_telefono.setVisible(false);
        Etiqueta_error_DNI_duplicado.setVisible(false);
        Etiqueta_error_NIE.setVisible(false);



        
    }
    
    public void añade_controladores(){
    
   
    Boton_registrar_nuevo_cliente.addActionListener(new Controlador_Formulario_Registro_Cliente_Validar_Cliente());
    Boton_Volver.addActionListener(new Controlador_Formulario_Cliente_Abrir());
   
    }

    public JTextField getTexto_DNI() {
        return Texto_DNI;
    }

    
    
    public JTextField getTexto_apellidos() {
        return texto_apellidos;
    }

    public JTextField getTexto_calle() {
        return texto_calle;
    }

    public JTextField getTexto_ciudad() {
        return texto_ciudad;
    }

    public JTextField getTexto_codigo_postal() {
        return texto_codigo_postal;
    }

    public JTextField getTexto_nombre() {
        return texto_nombre;
    }

    public JTextField getTexto_numero() {
        return texto_numero;
    }

    public JTextField getTexto_telefono() {
        return texto_telefono;
    }

    public JLabel getEtiqueta_error_DNI() {
        return Etiqueta_error_DNI;
    }

    public JLabel getEtiqueta_error_DNI_duplicado() {
        return Etiqueta_error_DNI_duplicado;
    }

    public JLabel getEtiqueta_error_NIE() {
        return Etiqueta_error_NIE;
    }

    public JLabel getEtiqueta_error_apellidos() {
        return Etiqueta_error_apellidos;
    }

    public JLabel getEtiqueta_error_calle() {
        return Etiqueta_error_calle;
    }

    public JLabel getEtiqueta_error_codigo_postal() {
        return Etiqueta_error_codigo_postal;
    }

    public JLabel getEtiqueta_error_nombre() {
        return Etiqueta_error_nombre;
    }

    public JLabel getEtiqueta_error_numero() {
        return Etiqueta_error_numero;
    }

    public JLabel getEtiqueta_error_precio_venta() {
        return Etiqueta_error_ciudad;
    }

    public JLabel getEtiqueta_error_producto_duplicado() {
        return Etiqueta_error_producto_duplicado;
    }

    public JLabel getEtiqueta_error_telefono() {
        return Etiqueta_error_telefono;
    }

    public JLabel getEtiqueta_error_ciudad() {
        return Etiqueta_error_ciudad;
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

        Panel_Marco = new javax.swing.JPanel();
        Panel_contenedor = new javax.swing.JPanel();
        Panel_Inferior = new javax.swing.JPanel();
        Boton_Volver = new javax.swing.JButton();
        Boton_registrar_nuevo_cliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Panel_Cabecera = new javax.swing.JPanel();
        Cabecera = new javax.swing.JLabel();
        Panel_Datos = new javax.swing.JPanel();
        Panel_Izquierdo = new javax.swing.JPanel();
        Panel_General = new javax.swing.JPanel();
        Etiqueta_DNI = new javax.swing.JLabel();
        Etiqueta_Nombre = new javax.swing.JLabel();
        Etiqueta_Apellidos = new javax.swing.JLabel();
        Etiqueta_Calle = new javax.swing.JLabel();
        Etiqueta_Telefono = new javax.swing.JLabel();
        Etiqueta_Numero = new javax.swing.JLabel();
        Etiqueta_Ciudad = new javax.swing.JLabel();
        Texto_DNI = new javax.swing.JTextField();
        Etiqueta_error_DNI = new javax.swing.JLabel();
        Etiqueta_error_calle = new javax.swing.JLabel();
        Etiqueta_error_telefono = new javax.swing.JLabel();
        Etiqueta_error_ciudad = new javax.swing.JLabel();
        Etiqueta_error_producto_duplicado = new javax.swing.JLabel();
        Etiqueta_error_apellidos = new javax.swing.JLabel();
        Etiqueta_Codigo_Postal = new javax.swing.JLabel();
        Etiqueta_error_DNI_duplicado = new javax.swing.JLabel();
        Etiqueta_espacio_2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        texto_apellidos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        texto_nombre = new javax.swing.JTextField();
        texto_telefono = new javax.swing.JTextField();
        texto_calle = new javax.swing.JTextField();
        texto_numero = new javax.swing.JTextField();
        texto_codigo_postal = new javax.swing.JTextField();
        texto_ciudad = new javax.swing.JTextField();
        Etiqueta_error_numero = new javax.swing.JLabel();
        Etiqueta_error_codigo_postal = new javax.swing.JLabel();
        Etiqueta_error_nombre = new javax.swing.JLabel();
        Etiqueta_error_NIE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel_Derecho = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0};
        getContentPane().setLayout(layout);

        Panel_Marco.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Marco.setLayout(new java.awt.GridBagLayout());

        Panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_contenedor.setLayout(new java.awt.BorderLayout());

        Panel_Inferior.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Inferior.setPreferredSize(new java.awt.Dimension(760, 123));
        Panel_Inferior.setLayout(new java.awt.BorderLayout());

        Boton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_flecha_izquierda.png"))); // NOI18N
        Boton_Volver.setBorderPainted(false);
        Boton_Volver.setContentAreaFilled(false);
        Boton_Volver.setMargin(new java.awt.Insets(2, 14, 2, 30));
        Boton_Volver.setPreferredSize(new java.awt.Dimension(80, 40));
        Panel_Inferior.add(Boton_Volver, java.awt.BorderLayout.EAST);

        Boton_registrar_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_validar_compra_venta.png"))); // NOI18N
        Boton_registrar_nuevo_cliente.setText("Registrar nuevo cliente");
        Boton_registrar_nuevo_cliente.setBorderPainted(false);
        Boton_registrar_nuevo_cliente.setContentAreaFilled(false);
        Boton_registrar_nuevo_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_registrar_nuevo_cliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Boton_registrar_nuevo_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Panel_Inferior.add(Boton_registrar_nuevo_cliente, java.awt.BorderLayout.CENTER);

        jLabel3.setText("                          ");
        Panel_Inferior.add(jLabel3, java.awt.BorderLayout.WEST);

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

        Panel_Izquierdo.setLayout(new java.awt.BorderLayout());
        Panel_Datos.add(Panel_Izquierdo, java.awt.BorderLayout.WEST);

        Panel_General.setBackground(new java.awt.Color(255, 255, 255));
        Panel_General.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        java.awt.GridBagLayout Panel_GeneralLayout = new java.awt.GridBagLayout();
        Panel_GeneralLayout.columnWidths = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        Panel_GeneralLayout.rowHeights = new int[] {0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
        Panel_General.setLayout(Panel_GeneralLayout);

        Etiqueta_DNI.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_DNI, gridBagConstraints);

        Etiqueta_Nombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Nombre, gridBagConstraints);

        Etiqueta_Apellidos.setText("Apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Apellidos, gridBagConstraints);

        Etiqueta_Calle.setText("Calle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Calle, gridBagConstraints);

        Etiqueta_Telefono.setText("Telefono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Telefono, gridBagConstraints);

        Etiqueta_Numero.setText("Numero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Numero, gridBagConstraints);

        Etiqueta_Ciudad.setText("Ciudad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Ciudad, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(Texto_DNI, gridBagConstraints);

        Etiqueta_error_DNI.setText("Debe de introducir un DNI (8 numero y una letra)");
        Etiqueta_error_DNI.setPreferredSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_DNI, gridBagConstraints);

        Etiqueta_error_calle.setText("Debe introducir un nombre entre 1 y 15 caracteres");
        Etiqueta_error_calle.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_calle, gridBagConstraints);

        Etiqueta_error_telefono.setText("Debe introducir un numero de 9 digitos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_telefono, gridBagConstraints);

        Etiqueta_error_ciudad.setText("Debe introducir un nombre entre 1 y 15 caracteres");
        Etiqueta_error_ciudad.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_ciudad, gridBagConstraints);

        Etiqueta_error_producto_duplicado.setText("Producto ya existente");
        Etiqueta_error_producto_duplicado.setPreferredSize(new java.awt.Dimension(20, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_producto_duplicado, gridBagConstraints);

        Etiqueta_error_apellidos.setText("Debe introducir palabras con un maximo de 30 caracteres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_apellidos, gridBagConstraints);

        Etiqueta_Codigo_Postal.setText("Codigo postal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_Codigo_Postal, gridBagConstraints);

        Etiqueta_error_DNI_duplicado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Etiqueta_error_DNI_duplicado.setText("El cliente ya esta registrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_DNI_duplicado, gridBagConstraints);

        Etiqueta_espacio_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Etiqueta_espacio_2.setText("                                                                                                                     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_espacio_2, gridBagConstraints);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(texto_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Panel_General.add(jPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_telefono, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_calle, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_numero, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_codigo_postal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        Panel_General.add(texto_ciudad, gridBagConstraints);

        Etiqueta_error_numero.setText("Debe introducir un numero entero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_numero, gridBagConstraints);

        Etiqueta_error_codigo_postal.setText("Debe introducir un numero entero de 6 cifras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_codigo_postal, gridBagConstraints);

        Etiqueta_error_nombre.setText("Debe introducir un nombre entre 1 y 20 caracteres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_nombre, gridBagConstraints);

        Etiqueta_error_NIE.setText("o un NIE (1 letra,  8 numeros, 1 letra)");
        Etiqueta_error_NIE.setPreferredSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Panel_General.add(Etiqueta_error_NIE, gridBagConstraints);

        jLabel1.setText("                                                               ");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 30;
        gridBagConstraints.gridy = 4;
        Panel_General.add(jLabel1, gridBagConstraints);

        Panel_Datos.add(Panel_General, java.awt.BorderLayout.CENTER);

        Panel_Derecho.setLayout(new java.awt.BorderLayout());
        Panel_Datos.add(Panel_Derecho, java.awt.BorderLayout.EAST);

        Panel_contenedor.add(Panel_Datos, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        Panel_Marco.add(Panel_contenedor, gridBagConstraints);

        getContentPane().add(Panel_Marco, new java.awt.GridBagConstraints());

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
            java.util.logging.Logger.getLogger(Formulario_Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Formulario_Registro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Volver;
    private javax.swing.JButton Boton_registrar_nuevo_cliente;
    private javax.swing.JLabel Cabecera;
    private javax.swing.JLabel Etiqueta_Apellidos;
    private javax.swing.JLabel Etiqueta_Calle;
    private javax.swing.JLabel Etiqueta_Ciudad;
    private javax.swing.JLabel Etiqueta_Codigo_Postal;
    private javax.swing.JLabel Etiqueta_DNI;
    private javax.swing.JLabel Etiqueta_Nombre;
    private javax.swing.JLabel Etiqueta_Numero;
    private javax.swing.JLabel Etiqueta_Telefono;
    private javax.swing.JLabel Etiqueta_error_DNI;
    private javax.swing.JLabel Etiqueta_error_DNI_duplicado;
    private javax.swing.JLabel Etiqueta_error_NIE;
    private javax.swing.JLabel Etiqueta_error_apellidos;
    private javax.swing.JLabel Etiqueta_error_calle;
    private javax.swing.JLabel Etiqueta_error_ciudad;
    private javax.swing.JLabel Etiqueta_error_codigo_postal;
    private javax.swing.JLabel Etiqueta_error_nombre;
    private javax.swing.JLabel Etiqueta_error_numero;
    private javax.swing.JLabel Etiqueta_error_producto_duplicado;
    private javax.swing.JLabel Etiqueta_error_telefono;
    private javax.swing.JLabel Etiqueta_espacio_2;
    private javax.swing.JPanel Panel_Cabecera;
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JPanel Panel_Derecho;
    private javax.swing.JPanel Panel_General;
    private javax.swing.JPanel Panel_Inferior;
    private javax.swing.JPanel Panel_Izquierdo;
    private javax.swing.JPanel Panel_Marco;
    private javax.swing.JPanel Panel_contenedor;
    private javax.swing.JTextField Texto_DNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField texto_apellidos;
    private javax.swing.JTextField texto_calle;
    private javax.swing.JTextField texto_ciudad;
    private javax.swing.JTextField texto_codigo_postal;
    private javax.swing.JTextField texto_nombre;
    private javax.swing.JTextField texto_numero;
    private javax.swing.JTextField texto_telefono;
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

