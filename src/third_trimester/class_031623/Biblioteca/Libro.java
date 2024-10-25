package third_trimester.Biblioteca;

public class Libro {
    private boolean estaDisponible;
    private String nombre;
    private String autor;
    public Libro(String nombre, String autor){
        this.nombre = nombre;
        this.autor = autor;
        this.estaDisponible=true;
    }
    public Libro(Libro origen){
        this.nombre = origen.nombre;
        this.autor = origen.autor;
        this.estaDisponible=origen.estaDisponible;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }
    public void setEstaDisponible(boolean estaDisponible){
        this.estaDisponible=estaDisponible;
    }
}
