package Presentacion;

import Logica.Coordenadas;
import ds.desktop.notify.DesktopNotify;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;
import java.applet.AudioClip;
        
public class Modelo implements Runnable{

public static int[] posicionA= new int[3];
    public static int[] posicionB= new int[3];
    public static int[] posicionC= new int[3];
    public static int[] pinzaCentro= new int[3];
    public static int[] garraI= new int[3];
    public static int[] garraS= new int[3];



    private Coordenadas miSistema = new Coordenadas();
    private Vista ventana;
    private Thread hiloDibujo;
    private BufferedImage dobleBuffer;
    private boolean dibujando;
    
    // Métododos generados para ocultación de información
    public Modelo() {
        dibujando=false;
    }

    public Vista getVentana() {
        if (ventana == null) {
            ventana = new Vista(this);
        }
        return ventana;
    }

    public Coordenadas getMiSistema() {
        if (miSistema == null) {
            miSistema = new Coordenadas();
        }
        return miSistema;
    }

    // Funcionalidades halladas en los requirimientos (casos de uso)
    public void iniciar() {
        getVentana().setSize(560, 600);
        getVentana().setVisible(true);

    }

    public void cambiarValSlider(int jLHor, int jLRota, int jLA, int jLB, int jLC, int jLD) {
        //System.out.println(""+val);
        getVentana().getMostrar_mov().setText(String.valueOf(jLHor));
        getVentana().getMostrar_rota().setText(String.valueOf(jLRota));
        getVentana().getMostrarA().setText(String.valueOf(jLA));
        getVentana().getMostrarB().setText(String.valueOf(jLB));
        getVentana().getMostrarC().setText(String.valueOf(jLC));
        getVentana().getMostrarD().setText(String.valueOf(jLD));
    }

    public void calcularCoordenadas() {

        //JointA Slider articulacion 1
        //JointB Slider articulacion 2
        //JointC Slider articulacion 3
        //JointD Slider articulacion 4
        int[] joints = {getVentana().getJointA().getValue()+180, getVentana().getJointB().getValue()+180, getVentana().getJointC().getValue()+180, getVentana().getJointD().getValue()+180};
        miSistema.setJoints(joints);
        miSistema.setRota(getVentana().getRota().getValue());
        miSistema.setMov_Ho(getVentana().getMov_Ho().getValue());
        miSistema.Precalcular();
        miSistema.setOpen(getVentana().getPinza().isSelected());//true -> open

        posicionA = miSistema.Calcular(0, false);//Seccion 1
        getVentana().getX1().setText("" + posicionA[0]);
        getVentana().getY1().setText("" + posicionA[1]);
        getVentana().getZ1().setText("" + posicionA[2]);

        posicionB = miSistema.Calcular(1, false);//Seccion 2
        getVentana().getX2().setText("" + posicionB[0]);
        getVentana().getY2().setText("" + posicionB[1]);
        getVentana().getZ2().setText("" + posicionB[2]);

        posicionC = miSistema.Calcular(2, false);//Seccion 3
        getVentana().getX3().setText("" + posicionC[0]);
        getVentana().getY3().setText("" + posicionC[1]);
        getVentana().getZ3().setText("" + posicionC[2]);

        pinzaCentro = miSistema.Calcular(3, true);//Garra
        getVentana().getX4().setText("" + pinzaCentro[0]);
        getVentana().getY4().setText("" + pinzaCentro[1]);
        getVentana().getZ4().setText("" + pinzaCentro[2]);
        
        Restricciones();
        
            if(hiloDibujo == null){
             hiloDibujo = new Thread(this);
             dibujando = true;
             hiloDibujo.start();
            }
    }

    public void Restricciones() {
       if(!getVentana().getPinza().isSelected()){//true- close
            int[] relleno={1,1,1};
            miSistema.setGarrainf2(relleno);
            miSistema.setGarrasup2(relleno);
        }
        boolean cont=false;
        for(int i=0;i<3;i++){
            if(posicionA[i]<0 || posicionB[i]<0  || posicionC[i]<0 || garraI[i]<0  || garraS[i]<0 || miSistema.getGarrainf1()[i]<0 || miSistema.getGarrasup1()[i]<0 || miSistema.getGarrasup2()[i]<0 || miSistema.getGarrainf2()[i]<0){
              cont=true;
            }
        }
        for(int i=0;i<2;i++){
            if(posicionA[i]>800 || posicionB[i]>800 || posicionC[i]>800 || garraI[i]>800 || garraS[i]>800 || miSistema.getGarrainf1()[i]<0 || miSistema.getGarrasup1()[i]<0 || miSistema.getGarrasup2()[i]<0 || miSistema.getGarrainf2()[i]<0){
              cont=true;
            }
        }
        if(cont){
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Error_Restricciones.wav"));
        sonido.play();
        DesktopNotify.showDesktopMessage("¡ALERTA! RESTRICCION GENERADA", "Configuración no permitida: Excede los limites", DesktopNotify.ERROR, 2000L);//1000 es 1 segundo
        //Icon m = new ImageIcon(getClass().getResource("/imagenes/imagenalerta.png"));
        //JOptionPane.showMessageDialog(null, "Configuración no permitida: Excede los limites", "¡ALERTA! RESTRICCION GENERADA", JOptionPane.INFORMATION_MESSAGE,m);  
        }
    }
    
