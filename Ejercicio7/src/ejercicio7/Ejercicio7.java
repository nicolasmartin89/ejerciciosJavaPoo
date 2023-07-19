package ejercicio7;

import ejercicio7.Entidades.Persona;
import ejercicio7.Servicios.Servicios;




public class Ejercicio7 {


    public static void main(String[] args) {
        Servicios serv = new Servicios();
        
        Persona [] personas = new Persona[4];
        int [] pesoPersona = new int[4];
        boolean [] esMayorPersona = new boolean[4];

        
        for (int i = 0; i < 4; i++) {
            personas [i] = serv.crearPersona();
            pesoPersona [i] = serv.calcularIMC(personas[i]);
            esMayorPersona [i] = serv.esMayorDeEdad(personas[i]);
            
        }
        double pesoPorDebajo = 0.0;
        double pesoIdeal = 0.0;
        double pesoSobrepeso = 0.0;
        
        
        for (int i = 0; i < 4; i++) {
            switch (pesoPersona[i]) {
                case -1:
                    pesoPorDebajo ++;
                    break;
                case 0:
                    pesoIdeal ++;
                    break;
                default:
                    pesoSobrepeso ++;
                    break;
            }
        }
        System.out.println(pesoPorDebajo);
        System.out.println(pesoIdeal);
        System.out.println(pesoSobrepeso);

        double mayor = 0.0;
        double menor = 0.0;
        
        for (int i = 0; i < 4; i++) {
           if(esMayorPersona [i]){
               mayor ++;
           }else{
               menor ++;
           }
        }
        
        double porcentajeDeMayores = (mayor / 4) * 100;
        double porcentajeDeMenores = (menor / 4) * 100;
        double porcentajePesoBajo = (pesoPorDebajo / 4) * 100;
        double porcentajePesoIdeal = (pesoIdeal / 4) * 100;
        double porcentajeSobrepeso = (pesoSobrepeso / 4) * 100;

        System.out.println("Porcentaje de personas mayores de edad "+ porcentajeDeMayores);
        System.out.println("Porcentaje de personas menores de edad " + porcentajeDeMenores);
        System.out.println("Porcentaje de personas flaquitos " + porcentajePesoBajo);
        System.out.println("Porcentaje de personas joya " + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas gorditos " + porcentajeSobrepeso);
        
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println(personas[i].toString());
        }



    }
    
}
