package ejerciciocooperativoextra2.Servicios;

import ejerciciocooperativoextra2.Entidades.Alquiler;
import ejerciciocooperativoextra2.Entidades.Pelicula;
import java.time.LocalDate;
import java.util.ArrayList;


public class AlquilerServicios {
    
    public Alquiler crearAlquiler(Pelicula pelicula) {
        Alquiler alquiler = new Alquiler();
        alquiler.setPeliculas(pelicula);
        alquiler.setFechaDeInicio(LocalDate.now());
        alquiler.setFechaDeFin(null);
        alquiler.setPrecio(10);
        pelicula.setAlquilada(true);
        return alquiler;
    }
    
      public void listarAlquileres(ArrayList<Alquiler> misAlquileres) {
        for (int i = 0; i < misAlquileres.size(); i++) {
            System.out.println(misAlquileres.get(i).getPeliculas().getTitulo());
            System.out.println(misAlquileres.get(i).getFechaDeInicio());
            System.out.println(misAlquileres.get(i).getPrecio());
            System.out.println(misAlquileres.get(i).getFechaDeFin());
        }
    }
}
