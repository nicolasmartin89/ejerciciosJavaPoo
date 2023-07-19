package ejercicio8;

public class Servicios {

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        String cadenaMinuscula = cadena.getFrase().toLowerCase();

        for (int i = 0; i < cadenaMinuscula.length(); i++) {
            char letra = cadenaMinuscula.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador ++;
            }
        }
        System.out.println("Cantidad de vocales encontradas en la frase: " + contador);
    }
    
    public void invertirFrase(Cadena cadena){
        StringBuilder fraseInvertida = new StringBuilder(cadena.getFrase());

        fraseInvertida.reverse();
        
        System.out.println("La frase invertida queda de la siguiente manera: " + fraseInvertida);
       
    }

    public void vecesRepetido(Cadena cadena, char letra) {
        String frase = cadena.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letraRecorrida = frase.charAt(i);
            if (letra == letraRecorrida) {
                contador++;
            }
        }
        System.out.println("La letra ingresada es: " + letra);
        System.out.println("La cantidad de veces que se repite la letra ingresada en la frase es: " + contador + " veces.");
    }
    
    public void compararLongitud(Cadena cadena, String fraseNueva){
        String frase = cadena.getFrase();
        if (frase.length() == fraseNueva.length()) {
            System.out.println("La longitud de las frases son iguales");
        }else if(frase.length() > fraseNueva.length()){
            System.out.println("La frase original es mas larga");
        }else{
            System.out.println("La frase nueva es mas larga");
        }
    }

    public void unirFrases(Cadena cadena, String fraseNueva) {
        String frase = cadena.getFrase();
        String fraseUnida = frase.concat(fraseNueva);
        System.out.println("La frase unida queda asi: " + fraseUnida);
    }
    
    public void reemplazarLetra(Cadena cadena, char letra) {
        String frase = cadena.getFrase();
        
        String fraseRemplazada = frase.replace(letra, '%');
        
        System.out.println("La frase con la letra remplazada queda asi: " + fraseRemplazada);  
    }

    public void contiene(Cadena cadena, String letra) {
        String frase = cadena.getFrase();
        if (frase.contains(letra)) {
            System.out.println("La frase contiene la letra indicada");
        }else{
            System.out.println("La frase NO contiene la letra");
        }
    }
}
