package ejercicioextra02;

public class EjercicioExtra02 {

    public static void main(String[] args) {
        Servicios serv = new Servicios();

        Puntos puntos = serv.crearPuntos();
        System.out.println("La distancia entre los puntos es ");
        System.out.println(serv.calcularYDevolverDistancia(puntos));
        

    }

}
