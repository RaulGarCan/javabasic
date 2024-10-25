package third_trimester.class_032123;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Wrappers

        Integer i1 = 5;
        Integer i2 = new Integer("7");
        String n1 = i1.toString();
        int i3 = Integer.parseInt("10", 10);
        int i4 = Integer.parseInt("FF", 16);
        int i5 = Integer.valueOf("22").intValue();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(n1);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toHexString(15));

        // Fechas

        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println( "La hora actual es: " + LocalTime.now() );
        System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
        System.out.println( "Próxima fiesta: " + LocalDate.of(2022, Month.MAY, 1) );

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha.getDayOfWeek()+" "+fecha.getDayOfMonth()+"/"+fecha.getMonth()+"/"+fecha.getYear());
        System.out.println(fecha.plusDays(365));
        System.out.println(fecha.plusYears(1));

        // Abstraccion

        //Coche coche = new Coche();
        //System.out.println(coche.getVelocidadMaxima());
        Moto moto = new Moto();
        System.out.println("\n"+moto.getVelocidadMaxima()+" "+moto.nRuedas());
        //Vehiculo vehiculo = new Vehiculo();
        Deportivo deportivo = new Deportivo();
        System.out.println(deportivo.getVelocidadMaxima()+" "+deportivo.nRuedas());
    }
}
