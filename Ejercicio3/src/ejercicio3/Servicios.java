package ejercicio3;

import java.util.Scanner;
/**
 *
 * @author el_ni
 */
public class Servicios {
    
    public void crearOperacion(Operacion op){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        op.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        op.setNum2(leer.nextInt());
    }
    
    public void sumar(Operacion op){
    
        System.out.println("La suma de " + op.getNum1() + " + " + op.getNum2() + " = " + (op.getNum1()+op.getNum2()));
    }
    
        public void restar(Operacion op){
    
        System.out.println("La resta de " + op.getNum1() + " - " + op.getNum2() + " = " + (op.getNum1()-op.getNum2()));
    }

    public void multiplicar(Operacion op) {
        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("No se puede multiplicar por cero!");
        } else {
            System.out.println("La multiplicacion de " + op.getNum1() + " X " + op.getNum2() + " = " + (op.getNum1() * op.getNum2()));
        }
    }

    public void dividir(Operacion op) {

        double num1Convert = op.getNum1();
        double num2Convert = op.getNum2();

        double resulDivi = (num1Convert / num2Convert);

        if (op.getNum1() == 0 || op.getNum2() == 0) {
            System.out.println("No se puede dividir por cero!");
        } else {
            System.out.println("La division de " + op.getNum1() + " / " + op.getNum2() + " = " + resulDivi);
        }
    }
}
