import java.util.Date;
import java.util.List;

public class Venta {
    private int ventaID;
    private Date fecha;
    private double total;
    private List<Libro> librosVendidos;

    public Venta(int ventaID, Date fecha, List<Libro> librosVendidos) {
        this.ventaID = ventaID;
        this.fecha = fecha;
        this.librosVendidos = librosVendidos;
        this.total = calcularTotal();
    }

    public void registrarVenta() {
        System.out.println("Venta registrada el: " + fecha);
    }

    public double calcularTotal() {
        double sumaTotal = 0;
        for (Libro libro : librosVendidos) {
            sumaTotal += libro.getPrecio();
        }
        return sumaTotal;
    }

    public double getTotal() {
        return total;
    }
}
