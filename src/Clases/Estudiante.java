package Clases;

public class Estudiante extends Persona {
    private String Carnet;
    private String Carrera;
    private String Nivel;

    public Estudiante(String Carnet, String Carrera, String Nivel, String Nombres, String Apellidos, String Email, String Telefono) {
        super(Nombres, Apellidos, Email, Telefono);
        this.Carnet = Carnet;
        this.Carrera = Carrera;
        this.Nivel = Nivel;
    }

    public String getCarnet() {
        return Carnet;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    @Override
    public String toString() {
        return "estudiante{" + "Carnet=" + Carnet + ", Carrera=" + Carrera + ", Nivel=" + Nivel + '}';
    }
    
    
}
