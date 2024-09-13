package POO.UI;

import POO.model.Estudiante;
import POO.model.Maestro;
import POO.model.Secretaria;
import static POO.UI.UIEstudiante.estudianteMenu;
import static POO.UI.UIMaestro.maestroMenu;
import static POO.UI.UISecretaria.secretariaMenu;
import java.util.ArrayList;
import java.util.Scanner;


public class UIMenu {

    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();

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
                    loginUsuario(1);
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 3:
                    secretariaMenu();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta válida");
            }
        } while (respuesta != 0);
    }

    public static void loginUsuario(int tipoUsuario) {

        // Maestro 1
        // Estudiante 2
        // Secretaria 3

        System.out.println("Ingresa tu correo");
        Scanner sc = new Scanner(System.in);
        String correo = sc.nextLine();


        if (tipoUsuario == 1) {
            for (Maestro maestro : maestros) {
                if (maestro.getCorreo().equals(correo)) {
                    // Maestro con acceso
                    System.out.println("Hola " + maestro.getNombre());
                    maestroMenu();
                }
            }
        }
    }

}
