package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Servicios serv = new Servicios();
        Rectangulo rect = new Rectangulo();
        serv.crearRectangulo(rect);

        System.out.println("El perimetro es " + serv.calcularPerimetro(rect));
        System.out.println("La superficie es " + serv.calcularSuperficie(rect));
        
        serv.dibujarCuadrado(rect);


    }
    
}
