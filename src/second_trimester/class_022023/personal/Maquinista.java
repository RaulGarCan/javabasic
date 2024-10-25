package second_trimester.class_022023.personal;

public class Maquinista {
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String dni, double sueldo, String rango){
        setDni(dni);
        setSueldo(sueldo);
        setRango(rango);
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
