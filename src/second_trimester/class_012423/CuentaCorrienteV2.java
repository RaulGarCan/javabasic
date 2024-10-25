package second_trimester.class_012423;

import java.util.Scanner;

public class CuentaCorrienteV2 {
    /*
        Actividad 7.2: en la clase CuentaCorriente sobrecargar los constructores para poder crear objetos.
a) Con el DNI del titular de la cuenta y un saldo inicial.
b) Con el DNI, nombre y el saldo inicial.
     */
    String dni;
    String nombre;
    double saldo;
    public CuentaCorrienteV2(){}
    public CuentaCorrienteV2(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorrienteV2(String dni, String nombre, double saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public boolean crearCuenta(String dni, String nombre){
        if (dni!=null && nombre!=null) {
            this.dni = dni;
            this.nombre = nombre;
            return true;
        }
        return false;
    }
    public boolean sacarDinero(double cantidad){
        if (cantidad<=this.saldo){
            this.saldo-=cantidad;
            return true;
        }
        return false;
    }
    public boolean ingresarDinero(double cantidad){
        if (cantidad<0){
            return false;
        }
        this.saldo+=cantidad;
        return true;
    }
    public void mostrarInformacion(){
        System.out.println("DNI: "+this.dni+" Nombre: "+this.nombre+" Saldo: "+this.saldo);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean ejecucion = true;
        int opcion;
        System.out.println("Creación de cuenta");
        System.out.print("Introduce tu DNI: ");
        String dniUsuario = userInput.nextLine().strip();
        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = userInput.nextLine().strip();
        System.out.print("Introduce tu saldo inicial: ");
        int saldo = userInput.nextInt();
        CuentaCorrienteV2 cuenta1 = new CuentaCorrienteV2(dniUsuario, nombreUsuario, saldo);
        do {
            if (cuenta1.crearCuenta(dniUsuario, nombreUsuario)){
                System.out.println("Cuenta creada correctamente.");
            } else {
                System.out.println("Error al crear la cuenta.");
            }
            System.out.println("Opción 1: Sacar dinero");
            System.out.println("Opción 2: Ingresar dinero");
            System.out.println("Opción 3: Mostrar información");
            System.out.print("Selecciona la opción buscada: ");
            opcion = userInput.nextInt();
            switch (opcion) {
                case 1: // Sacar dinero
                    System.out.println("Opción 2 seleccionada");
                    System.out.print("Introduce una cantidad a retirar: ");
                    double cantidadSacar = userInput.nextDouble();
                    if (cuenta1.sacarDinero(cantidadSacar)){
                        System.out.println("Operación realizada correctamente.");
                    }else {
                        System.out.println("Se produjo un error durante la operación.");
                    }
                    break;
                case 2: // Ingresar dinero
                    System.out.println("Opcion 3 seleccionada");
                    System.out.print("Introduce una cantidad a ingresar: ");
                    double cantidadIngresar = userInput.nextDouble();
                    if (cuenta1.ingresarDinero(cantidadIngresar)){
                        System.out.println("Operación realizada correctamente");
                    } else {
                        System.out.println("Se produjo un error durante la operacion");
                    }
                    break;
                case 3: // Mostrar información
                    cuenta1.mostrarInformacion();
                    break;
                default: // Cerrar programa
                    System.out.println("Cerrando el programa...");
                    ejecucion = false;
                    break;
            }
        }while (ejecucion);

    }
}
