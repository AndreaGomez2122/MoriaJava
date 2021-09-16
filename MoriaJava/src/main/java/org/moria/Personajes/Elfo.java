package org.moria.Personajes;

import org.moria.Objetos.Carcaj;
import org.moria.Objetos.Objeto;
import org.moria.Objetos.Vara;

public class Elfo extends Personaje {


    public Elfo(String nombre, Objeto objeto, int huir, boolean vivo) {
        super(nombre, objeto, huir, vivo);
    }


    public void recargarFlecha(int flechas) {

        Carcaj carcaj = (Carcaj) this.objeto;
        carcaj.setCarga(carcaj.getCarga() - flechas);

    }
}
