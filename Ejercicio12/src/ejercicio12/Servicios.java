package ejercicio12;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author el_ni
 */
public class Servicios {
    
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona a crear");
        persona.setNombre(sc.nextLine());
        System.out.println("Ingresa el AÑO de tu nacimiento: ");
        int anio = sc.nextInt();
        System.out.println("Ingresa el MES de tu nacimiento: ");
        int mes = sc.nextInt();
        System.out.println("Ingresa el DIA de tu nacimiento: ");
        int dia = sc.nextInt();
        Date nacimiento = new Date(anio-1900, mes-1, dia);
        persona.setFechaDeNacimiento(nacimiento);
        return persona;
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        long edadEnMilisegundos = fechaActual.getTime() - persona.getFechaDeNacimiento().getTime();
        double edadNueva = (edadEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        int edadActual = (int) edadNueva;
        return edadActual;
    }

    public boolean menorQue(int edad, Persona persona) {
        return edad < calcularEdad(persona);
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Datos de la persona creda:");
        System.out.println(persona.toString());
    }
}
