package third_trimester.Ahorcado;

import java.util.Scanner;

public class Main {

    public static int menuPrincipal(Scanner in) {
        /*
        En este método presentaremos el menú para que el usuario indique la dificultad con la que quiere jugar
        y devolverá la opción seleccionada.
         */
        System.out.print("1.- Nivel Principiante\n2.- Nivel Intermedio\n3.- Nivel Experto\n\nSelecciona el nivel con el que quieres jugar (1-3): ");
        return in.nextInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nivel;
        do {
            nivel = menuPrincipal(in);
        }while (nivel<1 || nivel>3);
        Juego ahorcado = new Juego(nivel);

        //Continuamos ....
        boolean ejecucion = true;
        do {
            System.out.print("Introduce una letra: ");
            char letraUser = in.next().charAt(0);
            switch (ahorcado.comprobarLetra(letraUser)){
                case 1:
                    System.out.println("Letra encontrada !!!");
                    break;
                case 0:
                    System.out.println("La letra '"+letraUser+"' no se ha encontrado en la palabra que buscamos, inténtelo de nuevo.");
                    break;
                case -1:
                    System.out.println("Ha indicado un carácter no válido o un carácter dicho con anterioridad, inténtelo de nuevo.");
                    break;
            }
            System.out.println(ahorcado);
            switch (ahorcado.juegoTerminado()){
                case 1:
                    System.out.println("ENHORABUENA !!, has encontrado la palabra que buscábamos");
                    ejecucion=false;
                    break;
                case 0:
                    ejecucion=false;
                    System.out.println("Mejor suerte para la próxima, la palara que buscábamos era "+ahorcado.getPalabraBuscada());
                    break;
                case -1:
                    break;
            }
        }while (ejecucion);
    }
}
