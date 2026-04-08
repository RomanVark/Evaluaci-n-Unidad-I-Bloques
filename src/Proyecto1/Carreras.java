package Proyecto1;

public class Carreras {
    private String nombre;
    private int duracion;

    public Carreras() {

    }

    public Carreras(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Carreras{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                '}';
    }

}
