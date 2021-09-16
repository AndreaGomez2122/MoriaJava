package org.moria.Objetos;

public class Anillo extends Objeto {

    private boolean puesto;
    public Anillo(boolean puesto) {
        this.puesto = puesto;
    }


    public boolean isPuesto() {
        return puesto;
    }

    public void setPuesto(boolean puesto) {
        this.puesto = puesto;
    }




}
