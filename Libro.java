import java.util.Date;
import java.util.List;

public class Libro {
    private String ISBN;
    private String titulo;
    private Date añoPublicacion;
    private double precio;
    private int stock;
    private List<Autor> autores;
    private Categoria categoria;

    public Libro(String ISBN, String titulo, Date añoPublicacion, double precio, int stock, List<Autor> autores, Categoria categoria) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
        this.categoria = categoria;
    }

    public void agregarLibro() {
        System.out.println("Libro agregado: " + titulo);
    }

    public void modificarLibro(String nuevoTitulo, double nuevoPrecio, int nuevoStock) {
        this.titulo = nuevoTitulo;
        this.precio = nuevoPrecio;
        this.stock = nuevoStock;
        System.out.println("Libro modificado: " + titulo);
    }

    public void eliminarLibro() {
        System.out.println("Libro eliminado: " + titulo);
    }

    public void buscarLibro(String ISBN) {
        if (this.ISBN.equals(ISBN)) {
            System.out.println("Libro encontrado: " + titulo);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public double getPrecio() {
        return precio;
    }
}
