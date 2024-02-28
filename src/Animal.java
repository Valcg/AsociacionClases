public class Animal {




    private String codigo;
    private String nombre;
    private int anioNacimiento;
    private Instalacion instalacion;

    public Animal(String codigo, String nombre, int anioNacimiento, Instalacion instalacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.instalacion = instalacion;
    }

    public Animal() {
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", instalacion=" + instalacion +
                '}';
    }
}
