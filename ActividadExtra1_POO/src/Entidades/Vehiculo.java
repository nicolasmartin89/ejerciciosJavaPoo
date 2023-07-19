package Entidades;

/**
 *
 * @author el_ni
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private String tipo; // automóvil, una motocicleta, o una bicicleta

    
    public Vehiculo(){
    }
    
    public Vehiculo(String marca, String modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", tipo=" + tipo + '}';
    }

  
   
    
}
