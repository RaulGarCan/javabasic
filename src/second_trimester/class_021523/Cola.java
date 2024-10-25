package second_trimester.class_021523;

import java.util.Arrays;
import java.util.Scanner;

public class Cola {
    /*
        Una cola es una estructura dinámica como la pila, donde los elementos, en vez de apilarse o desapilarse,
        se encolan  y desencolan. La diferencia con las pilas es que se desencola el primer elemento encolado,
        ya que así es como funcionan las colas del autobús o del cine. El primero que llega es el primero que sale de la cola
        (vamos a suponer que nadie se cuela). Por tanto, los elementos se encolan y desencolan en extremos opuestos de la estructura,
        llamados primero (el que está primero y será el último en abandonar la cola) y último (el que llegó último).
        Implementa la clase Cola donde los elementos Integer encolados se guardan en una tabla dinámica que irá creciendo o
        decreciendo según se encolen o desencolen elementos.

        1.- (1 punto) Crear un constructor que inicialice la cola de Integer a cero elementos.
        2.  (1 punto) Crear un método que cuente los elementos de la cola.
        3.  (5 puntos) Crear un método que encole un elemento en la cola.
        4.- (3 puntos) Crear un método que desencole un elemento de la cola.
     */
    private Integer[] cola;
    public Cola() {
        setCola(new Integer[0]);
    }

    public Integer[] getCola() {
        return cola;
    }

    public void setCola(Integer[] cola) {
        this.cola = cola;
    }
    public int contarElementos(){
        return cola.length;
    }
    public void encolar(int elemento){
        cola = Arrays.copyOf(cola, cola.length+1); // Aumenta el tamaño de la cola en 1
        cola[cola.length-1] = elemento; // Añade el nuevo elemento al final
    }
    public void desencolar(){
        if (cola.length>0) { // Comprueba si la cola tiene elementos
            for (int i = 1; i < cola.length; i++) { // Desplaza todos los elementos hacia el principio de la cola
                cola[i - 1] = cola[i];
            }
            cola = Arrays.copyOf(cola, cola.length - 1); // Reduce el tamaño de la cola en 1
            System.out.println("Elemento desencolado correctamente.");
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Cola colaElementos = new Cola();
        boolean ejecucion = true;
        int opcion;
        do {
            boolean fix = false;
            System.out.println("\n1.- Contar elementos de la cola");
            System.out.println("2.- Encolar un elemento");
            System.out.println("3.- Desencolar un elemento");
            System.out.println("4.- Salir");
            System.out.print("\nIntroduce la opción deseada: ");
            opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Contar elementos
                    if (colaElementos.contarElementos()>0) {
                        System.out.println("\n" + Arrays.toString(colaElementos.cola)); // Muestra los elementos de la cola
                        if (colaElementos.cola.length>1) {
                            System.out.println("La cola tiene " + colaElementos.contarElementos() + " elementos.");
                        } else {
                            System.out.println("La cola tiene "+colaElementos.contarElementos()+" elemento");
                        }
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 2: // Encolar un elemento
                    do {
                        System.out.print("Introduce el elemento que quieres encolar: ");
                        if (!userInput.hasNextInt()){ // Almacena dato no int en Scanner y rompe variable int "opcion"
                            fix = true; // Indica que es necesario un fix
                            break;
                        }
                        int elemento = userInput.nextInt();
                        colaElementos.encolar(elemento);
                    }while (true);
                    break;
                case 3: // Desencolar un elemento
                    colaElementos.desencolar();
                    break;
                case 4: // Salir
                    System.out.println("Cerrando el programa...");
                    ejecucion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            if (fix) { // Solo se produce si se introduce un dato no int
                userInput.next(); // Limpia la memoria de Scanner y evita que los restos se almacenen en la variable int opcion
            }
        }while (ejecucion);
    }
}
