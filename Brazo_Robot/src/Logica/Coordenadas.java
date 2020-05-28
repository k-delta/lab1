
package Logica;

public class Coordenadas {
private double anguloA=51;//respecto vector y plano xy
private double anguloB;
private double anguloC;
private double anguloD;
private double rotar;
private int norma=9;//del vector

    public int[] Calcular(char vector){//voy en sentido anti horario y midiendo respecto a +x
       int[] coordenada = {0,0,0}; 
       int[] vectorA = {0,0,0};
       int[] vectorB = {0,0,0};
       int[] vectorC = {0,0,0};
       int[] vectorD = {0,0,0};
        switch (vector) 
        {
            case 'A':
                rotar=Math.PI*rotar/180;
                 anguloA=Math.PI*anguloA/180;
                 vectorA[0] =(int)(Math.round(norma*Math.cos(anguloA)*Math.cos(rotar)));
                 vectorA[1]=(int)(Math.round(norma*Math.cos(anguloA)*Math.sin(rotar)));
                 vectorA[2]= (int)(Math.round(norma*Math.sin(anguloA)));//+3 base
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorA[i];
                }
                break;
            case 'B': 
                anguloB=Math.PI*anguloB/180;
                vectorB[0] =(int)(Math.round(norma*Math.cos(anguloB)*Math.cos(rotar)));
                vectorB[1]=(int)(Math.round(norma*Math.cos(anguloB)*Math.sin(rotar)));
                vectorB[2]= (int)(Math.round(norma*Math.sin(anguloB)));
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorB[i];
                }
                break;
            case 'C':
                anguloC=Math.PI*anguloC/180;
                vectorC[0] =(int)(Math.round(norma*Math.cos(anguloC)*Math.cos(rotar)));
                vectorC[1]=(int)(Math.round(norma*Math.cos(anguloC)*Math.sin(rotar)));
                vectorC[2]= (int)(Math.round(norma*Math.sin(anguloC)));
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorC[i];
                }
                break;
            case 'D':
                anguloD=Math.PI*anguloD/180;
                vectorD[0] =(int)(Math.round(norma*Math.cos(anguloD)*Math.cos(rotar)));
                vectorD[1]=(int)(Math.round(norma*Math.cos(anguloD)*Math.sin(rotar)));
                vectorD[2]= (int)(Math.round(norma*Math.sin(anguloD)));
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorD[i];
                }
                break;
        }
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
