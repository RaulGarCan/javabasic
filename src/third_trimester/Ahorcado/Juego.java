package third_trimester.Ahorcado;

import third_trimester.Ahorcado.basedatos.BD;
import third_trimester.Ahorcado.basedatos.BDNivel1;
import third_trimester.Ahorcado.basedatos.BDNivel2;
import third_trimester.Ahorcado.basedatos.BDNivel3;
import java.util.Arrays;

public class Juego {

    //Palabra que se selecciona de forma aleatoria.
    private char[] palabra;
    //Listado de letras que ha indicado el usuario.
    private char[] letras = new char[0];
    //En esta propiedad guardamos las letras acertadas por el usuario y mientras no esté acertada tendremos un guion
    // Ejemplo : -A---B---
    private char[] resultado;
    private Muñeco estadoAhoracado;

    public Juego(int nivel) {
        /*
        Preparamos el juego para la partida, solicitaremos la palabra y haremos todas las inicializaciones
        necesarias para el buen desempeño del juego.
        */
        BD bdPalabras = null;
        switch (nivel){
            case 1:
                bdPalabras = new BDNivel1();
                break;
            case 2:
                bdPalabras = new BDNivel2();
                break;
            case 3:
                bdPalabras = new BDNivel3();
                break;
            default:
                break;
        }
        this.palabra=bdPalabras.getRandomPalabra().toCharArray();
        this.resultado = new char[palabra.length];
        Arrays.fill(resultado, '-');
        estadoAhoracado=new Muñeco();
    }

    private boolean isValidCaracter(char letra){
        /*
        Comprueba si una letra es válida y no está dicha con anterioridad, devolviendo true y false en caso de que
        no sea una letra, por ejemplo, un número o sea una letra que ya se haya dicho.
        */
        if(!Character.isLetter(letra
        )){
            return false;
        }
        if(letras.length>0) {
            for (int i = 0; i < this.letras.length; i++) {
                if (letra == letras[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void guardarLetra(char letra) {
        //Este método añadirá la letra en la lista de letras que lleva el usuario.
        this.letras = Arrays.copyOf(letras, letras.length+1);
        this.letras[letras.length-1]=letra;
    }

    public int comprobarLetra(char letra) {
        /*
        Devuelve 1 si la letra indicada es una de las letras de la palabra que estamos adivinando.
        Devuelve -1 si no es un caracter válido.
        Devuelve 0 si la letra no está en la palabra que buscamos.

        Pasaremos la letra a mayúsculas.
        Comprobaremos si es una letra válida.
        Buscaremos a ver si está dentro de la palabra, en caso de que no hay acertado cambiaremos el estado del muñeco.
        Guardaremos la letra en la lista de letras usadas para no repetirla posteriormente.
        */
        int contAciertos = 0;
        letra = Character.toUpperCase(letra);
        if(!isValidCaracter(letra)){
            return -1;
        }
        guardarLetra(letra);
        for(int i=0; i<palabra.length; i++){
            if(letra==palabra[i]){
                resultado[i]=letra;
                contAciertos++;
            }
        }
        if(contAciertos==0){
            this.estadoAhoracado.nextEstado();
            return 0;
        }
        return 1;
    }

    public int juegoTerminado(){
        /*
        Devolverá -1 si el juego no ha terminado
        Devolverá 0 si ha terminado por que se ha ahorcado al Muñeco
        Devolverá 1 si ha encontrado la palabra.
         */

        if(estadoAhoracado.estaAhorcado()){
            return 0;
        }
        for(int i=0; i<resultado.length; i++){
            if(resultado[i]!=palabra[i]){
                return -1;
            }
        }
        return 1;
    }

    public String getPalabraBuscada() {
        //Devolveremos como string la palabra que tenía que adivinar el jugador.
        return String.valueOf(this.palabra);
    }

    @Override
    public String toString() {
        /*
        Redefinimos este método para que nos devuelva una iteración del juego, indicando el estado del ahorcado,
        la palabra que está adivinando el jugador con las letras acertadas y una lista de letras que son las que
        ha dicho hasta el momento.

        Ejemplo:
         __________
        |          |
        |          0
        |
        |
        |
        =============
        =           =
        Palabra(7): --O---O
        Letras: [A, O, R]

         */
        return this.estadoAhoracado.toString()+"\n"+"Palabra(7):"+String.valueOf(resultado)+"\n"+String.valueOf(letras)+"\n";
    }
}
