package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class ServiciosCircunferencia {

    Scanner leer = new Scanner(System.in);


    public Circunferencia crearCircunferencia() {
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingresa el radio: ");
        circunferencia.setRadio(leer.nextDouble());
        return circunferencia;
    }
    
    public void determinarArea(Circunferencia circunferencia){
        
        double area = (Math.PI*(Math.pow(circunferencia.getRadio(), 2)));
        
        System.out.println("El area calculada es: " + area);
  
    }
    
        public void determinarPerimetro(Circunferencia circunferencia){
        
        double perimetro = (2*Math.PI*circunferencia.getRadio());
        
        System.out.println("El perímetro calculado es: " + perimetro);
  
    }
    
//    public double determianrArea(Circunferencia circunferencia(radio)){
//        
//        double area = (Math.PI*(Math.pow(radio, 2)));
//        
//        return circunferencia;
//    }

}
