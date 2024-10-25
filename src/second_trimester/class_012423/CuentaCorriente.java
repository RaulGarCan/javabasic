package second_trimester.class_012423;

import java.util.Scanner;

public class CuentaCorriente {
    /*
        Actividad 7.1: diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las operaciones típicas con una cuenta corriente son:

a) Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial sera 0.
b) Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
c) Ingresar dinero: se incrementa el saldo.
d) Mostrar información: muestra la información disponible de la cuenta corriente.
     */
    String dni;
    String nombre;
    double saldo;
    public CuentaCorriente(){}
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
        CuentaCorriente cuenta1 = new CuentaCorriente();
        do {
            System.out.println("Opción 1: Crear cuenta");
            System.out.println("Opción 2: Sacar dinero");
            System.out.println("Opción 3: Ingresar dinero");
            System.out.println("Opción 4: Mostrar información");
            System.out.print("Selecciona la opción buscada: ");
            int opcion = userInput.nextInt();
            switch (opcion) {
                case 1: // Crear cuenta
                    System.out.println("Opción 1 seleccionada");
                    System.out.print("Introduce tu DNI: ");
                    userInput.nextLine();
                    String dniUsuario = userInput.nextLine().strip();
                    System.out.print("Introduce tu nombre: ");
                    String nombreUsuario = userInput.nextLine().strip();
                    if (cuenta1.crearCuenta(dniUsuario, nombreUsuario)){
                        System.out.println("Cuenta creada correctamente.");
                    } else {
                        System.out.println("Error al crear la cuenta.");
                    }
                    break;
                case 2: // Sacar dinero
                    System.out.println("Opción 2 seleccionada");
                    System.out.print("Introduce una cantidad a retirar: ");
                    double cantidadSacar = userInput.nextDouble();
                    if (cuenta1.sacarDinero(cantidadSacar)){
                        System.out.println("Operación realizada correctamente.");
                    }else {
                        System.out.println("Se produjo un error durante la operación.");
                    }
                    break;
                case 3: // Ingresar dinero
                    System.out.println("Opcion 3 seleccionada");
                    System.out.print("Introduce una cantidad a ingresar: ");
                    double cantidadIngresar = userInput.nextDouble();
                    if (cuenta1.ingresarDinero(cantidadIngresar)){
                        System.out.println("Operación realizada correctamente");
                    } else {
                        System.out.println("Se produjo un error durante la operacion");
                    }
                    break;
                case 4: // Mostrar información
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
