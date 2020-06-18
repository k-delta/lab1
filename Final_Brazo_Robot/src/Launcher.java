

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
}
