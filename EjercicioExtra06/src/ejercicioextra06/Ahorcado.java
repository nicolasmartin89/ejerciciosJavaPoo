package ejercicioextra06;

public class Ahorcado {

    private char[] palabra;
    private char[] palabraOculta;
    private int encontradas;
    private int jugadasMaximas;
    private int intentosFallidos;


    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, char[] palabraOculta, int encontradas, int jugadasMaximas, int intentosFallidos) {
        this.palabra = palabra;
        this.palabraOculta = palabraOculta;
        this.encontradas = encontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.intentosFallidos = intentosFallidos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(char[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }
    
    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
}

