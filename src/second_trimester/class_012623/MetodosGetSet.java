package second_trimester.class_012623;

import java.util.Scanner;

public class MetodosGetSet {
    private int edad;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String ciudad;

    public MetodosGetSet(){

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        MetodosGetSet persona1 = new MetodosGetSet();
        System.out.print("¿Cual es tu edad? ");
        persona1.setEdad(userInput.nextInt());
        System.out.print("¿Cuál es tu nombre? ");
        userInput.nextLine();
        persona1.setNombre(userInput.nextLine().strip());
        System.out.print("¿Cuáles son tus apellidos? ");
        String apellidos = userInput.nextLine().strip();
        persona1.setPrimerApellido(apellidos.split(" ")[0]);
        persona1.setSegundoApellido(apellidos.split(" ")[1]);
        System.out.print("¿Dónde vives? ");
        persona1.setCiudad(userInput.nextLine().strip());

        System.out.println(persona1.edad);
        System.out.println(persona1.nombre);
        System.out.print(persona1.primerApellido+" ");
        System.out.println(persona1.segundoApellido);
        System.out.println(persona1.ciudad);
    }
}
