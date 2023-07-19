package ejercicio12;


public class Ejercicio12 {

 
    public static void main(String[] args) {

        Servicios serv = new Servicios();
        Persona miPersona = serv.crearPersona();
        System.out.println("Datos de la persona creada: ");
        System.out.println(miPersona.toString());
        System.out.println("Calculando la edad de la persona");
        System.out.println(serv.calcularEdad(miPersona));
        System.out.println("Comparando si es menor que la persona");
        System.out.println(serv.menorQue(25, miPersona));
        
        System.out.println("Utilizando el metodo mostrar persona");
        serv.mostrarPersona(miPersona);
        
    }
    
}
