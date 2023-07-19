package Ejercicio13;

import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public Curso crearCurso() {
        Curso curso = new Curso();

        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Turno del curso mañana/tarde:");
        curso.setTurno(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por día:");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana:");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(curso);
        return curso;
    }

    public void cargarAlumnos(Curso curso) {
        String[] alumno = new String[5];
        leer.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre del alumno " + i + 1);
            alumno[i] = leer.nextLine();
        }
        curso.setAlumnos(alumno);
    }

    public void mostrarAlumnos(Curso curso) {
        System.out.println("Lista de alumnos:");
        for (String cadena : curso.getAlumnos()) { // Solo para listass
            System.out.println(cadena);
        }
    }

    public double calcularGananciaSemanal(Curso curso) {
        double ganancias = curso.getPrecioPorHora()*curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*5;
        return ganancias;
    }
}
