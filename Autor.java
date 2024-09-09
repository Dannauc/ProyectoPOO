public class Autor {
    private int autorID;
    private String nombre;
    private String nacionalidad;
    private String biografia;

    public Autor(int autorID, String nombre, String nacionalidad, String biografia) {
        this.autorID = autorID;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    public void agregarAutor() {
        System.out.println("Autor agregado: " + nombre);
    }

    public void modificarAutor(String nuevoNombre, String nuevaBiografia) {
        this.nombre = nuevoNombre;
        this.biografia = nuevaBiografia;
        System.out.println("Autor modificado: " + nombre);
    }

    public void eliminarAutor() {
        System.out.println("Autor eliminado: " + nombre);
    }
}
