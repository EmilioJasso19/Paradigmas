package POO.UI;

import POO.model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;

import static POO.UI.UIMenu.maestroLogueado;
import static POO.UI.UIMenu.mostrarMenu;

public class UIMaestro {
    public static ArrayList<Maestro> maestrosConTutorias = new ArrayList<>();

    public static void maestroMenu() {


        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("..:: Maestro - " + maestroLogueado.getNombre() + " ::..");
            System.out.println("Seleccione una opción");
            System.out.println("1. Agregar tutoría");
            System.out.println("2. Listar mis tutorías");
            System.out.println("3. Salir");

            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    agregarTutoria();
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
                    listarTutoria();
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
        boolean banderaExterna = true;
        do {
            System.out.println("Ingrese la fecha del curso: [dd/mm/yyyy]");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingrese la hora de la tutoria: [00:00]");
            String hora = sc.nextLine();
            boolean banderaInterna = true;

            do {
                System.out.println("La tutoria es: " + fecha + " " + hora);

                System.out.println("""
                1. Para agregar Tutoria
                2. Cambiar Tutoria""");

                int opcion = Integer.parseInt(sc.nextLine());
                if (opcion == 2) {
                    banderaInterna = false;
                } else if (opcion == 1) {
                    banderaInterna = false;
                    banderaExterna = false;
                    // Agregar tutoria
                    maestroLogueado.addTutoriasDisponible(fecha, hora);
                    consultarMaestroConTutoria(maestroLogueado);
                } else {
                    System.out.println("Opcion no valida");
                }
            } while (banderaInterna);
        } while (banderaExterna);
    }

    private static void consultarMaestroConTutoria(Maestro maestroLogueado) {
        if (!maestrosConTutorias.contains(maestroLogueado)) {
            maestrosConTutorias.add(maestroLogueado);
        }
    }

    public static void listarTutoria() {
        System.out.println("Listar Tutorias");

        // TODO: showTutoriasDisponibles
        if (!maestroLogueado.getTutoriasDisponibles().isEmpty()) {
            for (int i = 0; i < maestroLogueado.getTutoriasDisponibles().size(); i++) {
                System.out.println((i + 1) + ". " +
                        maestroLogueado.getTutoriasDisponibles().get(i).getFecha() + " - "
                        + maestroLogueado.getTutoriasDisponibles().get(i).getHora() + "\n");
            }
        } else {
            System.out.println("No hay tutorias disponibles");
        }
    }
}
