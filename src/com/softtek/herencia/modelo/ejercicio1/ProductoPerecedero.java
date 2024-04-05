package com.softtek.herencia.modelo.ejercicio1;

import java.time.LocalDateTime;

public class ProductoPerecedero extends Producto {

    private LocalDateTime fCaducidad;
    private LocalDateTime fFabriacion;

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDateTime fCaducidad, LocalDateTime fFabriacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabriacion = fFabriacion;
    }

    public ProductoPerecedero() {
    }

    public LocalDateTime getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDateTime fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDateTime getfFabriacion() {
        return fFabriacion;
    }

    public void setfFabriacion(LocalDateTime fFabriacion) {
        this.fFabriacion = fFabriacion;
    }


    public double timepoConsumicion(double tiempo){
        return tiempo;
    }
}
