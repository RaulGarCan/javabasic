package third_trimester.Ej2Repaso;

public class Main {
    public static void main(String[] args) {
        InfoSec prueba = new InfoSec("empresa", TipoAuditoria.CAJABLANCA, "123456789", true, false);
        System.out.println(prueba);
    }
}
