package POO.model;

import java.util.ArrayList;
import java.util.Date;

public class Secretaria extends Usuario {
    private String area;
    private String turno;

    public Secretaria(String nombre, String correo, String area, String turno) {
        super(nombre, correo);
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

    ArrayList<Secretaria.TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriasDisponible(String fecha, String hora){
        tutoriasDisponibles.add(new Secretaria.TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<Secretaria.TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public void showCursoDisponible() {
        for(Secretaria.TutoriasDisponibles curso: tutoriasDisponibles) {
            System.out.println("Hora: " + curso.getHora() + "\nFecha: " + curso.getFecha());
        }
    }

    public static class TutoriasDisponibles extends CitaTutoria {
        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + this.turno;
    }
}
