package Presentacion;

import Logica.Articulacion;
import Logica.Base;
import Logica.Seccion;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class HojaDibujo extends JPanel{
    
    public Base plataforma=new Base();
    public Base bas = new Base();
    public Articulacion a1=new Articulacion();
    public Seccion s1=new Seccion();
    public Articulacion a2=new Articulacion();
    public Seccion s2=new Seccion();
    public Articulacion a3=new Articulacion();
    public Seccion s3=new Seccion();
    public Articulacion aGD1=new Articulacion();
    public Articulacion aGI1=new Articulacion();
    public Seccion sGD1=new Seccion();
    public Seccion sGI1=new Seccion();
    public Articulacion aGD2=new Articulacion();
    public Articulacion aGI2=new Articulacion();
    public Seccion sGD2=new Seccion();
    public Seccion sGI2=new Seccion();
    
    public HojaDibujo(Base p, Seccion s1, Seccion s2, Seccion s3, Seccion sGD1, Seccion sGI1, Seccion sGD2, Seccion sGI2){
        
        this.plataforma=p;
        this.a1 = a1;
        this.s1 = s1;
        this.a2 = a2;
        this.s2 = s2;
        this.a3 = a3;
        this.s3 = s3; 
        this.aGD1 = aGD1; 
        this.aGI1 = aGI1;
        this.sGD1 = sGD1;
        this.sGI1 = sGI1;
        this.aGD2 = aGD2;
        this.aGI2 = aGI2;
        this.sGD2 = sGD2;
        this.sGI2 = sGI2;
           
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        g.drawRect(plataforma.getMovHorizontal(), plataforma.getInicialVer(), plataforma.getAncho(), plataforma.getAltura());
        g.drawLine(s1.getIx(), s1.getIy(), s1.getFx(), s1.getFy());
        g.drawLine(s2.getIx(), s2.getIy(), s2.getFx(), s2.getFy());
        g.drawLine(s3.getIx(), s3.getIy(), s3.getFx(), s3.getFy());
        g.drawLine(sGD1.getIx(), sGD1.getIy(), sGD1.getFx(), sGD1.getFy());
        g.drawLine(sGD2.getIx(), sGD2.getIy(), sGD2.getFx(), sGD2.getFy());
        g.drawLine(sGI1.getIx(), sGI1.getIy(), sGI1.getFx(), sGI1.getFy());
        g.drawLine(sGI2.getIx(), sGI2.getIy(), sGI2.getFx(), sGI2.getFy());
        
    }
    

}
