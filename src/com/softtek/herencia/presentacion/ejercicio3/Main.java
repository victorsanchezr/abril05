package com.softtek.herencia.presentacion.ejercicio3;

import com.softtek.herencia.modelo.ejercicio2.Empleado;
import com.softtek.herencia.modelo.ejercicio2.Gerente;
import com.softtek.herencia.modelo.ejercicio2.Operador;
import com.softtek.herencia.modelo.ejercicio2.Vendedor;
import com.softtek.herencia.modelo.ejercicio3.Cuadrado;
import com.softtek.herencia.modelo.ejercicio3.Figura;
import com.softtek.herencia.modelo.ejercicio3.Triangulo;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(1);
        cPeque.setY(2);
        cPeque.setLado(5);
        Figura cuad2 = new Cuadrado(2, 3, 10);

        Triangulo tPeque = new Triangulo();
        tPeque.setX(3);
        tPeque.setY(4);
        tPeque.setAltura(5);
        tPeque.setBase(10);

        Figura tria2 = new Triangulo(10, 11, 7, 3);

        Figura[] lista = new Figura[4];

        lista[0] = cPeque;
        lista[1] = cuad2;
        lista[2] = tPeque;
        lista[3] = tria2;

        for (Figura figuras : lista) {
            System.out.println(figuras.calcularArea());

        }


    }
}
