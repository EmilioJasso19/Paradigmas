package POO.UI;

import java.util.Scanner;

public class UIMenu {

    public final static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void mostrarMenu() {
        System.out.println("..:: Bienvenido ::..");
        System.out.println("Selecciona una opción");
        System.out.println("1. Maestros");
        System.out.println("2. Estudiantes");
        System.out.println("0. Salir");

        Scanner in = new Scanner(System.in);

        int respuesta;
        do {
            respuesta = Integer.parseInt(in.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("..:: Maestros ::..");
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta válida");
            }
        } while (respuesta != 0);
    }

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
                    System.out.println("..:: Agendar tutoría ::..");
                    System.out.println("Selecciona una opcion");
                    for (int i = 1; i < MESES.length; i++) {
                        System.out.println(i + ". " + MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("..:: Mis tutorías ::..");
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor selecciona una opcion valida");
            }
        } while (respuesta != 0);
    }

}
