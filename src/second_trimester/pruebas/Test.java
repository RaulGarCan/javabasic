package second_trimester.pruebas;

import java.util.Arrays;

public class Test {
    static String[][] agenda = new String[2][0];
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Mohamed", "Sara", "Maria", "Ahmed"};
        String[] telefonos = {"66656565", "5665656", "3456789", "684335", "3847346", "4563875"};
        for (int i=0; i<nombres.length; i++){
            agenda[0] = Arrays.copyOf(agenda[0], agenda[0].length+1);
            agenda[1] = Arrays.copyOf(agenda[1], agenda[1].length+1);
            agenda[0][i] = nombres[i];
            agenda[1][i] = telefonos[i];
        }
        System.out.println(Arrays.toString(agenda[0]));
        System.out.println(Arrays.toString(agenda[1])+"\n");
        for (int j=0; j<agenda.length; j++){
            for (int k=0; k<agenda[0].length; k++){
                System.out.println(agenda[j][k]);
            }
        }
    }
}
