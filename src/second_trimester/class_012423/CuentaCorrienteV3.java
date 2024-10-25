package second_trimester.class_012423;

import java.util.Scanner;

class CuentaCorrienteV3 {
    /*
        Actividad 7.4: todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. Añadir un atributo que almacene el nombre del banco
        (que es único) en la clase CuentaCorriente. Diseñar un método que permita recuperar y modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)
     */
    private static String banco;
    String dni;
    public String nombre;
    private double saldo;
    private Gestor miGestor;
    public CuentaCorrienteV3(){}
    public CuentaCorrienteV3(String dni, String nombre, double saldo){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setSaldo(saldo);
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorrienteV3.banco = banco;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean crearCuenta(String dni, String nombre){
        if (dni!=null && nombre!=null) {
            this.setDni(dni);
            this.setNombre(nombre);
            return true;
        }
        return false;
    }
    public boolean sacarDinero(double cantidad){
        if (cantidad<= this.getSaldo()){
            this.setSaldo(this.getSaldo() - cantidad);
            return true;
        }
        return false;
    }
    public boolean ingresarDinero(double cantidad){
        if (cantidad<0){
            return false;
        }
        this.setSaldo(this.getSaldo() + cantidad);
        return true;
    }
    public void mostrarInformacion(){
        System.out.println("\nBanco: "+banco+" | DNI: "+ this.getDni() +" | Nombre: "+ this.getNombre() +" | Saldo: "+ this.getSaldo());
        System.out.println("Información del gestor:");
        miGestor.mostrarInformacion();
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean ejecucion = true;
        CuentaCorrienteV3 cuenta1 = new CuentaCorrienteV3();
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
                    System.out.println("Introduzca el nombre de su banco: ");
                    userInput.nextLine();
                    banco = userInput.nextLine();
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
                    System.out.print("¿Quiere contar con un gestor? ");
                    if (userInput.nextLine().equalsIgnoreCase("si")){
                        System.out.print("Introduce el nombre del gestor: ");
                        String nombreGestor = userInput.nextLine();
                        System.out.print("Introduce el teléfono del gestor: ");
                        int telefonoGestor = userInput.nextInt();
                        System.out.print("¿Quiere establecer un importe máximo? ");
                        userInput.nextLine();
                        if (userInput.nextLine().equalsIgnoreCase("si")){
                            System.out.print("Introduzca el importe máximo: ");
                            double importeMax = userInput.nextDouble();
                            Gestor gestor1 = new Gestor(nombreGestor, telefonoGestor, importeMax);
                            cuenta1.miGestor = gestor1;
                        } else {
                            Gestor gestor1 = new Gestor(nombreGestor, telefonoGestor);
                            cuenta1.miGestor = gestor1;
                        }
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
                    if (cuenta1.nombre!=null){
                        cuenta1.mostrarInformacion();
                    } else {
                        System.out.println("Su cuenta no ha sido creada en el sistema todavía");
                    }
                    break;
                default: // Cerrar programa
                    System.out.println("Cerrando el programa...");
                    ejecucion = false;
                    break;
            }
        }while (ejecucion);

    }


}
