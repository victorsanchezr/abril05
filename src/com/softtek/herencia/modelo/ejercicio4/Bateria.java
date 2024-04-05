package com.softtek.herencia.modelo.ejercicio4;

public class Bateria extends InstrumentoMusical{
    private int numeropalillos;

    public Bateria(String marca, int numeropalillos) {
        super(marca);
        this.numeropalillos = numeropalillos;
    }

    public Bateria() {
    }

    public int getNumeropalillos() {
        return numeropalillos;
    }

    public void setNumeropalillos(int numeropalillos) {
        this.numeropalillos = numeropalillos;
    }

    public String emitirSonido(){
        return "Sonido Bateria";
    }
}
