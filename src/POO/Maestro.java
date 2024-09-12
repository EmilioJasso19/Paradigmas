package POO;

import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    //Atributos
    private int numPersonal;
    private String especialidad;


    //Constructor
    public Maestro(String nombre,String correo, String telefono, int numPersonal, String especialidad) {
        super(nombre, correo, telefono);
        this.numPersonal = numPersonal;
        this.especialidad = especialidad;
    }

    //Getters y Setters
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

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriasDisponible(Date fecha, String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
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


        TutoriasDisponibles(Date fecha, String hora) {
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

        @Override
        public String toString() {
            return "Fecha: " + fecha + ", Hora: " + hora + "\n";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de personal: " + this.getNumPersonal() +
                "\nLos cursos disponibles son:\n" + tutoriasDisponibles.toString() + "\n";
    }
}