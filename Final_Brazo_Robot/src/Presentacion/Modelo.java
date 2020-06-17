package Presentacion;

import Logica.Coordenadas;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modelo {
    public static int[] posicionA= new int[3];
    public static int[] posicionB= new int[3];
    public static int[] posicionC= new int[3];
    public static int[] posicionD= new int[3];
    public static int[] garraI= new int[3];
    public static int[] garraS= new int[3];
        
    private Coordenadas miSistema= new Coordenadas();
    private Vista ventana;
     
    // Métododos generados para ocultación de información
    
    public Modelo(){
       
    }
    
    public Vista getVentana(){        
        if(ventana == null){
            ventana = new Vista(this);
        }
        return ventana;                
    }

    public Coordenadas getMiSistema() {
        if(miSistema == null){
            miSistema = new Coordenadas();
        }
        return miSistema;                
    }
    
    
    // Funcionalidades halladas en los requirimientos (casos de uso)
    
    public void iniciar(){
        getVentana().setSize(560, 600);
        getVentana().setVisible(true);
        
    }
    
    public void cambiarValSlider(int jLHor, int jLRota, int jLA, int jLB, int jLC, int jLD){
        //System.out.println(""+val);
        getVentana().getMostrar_mov().setText(String.valueOf(jLHor));
        getVentana().getMostrar_rota().setText(String.valueOf(jLRota));
        getVentana().getMostrarA().setText(String.valueOf(jLA));
        getVentana().getMostrarB().setText(String.valueOf(jLB));
        getVentana().getMostrarC().setText(String.valueOf(jLC));
        getVentana().getMostrarD().setText(String.valueOf(jLD));
    }
    
    
        
       public void cambiarval(){
           
       }
        
        
        public void calcularCoordenadas(){
        
        //JointA Slider Seccion 1
        //JointB Slider Seccion 2
        //JointC Slider Seccion 3
        //JointD Slider Seccion 4
        
            int[] joints={getVentana().getJointA().getValue()+180,getVentana().getJointB().getValue()+180,getVentana().getJointC().getValue()+180,getVentana().getJointD().getValue()+180};
            miSistema.setJoints(joints);
            miSistema.setRota(getVentana().getRota().getValue());
            miSistema.setMov_Ho(getVentana().getMov_Ho().getValue());
            miSistema.Precalcular();
            miSistema.setOpen(getVentana().getPinza().isSelected());//true si open
        
        posicionA=miSistema.Calcular(0,false);//Seccion 1
        getVentana().getX1().setText(""+posicionA[0]);
        getVentana().getY1().setText(""+posicionA[1]);
        getVentana().getZ1().setText(""+posicionA[2]);
  
        posicionB=miSistema.Calcular(1,false);//Seccion 2
        getVentana().getX2().setText(""+posicionB[0]);
        getVentana().getY2().setText(""+posicionB[1]);
        getVentana().getZ2().setText(""+posicionB[2]);
        
        posicionC=miSistema.Calcular(2,false);//Seccion 3
        getVentana().getX3().setText(""+posicionC[0]);
        getVentana().getY3().setText(""+posicionC[1]);
        getVentana().getZ3().setText(""+posicionC[2]);
        
        posicionD=miSistema.Calcular(3,true);//Garra
        getVentana().getX4().setText(""+posicionD[0]);
        getVentana().getY4().setText(""+posicionD[1]);
        getVentana().getZ4().setText(""+posicionD[2]);
        
        //tanto si esta abierta como cerrada no debe salirse del plano
        garraI= miSistema.getGarraInf();//coordenadas - Garra Inferior
        garraS= miSistema.getGarraSup();//Garra Superior
        //Restricciones();
        
    }
    
    public void Restricciones(){
        boolean cont=false;
        for(int i=0;i<3;i++){
            if(posicionA[i]<0 || posicionB[i]<0  || posicionC[i]<0 || garraI[i]<0  || garraS[i]<0){
              cont=true;
            }
        }
        for(int i=0;i<2;i++){
            if(posicionA[i]>800 || posicionB[i]>800 || posicionC[i]>800 || garraI[i]>800 || garraS[i]>800){
              cont=true;
            }
        }
        if(cont){
        Icon m = new ImageIcon(getClass().getResource("/imagenes/imagenalerta.png"));
        JOptionPane.showMessageDialog(null, "Configuración no permitida: Excede los limites", "¡ALERTA! RESTRICCION GENERADA", JOptionPane.INFORMATION_MESSAGE,m);  
        }
    }
    
    protected void dibujar(Graphics lapiz){
        
        lapiz.setColor(Color.white);
        lapiz.fillRect(0, 0, getVentana().getWidth(), getVentana().getHeight());   // Limpia la superficie de dibuja con el color de fondo en el área especificada
        lapiz.setColor(new Color(0xff, 0x00, 0x00));
        // puntos
            lapiz.drawLine(getVentana().getMov_Ho().getValue(), 0, posicionA[0], posicionA[2]);
            lapiz.drawLine(posicionA[0], posicionA[2], posicionB[0], posicionB[2]);
            lapiz.drawLine(posicionB[0], posicionB[2], posicionC[0], posicionC[2]);
            lapiz.drawLine(posicionC[0], posicionC[2], posicionD[0], posicionD[2]);
        
        //String strCoordenada = "("+getMiSistema().getTrianguloActual().getxA()+", 45)";
        //lapiz.drawString(strCoordenada, getMiSistema().getTrianguloActual().getxA(), 45);
        
    }
    
    public void dibujo(){
        Canvas lienzo = getVentana().getVistaFrontal();
        boolean dibujando=true;
        Graphics lapizLienzo = lienzo.getGraphics();
        //while(dibujando){                         
            dibujar(lapizLienzo);
       // }
    }
}
