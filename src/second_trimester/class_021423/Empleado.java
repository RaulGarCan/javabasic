package second_trimester.class_021423;

public class Empleado extends Persona{
    double salario;
    public Empleado(){}
    public Empleado(String nombre, int edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(this.getSalario());
    }

    public static void main(String[] args) {
        Empleado yoMismo = new Empleado();
        System.out.println(yoMismo.getNombre());
        System.out.println(yoMismo.getEdad());
        System.out.println(yoMismo.getEstatura());
        System.out.println(yoMismo.getSalario());
    }
}
