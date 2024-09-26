package POO;

import POO.UI.UIEstudiante;
import POO.UI.UIMaestro;
import POO.model.Estudiante;
import POO.model.Maestro;
import POO.model.Secretaria;

import static POO.UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Maestro maestro1 = new Maestro("Luis Morales", "luismorales04@uv.mx", 57522);
        maestro1.addTutoriasDisponible("10/10/2024", "13:00");

        Maestro maestro2 = new Maestro("Mag Mercado", "mamercado@uv.mx", 57531);
        maestro2.addTutoriasDisponible("10/10/2024", "15:00");
        maestro2.addTutoriasDisponible("16/10/2024", "11:00");

        Maestro maestro3 = new Maestro("Javier Pino", "jpino@uv.mx", 57523);
//        maestro2.addTutoriasDisponible("08/10/2024", "11:00");
//        maestro2.addTutoriasDisponible("09/10/2024", "11:00");

        maestros.add(maestro1);
        maestros.add(maestro2);
//        maestros.add(maestro3);
        UIMaestro.maestrosConTutorias.add(maestro1);
        UIMaestro.maestrosConTutorias.add(maestro2);
//        UIMaestro.maestrosConTutorias.add(maestro3);

        estudiantes.add(new Estudiante("Emilio", "jasso@estudiantes.uv.mx", "S22017027","5"));
        estudiantes.add(new Estudiante("Henry", "fco@estudiantes.uv.mx", "S220170009","5"));

        /*secretarias.add(new Secretaria("Lupita", "lupe@secres.uv", "Lis","vespertino"));
        secretarias.add(new Secretaria("Maricarmen", "mmen@secres.uv", "Admin","matutino"));*/
        mostrarMenu();
//        UIEstudiante.agendarTutoria();
    }
}