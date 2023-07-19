package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        //Creando los arreglos
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        //Llenando el arreglo A con aleatorios
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random() * 10000.0) / 100.0;
        }
        //Mostrando el arreglo A
        System.out.println("Arreglo A original...");
        mostrarArreglo(arregloA);
        //Ordenando el arreglo A.
        System.out.println("Arreglo A ORDENADO");
        Arrays.sort(arregloA);

        //Mostrando el arreglo A ordenado
        mostrarArreglo(arregloA);
        
        //Copiando los primeros 10 numeros
        System.arraycopy(arregloA, 0, arregloB, 0, 10); //Esto me sugiere el IDE
        
//          for (int i = 0; i < 10; i++) {
//            arregloB[i] = arregloA[i];        YO lo habia echo de esta manera
//        }
        
        //Rellanando los ultimos 10 numeros con 0.5
        
          for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
        
        //Imprimiendo el array B
        System.out.println("Arreglo B completo");
        mostrarArreglo(arregloB);
        
    }

    private static void mostrarArreglo(double[] arreglo) {
        for (double d : arreglo) {
            System.out.println(d + " ");
        }
        System.out.println();
    }
}
