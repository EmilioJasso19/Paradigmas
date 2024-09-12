package POO;

public class Usuario {
    private String nombre;
    private String correo;
    private String telefono;

    public Usuario(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", correo: " + correo;
    }
}