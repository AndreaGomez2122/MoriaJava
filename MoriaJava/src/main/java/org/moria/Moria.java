package org.moria;

import java.util.ArrayList;

import org.moria.Objetos.Anillo;
import org.moria.Objetos.Carcaj;
import org.moria.Objetos.Objeto;
import org.moria.Objetos.Vara;
import org.moria.Peligros.Magico;
import org.moria.Personajes.Elfo;
import org.moria.Personajes.Hobbit;
import org.moria.Personajes.Mago;
import org.moria.Personajes.Personaje;
import org.moria.Salas.Sala;

public class Moria {

private final ArrayList<Sala>Salas= new ArrayList<>();

    private int MAX_ENERGIA=30;
    private int MAX_FLECHAS=20;
    private int MAX_SALAS=36;
    private int MAX_PODER_MALIGNO_SALA=10;
    private int MAX_FLECHAS_SALA=10;
    private int MAX_ENEMIGOS_SALA=10;

    private Personaje Gandalf;
    private Personaje Legolas;
    private Personaje Frodo;


    // Repaso e implemento la inyeccion de dependencias, esta parte la he hecho ayudándome de apuntes.
    public void crearPersonajes(){


        Gandalf= new Mago("Gandalf", new Vara(MAX_ENERGIA), 80,true);
        Legolas= new Elfo("Legolas",new Carcaj(MAX_FLECHAS),80,true);
        Frodo= new Hobbit("Frodo", new Anillo(true),80,true);




    }


    public void crearSalas(){

        }




    }







