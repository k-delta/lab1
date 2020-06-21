
package Presentacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JLabel;

public class Vista extends javax.swing.JFrame {

    private Controlador control;
    private Modelo modelo;
    //private boolean seleccion;
    
    public Vista(Modelo m) {
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/IconoFrame.png")).getImage());
        this.setSize(new Dimension(1000, 1000));
        modelo = m;
        initComponents();
        asignacionDeEvents();
    }

    
    public Controlador getControl() {
        if (control == null) {
            control = new Controlador(this);
        }
        return control;
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public JCheckBox getPinza() {
        return Pinza;
    }

    public void setPinza(JCheckBox Pinza) {
        this.Pinza = Pinza;
    }

    public JLabel getX1() {
        return X1;
    }

    public void setX1(JLabel X1) {
        this.X1 = X1;
    }

    public JLabel getX2() {
        return X2;
    }

    public void setX2(JLabel X2) {
        this.X2 = X2;
    }

    public JLabel getX3() {
        return X3;
    }

    public void setX3(JLabel X3) {
        this.X3 = X3;
    }

    public JLabel getX4() {
        return X4;
    }

    public void setX4(JLabel X4) {
        this.X4 = X4;
    }

    public JLabel getY1() {
        return Y1;
    }

    public void setY1(JLabel Y1) {
        this.Y1 = Y1;
    }

    public JLabel getY2() {
        return Y2;
    }

    public void setY2(JLabel Y2) {
        this.Y2 = Y2;
    }

    public JLabel getY3() {
        return Y3;
    }

    public void setY3(JLabel Y3) {
        this.Y3 = Y3;
    }

    public JLabel getY4() {
        return Y4;
    }

    public void setY4(JLabel Y4) {
        this.Y4 = Y4;
    }

    public JLabel getZ1() {
        return Z1;
    }

    public void setZ1(JLabel Z1) {
        this.Z1 = Z1;
    }

    public JLabel getZ2() {
        return Z2;
    }

    public void setZ2(JLabel Z2) {
        this.Z2 = Z2;
    }

    public JLabel getZ3() {
        return Z3;
    }

    public void setZ3(JLabel Z3) {
        this.Z3 = Z3;
    }

    public JLabel getZ4() {
        return Z4;
    }

    public void setZ4(JLabel Z4) {
        this.Z4 = Z4;
    }

    

    public JCheckBox getjCBVistaSuperior() {
        return jCBVistaSuperior;
    }

    public void setjCBVistaSuperior(JCheckBox jCBVistaSuperior) {
        this.jCBVistaSuperior = jCBVistaSuperior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new FondoPanel();
        JointD = new javax.swing.JSlider();
        Pinza = new javax.swing.JCheckBox();
        JointA = new javax.swing.JSlider();
        JointB = new javax.swing.JSlider();
        JointC = new javax.swing.JSlider();
        Mov_Ho = new javax.swing.JSlider();
        Rota = new javax.swing.JSlider();
        jSPVistaFrontal = new javax.swing.JScrollPane();
        vistaFrontal = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        Title_X = new javax.swing.JLabel();
        Title_Y = new javax.swing.JLabel();
        Title_Z = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();
        X3 = new javax.swing.JLabel();
        X4 = new javax.swing.JLabel();
        Y1 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        Y3 = new javax.swing.JLabel();
        Y4 = new javax.swing.JLabel();
        Z2 = new javax.swing.JLabel();
        Z1 = new javax.swing.JLabel();
        Z3 = new javax.swing.JLabel();
        Z4 = new javax.swing.JLabel();
        jCBVistaSuperior = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mostrar_mov = new javax.swing.JLabel();
        mostrar_rota = new javax.swing.JLabel();
        mostrarA = new javax.swing.JLabel();
        mostrarB = new javax.swing.JLabel();
        mostrarD = new javax.swing.JLabel();
        mostrarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brazo Robotico");
        setBounds(new java.awt.Rectangle(0, 0, 800, 500));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(900, 730));
        setMinimumSize(new java.awt.Dimension(844, 702));
        setName("Visual_Datos"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(30000, 30000));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(830, 700));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(3500, 2500));

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 1350));

        JointD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JointD.setMajorTickSpacing(15);
        JointD.setMaximum(175);
        JointD.setMinimum(5);
        JointD.setPaintLabels(true);
        JointD.setPaintTicks(true);
        JointD.setValue(90);
        JointD.setOpaque(false);

        Pinza.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Pinza.setText("Pinza");
        Pinza.setMaximumSize(new java.awt.Dimension(25, 25));
        Pinza.setMinimumSize(new java.awt.Dimension(25, 25));
        Pinza.setOpaque(false);
        Pinza.setPreferredSize(new java.awt.Dimension(25, 25));
        Pinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinzaActionPerformed(evt);
            }
        });

        JointA.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JointA.setMajorTickSpacing(15);
        JointA.setMaximum(175);
        JointA.setMinimum(5);
        JointA.setPaintLabels(true);
        JointA.setPaintTicks(true);
        JointA.setValue(90);
        JointA.setOpaque(false);

        JointB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JointB.setMajorTickSpacing(15);
        JointB.setMaximum(175);
        JointB.setMinimum(5);
        JointB.setPaintLabels(true);
        JointB.setPaintTicks(true);
        JointB.setValue(90);
        JointB.setOpaque(false);

        JointC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JointC.setMajorTickSpacing(15);
        JointC.setMaximum(175);
        JointC.setMinimum(5);
        JointC.setPaintLabels(true);
        JointC.setPaintTicks(true);
        JointC.setValue(90);
        JointC.setOpaque(false);

        Mov_Ho.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Mov_Ho.setMajorTickSpacing(100);
        Mov_Ho.setMaximum(800);
        Mov_Ho.setPaintLabels(true);
        Mov_Ho.setPaintTicks(true);
        Mov_Ho.setSnapToTicks(true);
        Mov_Ho.setValue(0);
        Mov_Ho.setOpaque(false);

        Rota.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Rota.setMajorTickSpacing(45);
        Rota.setMaximum(360);
        Rota.setPaintLabels(true);
        Rota.setPaintTicks(true);
        Rota.setValue(0);
        Rota.setOpaque(false);

        vistaFrontal.setBackground(new java.awt.Color(102, 255, 255));
        vistaFrontal.setMinimumSize(new java.awt.Dimension(800, 800));
        jSPVistaFrontal.setViewportView(vistaFrontal);
        vistaFrontal.getAccessibleContext().setAccessibleName("");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        Title_X.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Title_X.setForeground(new java.awt.Color(65, 34, 39));
        Title_X.setText("X");
        Title_X.setAlignmentX(2.0F);

        Title_Y.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Title_Y.setText("Y");
        Title_Y.setAlignmentX(2.0F);

        Title_Z.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Title_Z.setText("Z");
        Title_Z.setAlignmentX(2.0F);

        X1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        X1.setText("0");
        X1.setAlignmentX(2.0F);

        X2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        X2.setText("0");
        X2.setAlignmentX(2.0F);

        X3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        X3.setText("0");
        X3.setAlignmentX(2.0F);

        X4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        X4.setText("0");
        X4.setAlignmentX(2.0F);

        Y1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Y1.setText("0");
        Y1.setAlignmentX(2.0F);

        Y2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Y2.setText("0");
        Y2.setAlignmentX(2.0F);

        Y3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Y3.setText("0");
        Y3.setAlignmentX(2.0F);

        Y4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Y4.setText("0");
        Y4.setAlignmentX(2.0F);

        Z2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Z2.setText("0");
        Z2.setAlignmentX(2.0F);

        Z1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Z1.setText("0");
        Z1.setAlignmentX(2.0F);

        Z3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Z3.setText("0");
        Z3.setAlignmentX(2.0F);

        Z4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Z4.setText("0");
        Z4.setAlignmentX(2.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(X4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title_X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title_Y, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(Y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Y4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Y3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Z3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Z2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Z1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title_Z, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Z4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title_Y, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(Title_X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title_Z, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(X1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(X4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jCBVistaSuperior.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCBVistaSuperior.setText("Vista Superior");
        jCBVistaSuperior.setOpaque(false);
        jCBVistaSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBVistaSuperiorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 34, 39));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desplazamiento Horizontal");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 34, 39));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rotación");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Articulaciones");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("D");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrar_mov.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrar_mov.setText("0");
        mostrar_mov.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrar_rota.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrar_rota.setText("0");
        mostrar_rota.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrarA.setText("5");
        mostrarA.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrarB.setText("5");
        mostrarB.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrarD.setText("5");
        mostrarD.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mostrarC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mostrarC.setText("5");
        mostrarC.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JointD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JointC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JointB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(JointA, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jCBVistaSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSPVistaFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mov_Ho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                            .addComponent(Rota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrar_mov, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(mostrar_rota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrar_mov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrar_rota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBVistaSuperior)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JointA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(mostrarB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JointB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(mostrarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JointC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrarD, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(JointD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSPVistaFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1405, 1405, 1405))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(851, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBVistaSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBVistaSuperiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBVistaSuperiorActionPerformed

    private void PinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinzaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider JointA;
    private javax.swing.JSlider JointB;
    private javax.swing.JSlider JointC;
    private javax.swing.JSlider JointD;
    private javax.swing.JSlider Mov_Ho;
    private javax.swing.JCheckBox Pinza;
    private javax.swing.JSlider Rota;
    private javax.swing.JLabel Title_X;
    private javax.swing.JLabel Title_Y;
    private javax.swing.JLabel Title_Z;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X3;
    private javax.swing.JLabel X4;
    private javax.swing.JLabel Y1;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel Y3;
    private javax.swing.JLabel Y4;
    private javax.swing.JLabel Z1;
    private javax.swing.JLabel Z2;
    private javax.swing.JLabel Z3;
    private javax.swing.JLabel Z4;
    private javax.swing.JCheckBox jCBVistaSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSPVistaFrontal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarA;
    private javax.swing.JLabel mostrarB;
    private javax.swing.JLabel mostrarC;
    private javax.swing.JLabel mostrarD;
    private javax.swing.JLabel mostrar_mov;
    private javax.swing.JLabel mostrar_rota;
    private java.awt.Canvas vistaFrontal;
    // End of variables declaration//GEN-END:variables

    public JSlider getJointA() {
        return JointA;
    }

    public void setJointA(JSlider JointA) {
        this.JointA = JointA;
    }

    public JSlider getJointB() {
        return JointB;
    }

    public void setJointB(JSlider JointB) {
        this.JointB = JointB;
    }

    public JSlider getJointC() {
        return JointC;
    }

    public void setJointC(JSlider JointC) {
        this.JointC = JointC;
    }

    public JSlider getJointD() {
        return JointD;
    }

    public void setJointD(JSlider JointD) {
        this.JointD = JointD;
    }

    public JSlider getMov_Ho() {
        return Mov_Ho;
    }

    public void setMov_Ho(JSlider Mov_Ho) {
        this.Mov_Ho = Mov_Ho;
    }

    public JSlider getRota() {
        return Rota;
    }

    public void setRota(JSlider Rota) {
        this.Rota = Rota;
    }

    public JLabel getMostrarA() {
        return mostrarA;
    }

    public void setMostrarA(JLabel mostrarA) {
        this.mostrarA = mostrarA;
    }

    public JLabel getMostrarB() {
        return mostrarB;
    }

    public void setMostrarB(JLabel mostrarB) {
        this.mostrarB = mostrarB;
    }

    public JLabel getMostrarC() {
        return mostrarC;
    }

    public void setMostrarC(JLabel mostrarC) {
        this.mostrarC = mostrarC;
    }

    public JLabel getMostrarD() {
        return mostrarD;
    }

    public void setMostrarD(JLabel mostrarD) {
        this.mostrarD = mostrarD;
    }

    

    

    public JLabel getMostrar_mov() {
        return mostrar_mov;
    }

    public void setMostrar_mov(JLabel mostrar_mov) {
        this.mostrar_mov = mostrar_mov;
    }

    public JLabel getMostrar_rota() {
        return mostrar_rota;
    }

    public void setMostrar_rota(JLabel mostrar_rota) {
        this.mostrar_rota = mostrar_rota;
    }
    
    

    public Canvas getVistaFrontal() {
        return vistaFrontal;
    }

    public void setVistaFrontal(Canvas vistaFrontal) {
        this.vistaFrontal = vistaFrontal;
    }
    
    public void asignacionDeEvents() {
        this.Mov_Ho.addChangeListener(getControl());
        this.Rota.addChangeListener(getControl());
        this.JointA.addChangeListener(getControl());
        this.JointB.addChangeListener(getControl());
        this.JointC.addChangeListener(getControl());
        this.JointD.addChangeListener(getControl());
        
    }

    public JScrollPane getjSPVistaFrontal() {
        return jSPVistaFrontal;
    }

    public void setjSPVistaFrontal(JScrollPane jSPVistaFrontal) {
        this.jSPVistaFrontal = jSPVistaFrontal;
    }
    
    
    class FondoPanel extends JPanel{
        private Image fondo;
        @Override
        public void paint(Graphics g) {
            
            fondo=new ImageIcon(getClass().getResource("/imagenes/cyanFondo.png")).getImage(); 
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this );
            setOpaque(false);
            super.paint(g);
       
        }   
    }

}
