package POO;

public class Estudiante {

    private String matricula;
    private String telefono;
    private String semestre;

    public Estudiante(String matricula, String telefono, String semestre) {
        this.matricula = matricula;
        this.telefono = telefono;
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
