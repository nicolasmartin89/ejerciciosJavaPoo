//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:

//a) Método constructor que inicialice el radio pasado como parámetro.

//b) Métodos get y set para el atributo radio de la clase Circunferencia.

//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).


package ejercicio2;

import Entidades.Circunferencia;
import Servicios.ServiciosCircunferencia;


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Servicios
        ServiciosCircunferencia serv = new ServiciosCircunferencia();

        
        //Circunferencias creadas de forma distinta
        Circunferencia circunfUno = new Circunferencia();
        circunfUno.setRadio(200);
//
//        Circunferencia circunfDos = new Circunferencia(500);
//
//        Circunferencia circunfTres = serv.crearCircunferencia();

       
        System.out.println(circunfUno.getRadio());
        serv.determinarArea(circunfUno);
        serv.determinarPerimetro(circunfUno);
        
//        System.out.println(circunfDos.getRadio());
//
//        System.out.println(circunfTres.getRadio());

    }
    
}
