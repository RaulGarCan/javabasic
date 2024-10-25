package third_trimester.class_041123;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TipoMadera madera = TipoMadera.ROBLE;
        System.out.println ("La madera elegida por el usuario es " + madera.toString() );
        System.out.println ("Un palet admite 2.27 m3 de volumen. A continuación, el peso de los palets de las distintas maderas:");
        for (TipoMadera tmp: TipoMadera.values()) {
            System.out.println ("\t" + tmp.name() + " el palet pesa " + (2.27f * (float)tmp.getPesoEspecifico() ) + " kg");
        }
        for (TipoMadera m: TipoMadera.values()){
            System.out.println(m.getNombreComercial());
        }
        System.out.println("");
        for (int i=0; i<TipoMadera.values().length; i++) {
            System.out.println(TipoMadera.values()[i].getNombreComercial());
        }
        int[][] tabla = new int[2][4];
        for (int j=0; j<tabla.length; j++){
            for (int k=0; k<tabla[j].length; k++){
                tabla[j][k]=(int)(Math.random()*10);
            }
        }
        for (int[] fila : tabla){
            System.out.println(Arrays.toString(fila));
        }
    }
}
