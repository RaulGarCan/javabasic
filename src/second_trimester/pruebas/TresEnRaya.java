package second_trimester.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
     /*
        Crea una copia del famoso juego Tres en Raya
     */

    static Scanner userInput = new Scanner(System.in);
    static String[][] tablero = {
            {"-","-","-"},
            {"-","-","-"},
            {"-","-","-"},
    };
    static boolean jugador = true;         //True = J1 | False = J2
    static int ganador = 0;
    static String nombreJ1 = "";
    static String nombreJ2 = "";
    static String fichaJ1 = "";
    static String fichaJ2 = "";
    static String revancha = "SI";
    static int puntuacionJ1 = 0;
    static int puntuacionJ2 = 0;
    static String cerrarPrograma = "SALIR";

    public static void mostrarTablero(){
        System.out.println("\n\t1\t2\t3\t(Y)");
        System.out.println("A "+Arrays.toString(tablero[0]));
        System.out.println("B "+Arrays.toString(tablero[1]));
        System.out.println("C "+Arrays.toString(tablero[2]));
        System.out.println("\n(X)\n");
        int casillasVacias = 0;
        for (int k=0; k<3; k++){
            for (int l=0; l<3; l++){
                if ((tablero[k][l].equals("-"))){
                    casillasVacias++;
                }
            }
        }
        if (casillasVacias==0 && ganador==0){
            System.out.println("No quedan casillas vacías!");
            ganador++;
        }
    }

    public static void turno(){
        String fichaJugador = "";
        if (jugador){
            System.out.println(nombreJ1+", es tu turno ("+fichaJ1+")");
            fichaJugador=fichaJ1;
        }else {
            System.out.println(nombreJ2+", es tu turno ("+fichaJ2+")");
            fichaJugador=fichaJ2;
        }
        jugador=!jugador;
        System.out.print("Selecciona coordenadas XY: ");
        String input = userInput.next().toUpperCase().trim();
        if (input.toUpperCase().equals(cerrarPrograma)){
            cerrarJuego();
        }
        while (
                input.length()!=2 ||
                input.toUpperCase().charAt(0)!='A' && input.toUpperCase().charAt(0)!='B' && input.toUpperCase().charAt(0)!='C' ||
                (Character.getNumericValue(input.charAt(1)))<1 || (Character.getNumericValue(input.charAt(1)))>3
        ){
            System.out.println("Coordenadas no válidas, recuerde mantener el formato de coordenadas XY dentro del rango de juego");
            System.out.print("Selecciona coordenadas XY: ");
            input = userInput.next().toUpperCase();
        }
        int coordenadaX = (Character.getNumericValue(input.charAt(1)))-1;
        int coordenadaY = -1;
        switch (input.charAt(0)){
            case 'A':
                coordenadaY = 0;
                break;
            case 'B':
                coordenadaY = 1;
                break;
            case 'C':
                coordenadaY = 2;
                break;
        }
        //System.out.print("La coordenada X es: "+coordenadaX+"\n");
        //System.out.print("La coordenada Y es: "+coordenadaY+"\n");
        if (tablero[coordenadaY][coordenadaX].equals("-")){
            tablero[coordenadaY][coordenadaX] = fichaJugador;
        } else {
            jugador=!jugador; // Evitar salto de turno al equivocarse
            mostrarTablero();
            System.out.println("Esa casilla ya está ocupada!");
            turno();
        }
    }

    public static void comprobarVictoria(){
        // Filas
        for (int i=0; i<3; i++){
            if ((tablero[i][0].equals(tablero[i][1])) && (tablero[i][1].equals(tablero[i][2]))){
                if (tablero[i][0].equals(fichaJ1)){
                    System.out.println(nombreJ1+" es el ganador!");
                    puntuacionJ1++;
                    ganador++;
                } else if(tablero[i][0].equals(fichaJ2)){
                    System.out.println(nombreJ2+" es el ganador!");
                    puntuacionJ2++;
                    ganador++;
                }
            }
        }
        // Columnas
        for (int j=0; j<3; j++){
            if (tablero[0][j].equals(tablero[1][j]) && (tablero[1][j].equals(tablero[2][j]))){
                if (tablero[0][j].equals(fichaJ1)){
                    System.out.println(nombreJ1+" es el ganador!");
                    puntuacionJ1++;
                    ganador++;
                } else if(tablero[0][j].equals(fichaJ2)){
                    System.out.println(nombreJ2+" es el ganador!");
                    puntuacionJ2++;
                    ganador++;
                }
            }
        }
        // Diagonales
        if (tablero[0][0].equals(tablero[1][1]) && (tablero[1][1].equals(tablero[2][2]))){
            if (tablero[0][0].equals(fichaJ1)){
                System.out.println(nombreJ1+" es el ganador!");
                puntuacionJ1++;
                ganador++;
            } else if(tablero[0][0].equals(fichaJ2)){
                System.out.println(nombreJ2+" es el ganador!");
                puntuacionJ2++;
                ganador++;
            }
        }
        if (tablero[2][0].equals(tablero[1][1]) && (tablero[1][1].equals(tablero[0][2]))){
            if (tablero[2][0].equals(fichaJ1)){
                System.out.println(nombreJ1+" es el ganador!");
                puntuacionJ1++;
                ganador++;
            } else if(tablero[2][0].equals(fichaJ2)){
                System.out.println(nombreJ2+" es el ganador!");
                puntuacionJ2++;
                ganador++;
            }
        }
    }
    public static void cerrarJuego(){
        System.out.println("Cerrando el juego...");
        System.exit(1);
    }
    public static void main(String[] args) {
        System.out.print("Introduzca el nombre del Jugador 1: ");
        nombreJ1 = userInput.nextLine().trim();
        if (nombreJ1.toUpperCase().equals(cerrarPrograma)){
            cerrarJuego();
        }
        fichaJ1 = Character.toString(nombreJ1.charAt(0)).toUpperCase();
        System.out.print("Introduzca el nombre del Jugador 2: ");
        nombreJ2 = userInput.nextLine().trim();
        if (nombreJ2.toUpperCase().equals(cerrarPrograma)){
            cerrarJuego();
        }
        while (nombreJ1.equals(nombreJ2)){
            System.out.println("Los nombres deben ser distintos");
            System.out.print("Introduzca el nombre del Jugador 2: ");
            nombreJ2 = userInput.nextLine().trim();
        }
        fichaJ2 = Character.toString(nombreJ2.charAt(0)).toUpperCase();
        if (fichaJ1.equals(fichaJ2)){
            fichaJ1+=1;
            fichaJ2+=2;
        }
        while (revancha.charAt(0)=='S' && revancha.charAt(1)=='I') {
            int turnos = 1;
            ganador=0;
            for (int k=0; k<3; k++){
                for (int l=0; l<3; l++){
                    tablero[k][l] = "-";
                }
            }
            do {
                System.out.println("Turno " + turnos);
                mostrarTablero();
                turno();
                comprobarVictoria();
                mostrarTablero();
                turnos++;
            } while (ganador == 0);
            System.out.println("Fin del juego!");
            System.out.println("Puntuaciones:");
            System.out.print(nombreJ1+" "+puntuacionJ1+"\t"+nombreJ2+" "+puntuacionJ2);
            System.out.print("\n¿Quieres la revancha? ");
            revancha = userInput.next().toUpperCase().trim();
        }
        System.out.println("Cerrando el juego...");
    }
}
