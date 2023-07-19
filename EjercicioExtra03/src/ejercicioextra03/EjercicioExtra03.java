package ejercicioextra03;

public class EjercicioExtra03 {

    public static void main(String[] args) {
        Servicios serv = new Servicios();
        Raices raices = serv.crearEcuacion();

        System.out.println(raices.toString());

        System.out.println(serv.getDiscriminante(raices));

//        System.out.println(serv.tieneRaices(raices));
//
//        System.out.println(serv.tieneRaiz(raices));
//
//        serv.obtenerRaices(raices);
//        
//        serv.obtenerRaiz(raices);

        serv.calcular(raices);
    }

}
