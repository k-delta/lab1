
package Logica;

import Visual.Pide_Datos;

public class Coordenadas {
private int anguloA;
private int anguloB;
private int anguloC;
private int anguloD;
private int rotar;
private int longitud=144;//de cada brazo

    public static void main(String args[]) {
        try {//llamar frame
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pide_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Pide_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pide_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pide_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pide_Datos().setVisible(true);
            }
        });
    }
    
    public int[] Calcular(){
        int vectorA[] = {(int)(longitud*Math.cos(anguloA)*Math.cos(rotar)), (int)(longitud*Math.cos(anguloA)*Math.sin(rotar)), (int)(longitud*Math.sin(anguloA))};
        int vectorB[] = {(int)(longitud*Math.cos(anguloB)*Math.cos(rotar)), (int)(longitud*Math.cos(anguloB)*Math.sin(rotar)), (int)(longitud*Math.sin(anguloB))};
        int vectorC[] = {(int)(longitud*Math.cos(anguloC)*Math.cos(rotar)), (int)(longitud*Math.cos(anguloC)*Math.sin(rotar)), (int)(longitud*Math.sin(anguloC))};
        int vectorD[] = {(int)(longitud*Math.cos(anguloD)*Math.cos(rotar)), (int)(longitud*Math.cos(anguloD)*Math.sin(rotar)), (int)(longitud*Math.sin(anguloD))};
        
        int coordenada[]={vectorA[0]+vectorB[0]+vectorC[0]+vectorD[0],vectorA[1]+vectorB[1]+vectorC[1]+vectorD[1],vectorA[2]+vectorB[2]+vectorC[2]+vectorD[2]+3};
        return coordenada;//posicion final
    }
public void setJointA(int jointA){
        this.anguloA= jointA;
    }

    public void setJointB(int jointB) {
        this.anguloB= jointB; 
    }

    public void setJointC(int jointC) {
        this.anguloC= jointC; 
    }

    public void setJointD(int jointD) {
       this.anguloD= jointD; 
    }

    public void setRota(int rota) {
        this.rotar= rota; 
    }
}
