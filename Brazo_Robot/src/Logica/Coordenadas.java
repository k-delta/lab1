package Logica;

public class Coordenadas {
private static final int num_angulos=4;
private static final int norma=144;//del vector
private static final int norma_f=20;
private final double[] angulo=new double[num_angulos];
private int[] angulo_grad=new int[num_angulos];//respecto vector y el plano xy
private double rotar;
double[] suma_cos= new double[num_angulos];
double[] suma_sen= new double[num_angulos];
private int mov_x;
private boolean open;
int[] garraSup=new int[3];
int[] garraInf=new int[3];

    public void Precalcular(){
        Ajustar_Angulos();
        Grad_a_Rad();
        Sumas();
    }
    private void Ajustar_Angulos(){
        for(int i=1; i<num_angulos;i++){
            angulo_grad[i]=angulo_grad[i]-90-(int)(Math.round(Math.toDegrees(Math.acos(Math.sin(Math.toRadians(angulo_grad[i-1]))))));
        }
    }
    private void Grad_a_Rad(){
      for(int i=0;i<num_angulos;i++){
          angulo[i]=Math.toRadians(angulo_grad[i]);
      } 
      rotar=Math.toRadians(rotar);
    }
    private void Sumas(){ 
        suma_cos[0]=Math.cos(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_cos[i]=suma_cos[i-1]+Math.cos(angulo[i]);
        }
        suma_sen[0]=Math.sin(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_sen[i]=suma_sen[i-1]+Math.sin(angulo[i]);
        }
    }
    public int[] Calcular(int vector,boolean pinza){//voy en sentido anti horario y midiendo respecto a +x
        double[] operar={norma*Math.cos(rotar),norma*Math.sin(rotar),norma};
        int[] coordenadas=new int[3];
        for(int i=0; i<2;i++){
            coordenadas[i]=(int)(Math.round(operar[i]*suma_cos[vector]));
        }
        coordenadas[0]=coordenadas[0]+mov_x;
        coordenadas[2]=(int)(Math.round(operar[2]*suma_sen[vector]))+3;//de la base+3   
        if(pinza){
            int [] punto_F=coordenadas;
            int[] punto_I=Calcular(2,false);
            for(int i=0; i<3; i++){//dejo en el origen
                coordenadas[i]=punto_F[i]-punto_I[i];
            }
            for(int i=0; i<3; i++){//vector unitario*20
                coordenadas[i]=norma_f*coordenadas[i]/norma;
            }
            for(int i=0;i<3;i++){//el vector norma20 + vector anterior
                coordenadas[i]=coordenadas[i]+punto_I[i];
            }
            Condisiones(coordenadas, punto_I);
        }
        return coordenadas;//posicion final
    }
    private void Condisiones(int[] v_Director, int[] punto_I){// genera vectores imaginarios para evaluar las condiciones   
        if(open){
            /*puntos para completar cuadrado (no borrar)
            int[] aristaB={punto_I[0]+norma_f,punto_I[1],(int)(Math.round(v_Director[2]/2))};
            int[] aristaC={punto_I[0],punto_I[1]+norma_f,(int)(Math.round(v_Director[2]/2))};
            */
            //pinza inferior
            int[] aristaD={punto_I[0]+norma_f+(int)(Math.round(10/Math.sin(Math.toRadians(45)))), punto_I[1]+(int)(Math.round(10/Math.sin(Math.toRadians(45)))),v_Director[2]};
            //pinza superior
            int[] aristaE={punto_I[0]+(int)(Math.round(10/Math.sin(Math.toRadians(45)))),punto_I[1]+norma_f+(int)(Math.round(10/Math.sin(Math.toRadians(45)))),v_Director[2]};
            setGarraInf(aristaD);
            setGarraSup(aristaE);
        }else{//pinza cerrada
            //inf
            int[] B={punto_I[0]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))),punto_I[1],(int)(Math.round(v_Director[2]/2))};
            //sup
            int[] C={punto_I[0],punto_I[1]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))),(int)(Math.round(v_Director[2]/2))};
            /*centro de pinza  no borrar
            int[] D={punto_I[0]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))), punto_I[1]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))),v_Director[2]};
            aristaD=D;
            */
            setGarraInf(B);
            setGarraSup(C);
        }
    }
    public int[] R3_a_R2(int[] vector){
        int[] punto={vector[0],vector[2]};
        return punto;
    }
    public void setJoints(int[] joints){
        this.angulo_grad=joints;
    }
    public double[] getJoints(){//en Rad
        return angulo;
    }
    public void setRota(int rota) {
        this.rotar= rota; 
    }
    public double getRota(){
        return rotar;
    }
    public void setMov_Ho(int mov_Ho) {
        this.mov_x=mov_Ho;
    }
    public void setOpen(boolean open) {
        this.open=open;
    }
     public boolean getOpen(){
        return open;
    }
    public int[] getGarraSup(){
        return garraSup;
    }
    public void setGarraSup(int[] aristaE) {
        this.garraSup=aristaE;
    }
    public int[] getGarraInf(){
        return garraInf;
    }
    public void setGarraInf(int[] aristaD) {
        this.garraInf=aristaD;
    }
}