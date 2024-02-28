public class Asignacion {

    private Zona zona;
    private Trabajador trabajador;
    private String horario;

    public Asignacion(Zona zona, Trabajador trabajador, String horario) {
        this.zona = zona;
        this.trabajador = trabajador;
        this.horario = horario;
    }

    public Asignacion() {
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "zona=" + zona +
                ", trabajador=" + trabajador +
                ", horario='" + horario + '\'' +
                '}';
    }
}
