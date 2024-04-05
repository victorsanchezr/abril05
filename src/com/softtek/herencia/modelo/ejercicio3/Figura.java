package com.softtek.herencia.modelo.ejercicio3;

public class Figura {
    protected int x;
    protected int y;


    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String mostrarPosicion(){


        return String.valueOf(x)+" "+String.valueOf(y);
    }

    public double calcularArea(){

        return x*y;
    }


}
