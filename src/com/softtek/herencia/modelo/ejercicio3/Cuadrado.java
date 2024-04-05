package com.softtek.herencia.modelo.ejercicio3;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado() {

    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){

        return lado*lado;
    }

}
