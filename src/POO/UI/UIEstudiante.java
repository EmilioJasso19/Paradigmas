package POO.UI;

import POO.model.CitaMaestro;
import POO.model.CitaTutoria;
import POO.model.Estudiante;
import POO.model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;

public class UIEstudiante {

    public final static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void estudianteMenu() {
        int respuesta;

        do {
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1. Agendar tutoría");
            System.out.println("2. Mis tutorías");
            System.out.println("0. Cancelar");

            Scanner in = new Scanner(System.in);
            respuesta = Integer.parseInt(in.nextLine());
            switch (respuesta) {
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarMisTutorias();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor selecciona una opcion valida");
            }
        } while (respuesta != 0);
    }

    public static void agendarTutoria() {
        System.out.println("..:: Agendar Tutoria ::..");
        int respuestaConfirmacion = 0;

        do {
            System.out.println("Seleccione un maestro: ");

            for (Maestro maestro : UIMaestro.maestrosConTutorias) {
                int i = UIMaestro.maestrosConTutorias.indexOf(maestro) + 1;
                System.out.println(i + ". " + maestro.getNombre());
            }

            Scanner sc = new Scanner(System.in);
            int respuestaMaestro = sc.nextInt();
            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(respuestaMaestro - 1);

            System.out.println("Seleccione una tutoria: ");
            System.out.println(maestroSeleccionado.getNombre());

            for (Maestro.TutoriasDisponibles td : maestroSeleccionado.getTutoriasDisponibles()) {
                System.out.println((maestroSeleccionado.getTutoriasDisponibles().indexOf(td) + 1) + ". " + td.getFecha() + " - " + td.getHora());
            }
            int tutoriaSeleccionada = sc.nextInt();

            System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoria: "
                    + maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionada - 1));
            do {
                System.out.println("""
                        1. Para continuar
                        2. Cambiar tutoria""");

                respuestaConfirmacion = sc.nextInt();
            } while (respuestaConfirmacion < 1 || respuestaConfirmacion > 2);

            if (respuestaConfirmacion == 1) {
                Maestro.TutoriasDisponibles ts = maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionada - 1);
                UIMenu.estudianteLogueado.addTutoriaMaestro(maestroSeleccionado, ts.getDate(), ts.getHora());
            }

        } while (respuestaConfirmacion != 1);

    }

    private static void listarMisTutorias() {
        System.out.println("..:: Mis tutorías ::..");

        ArrayList<CitaMaestro> misTutorias = UIMenu.estudianteLogueado.getTutoriasAgendadas();

        if (!misTutorias.isEmpty()) {
            for (CitaMaestro citaMaestro : misTutorias) {
                System.out.println(misTutorias.indexOf(citaMaestro) + 1 + ". "
                        + citaMaestro.getMaestro().getNombre() + ": " + citaMaestro.getFecha() + " - " + citaMaestro.getHora());
            }
        } else {
            System.out.println("No hay tutorias agendadas :/");
        }
    }

}
