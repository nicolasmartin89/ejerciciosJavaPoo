package ejercicioextra01;


public class EjercicioExtra01 {

 
    public static void main(String[] args) {

        Cancion primeraCancion = new Cancion();
        primeraCancion.setAutor("Alicia Keys");
        primeraCancion.setTitutlo("If ain't got you");

        Cancion segundaCancion = new Cancion("Metallica", "Enter Sandman");

        System.out.println(primeraCancion.toString());
        System.out.println(segundaCancion.toString());

    }

}
