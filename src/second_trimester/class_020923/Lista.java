package second_trimester.class_020923;

import java.util.Arrays;
import java.util.Scanner;

public class Lista {
    /*
        Las listas son estructuras dinámicas de datos donde se pueden insertar o
eliminar elementos de un determinado tipo sin limitación de espacio.
Implementar
la clase Lista correspondiente a una lista de números de la clase
Integer. Los números se guardarán en una tabla que se redimensionará con
las inserciones y eliminaciones, aumentando o disminuyendo la capacidad
de la lista según el caso.

Entre los métodos de la clase, se incluirán las siguientes tareas:
(0.5 puntos) Un constructor que inicialice la tabla con un tamaño 0.
(0.5 puntos) Obtener el número de elementos insertados en la lista.
(2 puntos) Insertar un número al final de la lista.
(2.5  puntos) Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa como parámetro.
(2.5  puntos) Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
(0.5 puntos) Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
(0.5 puntos) Obtener el elemento cuyo índice se pasa como parámetro.
(0.5 puntos ) Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no, devolverá -1.
(0.5 puntos ) Mostrar los elementos de la lista por consola.
     */
    private int[] lista;
    private int contadorElementos;
    public Lista(){
        this.setLista(new int[0]);
        this.setContadorElementos(0);
    }
    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public int getContadorElementos() {
        return contadorElementos;
    }

    public void setContadorElementos(int contadorElementos) {
        this.contadorElementos = contadorElementos;
    }
    public int contarElementos(){
        return getContadorElementos();
    }
    public void insertarElementoFin(int elemento){
        setLista(Arrays.copyOf(getLista(), getLista().length+1));
        getLista()[getLista().length - 1] = elemento;
        setContadorElementos(getContadorElementos() + 1);
    }
    public boolean insertarElementoEnPosicion(int elemento, int indice){
        if (indice<=lista.length-1) {
            setLista(Arrays.copyOf(getLista(), getLista().length + 1)); // Ampliamos la lista
            for (int i = getLista().length - 1; i > indice; i--) {
                getLista()[i] = getLista()[i - 1]; // Mueve las posiciones +1 para dejar el espacio buscado sin datos que perder
            }
            getLista()[indice] = elemento;
            setContadorElementos(getContadorElementos() + 1);
            return true;
        }
        System.out.println("\nEl índice está fuera del rango");
        return false; // El indice esta fuera del rango
    }
    public void insertarListaFin(int[] listaAditivos){
        for (int j=0; j<listaAditivos.length; j++){
            setLista(Arrays.copyOf(getLista(), getLista().length+1));
            getLista()[contadorElementos]=listaAditivos[j];
            setContadorElementos(getContadorElementos() + 1);
        }
    }
    public int buscarElementoSegunIndice(int indiceBusqueda){
        int elementoEncontrado = -1;
        if (indiceBusqueda<=lista.length-1) {
            for (int i = 0; i < lista.length; i++) {
                if (i == indiceBusqueda) {
                    elementoEncontrado = lista[i];
                    return elementoEncontrado;
                }
            }
        }
        System.out.println("\nEl índice está fuera del rango");
        return elementoEncontrado; // El indice esta fuera del rango
    }
    public int buscarPrimerElementoEnLista(int elementoBuscado){
        for (int i=0; i<lista.length; i++){
            if (elementoBuscado==lista[i]){
                return i;
            }
        }
        System.out.println("\nEl índice está fuera del rango");
        return -1;
    }
    public boolean eliminarElemento(int indice){
        if (indice<=lista.length-1) {
            for (int i = indice; i < lista.length - 1; i++) {
                lista[indice] = lista[indice + 1];
            }
            setLista(Arrays.copyOf(lista, lista.length - 1));
            contadorElementos--;
            return true;
        }
        System.out.println("El índice está fuera del rango");
        return false; // El indice esta fuera del rango
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Lista lista = new Lista();
        boolean ejecucion = true;
        do {
            System.out.println("\n1.- Mostrar el nº de elementos de la lista");
            System.out.println("2.- Insertar un elemento al final");
            System.out.println("3.- Insertar elemento en un índice");
            System.out.println("4.- Añadir elementos de otra lista");
            System.out.println("5.- Eliminar elemento en un índice dado");
            System.out.println("6.- Obtener elemento en un índice dado");
            System.out.println("7.- Buscar un elemento en la lista");
            System.out.println("8.- Mostrar los elementos de la lista");
            System.out.print("\nIntroduce la opción: ");
            int opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Mostrar número de elementos en la tabla
                    System.out.println("\nLa lista tiene "+lista.getContadorElementos()+" elementos");
                    break;
                case 2: // Insertar elemento al final
                    System.out.print("Introduce el elemento que quiere introducir: ");
                    int elementoUsuario = userInput.nextInt();
                    lista.insertarElementoFin(elementoUsuario);
                    break;
                case 3: // Insertar elemento en indice
                    System.out.print("Introduce el elemento que quiere introducir: ");
                    elementoUsuario = userInput.nextInt();
                    System.out.print("Introduce la posición en la que quieres ponerlo: ");
                    int posicionUsuario = userInput.nextInt();
                    lista.insertarElementoEnPosicion(elementoUsuario, posicionUsuario);
                    break;
                case 4: // Añadir elementos de otra lista
                    int nElementosUsuario = 0;
                    int[] listaUsuario = new int[]{};
                    while (true){
                        System.out.print("Introduce un elemento: ");
                        /*if(!(userInput.hasNextInt())){ // Crash con valores no ints al alcanzar la solicitud de la variable "opcion" (los tipos de datos no concuerdan)
                            break;
                        }*/
                        int elementoLista = userInput.nextInt();
                        if (elementoLista<0){
                            break;
                        }
                        listaUsuario = Arrays.copyOf(listaUsuario, listaUsuario.length+1);
                        listaUsuario[nElementosUsuario]=elementoLista;
                        nElementosUsuario++;
                    }
                    lista.insertarListaFin(listaUsuario);
                    break;
                case 5: // Eliminar elemento segun indice
                    System.out.print("Introduce el indice a eliminar: ");
                    int indiceBorrar = userInput.nextInt();
                    lista.eliminarElemento(indiceBorrar);
                    break;
                case 6: // Obtener elemento segun indice
                    System.out.print("Introduce el indice del elemento buscado: ");
                    int indiceUsuario = userInput.nextInt();
                    if (lista.buscarElementoSegunIndice(indiceUsuario)!=-1) {
                        System.out.println("\nEl elemento situado en el indice " + indiceUsuario + " es " + lista.buscarElementoSegunIndice(indiceUsuario));
                    }
                    break;
                case 7: // Buscar un elemento en la lista y devolver el primer indice en el que se encuentra
                    System.out.print("Introduce el elemento buscado: ");
                    int elementoBusqueda = userInput.nextInt();
                    System.out.println("\nEl elemento se encuentra en el indice "+lista.buscarPrimerElementoEnLista(elementoBusqueda));
                    break;
                case 8: // Mostrar los elementos de la lista
                    System.out.println(Arrays.toString(lista.getLista()));
                    break;
                default: // Salir
                    System.out.println("\nCerrando el programa...");
                    ejecucion=false;
                    break;
            }
        }while (ejecucion);
    }
}
