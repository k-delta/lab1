package Presentacion;

import Logica.Coordenadas;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modelo {
        
    private Coordenadas miSistema;
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
    
        public static int[] posicionA= new int[3];
        public static int[] posicionB= new int[3];
        public static int[] posicionC= new int[3];
        public static int[] posicionD= new int[3];
        public static int[] garraI= new int[3];
        public static int[] garraS= new int[3];
    public void calcularCoordenadas(){
        
        //JointA Slider Seccion 1
        //JointB Slider Seccion 2
        //JointC Slider Seccion 3
        //JointD Slider Seccion 4
        
        Coordenadas Brazo = new Coordenadas();
        int[] joints={getVentana().getJointA().getValue(),getVentana().getJointB().getValue(),getVentana().getJointC().getValue(),getVentana().getJointD().getValue()};
        Brazo.setJoints(joints);
        Brazo.setRota(getVentana().getRota().getValue());
        Brazo.setMov_Ho(getVentana().getMov_Ho().getValue());
        Brazo.Precalcular();
        Brazo.setOpen(getVentana().getPinza().isSelected());//true si open
        
        posicionA=Brazo.Calcular(0,false);//Seccion 1
        getVentana().getX1().setText(""+posicionA[0]);
        getVentana().getY1().setText(""+posicionA[1]);
        getVentana().getZ1().setText(""+posicionA[2]);
  
        posicionB=Brazo.Calcular(1,false);//Seccion 2
        getVentana().getX2().setText(""+posicionB[0]);
        getVentana().getY2().setText(""+posicionB[1]);
        getVentana().getZ2().setText(""+posicionB[2]);
        
        posicionC=Brazo.Calcular(2,false);//Seccion 3
        getVentana().getX3().setText(""+posicionC[0]);
        getVentana().getY3().setText(""+posicionC[1]);
        getVentana().getZ3().setText(""+posicionC[2]);
        
        posicionD=Brazo.Calcular(3,true);//Garra
        getVentana().getX4().setText(""+posicionD[0]);
        getVentana().getY4().setText(""+posicionD[1]);
        getVentana().getZ4().setText(""+posicionD[2]);
        
        //tanto si esta abierta como cerrada no debe salirse del plano
        garraI= Brazo.getGarraInf();//coordenadas - Garra Inferior
        garraS= Brazo.getGarraSup();//Garra Superior
        Restricciones();
        
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
}
