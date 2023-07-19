package ejerciciocooperativoextra2.Entidades;

import java.time.LocalDate;

public class Alquiler {

    private Pelicula pelicula;
    private LocalDate fechaDeInicio;
    private LocalDate fechaDeFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, LocalDate fechaDeInicio, LocalDate fechaDeFin, double precio) {
        this.pelicula = pelicula;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precio = precio;
    }

    public Pelicula getPeliculas() {
        return pelicula;
    }

    public void setPeliculas(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "pelicula=" + pelicula + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFin=" + fechaDeFin + ", precio=" + precio + '}';
    }

}
