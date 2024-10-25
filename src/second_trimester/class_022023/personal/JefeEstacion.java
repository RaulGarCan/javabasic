package second_trimester.class_022023.personal;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private String fechaNombramiento;
    public JefeEstacion(String nombre, String dni, String fechaNombramiento){
        setNombre(nombre);
        setDni(dni);
        setFechaNombramiento(fechaNombramiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNombramiento='" + fechaNombramiento + '\'' +
                '}';
    }
}
