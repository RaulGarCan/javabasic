package second_trimester.class_012323;

import java.util.Date;

public class Alumno {
    int edad;
    String numeroMatricula;
    Date fechaMatriculacion;
    String estudios;
    public Alumno(){}

    public static void main(String[] args) {
        Alumno mohamed = new Alumno();
        Alumno kevin = new Alumno();
        Alumno youness = new Alumno();
        Alumno raul = new Alumno();

        mohamed.edad = 20;
        mohamed.numeroMatricula = "sd3472346sd";
        mohamed.fechaMatriculacion = new Date("03/09/2021");
        mohamed.estudios = "DAM";
        kevin.edad = 21;
        kevin.numeroMatricula = "54356ds";
        kevin.estudios = "DAM";
        kevin.fechaMatriculacion = new Date("07/10/2020");
        kevin = mohamed;
        System.out.println(kevin);
        System.out.println(mohamed);

        String texto;               // No se crea referencia
        String texto2 = null;       // Se crea referencia pero no se asigna memoria
        String texto4 = "Texto";    // Se crea referencia y se asigna memoria

    }
}
