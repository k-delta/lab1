package Presentacion;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class Vista extends javax.swing.JFrame {

    private Controlador control;
    private Modelo modelo;
    
    public Vista(Modelo m) {
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

        Title_Mov_Ho = new java.awt.Label();
        mostrar_mov = new java.awt.Label();
        Mov_Ho = new javax.swing.JSlider();
        Title_Rota = new java.awt.Label();
        mostrar_rota = new java.awt.Label();
        Rota = new javax.swing.JSlider();
        Title_Joint = new java.awt.Label();
        TitleA = new java.awt.Label();
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
        JointD = new javax.swing.JSlider();
        Title_Pinza = new java.awt.Label();
        Pinza = new javax.swing.JCheckBox();
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
        Boton_Datos = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Visual_Datos"); // NOI18N

        Title_Mov_Ho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title_Mov_Ho.setText("Desplazamiento Horizontal");

        mostrar_mov.setMinimumSize(new java.awt.Dimension(15, 20));
        mostrar_mov.setText("0");

        Mov_Ho.setMajorTickSpacing(100);
        Mov_Ho.setMaximum(800);
        Mov_Ho.setMinorTickSpacing(200);
        Mov_Ho.setPaintLabels(true);
        Mov_Ho.setPaintTicks(true);
        Mov_Ho.setToolTipText("");
        Mov_Ho.setValue(0);

        Title_Rota.setText("Rotacion");

        mostrar_rota.setMinimumSize(new java.awt.Dimension(15, 20));
        mostrar_rota.setName(""); // NOI18N
        mostrar_rota.setText("0");

        Rota.setMajorTickSpacing(60);
        Rota.setMaximum(359);
        Rota.setPaintLabels(true);
        Rota.setPaintTicks(true);
        Rota.setValue(0);

        Title_Joint.setText("Articulaciones");

        TitleA.setText("A");

        mostrarA.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarA.setText("0");

        JointA.setMajorTickSpacing(40);
        JointA.setMaximum(175);
        JointA.setMinimum(5);
        JointA.setPaintLabels(true);
        JointA.setPaintTicks(true);

        TitleB.setText("B");

        mostrarB.setName(""); // NOI18N
        mostrarB.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarB.setText("0");

        JointB.setMajorTickSpacing(40);
        JointB.setMaximum(175);
        JointB.setMinimum(5);
        JointB.setPaintLabels(true);
        JointB.setPaintTicks(true);

        TitleC.setText("C");

        mostrarC.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarC.setText("0");

        JointC.setMajorTickSpacing(40);
        JointC.setMaximum(175);
        JointC.setMinimum(5);
        JointC.setPaintLabels(true);
        JointC.setPaintTicks(true);

        TitleD.setText("D");

        mostrarD.setPreferredSize(new java.awt.Dimension(15, 20));
        mostrarD.setText("0");

        JointD.setMajorTickSpacing(40);
        JointD.setMaximum(175);
        JointD.setMinimum(5);
        JointD.setPaintLabels(true);
        JointD.setPaintTicks(true);

        Title_Pinza.setText("Pinza");

        Pinza.setMaximumSize(new java.awt.Dimension(25, 25));
        Pinza.setMinimumSize(new java.awt.Dimension(25, 25));
        Pinza.setPreferredSize(new java.awt.Dimension(25, 25));

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

        Boton_Datos.setLabel("Aceptar");
        Boton_Datos.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Title_Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Title_Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(Title_Joint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(TitleA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TitleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TitleB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TitleD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JointC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JointD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mostrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JointA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(mostrarA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JointB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(mostrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(X4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mostrar_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Pinza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title_Pinza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrar_rota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addComponent(Title_X, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(Title_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Y1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title_Z, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Z2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Z3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Z4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mostrar_mov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mov_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(Title_Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Title_Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Title_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Title_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Z1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Title_Joint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TitleA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JointA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mostrarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Title_X, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JointB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TitleB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mostrarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Z2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Y2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JointC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TitleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Z3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Y3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(X3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TitleD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JointD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mostrarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Z4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(X4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(Boton_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrar_rota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Title_Pinza.getAccessibleContext().setAccessibleName("");
        Boton_Datos.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(570, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Boton_Datos;
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
    private java.awt.Label mostrarA;
    private java.awt.Label mostrarB;
    private java.awt.Label mostrarC;
    private java.awt.Label mostrarD;
    private java.awt.Label mostrar_mov;
    private java.awt.Label mostrar_rota;
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
    
    //Controlador
    public void asignacionDeEvents(){
        this.Mov_Ho.addChangeListener(getControl());
        this.Rota.addChangeListener(getControl());
        this.JointA.addChangeListener(getControl());
        this.JointB.addChangeListener(getControl());
        this.JointC.addChangeListener(getControl());
        this.JointD.addChangeListener(getControl());
        this.Boton_Datos.addActionListener(getControl());
    }
    
}
