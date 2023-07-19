package Ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        Servicios serv = new Servicios();
        Movil movil = serv.cargarCelular();
        System.out.println(movil.toString());
        serv.mostrarCod(movil);
    }
    
}
