package Presentacion;

import Logica.Articulacion;
import Logica.Base;
import Logica.Seccion;
import Logica.Coordenadas;
import javax.swing.JPanel;

public class ValoresCoordenadas extends javax.swing.JFrame {
    
    public ValoresCoordenadas() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setBounds(0,0,500,500 );
        jPanel1.setBounds(0,0,500,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deslizamientoHorizontal = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jSangulo1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rotacion = new javax.swing.JSlider();
        jSangulo2 = new javax.swing.JSlider();
        jSangulo4 = new javax.swing.JSlider();
        jSangulo3 = new javax.swing.JSlider();
        anguloToracionBase = new javax.swing.JLabel();
        jLHorizontal = new javax.swing.JLabel();
        angulo1 = new javax.swing.JLabel();
        angulo2 = new javax.swing.JLabel();
        angulo3 = new javax.swing.JLabel();
        angulo4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        Title_X = new java.awt.Label();
        Title_Z = new java.awt.Label();
        Title_Y = new java.awt.Label();
        x1 = new java.awt.Label();
        x2 = new java.awt.Label();
        x3 = new java.awt.Label();
        x4 = new java.awt.Label();
        y1 = new java.awt.Label();
        y2 = new java.awt.Label();
        y3 = new java.awt.Label();
        y4 = new java.awt.Label();
        z1 = new java.awt.Label();
        z2 = new java.awt.Label();
        z3 = new java.awt.Label();
        z4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESLIZADOR HORIZONTAL");

        deslizamientoHorizontal.setMaximum(800);
        deslizamientoHorizontal.setValue(200);
        deslizamientoHorizontal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizamientoHorizontalStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROTACION");

        jSangulo1.setMajorTickSpacing(50);
        jSangulo1.setMaximum(175);
        jSangulo1.setMinimum(5);
        jSangulo1.setMinorTickSpacing(5);
        jSangulo1.setPaintLabels(true);
        jSangulo1.setPaintTicks(true);
        jSangulo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo1StateChanged(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ART");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("D:");

        rotacion.setMaximum(360);
        rotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rotacionStateChanged(evt);
            }
        });

        jSangulo2.setMajorTickSpacing(50);
        jSangulo2.setMaximum(175);
        jSangulo2.setMinimum(5);
        jSangulo2.setMinorTickSpacing(5);
        jSangulo2.setPaintLabels(true);
        jSangulo2.setPaintTicks(true);
        jSangulo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo2StateChanged(evt);
            }
        });

        jSangulo4.setMajorTickSpacing(50);
        jSangulo4.setMaximum(175);
        jSangulo4.setMinimum(5);
        jSangulo4.setMinorTickSpacing(5);
        jSangulo4.setPaintLabels(true);
        jSangulo4.setPaintTicks(true);
        jSangulo4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo4StateChanged(evt);
            }
        });

        jSangulo3.setMajorTickSpacing(50);
        jSangulo3.setMaximum(175);
        jSangulo3.setMinimum(5);
        jSangulo3.setMinorTickSpacing(5);
        jSangulo3.setPaintLabels(true);
        jSangulo3.setPaintTicks(true);
        jSangulo3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo3StateChanged(evt);
            }
        });

        anguloToracionBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anguloToracionBase.setText("0");
        anguloToracionBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLHorizontal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHorizontal.setText("0");
        jLHorizontal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo1.setText("5");
        angulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo2.setText("5");
        angulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo3.setText("5");
        angulo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo4.setText("5");
        angulo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("CERRAR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar_datos_24.png"))); // NOI18N
        jButton1.setText("Enviar Datos");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(165, 81));
        jButton1.setMinimumSize(new java.awt.Dimension(165, 81));
        jButton1.setPreferredSize(new java.awt.Dimension(105, 81));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar_datos_24.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar_datos_32.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Title_X.setMinimumSize(new java.awt.Dimension(54, 14));
        Title_X.setPreferredSize(new java.awt.Dimension(54, 14));
        Title_X.setText("X");

        Title_Z.setText("Z");

        Title_Y.setText("Y");

        x1.setText("0");

        x2.setText("0");

        x3.setText("0");

        x4.setText("0");

        y1.setText("0");

        y2.setText("0");

        y3.setText("0");

        y4.setText("0");

        z1.setText("0");

        z2.setText("0");

        z3.setText("0");

        z4.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deslizamientoHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(rotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1))
                            .addComponent(anguloToracionBase, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSangulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSangulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSangulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(angulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(angulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(angulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(angulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(x4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(y3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(y2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(y1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_Y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(y4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deslizamientoHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anguloToracionBase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_Z, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSangulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(angulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(z1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSangulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(y2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(angulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addComponent(x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(z2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSangulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(z3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(y3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(angulo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSangulo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(z4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(y4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(angulo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        jLHorizontal.getAccessibleContext().setAccessibleName("JLHORIZONTAL");
        jLHorizontal.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        plataforma.setMovHorizontal(deslizamientoHorizontal.getValue());

        a1.setAngulo(Math.toRadians(jSangulo1.getValue()));
        s1.setIx(((plataforma.getMovHorizontal())+plataforma.getAncho()/2));
        s1.setIy(plataforma.getInicialVer());
        s1.setFx(s1.getIx()+(int)(Math.cos(a1.getAngulo())*(150)));
        s1.setFy(s1.getIy()-(int)(Math.sin(a1.getAngulo())*(150)));

        a2.setAngulo(Math.toRadians(jSangulo2.getValue()));
        s2.setIx(s1.getFx());
        s2.setIy(s1.getFy());
        s2.setFx(s2.getIx()+(int)(Math.sin(a2.getAngulo())*(150)));
        s2.setFy(s2.getIy()+(int)(Math.cos(a2.getAngulo())*(150)));

        a3.setAngulo(Math.toRadians(jSangulo3.getValue()));
        s3.setIx(s2.getFx());
        s3.setIy(s2.getFy());
        s3.setFx(s3.getIx()-(int)(Math.cos(a3.getAngulo())*(150)));
        s3.setFy(s3.getIy()+(int)(Math.sin(a3.getAngulo())*(150)));

        aGD1.setAngulo(Math.toRadians(45));
        sGD1.setIx(s3.getFx());
        sGD1.setIy(s3.getFy());
        sGD1.setFx(sGD1.getIx()+(int)(Math.sin(aGD1.getAngulo())*(10)));
        sGD1.setFy(sGD1.getIy()+(int)(Math.cos(aGD1.getAngulo())*(10)));

        aGI1.setAngulo(-Math.toRadians(45));
        sGI1.setIx(s3.getFx());
        sGI1.setIy(s3.getFy());
        sGI1.setFx(sGI1.getIx()+(int)(Math.sin(aGI1.getAngulo())*(10)));
        sGI1.setFy(sGI1.getIy()+(int)(Math.cos(aGD1.getAngulo())*(10)));

        if(jCheckBox1.isSelected()==true){
            aGD2.setAngulo(-Math.PI/4);
            sGD2.setIx(sGD1.getFx());
            sGD2.setIy(sGD1.getFy());
            sGD2.setFx(sGD2.getIx()+(int)(Math.sin(aGD2.getAngulo())*(10)));
            sGD2.setFy(sGD2.getIy()+(int)(Math.cos(aGD2.getAngulo())*(10)));

            aGI2.setAngulo(Math.PI/4);
            sGI2.setIx(sGI1.getFx());
            sGI2.setIy(sGI1.getFy());
            sGI2.setFx(sGI2.getIx()+(int)(Math.sin(aGI2.getAngulo())*(10)));
            sGI2.setFy(sGI2.getIy()+(int)(Math.cos(aGI2.getAngulo())*(10)));
        }else if(jCheckBox1.isSelected()==false){
            aGD2.setAngulo(-Math.PI/39);
            sGD2.setIx(sGD1.getFx());
            sGD2.setIy(sGD1.getFy());
            sGD2.setFx(sGD2.getIx()+(int)(Math.sin(aGD2.getAngulo())*(10)));
            sGD2.setFy(sGD2.getIy()+(int)(Math.cos(aGD2.getAngulo())*(10)));

            aGI2.setAngulo(Math.PI/39);
            sGI2.setIx(sGI1.getFx());
            sGI2.setIy(sGI1.getFy());
            sGI2.setFx(sGI2.getIx()+(int)(Math.sin(aGI2.getAngulo())*(10)));
            sGI2.setFy(sGI2.getIy()+(int)(Math.cos(aGI2.getAngulo())*(10)));
        }
        int[] joints={jSangulo1.getValue(),jSangulo2.getValue(),jSangulo3.getValue(),jSangulo4.getValue()};
        Coordenadas Brazo = new Coordenadas(); //no estoy teniendo encuanta el x de la base
        Brazo.setJoints(joints);
        Brazo.setRota(rotacion.getValue());
        Brazo.setMov_Ho(deslizamientoHorizontal.getValue());
        Brazo.Precalcular();
        
        int[] posicion=Brazo.Calcular(0);
        x1.setText(""+posicion[0]);
        y1.setText(""+posicion[1]);
        z1.setText(""+posicion[2]);
  
        
        posicion=Brazo.Calcular(1);
        x2.setText(""+posicion[0]);
        y2.setText(""+posicion[1]);
        z2.setText(""+posicion[2]);
        
        posicion=Brazo.Calcular(2);
        x3.setText(""+posicion[0]);
        y3.setText(""+posicion[1]);
        z3.setText(""+posicion[2]);
        
        posicion=Brazo.Calcular(3);
        x4.setText(""+posicion[0]);
        y4.setText(""+posicion[1]);
        z4.setText(""+posicion[2]);
        Ventana brazoRobotico= new Ventana(plataforma,  s1,  s2,  s3,  sGD1,  sGI1,  sGD2,  sGI2);
        brazoRobotico.setVisible(true);
        brazoRobotico.setSize(800, 800);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jSangulo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo3StateChanged
        angulo3.setText(String.valueOf(jSangulo3.getValue()));

    }//GEN-LAST:event_jSangulo3StateChanged

    private void jSangulo4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo4StateChanged
        angulo4.setText(String.valueOf(jSangulo4.getValue()));

    }//GEN-LAST:event_jSangulo4StateChanged

    private void jSangulo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo2StateChanged
        angulo2.setText(String.valueOf(jSangulo2.getValue()));

    }//GEN-LAST:event_jSangulo2StateChanged

    private void rotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rotacionStateChanged
        anguloToracionBase.setText(String.valueOf(rotacion.getValue()));
    }//GEN-LAST:event_rotacionStateChanged

    private void jSangulo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo1StateChanged
        angulo1.setText(String.valueOf(jSangulo1.getValue()));

    }//GEN-LAST:event_jSangulo1StateChanged

    private void deslizamientoHorizontalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizamientoHorizontalStateChanged
        jLHorizontal.setText(String.valueOf(deslizamientoHorizontal.getValue()));

    }//GEN-LAST:event_deslizamientoHorizontalStateChanged
 
    public Base plataforma=new Base();
    public Articulacion a1=new Articulacion();
    public Seccion s1=new Seccion();
    public Articulacion a2=new Articulacion();
    public Seccion s2=new Seccion();
    public Articulacion a3=new Articulacion();
    public Seccion s3=new Seccion();
    
    public Articulacion aGD1=new Articulacion();
    public Articulacion aGI1=new Articulacion();
    public Seccion sGD1=new Seccion();
    public Seccion sGI1=new Seccion();
    public Articulacion aGD2=new Articulacion();
    public Articulacion aGI2=new Articulacion();
    public Seccion sGD2=new Seccion();
    public Seccion sGI2=new Seccion();
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Title_X;
    private java.awt.Label Title_Y;
    private java.awt.Label Title_Z;
    private javax.swing.JLabel angulo1;
    private javax.swing.JLabel angulo2;
    private javax.swing.JLabel angulo3;
    private javax.swing.JLabel angulo4;
    private javax.swing.JLabel anguloToracionBase;
    private javax.swing.JSlider deslizamientoHorizontal;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLHorizontal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSangulo1;
    private javax.swing.JSlider jSangulo2;
    private javax.swing.JSlider jSangulo3;
    private javax.swing.JSlider jSangulo4;
    private javax.swing.JSlider rotacion;
    private java.awt.Label x1;
    private java.awt.Label x2;
    private java.awt.Label x3;
    private java.awt.Label x4;
    private java.awt.Label y1;
    private java.awt.Label y2;
    private java.awt.Label y3;
    private java.awt.Label y4;
    private java.awt.Label z1;
    private java.awt.Label z2;
    private java.awt.Label z3;
    private java.awt.Label z4;
    // End of variables declaration//GEN-END:variables

}

