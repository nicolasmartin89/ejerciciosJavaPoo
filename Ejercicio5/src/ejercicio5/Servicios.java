package ejercicio5;

import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingresa el numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingresa el DNI: ");
        long dni = sc.nextLong();
        System.out.println("Ingresa el saldo: ");
        int saldo = sc.nextInt();

        return new Cuenta(numeroCuenta, dni, saldo);
    }

    public void ingresarDinero(double ingreso, Cuenta cuenta) {
        double operacion = (int) cuenta.getSaldo() + ingreso;
        cuenta.setSaldo((int) operacion);

    }

    public void retirarDinero(double retiro, Cuenta cuenta) {
        double operacion = (int) cuenta.getSaldo() - retiro;

        if (retiro <= cuenta.getSaldo()) {
            cuenta.setSaldo((int) operacion);
        } else {
            cuenta.setSaldo(0);
        }
    }

    public void extraccionRapida(int monto, Cuenta cuenta) {
        double limite = cuenta.getSaldo() * 0.2;

        double operacion = (int) cuenta.getSaldo() - monto;

        if (limite <= cuenta.getSaldo()) {
            cuenta.setSaldo((int) operacion);
        } else {
            System.out.println("No puedes extraer ese monto xq supera el limite que es " + limite);
        }
    }

    public int consultarSaldo(Cuenta cuenta) {
        return cuenta.getSaldo();
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDni());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
