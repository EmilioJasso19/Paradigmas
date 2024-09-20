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
    public static Maestro maestroLogueado;
    public static Estudiante estudianteLogueado;
    public static Secretaria secretariaLogueada;

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
                case 2:
                case 3:
                    loginUsuario(respuesta);
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

        boolean bandera = true;
        do {
            System.out.println("Ingresa tu correo");
            Scanner sc = new Scanner(System.in);
            String correo = sc.nextLine();


            if (tipoUsuario == 1) {
                for (Maestro maestro : maestros) {
                    if (maestro.getCorreo().equals(correo)) {
                        // Maestro con acceso
                        bandera = false;
                        maestroLogueado = maestro;
                        maestroMenu();
                    }
                }
            }
            if (tipoUsuario == 2) {
                for (Estudiante estudiante : estudiantes) {
                    if (estudiante.getCorreo().equals(correo)) {
                        bandera = false;
                        System.out.println("Hola - " + estudiante.getNombre());
                        estudianteLogueado = estudiante;
                        estudianteMenu();
                    }
                }
            }
            if (tipoUsuario == 3) {
                for (Secretaria secretaria : secretarias) {
                    if (secretaria.getCorreo().equals(correo)) {
                        bandera = false;
                        System.out.println("Hola - " + secretaria.getNombre());
                        secretariaLogueada = secretaria;
                        secretariaMenu();
                    }
                }
            }
        } while (bandera);
    }

}
