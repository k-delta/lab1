package Ejecutar;

import Presentacion.Modelo;
import Presentacion.Vista;

public class Launcher {

    private Modelo miApp;

    public static void main(String[] args) {
        new Launcher();
    }

    public Launcher() {
        miApp = new Modelo();
        miApp.iniciar();
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
