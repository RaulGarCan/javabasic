package third_trimester.class_050823;

import java.io.*;

public class Ficheros {
    public static final String ruta = "/home/tarde/Escritorio/archivo.bin";
    public static void escribirFichero(String cadenaEscritura){
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            for (int i=0; i<cadenaEscritura.length(); i++){
                fos.write((byte)cadenaEscritura.charAt(i));
            }
            fos.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }
    public static void escribirFicheroBuffer(String cadenaEscritura){
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            for (int i=0; i<cadenaEscritura.length(); i++){
                bos.write((byte)cadenaEscritura.charAt(i));
            }
            bos.close();
            fos.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }
    public static void escribirFicheroData(String nombre, int edad, boolean esMayorEdad){
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(nombre);
            dos.writeInt(edad);
            dos.writeBoolean(esMayorEdad);
            dos.close();
            fos.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }

    public static void leerFichero(){
        try {
            FileInputStream fis = new FileInputStream(ruta);
            int i;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }
    public static void leerFicheroBuffer(){
        try {
            FileInputStream fis = new FileInputStream(ruta);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i=bis.read())!=-1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }
    public static void leerFicheroData(){
        try {
            FileInputStream fis = new FileInputStream(ruta);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            dis.close();
            fis.close();
        }catch (IOException ioe){
            System.err.println(ioe);
        }
    }


    public static void main(String[] args) {
        escribirFicheroData("Raul", 20, true);
        leerFicheroData();
    }
}
