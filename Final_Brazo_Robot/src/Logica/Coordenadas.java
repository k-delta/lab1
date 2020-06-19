package Logica;

public class Coordenadas {
    
private static final int num_angulos=4;//A, B, C, D
private static final int norma=144;//del vector - SECCION
private static final int norma_f=20;//GARRA
private final double[] angulo=new double[num_angulos];//en radianes
private int[] angulo_grad=new int[num_angulos];//entre el vector y el plano xy
private double rotar;
double[] suma_cos= new double[num_angulos];
double[] suma_sen= new double[num_angulos];
private int mov_x;
private boolean open;//garra
int[] garrainf1=new int[3];
int[] garrainf2=new int[3];
int[] garrasup1=new int [3];
int[] garrasup2=new int [3];

    public void Precalcular(){
        Ajustar_Angulos();
        Grad_a_Rad();
        Sumas();
    }
    
    private void Ajustar_Angulos(){//restar el angulo que el anterior vector tenia para no modificar el siguiente
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
    
    private void Sumas(){//para hallar la posicion del siguiente es necesario sumar el cos y sen del angulo anterior 
        suma_cos[0]=Math.cos(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_cos[i]=suma_cos[i-1]+Math.cos(angulo[i]);
        }
        suma_sen[0]=Math.sin(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_sen[i]=suma_sen[i-1]+Math.sin(angulo[i]);
        }
    }
    
    public int[] Calcular(int vector,boolean v_final){//voy en sentido anti horario y midiendo respecto a +x
        final double[] operar={norma*Math.cos(rotar),norma*Math.sin(rotar),norma};//se deduce de ecuaciones
        int[] coordenadas=new int[3];
        for(int i=0; i<2;i++){
            coordenadas[i]=(int)(Math.round(operar[i]*suma_cos[vector]));
        }
        coordenadas[0]=coordenadas[0]+mov_x;
        coordenadas[2]=(int)(Math.round(operar[2]*suma_sen[vector]))+3;//de la base+3   
        if(v_final){
            int [] punto_F=coordenadas;
            int[] punto_I=Calcular(2,false);
            for(int i=0; i<3; i++){//dejo en el origen
                coordenadas[i]=punto_F[i]-punto_I[i];
            }
            for(int i=0; i<3; i++){//vector unitario*20
                coordenadas[i]=norma_f*coordenadas[i]/norma;
            }
            for(int i=0;i<3;i++){//calcula norma*20 + vector anterior
                coordenadas[i]=coordenadas[i]+punto_I[i];
            }
            coordenadas=Pinza(coordenadas, punto_I);//coordenadas ->punto_F de norma 20 
        }
        return coordenadas;//posicion final
    }
    
    private int[] Pinza(int[] v_Director, int[] punto_I){// genera vectores imaginarios para evaluar las condiciones   
        if(!open){//arista-> punto del cuadrado
            int[] inf1={punto_I[0]+(int)(Math.round(norma_f/2)),punto_I[1],v_Director[2]+5};
            int[] sup1={punto_I[0],punto_I[1]+(int)(Math.round(norma_f/2)),v_Director[2]+5};
            int[] inf2={punto_I[0]+(int)(Math.round(norma_f/2))+(int)(Math.round((norma_f/4)/Math.sin(Math.toRadians(30)))), punto_I[1]+(int)(Math.round((norma_f/4)/Math.sin(Math.toRadians(30)))),v_Director[2]};
            int[] sup2={punto_I[0]+(int)(Math.round((norma_f/4)/Math.sin(Math.toRadians(30)))),punto_I[1]+(int)(Math.round(norma_f/2))+(int)(Math.round((norma_f/4)/Math.sin(Math.toRadians(30)))),v_Director[2]};
            System.out.println("hola1"+inf2[0]+" , "+ inf2[1]+" , "+inf2[2]);
            System.out.println("hola2"+sup2[0]+" , "+ sup2[1]+" , "+sup2[2]);
            setGarrainf1(inf1);
            setGarrasup1(sup1);
            setGarrainf2(inf2);
            setGarrasup2(sup2);

        }else{//pinza cerrada
            int[] inf={punto_I[0]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))),punto_I[1],v_Director[2]};
            int[] sup={punto_I[0],punto_I[1]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))),v_Director[2]};
            setGarrainf1(inf);
            setGarrasup1(sup);
        }
        int[] Centro={punto_I[0]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45)))), punto_I[1]+(int)(Math.round(norma_f*Math.cos(Math.toRadians(45+180)))),v_Director[2]};
        return Centro;
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
     
    public int[] getGarrainf1(){
        return garrainf1;
    }
    
    public void setGarrainf1(int[] garrainf1) {
        this.garrainf1=garrainf1;
    }
    
    public int[] getGarrasup1(){
        return garrasup1;
    }
    
    public void setGarrasup1(int[] garrasup1) {
        this.garrasup1=garrasup1;
    }
        public int[] getGarrainf2(){
        return garrainf2;
    }
    
    public void setGarrainf2(int[] garrainf2) {
        this.garrainf2=garrainf2;
    }
    
    public int[] getGarrasup2(){
        return garrasup2;
    }
    
    public void setGarrasup2(int[] garrasup2) {
        this.garrasup2=garrasup2;
    }
}