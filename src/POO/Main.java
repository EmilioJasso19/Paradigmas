package POO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        mostrarMenu();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Maestro maestro = new Maestro("Morales");

        maestro.addCursoDisponible(new Date(), "12:00");
        maestro.addCursoDisponible(new Date(), "14:00");
        maestro.addCursoDisponible(new Date(), "16:00");
        Maestro maestro2 = new Maestro("Morales");

        maestro2.addCursoDisponible(new Date(), "10:00");
        maestro2.addCursoDisponible(new Date(), "13:00");
        maestro2.addCursoDisponible(new Date(), "15:00");

        System.out.println("..::Maestro 1::..");
        System.out.println("Cursos disponibles");
        System.out.println(maestro.getNumPersonal() + ". " + maestro.getNombre()) ;
        maestro.showCursoDisponible();
        System.out.println("..::Maestro 2::..");
        System.out.println("Cursos disponibles");
        System.out.println(maestro.getNumPersonal() + ". " + maestro.getNombre()) ;
        maestro2.showCursoDisponible();
    }
}