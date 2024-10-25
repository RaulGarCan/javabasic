package second_trimester.class_022023.personal;

import second_trimester.class_022023.maquinaria.Locomotora;
import second_trimester.class_022023.maquinaria.Tren;
import second_trimester.class_022023.maquinaria.Vagon;

import java.util.Arrays;
import java.util.Scanner;

public class GeneradorPersonal {
    static final String mecanico        = "MECANICO";
    static final String maquinista      = "MAQUINISTA";
    static final String jefeEstacion    = "JEFEESTACION";
    static Tren[] misTrenes = new Tren[]{};
    private static String[][] datosMaquinista = new String[][]{
            {"25353535V","200000","maquinista"},
            {"64686979A","200000","maquinista"},
            {"94589588B","200000","maquinista"},
            {"13131358C","200000","maquinista"},
            {"29489842D","200000","maquinista"},
            {"23242980E","200000","maquinista"},
            {"76757589F","200000","maquinista"},
            {"89568994G","200000","maquinista"},
            {"53535445H","200000","maquinista"}
    };
    private static String[][] datosMecanico = new String[][]{
            {"25353535V","200000","mecanico"},
            {"64686979A","200000","mecanico"},
            {"94589588B","200000","mecanico"},
            {"13131358C","200000","mecanico"},
            {"29489842D","200000","mecanico"},
            {"23242980E","200000","mecanico"},
            {"76757589F","200000","mecanico"},
            {"89568994G","200000","mecanico"},
            {"53535445H","200000","mecanico"}
    };
    private static String[][] datosJefeEstacion = new String[][]{
            {"25353535V","200000","Sun Feb 19"},
            {"64686979A","200000","Sun Feb 19"},
            {"94589588B","200000","Sun Feb 19"},
            {"13131358C","200000","Sun Feb 19"},
            {"29489842D","200000","Sun Feb 19"},
            {"23242980E","200000","Sun Feb 19"},
            {"76757589F","200000","Sun Feb 19"},
            {"89568994G","200000","Sun Feb 19"},
            {"53535445H","200000","Sun Feb 19"}
    };
    /*************************************************************************************
     *  (0.5 puntos) Inicializa las variables a sus valores por defecto con un tamaño
     *  del array a los correspondientes a los arrays datosMaquinista, datosMecanico y
     *  datosJefeEstacion respectivamente.
     ************************************************************************************/
    private static boolean[] maquinistasDisponibles = new boolean[9];
    private static boolean[] mecanicosDisponibles = new boolean[9];
    private static boolean[] jefesEstacionDisponibles = new boolean[9];

    /************************************************************************************
     *  (1 punto) Crea un método que modifique aleatoriamente los valores de los arrays
     *  maquinistasDisponibles, mecanicosDisponibles y jefesEstacionDisponibles a valores
     *  true o false, significando true que el personal en cuestión está trabajando o no
     *  está disponible y false que no esta trabajando y por tanto está disponible.
     ***********************************************************************************/
    static void modificadorValoresPorDefectoAleatorio(){
        for (int i=0; i<maquinistasDisponibles.length; i++){ // Randomiza los estados boolean de los distintos empleados
            int random = (int)(3*Math.random());
            if (random==0){
                maquinistasDisponibles[i] = true;
            } else if(random==1) {
                mecanicosDisponibles[i] = true;
            } else {
                jefesEstacionDisponibles[i] = true;
            }
        }
    }

    /************************************************************************************
     *   (1.5 puntos) Método que devuelve un booleano que informa si hay personal disponible
     *   (sea mecanico,maquinista o jefe de estación) o no. El parámetro del métoco indica
     *   que tipo de personal es: mecanico, maquinista o jefe de estacion.
     ************************************************************************************/
    static boolean hayPersonalDisponible(String personal){
        if (personal.equalsIgnoreCase("mecanico")){
            for (int j=0; j<mecanicosDisponibles.length; j++){
                if (mecanicosDisponibles[j]){
                    return true;
                }
            }
        } else if (personal.equalsIgnoreCase("maquinista")) {
            for (int j=0; j<maquinistasDisponibles.length; j++){
                if (maquinistasDisponibles[j]){
                    return true;
                }
            }
        } else if (personal.equalsIgnoreCase("jefeEstacion")) {
            for (int j=0; j<jefesEstacionDisponibles.length; j++){
                if (jefesEstacionDisponibles[j]){
                    return true;
                }
            }
        }
        return false;
    }
    /************************************************************************************
     * (3.5 puntos) Método que devuelve, para cada tipo de personal búscado (maquinista,
     * mecanico o jefe de estación), los datos en forma de un array de una fila y
     * 3 columnas, por ejemplo ["25353535V","200000","mecanico"]. Este método generará
     * un número aleatorio cuyo valor está relacionado con el tamaño de los arrays
     * datosMaquinista, datosMecanico o datosJefeEstacion. Dicho número permitirá elegir
     * aleatoriamente aquellos (maquinista, mecanico o jefe de estación) que estén
     * disponibles. Una vez seleccionado el personal (maquinista, mecanico o jefe de
     * estación) disponible aleatoriamente se verán su datos en forma de un array de
     * 1 fila y 3 columnas. Si no hubiese personal disponible se devolverá un array
     * vacío.
     * *********************************************************************************/
    static String[] generadorPersonalDisponible(String tipoPersonal){
        String[] datos = new String[3];
        if (tipoPersonal.equalsIgnoreCase("mecanico")){
            int random;
            do {
                random = (int) (9 * Math.random());
                if (mecanicosDisponibles[random]) {
                    for (int k = 0; k < datosMecanico[0].length; k++) {
                        datos[k] = datosMecanico[random][k];
                    }
                }
            }while (!(mecanicosDisponibles[random]));
        } else if (tipoPersonal.equalsIgnoreCase("maquinista")) {
            int random;
            do {
                random = (int) (9 * Math.random());
                if (maquinistasDisponibles[random]) {
                    for (int k = 0; k < datosMaquinista[0].length; k++) {
                        datos[k] = datosMaquinista[random][k];
                    }
                }
            }while (!(maquinistasDisponibles[random]));
        } else if (tipoPersonal.equalsIgnoreCase("jefeEstacion")) {
            int random;
            do {
                random = (int) (9 * Math.random());
                if (jefesEstacionDisponibles[random]) {
                    for (int k = 0; k < datosJefeEstacion[0].length; k++) {
                        datos[k] = datosJefeEstacion[random][k];
                    }
                }
            }while (!(jefesEstacionDisponibles[random]));
        }
        return datos;
    }

