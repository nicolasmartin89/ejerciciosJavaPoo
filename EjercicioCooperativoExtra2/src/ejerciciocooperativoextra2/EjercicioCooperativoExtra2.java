package ejerciciocooperativoextra2;

import ejerciciocooperativoextra2.Entidades.Alquiler;
import ejerciciocooperativoextra2.Entidades.Pelicula;
import ejerciciocooperativoextra2.Servicios.AlquilerServicios;
import ejerciciocooperativoextra2.Servicios.PeliculasServicios;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCooperativoExtra2 {

    public static void main(String[] args) {
        menuPrincipal();

        
        
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        PeliculasServicios servP = new PeliculasServicios();
        AlquilerServicios servA = new AlquilerServicios();

        ArrayList<Pelicula> misPeliculas = new ArrayList<>();
        ArrayList<Alquiler> misAlquileres = new ArrayList<>();
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("Ingrese una opcion del menu \n"
                    + "1. Crear Pelicula \n"
                    + "2. Crear Alquiler \n"
                    + "3. Listar peliculas disponibles \n"
                    + "4. Listar todos los alquileres \n"
                    + "5. Buscar una pelicula por titulo \n"
                    + "6. Buscar una pelicula por genero \n"
                    + "7. Buscar un alquiler por fecha \n"
                    + "8. Calcular el ingreso total por servicio \n"
                    + "9. Salir \n");

            System.out.println("Ingresa una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    misPeliculas.add(servP.crearPelicula());
                    break;
                case 2:
                    System.out.println("Elija el numero de pelicula que desea alquilar");
                    misAlquileres.add(servA.crearAlquiler(misPeliculas.get(sc.nextInt())));
                    break;
                case 3:
                    servP.listarPeliculas(misPeliculas);
                    //Listar todas las películas disponibles
                    break;
                case 4:
                    servA.listarAlquileres(misAlquileres);
                    //Listar todas los alquileres
                    break;
                case 5:
                    servP.buscarPeliculaPorTitulo(misPeliculas);
                    //Buscar una película por título (Decir si se existe o no)
                    break;
                case 6:
                    servP.buscarPeliculaPorGenero(misPeliculas);
                    //Buscar una película por género
                    break;
                case 7:
                    //Buscar un alquiler por fecha
                    break;
                case 8:
                    //Calcular el ingreso total del servicio
                    break;
                case 9:
                    //Salir
                    break;
                default:
                    throw new AssertionError();
            }

//            System.out.println(misPeliculas);
//            System.out.println(misAlquileres);
        }
    }

}
