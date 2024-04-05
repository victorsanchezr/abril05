package com.softtek.herencia.modelo.ejercicio4;

public class Flauta extends InstrumentoMusical{
    private String material;


    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta() {
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String emitirSonido(){
        return "Sonido Flauta";
    }
}
