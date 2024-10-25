package third_trimester.class_051023;

import java.io.FileWriter;
import java.io.IOException;

public class Archivos2 {
    static final String ruta = "/home/tarde/Escritorio/archivo.bin";
    public static void main(String [] args) {
        try {
            FileWriter fw = new FileWriter(ruta);
            fw.write("Ejemplo flujo 1\nEjemplo flujo 2\n\n\nEjemplo flujo 3\n");
            fw.write("Caracteres");
            fw.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
