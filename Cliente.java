import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int clienteID;
    private String nombre;
    private String email;
    private List<Venta> historialCompras;

    public Cliente(int clienteID, String nombre, String email) {
        this.clienteID = clienteID;
        this.nombre = nombre;
        this.email = email;
        this.historialCompras = new ArrayList<>();
    }

    public void agregarCliente() {
        System.out.println("Cliente agregado: " + nombre);
    }

    public void modificarCliente(String nuevoNombre, String nuevoEmail) {
        this.nombre = nuevoNombre;
        this.email = nuevoEmail;
        System.out.println("Cliente modificado: " + nombre);
    }

    public void eliminarCliente() {
        System.out.println("Cliente eliminado: " + nombre);
    }

    public void agregarCompra(Venta venta) {
        historialCompras.add(venta);
        System.out.println("Compra agregada al historial de: " + nombre);
    }
}
