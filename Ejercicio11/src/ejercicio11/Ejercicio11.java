package ejercicio11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*
        Esta es una prueba con la clase Date, pero la misma se encuentra Obsoleta a partir de java 11
        se recomienda utilizar la clase Calendar o las nuevas API de fechas y horas introducidas en Java 8,
        como LocalDate, LocalTime y DateTimeFormatter, que proporcionan una funcionalidad más robusta y fácil de usar. 
        */
/*
        System.out.println("Fecha con Date");
        
        Date fechaActual = new Date();
        
        System.out.println("Fecha Actual");
        System.out.println(fechaActual);
        // Crear un objeto Date con un valor específico
        
        System.out.println("Fecha Especifica");
        Date fechaEspecifica = new Date(2023 - 1900, 6-1, 26); // Nota: El constructor con año, mes y día está obsoleto
        System.out.println(fechaEspecifica);
        // Crear un objeto Date a partir de un valor de tiempo en milisegundos
        System.out.println("Fecha desde Milisegundos");
        
        long tiempoEnMilisegundos = 1624645467890L;
        Date fechaDesdeMilisegundos = new Date(tiempoEnMilisegundos);
        System.out.println(fechaDesdeMilisegundos);

      */

        System.out.println("Fecha con Calendar...");
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime());
        
        System.out.println("");
        System.out.println("Fecha actual con LocalDate");

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formateador);
        System.out.println("Fecha y hora formateada: " + fechaHoraFormateada);


       //Ejercicio 11 realizado con la API de fechas y horas introducidas en Java 8.
       /* 
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();
        
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("La fecha ingresada es: " + fechaIngresada);

        Period periodo = Period.between(fechaIngresada, fechaActual);
        int añosEntreFechas = periodo.getYears();

        System.out.println("Hay " + añosEntreFechas + " años entre la fecha ingresada y la fecha actual.");
        */
        
        
    }
}


