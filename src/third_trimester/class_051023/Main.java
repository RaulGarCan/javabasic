package third_trimester.class_051023;

import java.io.IOException;

public class Main {
    static final String ruta = "/home/tarde/Escritorio/archivo.bin";
    public static void main(String[] args) {
        try {
            FileStringReader fsr = new FileStringReader(ruta);
            String resul;
            while (!(resul=fsr.readString()).equals("")){
                System.out.println(resul);
            }
            fsr.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }
}
