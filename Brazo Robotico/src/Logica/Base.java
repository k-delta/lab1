package Logica;

public class Base {
    
    private int movHorizontal;
    private final int inicialVer=600;
    private final int ancho=100;
    private final int altura=3;
   
    public Base(){
       
    }

    public int getMovHorizontal() {
        return movHorizontal;
    }

    public int getInicialVer() {
        return inicialVer;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setMovHorizontal(int movHorizontal) {
        this.movHorizontal = movHorizontal;
    }    

    
}
