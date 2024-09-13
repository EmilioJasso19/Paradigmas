package POO.model;

import java.util.Date;

public class CitaTutoria {
    private int id;
    private Date fecha;
    private String hora;


    CitaTutoria(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + "\n";
    }
}
