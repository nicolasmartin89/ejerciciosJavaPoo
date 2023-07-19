package ejercicio6;

public class Ejercicio6 {


    public static void main(String[] args) {
        
        Cafetera miCafetera = new Cafetera();
        
        miCafetera.setCapacidadMaxima(100);
        miCafetera.setCantidadActual(50);
        
        System.out.println(miCafetera.toString());
        
        Servicios serv = new Servicios();

        serv.agregarCafe(miCafetera);

        System.out.println(miCafetera.toString());

        serv.servirTaza(60, miCafetera);

        System.out.println(miCafetera.toString());

    }

}
