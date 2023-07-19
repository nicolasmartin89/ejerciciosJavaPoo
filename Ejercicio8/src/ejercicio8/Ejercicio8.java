package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Servicios serv = new Servicios();

        Cadena cadena = new Cadena();
        System.out.println("Ingresa una frase");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        System.out.println(cadena.toString());

        serv.mostrarVocales(cadena);

        serv.invertirFrase(cadena);

        serv.vecesRepetido(cadena, 'a');

        serv.compararLongitud(cadena, "cortita");

        serv.unirFrases(cadena, " -> este es el pedazo de frase nuevo...");

        serv.reemplazarLetra(cadena, 'a');
        
        serv.contiene(cadena, "b");
    }

}
