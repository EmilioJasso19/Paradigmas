package POO.UI;

import POO.model.CitaTutoria;
import POO.model.Maestro;

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

    private static void agendarTutoria() {
        System.out.println("..:: Agendar Tutoria ::..");

        // 1. Maestro 1
        //  1. Tutoria 1
        //  2. Tutoria 2
        // 2. Maestro 2
        //  1. Tutoria 1
        for (Maestro maestro : UIMenu.maestros) {

        }
    }

    private static void listarMisTutorias() {
        System.out.println("..:: Mis tutorías ::..");
    }

}
