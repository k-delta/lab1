
package Visual;//modificar para dibujar el brazo
import Visual.Pide_Datos;
import Logica.Coordenadas;
public class Graficar extends javax.swing.JFrame {

    private int[] lineaA=new int[2];
    private int[] lineaB=new int[2];
    private int[] lineaC=new int[2];
    private int[] lineaD=new int[2];
    
    public Graficar(int[] posicionA,int[] posicionB,int[] posicionC,int[] posicionD) {
        Coordenadas Vector=new Coordenadas();
        lineaA=Vector.Pasar_a_2d(posicionA);
        lineaB=Vector.Pasar_a_2d(posicionB);
        lineaC=Vector.Pasar_a_2d(posicionC);
        lineaD=Vector.Pasar_a_2d(posicionD);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label1.setText(Integer.toString(lineaA[0]));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
