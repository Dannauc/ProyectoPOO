public class Autor extends Persona {
    private int autorID;
    private String nacionalidad;
    private String biografia;

    public Autor(int autorID, String nombre, String nacionalidad, String biografia) {
        super(nombre, null); // No usamos email para Autor
        this.autorID = autorID;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    public void agregarAutor() {
        System.out.println("Autor agregado: " + nombre);
    }

    public void modificarAutor(String nuevoNombre, String nuevaBiografia) {
        setNombre(nuevoNombre);
        this.biografia = nuevaBiografia;
        System.out.println("Autor modificado: " + nombre);
    }

    public void eliminarAutor() {
        System.out.println("Autor eliminado: " + nombre);
    }

    // Getters y Setters
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
