package ejercicioextra05;

import java.util.Scanner;

public class EjercicioExtra05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[0];

        boolean acertado = false;
        
        while (!acertado) {            
            System.out.println("Adivine el mes secreto, introduzca el nomrbe en minusculas");
            String mesIngresado = sc.nextLine();
            
            if (mesIngresado.equalsIgnoreCase(mesSecreto)) {
                acertado = true;
                System.out.println("Has acertado, el mes secreto era " + mesSecreto);
            }else{
                System.out.println("Erraste, ingresa el mes nuevamente.");
            }
        
        }
    }

}
