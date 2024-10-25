package exam_102822;

import java.util.Scanner;

public class Termostato {
    /*
    (3 puntos) Crear una clase que se llame Termostato. La clase debe tener los siguientes campos static:
- temperatura: variable double que guarda el valor de la temperatura de la habitación que proporciona el termostato.
- estaElTermoestatoEncendido: variable booleana que guarda el estado del termoestato (encendido o apagado).
La clase deberá tener los métodos static y void:
- encenderTermoestato(): deberá comprobar si el termostato está apagado, en tal caso deberá cambiar el valor de la variable
booleana a true, en caso contrario no debe hacer nada.
- apagarTermoestato(): deberá comprobar si el termostato está encendido, en tal deberá apagarlo cambiando el valor de la variable
booleana a false, en caso contrario no debe hacer nada.
Y los métodos static e double:
- subirTemperatura(double incrementoTemp): deberá incrementar la temperatura el valor introducido por el parámetro. Si la temperatura
superase los 100 grados no podrá incrementarse y el método deberá  devolver un valor -1, en caso contrario devolverá el valor
de la temperatura tras el incremento. Antes de subir la temperatura se deberá comprobar que el termostato está encendido,
en caso contrario se deberá encender antes de subir la temperatura.
- bajarTemperatura(double decrementoTemp): deberá decrementar la temperatura el valor introducido por el parámetro. Si la temperatura
bajase de los 0 grados no podrá decrementarse y el método debera devolver un valor -1, en caso contrario devolverá el valor
de la temperatura tras el decremento. Antes de bajar la temperatura se deberá comprobar que el termostato está encendido,
en caso contrario se deberá encender antes de bajar la temperatura.

Se le pedirá al usuario que introduzca un número indicando la operación a realizar por el termostato:
1	encenderTermoestato(): una vez llamado al método se deberá   imprimir el siguiente mensaje “Termostato encendido”.
2	apagarTermoestato(): una vez llamado al método se deberá imprimir el siguiente mensaje “Termostato apagado”.
3	subirTemperatura(double incrementoTemp): una vez llamado al método se deberá imprimir la temperatura resultado del incremento.
En caso de que la temperatura superase los 100 grado tras el incremento imprimir el mensaje “No se ha podido subir la temperatura”.
4	bajarTemperatura(double decrementoTemp): una vez llamado al método se deberá imprimir la temperatura resultado del decremento.
En caso de que la temperatura bajase de los 0 grados tras el decremento imprimir el mensaje “No se ha podido bajar la temperatura”.
     */
    static double temperatura;
    static boolean estaElTermostatoEncendido;
    public static void encenderTermostato(){
        if (estaElTermostatoEncendido==false){
            estaElTermostatoEncendido = true;
            System.out.println("Termostato encendido");
        }
    }
    public static void apagarTermostato(){
        if (estaElTermostatoEncendido==true){
            estaElTermostatoEncendido = false;
            System.out.println("Termostato apagado");
        }
    }
    public static double subirTemperatura(double incrementoTemp){
        if(estaElTermostatoEncendido==true){
            final int MAXTEMPERATURE = 100;
            final int INVALID = -1;
            if ((temperatura+incrementoTemp)<=MAXTEMPERATURE){
                temperatura+=incrementoTemp;
            } else {
                System.out.println(INVALID);
                System.out.println("No se ha podido subir la temperatura");
            }
        } else {
            encenderTermostato();
            subirTemperatura(incrementoTemp);
        }
        return temperatura;
    }
    public static double bajarTemperatura(double decrementoTemp){
        if(estaElTermostatoEncendido==true){
            final int MINTEMPERATURE = 0;
            final int INVALID = -1;
            if ((temperatura-decrementoTemp)>=MINTEMPERATURE){
                temperatura-=decrementoTemp;
            } else {
                System.out.println(INVALID);
                System.out.println("No se ha podido bajar la temperatura");
            }
        } else {
            encenderTermostato();
            bajarTemperatura(decrementoTemp);
        }
        return temperatura;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("¿Está el termostato encendido? ");
        estaElTermostatoEncendido = userInput.nextBoolean();
        System.out.print("¿Qué temperatura hace? ");
        temperatura = userInput.nextDouble();
        System.out.print("¿Cuántos grados quieres subir la temperatura? ");
        double incremento = userInput.nextDouble();

        System.out.println(subirTemperatura(incremento));

        System.out.print("¿Cuántos grados quieres bajar la temperatura? ");
        double decremento = userInput.nextDouble();

        System.out.println(bajarTemperatura(decremento));
    }
}
