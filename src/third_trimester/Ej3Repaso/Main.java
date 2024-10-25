package third_trimester.Ej3Repaso;

import third_trimester.Ej4Repaso.Espectaculo;
import third_trimester.Ej4Repaso.TipoEspectaculo;

public class Main {
    public static void main(String[] args) {
        Espectaculo espectaculo = new Espectaculo("Espectaculo", 10, TipoEspectaculo.DRAMATICO, false);
        Bastion prueba = new Bastion("promotora", "artista", Duracion.MIN60, 12, espectaculo);
        System.out.println(prueba);
    }
}
