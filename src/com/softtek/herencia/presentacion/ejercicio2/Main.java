package com.softtek.herencia.presentacion.ejercicio2;

import com.softtek.herencia.modelo.ejercicio1.ProductoPerecedero;
import com.softtek.herencia.modelo.ejercicio2.Empleado;
import com.softtek.herencia.modelo.ejercicio2.Gerente;
import com.softtek.herencia.modelo.ejercicio2.Operador;
import com.softtek.herencia.modelo.ejercicio2.Vendedor;

public class Main {
    public static void main(String[] args) {
        Empleado gerente1 = new Gerente("Paco",4500,1250);

        System.out.println(gerente1.calcularNomina());
        Empleado operador1 = new Operador("Alberto",1500,20,100);
        System.out.println(operador1.calcularNomina());
        Empleado vendedor1 = new Vendedor("Lucia",2000,15,250);
        System.out.println(vendedor1.calcularNomina());
    }
}
