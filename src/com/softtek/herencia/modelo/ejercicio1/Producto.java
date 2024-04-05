package com.softtek.herencia.modelo.ejercicio1;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected double pvp;


    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }

    public Producto() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double cantidadApagar(double pagar ){

        return pagar;
    }
}
