package ejercicio6;

import java.util.Scanner;


public class Servicios {
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(int tamanioTaza, Cafetera cafetera){
//        int cafeActual = (int)cafetera.getCantidadActual();
        if (cafetera.getCantidadActual() >= tamanioTaza) {
            
            cafetera.setCantidadActual(cafetera.getCantidadActual()-tamanioTaza);
        }else{
            cafetera.setCantidadActual(0);
            System.out.println("No hay suficiente cafe como para llenar la taza.");
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de cafe que deseas añadir a la cafetera: ");
        double cantidadCafe = sc.nextDouble();
        if (cantidadCafe + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);

        }

    }
}
