package ejercicioextra03;

import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in);

    public Raices crearEcuacion() {

        Raices raices = new Raices();
        System.out.println("Ingresa el valor de a: ");
        raices.setA(sc.nextDouble());
        System.out.println("Ingresa el valor de b: ");
        raices.setB(sc.nextDouble());
        System.out.println("Ingresa el valor de c: ");
        raices.setC(sc.nextDouble());

        return raices;
    }

    public double getDiscriminante(Raices raices) {
        //formula (b^2)-4*a*c
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) {

        //-b±√((b^2)-(4*a*c)))/(2*a)
        double solucion1 = (-raices.getB()+Math.sqrt(getDiscriminante(raices)))/(2*raices.getA());
        double solucion2 = (-raices.getB()-Math.sqrt(getDiscriminante(raices)))/(2*raices.getA());

        if (tieneRaices(raices)) {
            System.out.println("La solucion 1 es: " + solucion1);
            System.out.println("La solucion 2 es: " + solucion2);
        } else {
            System.out.println("No tiene dos raices.");
        }
    }
    
    public void obtenerRaiz(Raices raices){
        
        if (tieneRaiz(raices)) {
            System.out.println("Tiene 1 raiz y el resultado es: " + (-raices.getB()/(2*raices.getA())));
        }else{
            System.out.println("Tiene dos raices...");
        }
    }
    
   public void calcular(Raices raices){
       if (tieneRaiz(raices)) {
           obtenerRaiz(raices);
       }else if(tieneRaices(raices)){
           obtenerRaices(raices);
       }else{
           System.out.println("Te salio todo mal no tiene nada");
       }
   
   }
}
