package Servicios;

import Entidades.Vehiculo;

/**
 *
 * @author el_ni
 */
public class Servicios {
    
    public Double moverse(Vehiculo vehiculo){
        String tipo = vehiculo.getTipo();
        
        Double metrosPorSegundo = 0.0;
        
        if (tipo.equalsIgnoreCase("auto")) {
            metrosPorSegundo += 3;
        } else if(tipo.equalsIgnoreCase("moto")) {
            metrosPorSegundo += 2;
        }else {
            metrosPorSegundo += 1;
        }
        
        return(metrosPorSegundo);
    }
    
    public Double frenar(Vehiculo vehiculo){
        String tipo = vehiculo.getTipo();

        Double metrosAvanzados = 0.0;

        if (tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("moto")) {
            metrosAvanzados += 2;
        } else {
            metrosAvanzados += 0;

        }

        return (metrosAvanzados);

    }

}
