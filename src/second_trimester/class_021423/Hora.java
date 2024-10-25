package second_trimester.class_021423;

import java.util.Scanner;

public class Hora {
    /*
        Actividad 8.1: diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos. Dispones de los métodos:
- Hora(hora, minuto), que construye un objeto con los datos pasados como parámetros.
- void inc(), que incrementa la hora en un minuto.
- boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar los minutos o no.
- boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.
- String toString(), que devuelve un String con la representación de la hora.
     */
    private int horas;
    private int minutos;
    public Hora(int horas, int minutos){
        setHoras(horas);
        setMinutos(minutos);
    }
    void inc(){
        if (getMinutos()+1==60){
            setHoras(getHoras()+1);
            setMinutos(0);
        } else {
            setMinutos(getMinutos() + 1);
        }

    }
    public int getHoras() {
        return horas;
    }

    public boolean setHoras(int horas) {
        if (horas>=0 && horas<=23) {
            this.horas = horas;
            return true;
        }
        return false;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if (minutos>=0 && minutos<60) {
            this.minutos = minutos;
        }
        return false;
    }

    @Override
    public String toString() {
        if (minutos<10) {
            return "Son las "+horas + ":0" + minutos;
        } else {
            return "Son las "+horas + ":" + minutos;
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean ejecucion = true;
        int horas;
        int minutos;
        do {
            System.out.println("\n¿Qué hora es?");
            String hora = userInput.nextLine().strip();
            horas = Integer.parseInt(hora.split(":")[0]);
            minutos = Integer.parseInt(hora.split(":")[1]);
            if ((horas>=0 && horas<=23)&&(minutos>=0 && minutos<=59)){
                break;
            } else {
                System.out.println("\nIntroduce valores válidos");
            }
        }while (true);
        Hora hora = new Hora(horas, minutos);
        do {
            System.out.println("\n1.- Incrementar los minutos");
            System.out.println("2.- Cambiar minutos");
            System.out.println("3.- Cambiar horas");
            System.out.println("4.- Mostrar Hora");
            System.out.println("5.- Salir");
            System.out.print("\nIntroduce la opción: ");
            int opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Incrementar los minutos
                    hora.inc();
                    break;
                case 2: // Cambiar minutos
                    System.out.print("Introduce los minutos: ");
                    int minutosCambio = userInput.nextInt();
                    hora.setMinutos(minutosCambio);
                    break;
                case 3: // Cambiar horas
                    System.out.print("Introduce las horas: ");
                    int horasCambio = userInput.nextInt();
                    hora.setMinutos(horasCambio);
                    break;
                case 4: // Mostrar hora
                    System.out.println("\n"+hora);
                    break;
                case 5: // Salir
                    System.out.println("Cerrando el programa...");
                    ejecucion=false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while (ejecucion);
    }
}
