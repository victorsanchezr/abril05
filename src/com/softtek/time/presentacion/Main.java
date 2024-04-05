package com.softtek.time.presentacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //A
        LocalDate inicio = LocalDate.of(2024, 4, 2); // Por ejemplo, el 1 de abril de 2024
        LocalDate fin = inicio.plusDays(10);
        System.out.println("Inicio " + inicio);
        System.out.println("Fin" + fin);

        //B
        LocalDateTime fechaHoy = LocalDateTime.now();
        System.out.println("Fecha de hoy: " + fechaHoy);

        //C
        LocalDateTime fechaHoySydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Fecha de hoy en Sydney: " + fechaHoySydney);

        //D
        LocalDate dia100de2024 = LocalDate.ofYearDay(2024, 100);
        System.out.println("El día 100 de 2024 es: " + dia100de2024);

        //E
        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate nocheVieja = LocalDate.of(2024, 12, 31);
        System.out.println("Navidad antes de Nochevieja? " + navidad.isBefore(nocheVieja));
        System.out.println("Nochevieja después de Navidad? " + nocheVieja.isAfter(navidad));

        //F.
        LocalDate fechaResultado = LocalDate.of(2024, 3, 15).plusWeeks(35);
        System.out.println("resultado: " + fechaResultado);

        //G
        LocalDate fechaInicioTrabajo = LocalDate.of(2012, 7, 6);
        long añosTrabajados = ChronoUnit.YEARS.between(fechaInicioTrabajo, LocalDate.now());
        System.out.println("Años trabajados: " + añosTrabajados);

        //H
        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        long edad = ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edad: " + edad);

        //I
        LocalDate fechaEntrega = LocalDate.of(2024, 10, 2);
        LocalDate fechaInicioProyecto = fechaEntrega.minusDays(200);
        System.out.println("Fecha de inicio del proyecto: " + fechaInicioProyecto);

        //J
        LocalDate fechaInicioProyecto2 = LocalDate.of(2024, 3, 15);
        LocalDate fechaFinProyecto2 = LocalDate.of(2024, 10, 20);
        long periodoProyecto1 = ChronoUnit.DAYS.between(fechaInicioProyecto2, fechaFinProyecto2);
        long periodoProyecto2 = ChronoUnit.MONTHS.between(fechaInicioProyecto2, fechaFinProyecto2);
        long periodoProyecto3 = ChronoUnit.YEARS.between(fechaInicioProyecto2, fechaFinProyecto2);
        System.out.println("Dias: " + periodoProyecto1 +  " Meses "+ periodoProyecto2  + " Años "+ periodoProyecto3);
    }
}
