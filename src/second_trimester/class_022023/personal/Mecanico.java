package second_trimester.class_022023.personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private String especialidad;
    public Mecanico(String nombre, String telefono, String especialidad){
        setNombre(nombre);
        setTelefono(telefono);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
