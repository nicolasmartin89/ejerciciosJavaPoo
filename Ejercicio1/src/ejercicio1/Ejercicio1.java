package ejercicio1;

import Entidades.Libro;
import Servicios.ServiciosLibro;

/**
 *
 * @author el_ni
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosLibro servLibro = new ServiciosLibro();
        

        Libro libroAna = servLibro.CrearLibro();
        
        servLibro.InformarDatos(libroAna);

        System.out.println("******");
        System.out.println(libroAna);
    }
    
}
