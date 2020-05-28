
package Logica;

public class Coordenadas {
private int anguloA;
private int anguloB;
private int anguloC;
private int anguloD;
private int rotar;
private int longitud=144;//de cada brazo

    public int[] Calcular(char vector){//voy en sentido anti horario y midiendo respecto a x
        int vectorA[] = {(int)(Math.round(longitud*Math.cos(anguloA)*Math.cos(rotar))), (int)(Math.round(longitud*Math.cos(anguloA)*Math.sin(rotar))), (int)(Math.round(longitud*Math.sin(anguloA)))+3};
        int vectorB[] = {(int)(Math.round(longitud*Math.cos(anguloB)*Math.cos(rotar))), (int)(Math.round(longitud*Math.cos(anguloB)*Math.sin(rotar))), (int)(Math.round(longitud*Math.sin(anguloB)))};
        int vectorC[] = {(int)(Math.round(longitud*Math.cos(anguloC)*Math.cos(rotar))), (int)(Math.round(longitud*Math.cos(anguloC)*Math.sin(rotar))), (int)(Math.round(longitud*Math.sin(anguloC)))};
        int vectorD[] = {(int)(Math.round(longitud*Math.cos(anguloD)*Math.cos(rotar))), (int)(Math.round(longitud*Math.cos(anguloD)*Math.sin(rotar))), (int)(Math.round(longitud*Math.sin(anguloD)))};
    int[] coordenada = {0,0,0}; 
        switch (vector) 
        {
            case 'A':
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorA[i];
                }
                     break;
            case 'B': 
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorA[i]+vectorB[i];
                }
                break;
            case 'C':
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorA[i]+vectorB[i]+vectorC[i];
                }
                break;
            case 'D':
                for(int i=0; i<3; i++){
                    coordenada[i]=vectorA[i]+vectorB[i]+vectorD[i];
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
