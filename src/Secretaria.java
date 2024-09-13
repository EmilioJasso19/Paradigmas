import POO.Usuario;

public class Secretaria extends Usuario {
    private String area;
    private String turno;

    public Secretaria(String nombre, String correo, String telefono, String area, String turno) {
        super(nombre, correo, telefono);
        this.area = area;
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public String getTurno() {
        return turno;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + this.turno;
    }
}
