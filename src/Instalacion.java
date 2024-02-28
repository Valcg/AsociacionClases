public class Instalacion {
    private String codigo;
    private String descripcion;

    private int anio;
    private Zona zona;

    public Instalacion(String codigo, String descripcion, int anio, Zona zona) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.zona = zona;
    }

    public Instalacion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Instalacion{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", anio=" + anio +
                ", zona=" + zona +
                '}';
    }
}
