package Servicios;

import Entidades.Libro;
import java.util.Scanner;


public class ServiciosLibro {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Libro CrearLibro() {
        
        Libro miLibro = new Libro();
        System.out.println("Ingresa el ISBN");
        miLibro.setIsbn(leer.nextLine());
        System.out.println("Ingresa el Titulo");
        miLibro.setTitulo(leer.nextLine());
        System.out.println("Ingresa el Autor");
        miLibro.setAutor(leer.nextLine());
        System.out.println("Ingresa el Numero de Paginas");
        miLibro.setNumeroDePaginas(leer.nextInt());
        
        return miLibro;
    }
    
    public void InformarDatos(Libro miLibro){
        
        System.out.println("El ISBN del libro es " + miLibro.getIsbn());
        System.out.println("El Titulo del libro es " + miLibro.getTitulo());
        System.out.println("El Autor del libro es " + miLibro.getAutor());
        System.out.println("El Numero de paginas del libro es  " + miLibro.getNumeroDePaginas());
            
    }
        
}
