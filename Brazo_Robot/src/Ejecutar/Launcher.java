
package Ejecutar;

import Presentacion.Modelo;

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
