package ejercicio4;

import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public void crearRectangulo(Rectangulo rect){
        System.out.println("Ingresa la base ");
        rect.setBase(leer.nextInt());
        System.out.println("Ingresa la altura ");
        rect.setAltura(leer.nextInt());
    }
    
    public double calcularSuperficie(Rectangulo rect) {
        double base = rect.getBase();
        double altura = rect.getAltura();
        double superficie = base * altura;
        return superficie;
    }

    public double calcularPerimetro(Rectangulo rect) {
        double base = rect.getBase();
        double altura = rect.getAltura();
        double perimetro = (base * altura) * 2;
        return perimetro;
    }
    
    public void dibujarCuadrado(Rectangulo rect){
        for (int i = 0; i < rect.getBase(); i++) {
            for (int j = 0; j < rect.getAltura(); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    
    }
}
