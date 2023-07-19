package ejercicio9;

import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {
        Random random = new Random();
        Servicios serv = new Servicios();

        Matematica mat = new Matematica();
        double numAleatorio1 = random.nextDouble() * 1000 / 10;
        double numAleatorio2 = random.nextDouble() * 1000 / 10;

        mat.setNum1(numAleatorio1);
        mat.setNum2(numAleatorio2);

        System.out.println(mat.toString());

        System.out.println(serv.devolverMayor(mat));
        System.out.println(serv.calcularPotencia(mat));
        System.out.println(serv.calcularRaiz(mat));
        
    }

}
