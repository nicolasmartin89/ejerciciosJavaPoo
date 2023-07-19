package ejerciciocooperativoextra2.Servicios;

import ejerciciocooperativoextra2.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


public class PeliculasServicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Pelicula crearPelicula() {
        
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingresa el titulo");
        pelicula.setTitulo(sc.nextLine());
        System.out.println("Ingresa el genero");
        pelicula.setGenero(sc.nextLine());
        System.out.println("Ingresa el año");
        pelicula.setAnio(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingresa la duracion");
        pelicula.setDuracion(Integer.parseInt(sc.nextLine()));
        pelicula.setAlquilada(false);

        return pelicula;
    }
    public void listarPeliculas(ArrayList<Pelicula> misPeliculas){
        for (int i = 0; i < misPeliculas.size(); i++) {
            if (!misPeliculas.get(i).isAlquilada()) {
                System.out.println(misPeliculas.get(i).getTitulo());
            } else {
                continue;
            }
        }
    }
    public void buscarPeliculaPorTitulo(ArrayList<Pelicula> misPeliculas) {
        System.out.println("Ingrese el titulo de la pelicula que desea buscar: ");
        String tituloBuscado = sc.nextLine();

        for (Pelicula p : misPeliculas) {
            if (p.getTitulo().contains(tituloBuscado)) {
                System.out.println("la pelicula se encuentra en la lista");
            }else{
                System.out.println("No se ha encontrado el titulo buscado");
            }
        }
    }
    public void buscarPeliculaPorGenero(ArrayList<Pelicula> misPeliculas) {
        System.out.println("Ingrese el genero de la pelicula que desea buscar: ");
        String generoBuscado = sc.nextLine();

        for (Pelicula p : misPeliculas) {
            if (p.getGenero().contains(generoBuscado)) {
                System.out.println("Estas son las peliculas con el genero buscado");
            }else{
                System.out.println("No se ha encontrado el genero buscado");
            }
        }
    }
}

