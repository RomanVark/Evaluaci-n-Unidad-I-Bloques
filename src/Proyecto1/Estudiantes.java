package Proyecto1;

public class Estudiantes {
    private String codigo;
    private String nombre;
    private float promedio;
    private Carreras carrera;

    public Estudiantes() {
    }

    public Estudiantes(String codigo, String nombre, float promedio, Carreras carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.carrera = carrera;
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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }

    public boolean aprobar() {
        return promedio >= 70;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", carrera=" + carrera +
                '}';
    }
}
