package POO;

import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {

    // Atributos

    private int numPersonal;
    private String especialidad;

    // Constructor


    // Getters & Setters
    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Comportamientos - Métodos
    public void mostrarID() {
        System.out.println("ID: " + numPersonal);
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addCursoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public void showCursoDisponible() {
        for(TutoriasDisponibles curso: tutoriasDisponibles) {
            System.out.println("Hora: " + curso.hora + "\nFecha: " + curso.fecha);
        }
    }

    public static class TutoriasDisponibles {
        private int id;
        private Date fecha;
        private String hora;

        public TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }

}
