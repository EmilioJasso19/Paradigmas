package POO.model;

import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    //Atributos
    private int numPersonal;

    //Constructor
    public Maestro(String nombre,String correo, int numPersonal) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }

    //Getters y Setters
    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
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
            System.out.println("Hora: " + curso.getHora() + "\nFecha: " + curso.getFecha());
        }
    }

    public static class TutoriasDisponibles extends CitaTutoria {
        public TutoriasDisponibles(Date fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de personal: " + this.getNumPersonal() +
                "\nLos cursos disponibles son:\n" + tutoriasDisponibles.toString() + "\n";
    }
}