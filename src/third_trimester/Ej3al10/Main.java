package third_trimester.Ej3al10;

import third_trimester.Ej3al10.Diario.Alarma;
import third_trimester.Ej3al10.Diario.DiaSemana;
import third_trimester.Ej3al10.Personal.Evento_Semanal;

public class Main {
    public static void main(String[] args) {
        Evento_Semanal evento1 = new Evento_Semanal("Cumpleaños",new Alarma(DiaSemana.SABADO, "19.23"));
        Evento_Semanal evento2 = new Evento_Semanal("Comida", new Alarma(DiaSemana.JUEVES, "14.15"));
        if(evento1.equals(evento2)){
            System.out.println("evento1 y evento2 son iguales");
        } else {
            System.out.println("evento1 y evento2 son distintos");
        }
        Evento_Semanal copia = evento1.clone();
        if(evento1.equals(copia)){
            System.out.println("evento1 y copia son iguales");
        } else {
            System.out.println("evento1 y copia son distintos");
        }
        copia = evento2;
        if(evento2.equals(copia)){
            System.out.println("evento2 y copia son iguales");
        } else {
            System.out.println("evento2 y copia son distintos");
        }
        copia.getAlarma().setHora("20.35");

        System.out.println(evento1);
        System.out.println(evento2);
        System.out.println(copia);

        // Clase Math
        double coseno = Math.cos(10);
        double seno = Math.sin(10);
        double tangente = Math.tan(10);
        int max = Math.max(1,3);
        int min = Math.min(1,3);

         /**
            Todos estos métodos son de clase ya que es necesario llamar a la clase a la que pertenecen en lugar de instanciar un objeto de ella
         **/
    }
}
