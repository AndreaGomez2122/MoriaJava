package org.moria.Salas;

import org.moria.Peligros.Peligro;

public class Sala {


    private int numeroSala;
    private Peligro peligro;



    public Sala(int numeroSala, Peligro peligro) {
        this.numeroSala = numeroSala;
        this.peligro = peligro;
    }




    public int getNumeroSala() {
        return numeroSala;
    }

    public Peligro getPeligro() {
        return peligro;
    }



}

