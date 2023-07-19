package ejercicioextra06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Servicios {
    public void crearJuego(Ahorcado ahorcado) {
        Scanner sc = new Scanner(System.in);
        
        
        String palabraUsuario="".toLowerCase();
        while (palabraUsuario.isEmpty()) {
            System.out.println("Ingresa la palabra a buscar: ");
            try {
                palabraUsuario = sc.nextLine();
                if (!palabraUsuario.matches("[a-zA-Z]+")) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa una palabra válida.");
                palabraUsuario = "";
            }
        }
        
        
        int jugadasMaximasUsuario = 0;
        while (jugadasMaximasUsuario == 0) {
            System.out.println("Ingresa la cantidad de jugadas máximas: ");
            try {
                jugadasMaximasUsuario = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                sc.nextLine();
            }
        }
        
        
        
        char[] palabra = new char[palabraUsuario.length()];
        char[] palabraOculta = new char[palabraUsuario.length()];
        Arrays.fill(palabraOculta, '_');
        for (int i = 0; i < palabraUsuario.length(); i++) {
            palabra[i] = palabraUsuario.charAt(i);
        }
        ahorcado.setPalabra(palabra);
        ahorcado.setPalabraOculta(palabraOculta);
        ahorcado.setJugadasMaximas(jugadasMaximasUsuario);
        ahorcado.setEncontradas(0);
        ahorcado.setIntentosFallidos(0);
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra a buscar es: " + ahorcado.getPalabra().length);
    }

    public boolean buscar(Ahorcado ahorcado, char letra) {
        boolean encontrada = false;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i] == letra && ahorcado.getPalabraOculta()[i] == '_') {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("La letra " + letra + " está en la palabra.");
            return true;
        } else {
            System.out.println("La letra " + letra + " no está en la palabra.");
            ahorcado.setIntentosFallidos(ahorcado.getIntentosFallidos() + 1);
            return false;
        }
    }

    public boolean encontradas(Ahorcado ahorcado, char letra) {
        int contadorLetrasEncontradas = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i] == letra && ahorcado.getPalabraOculta()[i] == '_') {
                contadorLetrasEncontradas++;
                ahorcado.setEncontradas(ahorcado.getEncontradas() + 1);
                ahorcado.getPalabraOculta()[i] = letra;
            }
        }
        System.out.println("Se han encontrado " + contadorLetrasEncontradas + " letras " + letra + ".");
        System.out.println("Faltan encontrar " + (ahorcado.getPalabra().length - ahorcado.getEncontradas()) + " letras.");
        return contadorLetrasEncontradas > 0;
    }

    public void intentos(Ahorcado ahorcado) {
        
        System.out.println("Te quedan " + (ahorcado.getJugadasMaximas() - ahorcado.getIntentosFallidos()) + " intentos.");
    }

    public void juego(Ahorcado ahorcado) {
        crearJuego(ahorcado);
        Scanner sc = new Scanner(System.in);
        while (ahorcado.getEncontradas() < ahorcado.getPalabra().length && ahorcado.getIntentosFallidos() < ahorcado.getJugadasMaximas()) {
            longitud(ahorcado);
            intentos(ahorcado);
            System.out.println("Ingresa una letra: ");
            char letraIngresada = sc.next().charAt(0);
            buscar(ahorcado, letraIngresada);
            encontradas(ahorcado, letraIngresada);
            System.out.println("-----------");
        }
        if (ahorcado.getEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("¡Felicidades! Has encontrado toda la palabra.");
        } else if (ahorcado.getIntentosFallidos() == ahorcado.getJugadasMaximas()) {
            System.out.println("Lo siento, te has quedado sin intentos. La palabra era: ");
            for (int i = 0; i < ahorcado.getPalabra().length; i++) {
                System.out.print(ahorcado.getPalabra()[i]);
            }
            System.out.println();
        }
    }
}
