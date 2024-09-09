import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor(1, "Gabriel García Márquez", "Colombiana", "Escritor famoso.");
        Categoria categoria1 = new Categoria(1, "Novela");
        Libro libro1 = new Libro("123456", "Cien años de soledad", 1967/05, 80000, 10, Arrays.asList(autor1),
                categoria1);

        libro1.agregarLibro();
        libro1.modificarLibro("Cien años de soledad (Edición Especial)", 90000, 15);

        Venta venta1 = new Venta(1, new Date(), Arrays.asList(libro1));
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "juan.perez@example.com");
        cliente1.agregarCompra(venta1);

        Empleado empleado1 = new Empleado(1, "Carlos López", "Vendedor");
        empleado1.gestionarVentas(venta1);
    }
}
