package Presentacion;

import Logica.Base;
import Logica.Seccion;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(Base plataforma, Seccion s1, Seccion s2, Seccion s3, Seccion sGD1, Seccion sGI1, Seccion sGD2, Seccion sGI2){
        //System.out.println(brazo.plataforma.getMovHorizontal());
        this.setTitle("Brazo Robotico");
        HojaDibujo dibujar=new HojaDibujo(plataforma,  s1,  s2,  s3,  sGD1,  sGI1,  sGD2,  sGI2);
        dibujar.setSize(700, 700);
        add(dibujar);
        
    }
    
}