    /************************************************************************************
     (2 puntos) Este método tendrá el flujo de la creación de una línea de tren (
     un objeto tren). Los objetos tren se guardarán en un array que irá aumentando a
     que se vayan creando los objetos, dicho array será una variable de esta clase.
     Antes de la creación de la línea de tren se debe comprobar que
     existe un maquinista, un mecanico y un jefe de estación disponibles. Si no existiese
     alguno de ellos no podría crearse la lína de tren y por tanto se mandaría un mensaje
     al usuario indicando que no se puede crear la línea.
     Existiendo un maquinista, un mecánico y un jefe de estación se empezará preguntanto
     al usuario por los datos siguientes (SIN COMPROBACIÓN DE ERRORES):
     1. Datos del vagon
     2. Datos de la locomotora
     3. Datos del tren (se preguntará sólo por el número de vagones)
     Una vez cumplimentados todos los datos se imprimirán por consola los datos del tren.
     ***********************************************************************************/

    public static void main(String[] args) {
        modificadorValoresPorDefectoAleatorio();
        Scanner userInput = new Scanner(System.in);
        if ((hayPersonalDisponible("mecanico") && hayPersonalDisponible("maquinista")) && hayPersonalDisponible("jefeEstacion")){
            do {
                String[] datosMaquinista = generadorPersonalDisponible("maquinista");
                String dni = datosMaquinista[0];
                double sueldo = Double.parseDouble(datosMaquinista[1]);
                String rango = datosMaquinista[2];
                Maquinista maquinista = new Maquinista(dni, sueldo, rango);

                String[] datosMecanico = generadorPersonalDisponible("mecanico");
                String nombre = datosMecanico[0];
                String telefono = datosMecanico[1];
                String especialidad = datosMecanico[2];
                Mecanico mecanico = new Mecanico(nombre, telefono, especialidad);

                String[] datosJefeEstacion = generadorPersonalDisponible("jefeEstacion");
                nombre = datosJefeEstacion[0];
                dni = datosJefeEstacion[1];
                String fechaNombramiento = datosJefeEstacion[2];
                JefeEstacion jefeEstacion = new JefeEstacion(nombre, dni, fechaNombramiento);

                System.out.print("Introduce el número identificativo del Vagón: ");
                String nIdentificativo = userInput.next();
                System.out.print("Introduce la carga máxima del Vagón: ");
                double cargaMaxima = userInput.nextDouble();
                System.out.print("Introduce la carga actual del Vagón: ");
                double cargaActual = userInput.nextDouble();
                System.out.print("Introduce el tipo de mercancía del Vagón: ");
                String tipoMercancia = userInput.next();
                Vagon vagon = new Vagon(nIdentificativo, cargaMaxima, cargaActual, tipoMercancia);

                System.out.print("Introduce la matrícula de la Locomotora: ");
                String matricula = userInput.next();
                System.out.print("Introduce la potencia de la Locomotora: ");
                double potencia = userInput.nextDouble();
                System.out.print("Introduce la antigüedad de la Locomotora: ");
                String antiguedad = userInput.next();
                Locomotora locomotora = new Locomotora(matricula, potencia, antiguedad, mecanico);

                System.out.print("¿Cuántos vagones tiene el Tren? ");
                int nVagones = userInput.nextInt();
                Vagon[] arrayVagones = new Vagon[nVagones];
                for (int j=0; j<arrayVagones.length; j++){
                    arrayVagones[j] = vagon;
                }
                Tren nuevoTren = new Tren(maquinista, mecanico, jefeEstacion, locomotora, arrayVagones);
                misTrenes = Arrays.copyOf(misTrenes, misTrenes.length+1);
                misTrenes[misTrenes.length-1] = nuevoTren;
                for (int i=0; i<misTrenes.length; i++){
                    System.out.println(misTrenes[i].toString());
                }
                System.out.println();
            }while (true);
        }else {
            System.out.println("No se ha podido crear la línea de Tren, no hay suficientes trabajadores disponibles.");
        }
    }
}
