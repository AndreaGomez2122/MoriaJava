package org.moria.Personajes;

import org.moria.Objetos.Objeto;

public class Personaje {

    private String nombre;
    Objeto objeto;
    private int huir;
    private boolean vivo;



    public Personaje(String nombre, Objeto objeto, int huir, boolean vivo) {

        this.nombre = nombre;
        this.objeto = objeto;
        this.huir = huir;
        this.vivo = vivo;

    }

}
