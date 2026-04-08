public class Cliente {
    private  String identificacion;
    private String nombres;
    private String Apellidos;

    public Cliente() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificacion='" + identificacion + '\'' +
                ", nombres='" + nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                '}';
    }
}
