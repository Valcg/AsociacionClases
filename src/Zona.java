import java.util.Objects;

public class Zona {
    private String codigo ;
    private String nombre ;
    private int metrosCuadrados ;


    public Zona() {
    }

    public Zona(String codigo, String nombre, int metrosCuadrados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }


    @Override
    public String toString() {
        return "Zona{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zona zona = (Zona) o;
        return Objects.equals(nombre, zona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
