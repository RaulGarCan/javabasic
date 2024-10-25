package third_trimester.class_032223;

public class Main {
    public static void main(String [] args){
        Persona p1;
        p1 = new Empleado();
        //p1 = new Persona();
        p1.setNombre("Arthas Menethil");
        //((Empleado)p1).setSueldoBase(100);
        Empleado e1;
        e1 = new Encargado();
        e1.setSueldoBase(500);
        ((Encargado)e1).setPuesto("Jefe Almacén");
        System.out.println(e1.getSueldo());
    }
}
