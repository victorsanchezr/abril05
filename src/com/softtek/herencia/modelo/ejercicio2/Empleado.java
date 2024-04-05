package com.softtek.herencia.modelo.ejercicio2;

public class Empleado {
    protected String nombre;

    protected double sueldo;

    protected double PORCENTAJE = 0.75;


    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPORCENTAJE() {
        return PORCENTAJE;
    }

    public void setPORCENTAJE(double PORCENTAJE) {
        this.PORCENTAJE = PORCENTAJE;
    }


    public double calcularNomina(){

        return sueldo*PORCENTAJE;
    }


}
