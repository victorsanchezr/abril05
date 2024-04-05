package com.softtek.herencia.presentacion.ejercicio4;

import com.softtek.herencia.modelo.ejercicio3.Cuadrado;
import com.softtek.herencia.modelo.ejercicio3.Figura;
import com.softtek.herencia.modelo.ejercicio3.Triangulo;
import com.softtek.herencia.modelo.ejercicio4.Bateria;
import com.softtek.herencia.modelo.ejercicio4.Flauta;
import com.softtek.herencia.modelo.ejercicio4.Guitarra;
import com.softtek.herencia.modelo.ejercicio4.InstrumentoMusical;

public class Main {
    public static void main(String[] args) {

        InstrumentoMusical guido = new Guitarra("Yamaha","nylon");
        InstrumentoMusical bataca = new Bateria("Pearl",5);
        InstrumentoMusical ham = new Flauta("honner","madera");

        InstrumentoMusical[] lista = new InstrumentoMusical[3];

        lista[0] = guido;
        lista[1] = bataca;
        lista[2] = ham;

        for (InstrumentoMusical sonido:lista) {
            System.out.println(sonido.emitirSonido());

        }
    }
}
