package ejerciciocooperativo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServiciosCliente {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private int id = 0;
    private List<Cliente> listaClientes = new ArrayList<>();

    public class listadoPorNombre implements Comparator<Cliente> {

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }

    }

    public void listaLlena() {
        // Crear 5 clientes predefinidos
        Cliente cliente1 = new Cliente(1, "Juan", 30, 170, 70, "Perder peso");
        Cliente cliente2 = new Cliente(2, "María", 25, 165, 60, "Mantener forma física");
        Cliente cliente3 = new Cliente(3, "Carlos", 40, 180, 80, "Ganar masa muscular");
        Cliente cliente4 = new Cliente(4, "Ana", 28, 160, 55, "Tonificar el cuerpo");
        Cliente cliente5 = new Cliente(5, "Luis", 35, 175, 75, "Mejorar resistencia");

        // Obtener el último ID utilizado
        id = Math.max(cliente1.getId(), Math.max(cliente2.getId(), Math.max(cliente3.getId(), Math.max(cliente4.getId(), cliente5.getId()))));

        // Agregar los clientes a la lista
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        
        id=5;

    }

    public void registrarCliente(String nombre, int edad, double altura, double peso, String objetivo) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        id++;
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);

        listaClientes.add(cliente);

    }

    public void obtenerClientes() {
   
        System.out.println("Lista Desordenada");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
        System.out.println("Lista ORDENADA por Nombre");
        
        listaClientes.sort(new listadoPorNombre());
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }
    public boolean verificarIdCliente(int id){
        boolean verificado = false;
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getId() == id) {
                verificado = true;
                break;
            }
        }
        if(!verificado){
            System.out.println("No se encontro el cliente con el id " + id);
        }
        return verificado;
    }
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
          for (Cliente clienteActual : listaClientes) {
                clienteActual.setId(id);
                clienteActual.setNombre(nombre);
                clienteActual.setEdad(edad);
                clienteActual.setAltura(altura);
                clienteActual.setPeso(peso);
                clienteActual.setObjetivo(objetivo);
                break; // Terminar el bucle una vez encontrado el cliente
            
    }
    }
    public void eliminarCliente(int id) {
        boolean eliminado = false;
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getId() == id) {
                listaClientes.remove(clienteActual);
                eliminado = true;
                break; // Terminar el bucle una vez eliminado el cliente
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró el id del cliente.");
        }
    }
}
