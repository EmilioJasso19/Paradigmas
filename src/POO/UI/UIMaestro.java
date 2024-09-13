package POO.UI;

import java.util.Scanner;

import static POO.UI.UIMenu.mostrarMenu;

public class UIMaestro {
    public static void maestroMenu() {


        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("..:: Maestro ::..");
            System.out.println("Seleccione una opción");
            System.out.println("1. Agregar curso");
            System.out.println("2. Listar mis cursos");
            System.out.println("3. Salir");

            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("Ingrese un nombre del curso");
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
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
}
