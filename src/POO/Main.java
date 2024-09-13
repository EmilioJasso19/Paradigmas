package POO;

import POO.model.Estudiante;
import POO.model.Maestro;

import static POO.UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        maestros.add(new Maestro("Luis Morales", "luismorales04@uv.mx", 57522));
        maestros.add(new Maestro("Mag Mercado", "mamercado@uv.mx", 15200));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx", 10258));
        maestros.add(new Maestro("Paty Martinez", "pmartinez@uv.mx", 12033));

        estudiantes.add(new Estudiante("Emilio", "zs22017027@estudiantes.uv.mx", "S22017027","5"));
        mostrarMenu();
    }
}