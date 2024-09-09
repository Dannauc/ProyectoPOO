public class Empleado {
    private int empleadoID;
    private String nombre;
    private String puesto;

    public Empleado(int empleadoID, String nombre, String puesto) {
        this.empleadoID = empleadoID;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void gestionarInventario(Libro libro) {
        System.out.println("Gestionando inventario para: " + libro);
    }

    public void gestionarVentas(Venta venta) {
        System.out.println("Gestionando venta con total: " + venta.getTotal());
    }
}
