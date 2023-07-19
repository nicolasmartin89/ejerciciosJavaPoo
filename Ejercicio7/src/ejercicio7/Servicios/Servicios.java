package ejercicio7.Servicios;

import ejercicio7.Entidades.Persona;
import java.util.Scanner;

/**
 *    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
 * @author el_ni
 */
public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese el Nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el Apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el Edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el Sexo");
        persona.setSexo(leer.next().toUpperCase());
        
        while (!persona.getSexo().equalsIgnoreCase("O") && !persona.getSexo().equalsIgnoreCase("H") && !persona.getSexo().equalsIgnoreCase("M")) {            
            System.out.println("Ingresaste un sexo incorrecto, ingresa H, M, O");
            persona.setSexo(leer.next());

        }
              
        System.out.println("Ingrese el Peso en kg");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese el Altura en mt");
        persona.setAltura(leer.nextDouble());

        return persona;  
    }
    
    public int calcularIMC(Persona persona){
        
        double imc = (persona.getPeso()/(Math.pow(persona.getAltura(), 2)));
       
        if(imc < 20 ){
            return -1;
        }else if(imc >= 20 && imc <= 25 ){
            return 0;
        }
        return 1;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad()>=18;
    }
    
}
