package POO.UI;

import java.util.Scanner;

import static POO.UI.UIMenu.maestroLogueado;
import static POO.UI.UIMenu.mostrarMenu;

public class UIMaestro {
    public static void maestroMenu() {


        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("..:: Maestro - " + maestroLogueado.getNombre() + " ::..");
            System.out.println("Seleccione una opción");
            System.out.println("1. Agregar curso");
            System.out.println("2. Listar mis cursos");
            System.out.println("3. Salir");

            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    agregarTutoria();
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
                    listarCursos();
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (respuesta != 3);
    }

    public static void agregarTutoria() {
        System.out.println("Agregar Tutoria");
        System.out.println("Ingrese la fecha del curso: [dd/mm/yyyy]");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("Ingrese la hora del curso: [00:00]");
        String hora = sc.nextLine();
    }

    public static void listarCursos() {}
}
