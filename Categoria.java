public class Categoria {
    private int categoriaID;
    private String nombre;

    public Categoria(int categoriaID, String nombre) {
        this.categoriaID = categoriaID;
        this.nombre = nombre;
    }

    public void agregarCategoria() {
        System.out.println("Categoría agregada: " + nombre);
    }

    public void modificarCategoria(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Categoría modificada: " + nombre);
    }

    public void eliminarCategoria() {
        System.out.println("Categoría eliminada: " + nombre);
    }
}
