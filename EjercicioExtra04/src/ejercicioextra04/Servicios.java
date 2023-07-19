package ejercicioextra04;

import java.util.Scanner;


public class Servicios {

    Scanner sc = new Scanner(System.in);

    public Nif crearNif() {
        Nif nif = new Nif();
        //Aca  verificamos que el dni sea valido
        boolean dniValido = false;
        while (!dniValido) {
            System.out.print("Ingrese el número de DNI (8 dígitos): ");
            String dniIngresado = sc.nextLine();

            if (dniIngresado.length() == 8) {
                try {
                    nif.setDni(Long.parseLong(dniIngresado));
                    dniValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("El DNI debe ser un número válido.");
                }
            } else {
                System.out.println("El DNI debe tener exactamente 8 dígitos.");
            }
        }
        
        int calcularResto = (int) (nif.getDni() % 23);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        nif.setLetra(letras[calcularResto]);
        return nif;
    }
    
    public void mostrar(Nif nif){
        System.out.println("El NIF es: " + nif.getDni() + "-" + nif.getLetra());
    }
}
