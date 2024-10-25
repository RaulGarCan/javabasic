package third_trimester.Biblioteca;

public class Persona {
    private String nombre;
    private String dni;
    private String telefono;
    private TipoPersona tipoPersona;
    public Persona(String nombre, String dni, String telefono, TipoPersona tipoPersona){
        this.nombre=nombre;
        this.dni=dni;
        this.telefono=telefono;
        this.tipoPersona=tipoPersona;
    }
    public Persona(Persona origen){
        this.nombre=origen.nombre;
        this.dni=origen.dni;
        this.telefono=origen.telefono;
        this.tipoPersona=origen.tipoPersona;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }
}
