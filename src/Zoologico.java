import java.util.ArrayList;

public class Zoologico {

    private string nombre;
    private ArrayList<Zona>zonas;
    private ArrayList<Instalacion>instalaciones;
    private ArrayList<Trabajador>trabajadores;
    private ArrayList<Animal>animales;
    private ArrayList<Asignacion>asignaciones;

    public Zoologico(string nombre) {
        this.nombre = nombre;
        zonas = new ArrayList<>();
        instalaciones = new ArrayList<>();
        trabajadores = new ArrayList<>();
        animales = new ArrayList<>();
        asignaciones = new ArrayList<>();

    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Instalacion> getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
        this.instalaciones = instalaciones;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
