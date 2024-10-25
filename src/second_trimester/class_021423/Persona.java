package second_trimester.class_021423;

public class Persona {
    String nombre;
    int edad;
    double estatura;
    public Persona(){}
    public Persona(String nombre, int edad, double estatura){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setEstatura(estatura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void mostrarDatos(){
        System.out.println(this.getNombre());
        System.out.println(this.getEdad());
        System.out.println(this.getEstatura());
    }

    public static void main(String[] args) {
        Persona yoMismo = new Persona("Sara", 16, 1.80d);
        System.out.println(yoMismo.getEstatura());
        System.out.println(yoMismo.getEdad());
        System.out.println(yoMismo.getNombre());
    }
}
