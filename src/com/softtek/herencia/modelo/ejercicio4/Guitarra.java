package com.softtek.herencia.modelo.ejercicio4;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public Guitarra() {
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String emitirSonido(){
        return "Sonido Bateria";
    }
}
