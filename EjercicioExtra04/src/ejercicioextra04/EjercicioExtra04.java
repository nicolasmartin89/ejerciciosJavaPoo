package ejercicioextra04;


public class EjercicioExtra04 {


    public static void main(String[] args) {
        Servicios serv = new Servicios();
        
        Nif miDocumento = serv.crearNif();
        serv.mostrar(miDocumento);

    }
    
}
