package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.Slider;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ChangeListener {

    private Vista ventana;
    private Modelo miApp;

    public Controlador(Vista v) {
        this.ventana = v;
        miApp = ventana.getModelo();
    }

    //Datos de los sliders
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        miApp.cambiarValSlider(this.ventana.getMov_Ho().getValue(), this.ventana.getRota().getValue(), this.ventana.getJointA().getValue(), this.ventana.getJointB().getValue(), this.ventana.getJointC().getValue(), this.ventana.getJointD().getValue());
        miApp.calcularCoordenadas();
        
    }
}
