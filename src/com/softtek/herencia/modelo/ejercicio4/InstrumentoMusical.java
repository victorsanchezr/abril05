package com.softtek.herencia.modelo.ejercicio4;

public abstract class InstrumentoMusical {
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

    public abstract String emitirSonido();
}
