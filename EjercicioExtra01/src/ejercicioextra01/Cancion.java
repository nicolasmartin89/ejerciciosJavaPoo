package ejercicioextra01;

public class Cancion {
    private String titutlo;
    private String autor;

    public Cancion() {
        this.titutlo = "";
        this.autor = "";
    }

    public Cancion(String titutlo, String autor) {
        this.titutlo = titutlo;
        this.autor = autor;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titutlo=" + titutlo + ", autor=" + autor + '}';
    }
    
    
    
}
