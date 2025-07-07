package clases;

public class Profesor extends Persona {
    private String IDprofesor;
    private String Especialidad;
    private String Tipocontrato;

    public Profesor(String IDprofesor, String Especialidad, String Tipocontrato, String Nombres, String Apellidos, String Email, String Telefono) {
        super(Nombres, Apellidos, Email, Telefono);
        this.IDprofesor = IDprofesor;
        this.Especialidad = Especialidad;
        this.Tipocontrato = Tipocontrato;
    }

    public String getIDprofesor() {
        return IDprofesor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public String getTipocontrato() {
        return Tipocontrato;
    }

    public void setIDprofesor(String IDprofesor) {
        this.IDprofesor = IDprofesor;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public void setTipocontrato(String Tipocontrato) {
        this.Tipocontrato = Tipocontrato;
    }

    @Override
    public String toString() {
        return "profesor{" + "IDprofesor=" + IDprofesor + ", Especialidad=" + Especialidad + ", Tipocontrato=" + Tipocontrato + '}';
    }
    
    
}