    protected void dibujarVistaFrontal(Graphics lapiz) {
        
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, getVentana().getjSPVistaFrontal().getWidth(), getVentana().getjSPVistaFrontal().getHeight());   // Limpia la superficie de dibuja con el color de fondo en el área especificada
        lapiz.setColor(new Color(65,34,39));
        
        
        
        if(this.ventana.getjCBVistaSuperior().isSelected()){
            lapiz.drawLine(getVentana().getMov_Ho().getValue(), 400, posicionA[0], 400+posicionA[1]);
            lapiz.drawLine(posicionA[0], 400+posicionA[1], posicionB[0], 400+posicionB[1]);
            lapiz.drawLine(posicionB[0], 400+posicionB[1], posicionC[0], 400+posicionC[1]);
        
            if(this.ventana.getPinza().isSelected()){//cerrado
                lapiz.drawLine(posicionC[0], 400+posicionC[1], miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[1]);
                lapiz.drawLine(miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[1], pinzaCentro[0] , 400+pinzaCentro[1]);
                lapiz.drawLine(posicionC[0], 400+posicionC[1], miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[1]);
                lapiz.drawLine(miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[1], pinzaCentro[0] , 400+pinzaCentro[1]);
            }else{//abierto
                lapiz.drawLine(posicionC[0], 400+posicionC[1], miSistema.getGarrainf1()[0],400+ miSistema.getGarrainf1()[1]);
                lapiz.drawLine(miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[1], miSistema.getGarrainf2()[0], 400+miSistema.getGarrainf2()[1]);
               System.out.println("inf: "+miSistema.getGarrainf2()[0]+", "+miSistema.getGarrainf2()[1]);//ciclo infinito
               System.out.println("sup: "+miSistema.getGarrasup2()[0]+", "+miSistema.getGarrasup2()[1]);
                lapiz.drawLine(posicionC[0], 400+posicionC[1], miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[1]);
                lapiz.drawLine(miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[1], miSistema.getGarrasup2()[0], 400+miSistema.getGarrasup2()[1]);
            } 
        }else{
            lapiz.drawLine(getVentana().getMov_Ho().getValue(), 400, posicionA[0], 400+posicionA[2]);
            lapiz.drawLine(posicionA[0], 400+posicionA[2], posicionB[0], 400+posicionB[2]);
            lapiz.drawLine(posicionB[0], 400+posicionB[2], posicionC[0], 400+posicionC[2]);
            if(this.ventana.getPinza().isSelected()){//cerrado
                lapiz.drawLine(posicionC[0], 400+posicionC[2], miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[2]); 
                lapiz.drawLine(miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[2], pinzaCentro[0] , 400+pinzaCentro[2]);
                lapiz.drawLine(posicionC[0], 400+posicionC[2], miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[2]);
                lapiz.drawLine(miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[2], pinzaCentro[0] , 400+pinzaCentro[2]);
                
            }else{//abierto
                //siempre los 2 mismos valores
                System.out.println("inf: "+miSistema.getGarrainf2()[0]+", "+miSistema.getGarrainf2()[2]);
                System.out.println("sup: "+miSistema.getGarrasup2()[0]+", "+miSistema.getGarrasup2()[2]);
                lapiz.drawLine(posicionC[0], 400+posicionC[2], miSistema.getGarrainf1()[0],400+ miSistema.getGarrainf1()[2]);
                lapiz.drawLine(miSistema.getGarrainf1()[0], 400+miSistema.getGarrainf1()[2], miSistema.getGarrainf2()[0], 400+miSistema.getGarrainf2()[2]);
                lapiz.drawLine(posicionC[0], 400+posicionC[2], miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[2]);
                lapiz.drawLine(miSistema.getGarrasup1()[0], 400+miSistema.getGarrasup1()[2], miSistema.getGarrasup2()[0], 400+miSistema.getGarrasup2()[2]);
                
            }
        }
    }

    @Override
    public void run() {
        Canvas lienzo = getVentana().getVistaFrontal();
        dobleBuffer = new BufferedImage(getVentana().getVistaFrontal().getWidth(), getVentana().getVistaFrontal().getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics lapiz = dobleBuffer.getGraphics();  // Obtener el conexto gráfico
        Graphics lapizLienzo = lienzo.getGraphics();
        System.out.println("Hilo ejecutando");

        while (dibujando) {
            dibujarVistaFrontal(lapiz);
            lapizLienzo.drawImage(dobleBuffer, 0, 0, lienzo);
        }

    }
}