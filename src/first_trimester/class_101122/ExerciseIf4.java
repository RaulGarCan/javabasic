package class_101122;

import java.util.Scanner;
public class ExerciseIf4 {
    /*
    Generate a random int number greater than 0 and less than 100 and print the number written.
    For example: 56 cincuenta y seis.
     */

    public String numberName(int number){
        int digit1 = number/10;
        int digit2 = number%10;
        String decenas = "";
        String y = "";

        System.out.println(digit1);
        System.out.println(digit2);

        String  uno = "uno",
                dos = "dos",
                tres = "tres",
                cuatro = "cuatro",
                cinco = "cinco",
                seis = "seis",
                siete = "siete",
                ocho = "ocho",
                nueve = "nueve",
                diez = "diez",
                dieci = "dieci",
                once = "once",
                doce = "doce",
                trece = "trece",
                catorce = "catorce",
                quince = "quince",
                veinte = "veinte",
                veinti = "veinti",
                treinta = "treinta",
                cuarenta = "cuarenta",
                cincuenta = "cincuenta",
                sesenta = "sesenta",
                setenta = "setenta",
                ochenta = "ochenta",
                noventa = "noventa",
                nombre = "";

        if (number == 1) {
            System.out.println(uno);
        } else if (number == 2) {
            System.out.println(dos);
        } else if (number == 3) {
            System.out.println(tres);
        } else if (number == 4) {
            System.out.println(cuatro);
        } else if (number == 5) {
            System.out.println(cinco);
        } else if (number == 6) {
            System.out.println(seis);
        } else if (number == 7) {
            System.out.println(siete);
        } else if (number == 8) {
            System.out.println(ocho);
        } else if (number == 9) {
            System.out.println(nueve);
        } else if (number == 10) {
            System.out.println(diez);
        } else if (number == 11) {
            System.out.println(once);
        } else if (number == 12) {
            System.out.println(doce);
        } else if (number == 13) {
            System.out.println(trece);
        } else if (number == 14) {
            System.out.println(catorce);
        } else if (number == 15) {
            System.out.println(quince);
        } else if (number < 20) {
            decenas = dieci;
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 20) {
            System.out.println(veinte);
        } else if (number < 30) {
            decenas = veinti;
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 30) {
            System.out.println(treinta);
        } else if (number < 40) {
            decenas = treinta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 40) {
            System.out.println(cuarenta);
        } else if (number < 50) {
            decenas = cuarenta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 50) {
            System.out.println(cincuenta);
        } else if (number < 60) {
            decenas = cincuenta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 60) {
            System.out.println(sesenta);
        } else if (number < 70) {
            decenas = sesenta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 70) {
            System.out.println(setenta);
        } else if (number < 80) {
            decenas = setenta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 80) {
            System.out.println(ochenta);
        } else if (number < 90) {
            decenas = ochenta;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            }
            if (digit2 == 9) {
                nombre = nueve;
            }
        } else if (number == 90) {
            System.out.println(noventa);
        } else {
            decenas = noventa;
            y = " y ";
            if (digit2 == 1) {
                nombre = uno;
            }
            if (digit2 == 2) {
                nombre = dos;
            }
            if (digit2 == 3) {
                nombre = tres;
            }
            if (digit2 == 4) {
                nombre = cuatro;
            }
            if (digit2 == 5) {
                nombre = cinco;
            }
            if (digit2 == 6) {
                nombre = seis;
            }
            if (digit2 == 7) {
                nombre = siete;
            }
            if (digit2 == 8) {
                nombre = ocho;
            } else if(digit2 == 9){
                nombre = nueve;
            }
        }
        return decenas+y+nombre;
    }
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Introduce your number: ");
        int number = inputNumber.nextInt();
        System.out.println(number);

        ExerciseIf4 numberNameMethod = new ExerciseIf4();
        System.out.println(numberNameMethod.numberName(number));
    }
}