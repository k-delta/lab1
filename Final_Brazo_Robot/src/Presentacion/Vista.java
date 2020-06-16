
package Presentacion;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
public class Vista extends javax.swing.JFrame {

    private Controlador control;
    private Modelo modelo;
    
    public Vista(Modelo m) {
        this.setSize(new Dimension(1000,1000));
        modelo = m;
        initComponents();
        
        asignacionDeEvents();
    }

    public Controlador getControl() {
        if(control == null){
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

    public Label getX1() {
        return X1;
    }

    public void setX1(Label X1) {
        this.X1 = X1;
    }

    public Label getX2() {
        return X2;
    }

    public void setX2(Label X2) {
        this.X2 = X2;
    }

    public Label getX3() {
        return X3;
    }

    public void setX3(Label X3) {
        this.X3 = X3;
    }

    public Label getX4() {
        return X4;
    }

    public void setX4(Label X4) {
        this.X4 = X4;
    }

    public Label getY1() {
        return Y1;
    }

    public void setY1(Label Y1) {
        this.Y1 = Y1;
    }

    public Label getY2() {
        return Y2;
    }

    public void setY2(Label Y2) {
        this.Y2 = Y2;
    }

    public Label getY3() {
        return Y3;
    }

    public void setY3(Label Y3) {
        this.Y3 = Y3;
    }

    public Label getY4() {
        return Y4;
    }

    public void setY4(Label Y4) {
        this.Y4 = Y4;
    }

    public Label getZ1() {
        return Z1;
    }

    public void setZ1(Label Z1) {
        this.Z1 = Z1;
    }

    public Label getZ2() {
        return Z2;
    }

    public void setZ2(Label Z2) {
        this.Z2 = Z2;
    }

    public Label getZ3() {
        return Z3;
    }

    public void setZ3(Label Z3) {
        this.Z3 = Z3;
    }

    public Label getZ4() {
        return Z4;
    }

    public void setZ4(Label Z4) {
        this.Z4 = Z4;
    }

    
    
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Title_Joint = new java.awt.Label();
        TitleA = new java.awt.Label();
        JointD = new javax.swing.JSlider();
        Title_Pinza = new java.awt.Label();
        Pinza = new javax.swing.JCheckBox();
        mostrarA = new java.awt.Label();
        JointA = new javax.swing.JSlider();
        TitleB = new java.awt.Label();
        mostrarB = new java.awt.Label();
        JointB = new javax.swing.JSlider();
        TitleC = new java.awt.Label();
        mostrarC = new java.awt.Label();
        JointC = new javax.swing.JSlider();
        TitleD = new java.awt.Label();
        mostrarD = new java.awt.Label();
        Title_Mov_Ho = new java.awt.Label();
        mostrar_mov = new java.awt.Label();
        Mov_Ho = new javax.swing.JSlider();
        Title_Rota = new java.awt.Label();
        mostrar_rota = new java.awt.Label();
        Rota = new javax.swing.JSlider();
        jSPVistaFrontal = new javax.swing.JScrollPane();
        vistaFrontal = new java.awt.Canvas();
        jSPVistaSuperior = new javax.swing.JScrollPane();
        vistaSuperior = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        Title_X = new java.awt.Label();
        X1 = new java.awt.Label();
        X2 = new java.awt.Label();
        X3 = new java.awt.Label();
        X4 = new java.awt.Label();
        Title_Y = new java.awt.Label();
        Y1 = new java.awt.Label();
        Y2 = new java.awt.Label();
        Y3 = new java.awt.Label();
        Y4 = new java.awt.Label();
        Title_Z = new java.awt.Label();
        Z1 = new java.awt.Label();
        Z2 = new java.awt.Label();
        Z3 = new java.awt.Label();
        Z4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 500));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(900, 730));
        setMinimumSize(new java.awt.Dimension(860, 730));
        setName("Visual_Datos"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(900, 600));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(900, 600));

        Title_Joint.setAlignment(java.awt.Label.CENTER);
        Title_Joint.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title_Joint.setText("Articulaciones");

        TitleA.setText("A");

        JointD.setMajorTickSpacing(15);
        JointD.setMaximum(175);
        JointD.setMinimum(5);
        JointD.setPaintLabels(true);
        JointD.setPaintTicks(true);
        JointD.setValue(90);

        Title_Pinza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title_Pinza.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title_Pinza.setText("Pinza");

        Pinza.setMaximumSize(new java.awt.Dimension(25, 25));
        Pinza.setMinimumSize(new java.awt.Dimension(25, 25));
        Pinza.setPreferredSize(new java.awt.Dimension(25, 25));
        Pinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinzaActionPerformed(evt);
            }
        });

        mostrarA.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarA.setText("5");

        JointA.setMajorTickSpacing(15);
        JointA.setMaximum(175);
        JointA.setMinimum(5);
        JointA.setPaintLabels(true);
        JointA.setPaintTicks(true);
        JointA.setValue(90);

        TitleB.setText("B");

        mostrarB.setName(""); // NOI18N
        mostrarB.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarB.setText("5");

        JointB.setMajorTickSpacing(15);
        JointB.setMaximum(175);
        JointB.setMinimum(5);
        JointB.setPaintLabels(true);
        JointB.setPaintTicks(true);
        JointB.setValue(90);

        TitleC.setText("C");

        mostrarC.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarC.setText("5");

        JointC.setMajorTickSpacing(15);
        JointC.setMaximum(175);
        JointC.setMinimum(5);
        JointC.setPaintLabels(true);
        JointC.setPaintTicks(true);
        JointC.setValue(90);

        TitleD.setText("D");

        mostrarD.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarD.setText("5");

        Title_Mov_Ho.setAlignment(java.awt.Label.CENTER);
        Title_Mov_Ho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title_Mov_Ho.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title_Mov_Ho.setText("Desplazamiento Horizontal");

        mostrar_mov.setMinimumSize(new java.awt.Dimension(15, 20));
        mostrar_mov.setText("0");

        Mov_Ho.setMajorTickSpacing(100);
        Mov_Ho.setMaximum(800);
        Mov_Ho.setPaintLabels(true);
        Mov_Ho.setPaintTicks(true);
        Mov_Ho.setValue(0);

        Title_Rota.setAlignment(java.awt.Label.CENTER);
        Title_Rota.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title_Rota.setText("Rotacion");

        mostrar_rota.setMinimumSize(new java.awt.Dimension(15, 20));
        mostrar_rota.setName(""); // NOI18N
        mostrar_rota.setText("0");

        Rota.setMajorTickSpacing(45);
        Rota.setMaximum(360);
        Rota.setPaintLabels(true);
        Rota.setPaintTicks(true);
        Rota.setValue(0);

        jSPVistaFrontal.setViewportView(vistaFrontal);
        vistaFrontal.getAccessibleContext().setAccessibleName("");

        jSPVistaSuperior.setViewportView(vistaSuperior);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Title_X.setText("X");

        X1.setText("0");

        X2.setText("0");

        X3.setText("0");

        X4.setText("0");

        Title_Y.setPreferredSize(new java.awt.Dimension(11, 15));
        Title_Y.setText("Y");

        Y1.setText("0");

        Y2.setText("0");

        Y3.setText("0");

        Y4.setName(""); // NOI18N
        Y4.setText("0");

        Title_Z.setText("Z");

        Z1.setText("0");

        Z2.setName(""); // NOI18N
        Z2.setText("0");

        Z3.setText("0");

        Z4.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title_X, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(X4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Z4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Z1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Z2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Z3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title_X, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Y3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(X4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Z4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Title_Joint, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSPVistaFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSPVistaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TitleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TitleA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JointD, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                                .addComponent(JointC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JointB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JointA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mostrarA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mostrarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mostrarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mostrarD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Title_Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Title_Mov_Ho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addComponent(Title_Rota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mov_Ho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrar_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar_rota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Title_Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrar_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mov_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title_Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Title_Joint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(mostrarA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JointB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TitleB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mostrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JointC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TitleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mostrarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TitleD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JointD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mostrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(TitleA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JointA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mostrar_rota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(Title_Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSPVistaFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPVistaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(621, 621, 621))
        );

        Title_Pinza.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(851, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private java.awt.Label TitleA;
    private java.awt.Label TitleB;
    private java.awt.Label TitleC;
    private java.awt.Label TitleD;
    private java.awt.Label Title_Joint;
    private java.awt.Label Title_Mov_Ho;
    private java.awt.Label Title_Pinza;
    private java.awt.Label Title_Rota;
    private java.awt.Label Title_X;
    private java.awt.Label Title_Y;
    private java.awt.Label Title_Z;
    public java.awt.Label X1;
    public java.awt.Label X2;
    public java.awt.Label X3;
    public java.awt.Label X4;
    public java.awt.Label Y1;
    public java.awt.Label Y2;
    public java.awt.Label Y3;
    public java.awt.Label Y4;
    public java.awt.Label Z1;
    public java.awt.Label Z2;
    public java.awt.Label Z3;
    public java.awt.Label Z4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSPVistaFrontal;
    private javax.swing.JScrollPane jSPVistaSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label mostrarA;
    private java.awt.Label mostrarB;
    private java.awt.Label mostrarC;
    private java.awt.Label mostrarD;
    private java.awt.Label mostrar_mov;
    private java.awt.Label mostrar_rota;
    private java.awt.Canvas vistaFrontal;
    private java.awt.Canvas vistaSuperior;
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

    public Label getMostrarA() {
        return mostrarA;
    }

    public void setMostrarA(Label mostrarA) {
        this.mostrarA = mostrarA;
    }

    public Label getMostrarB() {
        return mostrarB;
    }

    public void setMostrarB(Label mostrarB) {
        this.mostrarB = mostrarB;
    }

    public Label getMostrarC() {
        return mostrarC;
    }

    public void setMostrarC(Label mostrarC) {
        this.mostrarC = mostrarC;
    }

    public Label getMostrarD() {
        return mostrarD;
    }

    public void setMostrarD(Label mostrarD) {
        this.mostrarD = mostrarD;
    }

    public Label getMostrar_mov() {
        return mostrar_mov;
    }

    public void setMostrar_mov(Label mostrar_mov) {
        this.mostrar_mov = mostrar_mov;
    }

    public Label getMostrar_rota() {
        return mostrar_rota;
    }

    public void setMostrar_rota(Label mostrar_rota) {
        this.mostrar_rota = mostrar_rota;
    }

    public Canvas getVistaFrontal() {
        return vistaFrontal;
    }

    public void setVistaFrontal(Canvas vistaFrontal) {
        this.vistaFrontal = vistaFrontal;
    }

    public Canvas getVistaSuperior() {
        return vistaSuperior;
    }

    public void setVistaSuperior(Canvas vistaSuperior) {
        this.vistaSuperior = vistaSuperior;
    }
    
    

    public void asignacionDeEvents(){
        this.Mov_Ho.addChangeListener(getControl());
        this.Rota.addChangeListener(getControl());
        this.JointA.addChangeListener(getControl());
        this.JointB.addChangeListener(getControl());
        this.JointC.addChangeListener(getControl());
        this.JointD.addChangeListener(getControl());
        
    }
    
}
