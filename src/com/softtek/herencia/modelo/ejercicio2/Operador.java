package com.softtek.herencia.modelo.ejercicio2;

public class Operador extends Empleado{

    private double ventas;

    private double comision;

    public Operador(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }


    public Operador() {
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularNomina(){

        return ((ventas*comision)+sueldo)*PORCENTAJE;
    }
}
