
package Ejercicio14;


public class Movil {
    private String marca, modelo;
    private int memoria_ram, almacenamiento;
    private double precio;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, int memoria_ram, int almacenamiento, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria_ram = memoria_ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
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

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", memoria_ram=" + memoria_ram + ", almacenamiento=" + almacenamiento + ", precio=" + precio + ", codigo=" + codigo + '}';
    }
    
    
}
