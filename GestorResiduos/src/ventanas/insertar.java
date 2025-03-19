/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;
import Clases.*;


/**
 *
 * @author jdavid
 */
public class insertar extends javax.swing.JPanel {
  
    String nombre;
    String descripcion;
    String esBiodegradable;
    String tipoResiduo;
    String categoria;
    String icono;
    /**
     * Creates new form insertar
     */
    
    public insertar() {
        initComponents();
        nombre = "";
        descripcion = "";
        esBiodegradable = "";
        tipoResiduo = "";
        categoria = "";
        icono = "";
        
        aceptar.setUI(new BasicButtonUI()); // Esto quita el efecto 3D
        peligroso.setUI(new BasicButtonUI());
        inorganico.setUI(new BasicButtonUI());
        Si_Biod.setUI(new BasicButtonUI());
        No_Biod.setUI(new BasicButtonUI());
        organico.setUI(new BasicButtonUI());
        No_Reciclable.setUI(new BasicButtonUI());
        Si_Reciclable.setUI(new BasicButtonUI());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        peligroso = new javax.swing.JButton();
        inorganico = new javax.swing.JButton();
        Si_Biod = new javax.swing.JButton();
        No_Biod = new javax.swing.JButton();
        organico = new javax.swing.JButton();
        No_Reciclable = new javax.swing.JButton();
        Si_Reciclable = new javax.swing.JButton();
        icono6 = new javax.swing.JButton();
        icono5 = new javax.swing.JButton();
        icono4 = new javax.swing.JButton();
        icono3 = new javax.swing.JButton();
        icono2 = new javax.swing.JButton();
        icono1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        atras = new javax.swing.JToggleButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1200, 700));

        insertar.setMinimumSize(new java.awt.Dimension(1200, 700));
        insertar.setPreferredSize(new java.awt.Dimension(1200, 700));
        insertar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(215, 206, 158));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setHorizontalScrollBar(null);

        jTextArea1.setBackground(new java.awt.Color(215, 206, 158));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Ingrese descripción aquí...");
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 188, 122), 1, true));
        jScrollPane1.setViewportView(jTextArea1);

        insertar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 200, 220));

        jTextField1.setBackground(new java.awt.Color(215, 206, 158));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 188, 122), 1, true));
        insertar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 263, 240, -1));

        aceptar.setBackground(new java.awt.Color(98, 111, 71));
        aceptar.setForeground(new java.awt.Color(254, 250, 224));
        aceptar.setText("ACEPTAR");
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        insertar.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 110, 30));

        peligroso.setBackground(new java.awt.Color(215, 206, 158));
        peligroso.setForeground(new java.awt.Color(98, 111, 71));
        peligroso.setText("Peligroso");
        peligroso.setBorder(null);
        peligroso.setBorderPainted(false);
        peligroso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peligroso.setFocusPainted(false);
        peligroso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peligrosoActionPerformed(evt);
            }
        });
        insertar.add(peligroso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 90, 20));

        inorganico.setBackground(new java.awt.Color(215, 206, 158));
        inorganico.setForeground(new java.awt.Color(98, 111, 71));
        inorganico.setText("Inorganico");
        inorganico.setBorder(null);
        inorganico.setBorderPainted(false);
        inorganico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inorganico.setFocusPainted(false);
        inorganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inorganicoActionPerformed(evt);
            }
        });
        insertar.add(inorganico, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 90, 20));

        Si_Biod.setBackground(new java.awt.Color(215, 206, 158));
        Si_Biod.setForeground(new java.awt.Color(98, 111, 71));
        Si_Biod.setText("Si");
        Si_Biod.setBorder(null);
        Si_Biod.setBorderPainted(false);
        Si_Biod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Si_Biod.setFocusPainted(false);
        Si_Biod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si_BiodActionPerformed(evt);
            }
        });
        insertar.add(Si_Biod, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 70, 20));

        No_Biod.setBackground(new java.awt.Color(215, 206, 158));
        No_Biod.setForeground(new java.awt.Color(98, 111, 71));
        No_Biod.setText("No");
        No_Biod.setBorder(null);
        No_Biod.setBorderPainted(false);
        No_Biod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No_Biod.setFocusPainted(false);
        No_Biod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BiodActionPerformed(evt);
            }
        });
        insertar.add(No_Biod, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 70, 20));

        organico.setBackground(new java.awt.Color(215, 206, 158));
        organico.setForeground(new java.awt.Color(98, 111, 71));
        organico.setText("Organico");
        organico.setBorder(null);
        organico.setBorderPainted(false);
        organico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        organico.setFocusPainted(false);
        organico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organicoActionPerformed(evt);
            }
        });
        insertar.add(organico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 90, 20));

        No_Reciclable.setBackground(new java.awt.Color(215, 206, 158));
        No_Reciclable.setForeground(new java.awt.Color(98, 111, 71));
        No_Reciclable.setText("No");
        No_Reciclable.setBorder(null);
        No_Reciclable.setBorderPainted(false);
        No_Reciclable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No_Reciclable.setFocusPainted(false);
        No_Reciclable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_ReciclableActionPerformed(evt);
            }
        });
        insertar.add(No_Reciclable, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 70, 20));

        Si_Reciclable.setBackground(new java.awt.Color(215, 206, 158));
        Si_Reciclable.setForeground(new java.awt.Color(98, 111, 71));
        Si_Reciclable.setText("Si");
        Si_Reciclable.setBorder(null);
        Si_Reciclable.setBorderPainted(false);
        Si_Reciclable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Si_Reciclable.setFocusPainted(false);
        Si_Reciclable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si_ReciclableActionPerformed(evt);
            }
        });
        insertar.add(Si_Reciclable, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 70, 20));

        icono6.setBorderPainted(false);
        icono6.setContentAreaFilled(false);
        icono6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono6ActionPerformed(evt);
            }
        });
        insertar.add(icono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 70, 70));

        icono5.setBorderPainted(false);
        icono5.setContentAreaFilled(false);
        icono5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono5ActionPerformed(evt);
            }
        });
        insertar.add(icono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 70, 60));

        icono4.setBorderPainted(false);
        icono4.setContentAreaFilled(false);
        icono4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono4ActionPerformed(evt);
            }
        });
        insertar.add(icono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 60, 70));

        icono3.setBorderPainted(false);
        icono3.setContentAreaFilled(false);
        icono3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono3ActionPerformed(evt);
            }
        });
        insertar.add(icono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 70, 70));

        icono2.setBorderPainted(false);
        icono2.setContentAreaFilled(false);
        icono2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono2ActionPerformed(evt);
            }
        });
        insertar.add(icono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 70, 70));

        icono1.setBorderPainted(false);
        icono1.setContentAreaFilled(false);
        icono1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono1ActionPerformed(evt);
            }
        });
        insertar.add(icono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, 70));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-recycle.png"))); // NOI18N
        insertar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 67, 67));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-trash-bag.png"))); // NOI18N
        insertar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 67, 67));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-leaf.png"))); // NOI18N
        insertar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 67, 67));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-flash.png"))); // NOI18N
        insertar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 67, 67));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning (1).png"))); // NOI18N
        insertar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 67, 70));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-flask.png"))); // NOI18N
        insertar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 67, 70));

        jLabel19.setBackground(new java.awt.Color(98, 111, 71));
        jLabel19.setForeground(new java.awt.Color(98, 111, 71));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 330, 1));

        jLabel17.setBackground(new java.awt.Color(98, 111, 71));
        jLabel17.setForeground(new java.awt.Color(98, 111, 71));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 330, 1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(98, 111, 71));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Biodegradable:");
        insertar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 110, 40));

        jLabel15.setBackground(new java.awt.Color(98, 111, 71));
        jLabel15.setForeground(new java.awt.Color(98, 111, 71));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 330, 1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(98, 111, 71));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Que tipo es?:");
        insertar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 110, 30));

        jLabel14.setBackground(new java.awt.Color(98, 111, 71));
        jLabel14.setForeground(new java.awt.Color(98, 111, 71));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 293, 330, 1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(98, 111, 71));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Reciclable:");
        insertar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 90, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 111, 71));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Nombre:");
        insertar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 90, 40));

        jLabel11.setBackground(new java.awt.Color(98, 111, 71));
        jLabel11.setForeground(new java.awt.Color(98, 111, 71));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 330, 1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(98, 111, 71));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DATOS");
        insertar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 170, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(98, 111, 71));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("IMAGEN");
        insertar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 180, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(98, 111, 71));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DESCRIPCIÓN");
        insertar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 180, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d7ce9e (1).png"))); // NOI18N
        insertar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 200, 220));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel6.setText("1200");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 240, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EDE7C6 (1).png"))); // NOI18N
        jLabel5.setText("1200");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 280, 400));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 250, 224));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Insertar Residuo");
        insertar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 400, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 420, 70));

        jLabel21.setBackground(new java.awt.Color(98, 111, 71));
        jLabel21.setForeground(new java.awt.Color(98, 111, 71));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 219, 242, 302));

        jLabel20.setBackground(new java.awt.Color(98, 111, 71));
        jLabel20.setForeground(new java.awt.Color(98, 111, 71));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 169, 282, 402));

        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        insertar.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        insertar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 950, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fefae0 (1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 440, 50));

        jLabel.setBackground(new java.awt.Color(98, 111, 71));
        jLabel.setForeground(new java.awt.Color(98, 111, 71));
        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/626f47 (1).png"))); // NOI18N
        insertar.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ponerPanel(JPanel p) {
    // Establecer tamaño y ubicación para el panel a agregar
        insertar.removeAll();

    // Establecer tamaño y ubicación para el panel a agregar
        p.setSize(insertar.getWidth(), insertar.getHeight()); // Ajusta al tamaño del panelDerecha
        p.setLocation(0, 0); // Establecer la ubicación en el panelDerecha

        // Agregar el panel al contenedor sin especificar layout
        insertar.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1)); // Usando AbsoluteConstraints

        // Revalidar y repaint
        insertar.revalidate();
        insertar.repaint();
    }
    
    private void organicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organicoActionPerformed
      categoria = "Orgánico";
    }//GEN-LAST:event_organicoActionPerformed

    private void Si_ReciclableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si_ReciclableActionPerformed
        tipoResiduo = "Reciclable";
    }//GEN-LAST:event_Si_ReciclableActionPerformed

    private void inorganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inorganicoActionPerformed
       categoria = "Inorgánico";
    }//GEN-LAST:event_inorganicoActionPerformed

    private void peligrosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peligrosoActionPerformed
        categoria = "Peligroso";
    }//GEN-LAST:event_peligrosoActionPerformed

    private void Si_BiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si_BiodActionPerformed
        esBiodegradable = "SI";
    }//GEN-LAST:event_Si_BiodActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        Gestor gestor = Gestor.getInstance();
        nombre = jTextField1.getText();
        descripcion = jTextArea1.getText();
        
        gestor.insertarResiduo(nombre, descripcion, esBiodegradable, tipoResiduo, categoria, icono, this);
        menuPanel p1 = new menuPanel();ponerPanel(p1);
        ponerPanel(p1);
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        menuPanel p = new menuPanel();
        ponerPanel(p);
    }//GEN-LAST:event_atrasActionPerformed

    private void No_ReciclableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_ReciclableActionPerformed
        tipoResiduo = "NoReciclable";
    }//GEN-LAST:event_No_ReciclableActionPerformed

    private void No_BiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_BiodActionPerformed
        esBiodegradable = "NO";
    }//GEN-LAST:event_No_BiodActionPerformed

    private void icono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono1ActionPerformed
        icono = "warning (1).png";
    }//GEN-LAST:event_icono1ActionPerformed

    private void icono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono2ActionPerformed
        icono = "003-flask.png";
    }//GEN-LAST:event_icono2ActionPerformed

    private void icono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono3ActionPerformed
        icono = "002-leaf.png";
    }//GEN-LAST:event_icono3ActionPerformed

    private void icono4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono4ActionPerformed
         icono = "001-flash.png";
    }//GEN-LAST:event_icono4ActionPerformed

    private void icono5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono5ActionPerformed
        icono = "003-recycle.png";
    }//GEN-LAST:event_icono5ActionPerformed

    private void icono6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono6ActionPerformed
        icono = "002-trash-bag.png";
    }//GEN-LAST:event_icono6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton No_Biod;
    private javax.swing.JButton No_Reciclable;
    private javax.swing.JButton Si_Biod;
    private javax.swing.JButton Si_Reciclable;
    private javax.swing.JButton aceptar;
    private javax.swing.JToggleButton atras;
    private javax.swing.JButton icono1;
    private javax.swing.JButton icono2;
    private javax.swing.JButton icono3;
    private javax.swing.JButton icono4;
    private javax.swing.JButton icono5;
    private javax.swing.JButton icono6;
    private javax.swing.JButton inorganico;
    private javax.swing.JPanel insertar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton organico;
    private javax.swing.JButton peligroso;
    // End of variables declaration//GEN-END:variables

}

