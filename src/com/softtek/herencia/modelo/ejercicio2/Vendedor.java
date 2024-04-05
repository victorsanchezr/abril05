package com.softtek.herencia.modelo.ejercicio2;

public class Vendedor extends Empleado{
    private int piezas;
    private double incentivo;


    public Vendedor(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public Vendedor() {
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina(){

        return ((piezas*incentivo)+sueldo)*PORCENTAJE;
    }
}
