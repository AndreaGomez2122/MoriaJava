package org.moria.Personajes;

import org.moria.Objetos.Objeto;
import org.moria.Objetos.Vara;

public class Mago extends Personaje {
    public Mago( String nombre, Objeto objeto, int huir,boolean vivo) {
        super( nombre, objeto, huir,vivo);
    }


    public void recargarVara(int energia) {

        Vara vara = (Vara) this.objeto;  //esta linea te la he copiado, no conseguía hacerlo yo sola.
        vara.setEnergia(vara.getEnergia() - energia);



    }

    public int poderVara(){

     return ((Vara)this.objeto).getEnergia(); //esta linea te la he copiado, no conseguía hacerlo yo sola.

    }


}