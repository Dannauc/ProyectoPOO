public class Empleado extends Persona {
    private int empleadoID;
    private String puesto;

    public Empleado(int empleadoID, String nombre, String email, String puesto) {
        super(nombre, email);
        this.empleadoID = empleadoID;
        this.puesto = puesto;
    }

    public void gestionarInventario(Libro libro) {
        System.out.println("Gestionando inventario para: " + libro);
    }

    public void gestionarVentas(Venta venta) {
        System.out.println("Gestionando venta con total: " + venta.getTotal());
    }

    // Getters y Setters para el puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
