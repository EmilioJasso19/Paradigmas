package POO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Maestro morales = new Maestro("Morales", "luismorales04@uv.mx", "9211274568", 57522, "PHP");
        morales.addTutoriasDisponible(new Date(), "16:00");
        morales.addTutoriasDisponible(new Date(), "12:00");
        morales.addTutoriasDisponible(new Date(), "08:00");
        System.out.println(morales);
    }
}