
package Ejercicio14;

import java.util.Scanner;

public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Movil cargarCelular(){
        System.out.println("Ingrese marca:");
        String marca = leer.nextLine();
        System.out.println("Ingrese modelo:");
        String modelo = leer.nextLine();
        System.out.println("Ingrese memoria ram");
        int ram = leer.nextInt();
        System.out.println("Ingrese el almacenamiento:");
        int almacenamiento = leer.nextInt();
        System.out.println("Ingrese el precio:");
        double precio = leer.nextDouble();
        Movil movil = new Movil(marca, modelo, ram, almacenamiento, precio);
        ingresarCodigo(movil);
        return movil;
    }
    public void ingresarCodigo(Movil movil){
        int[] cod = new int[7];
        for(int i = 0; i<7; i++){
            System.out.println("Ingrese el codigo:");
            cod[i] = leer.nextInt();
        }
        movil.setCodigo(cod);
    }
    
    public void mostrarCod(Movil movil) {
        System.out.println("Codigos:");
        for (int cadena : movil.getCodigo()) { // Solo para listass
            System.out.println(cadena);
        }
    }
}
