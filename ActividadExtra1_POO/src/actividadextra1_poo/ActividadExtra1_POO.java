package actividadextra1_poo;

import Entidades.Vehiculo;
import Servicios.Servicios;
import java.util.Scanner;


public class ActividadExtra1_POO {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Servicios serv = new Servicios();
        
        Vehiculo miAuto = new Vehiculo();
       
        Vehiculo [] misVehiculos = new Vehiculo [3];
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos del vehículo " + i);
            System.out.println("Marca: ");
            String marca = leer.next();
            System.out.println("Modelo: ");
            String modelo = leer.next();
            System.out.println("Año: ");
            int anio = leer.nextInt();
            System.out.println("Tipo: ");
            String tipo = leer.next();
            
            misVehiculos[i] = new Vehiculo(marca, modelo, anio, tipo);

        }
        
        
        
        
        miAuto.setAño(2022);
        miAuto.setMarca("Ford");
        miAuto.setModelo("Focus");
        miAuto.setTipo("auto");
        
        Vehiculo miMoto = new Vehiculo();
        miMoto.setAño(1989);
        miMoto.setMarca("Honda");
        miMoto.setModelo("XR");
        miMoto.setTipo("moto");
        
        Vehiculo miBici = new Vehiculo();
        miBici.setAño(2023);
        miBici.setMarca("Venzo");
        miBici.setModelo("chiquito");
        miBici.setTipo("bici");
        
        System.out.println("El vehiculo se mueve durante 5 segundos ");
        double distanciaVehiculo1 = (serv.moverse(miAuto)*5 + serv.frenar(miAuto));
        System.out.println("El " + miAuto.getTipo() + " recorrió " + distanciaVehiculo1 + " metros.");
        
        System.out.println("El vehiculo se mueve durante 5 segundos ");
        double distanciaVehiculo2 = (serv.moverse(miMoto)*5 + serv.frenar(miMoto));
        System.out.println("El " + miMoto.getTipo() + " recorrió " + distanciaVehiculo2 + " metros.");
        
        System.out.println("El vehiculo se mueve durante 5 segundos ");
        double distanciaVehiculo3 = (serv.moverse(miBici)*5 + serv.frenar(miBici));
        System.out.println("El " + miBici.getTipo() + " recorrió " + distanciaVehiculo3 + " metros.");
        
       
        
        System.out.println(miAuto.toString());
        
        
        
        
        
        
    }
    
}
