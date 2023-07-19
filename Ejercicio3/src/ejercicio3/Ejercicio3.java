package ejercicio3;


public class Ejercicio3 {


    public static void main(String[] args) {
        // TODO code application logic here
        Servicios serv = new Servicios();
        Operacion op = new Operacion();
        serv.crearOperacion(op);

        serv.sumar(op);
        serv.restar(op);
        serv.multiplicar(op);
        serv.dividir(op);


//        System.out.println(op.toString());
    }
    
}
