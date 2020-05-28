
package Logica;

public class Coordenadas {
private int[] angulo_grad;//respecto vector y el plano xy
private double[] angulo;
private int Num_Angulos=4;
private double rotar;
private int norma=9;//del vector

    private void Grad_a_Rad(){
      for(int i=0;i<Num_Angulos;i++){
          angulo[i]=angulo_grad[i]*Math.PI/180;
      } 
      rotar=rotar*Math.PI/180;
    }

    public int[] Calcular(int vector){//voy en sentido anti horario y midiendo respecto a +x
        Grad_a_Rad();
        double[] operar = {norma*Math.cos(rotar),norma*Math.sin(rotar),norma}; //estos son constantes en la operacion

        double[] suma_cos= new double[Num_Angulos];//vectorA,vectorB,...,vectorN
        suma_cos[0]=Math.sin(angulo[0]);
        for(int i=0; i<(Num_Angulos);i++){ //inicializar todo=0
            suma_cos[i]=0;
        }
        for(int i=1; i<(Num_Angulos);i++){
            suma_cos[i]=Math.cos(angulo[i-1])+Math.cos(angulo[i]);     
        }
        
        double[] suma_sen= new double[Num_Angulos];//vectorA,vectorB,vectorC,vectorD
        suma_sen[0]=Math.sin(angulo[0]);
        for(int i=0; i<(Num_Angulos);i++){
            suma_sen[i]=0;
        }
        for(int i=1; i<(Num_Angulos);i++){
            suma_cos[i]=Math.sin(angulo[i-1])+Math.sin(angulo[i]);     
        } 
        
        int[] coordenadas={0,0,0};
        for(int i=0; i<2;i++){
            coordenadas[i]=(int)(Math.round(operar[i]*suma_cos[vector]));
        }
        coordenadas[2]=(int)(Math.round(operar[2]*suma_sen[vector]));
        return coordenadas;//posicion final
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
}
