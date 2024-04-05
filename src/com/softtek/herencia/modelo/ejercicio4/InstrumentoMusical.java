package com.softtek.herencia.modelo.ejercicio4;

public class InstrumentoMusical {
    protected String marca;


    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public InstrumentoMusical() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String emitirSonido(){
        return "Sonido Default";
    }
}
