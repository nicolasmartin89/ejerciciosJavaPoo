package ejercicioextra02;

import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in);

    public Puntos crearPuntos() {

        Puntos puntos = new Puntos();
        System.out.println("Ingresa el punto X 1 ");
        puntos.setX1(sc.nextInt());
        System.out.println("Ingresa el punto Y 1 ");
        puntos.setY1(sc.nextInt());
        System.out.println("Ingresa el punto X 2 ");
        puntos.setX2(sc.nextInt());
        System.out.println("Ingresa el punto Y 2 ");
        puntos.setY1(sc.nextInt());

        return puntos;
    }

    public double calcularYDevolverDistancia(Puntos puntos) {

        double punto1 = (Math.pow((puntos.getX1() - puntos.getY1()), 2));
        double punto2 = (Math.pow((puntos.getX2() - puntos.getY2()), 2));
        double suma = punto1+punto2;
        double distancia = Math.sqrt(suma);
        
        return distancia;

    }
}
