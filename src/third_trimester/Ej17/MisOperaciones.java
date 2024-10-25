package third_trimester.Ej17;

public class MisOperaciones implements Operaciones_Simples {
    @Override
    public int suma(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int resta(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int multiplicacion(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int division(int n1, int n2) {
        return n1/n2;
    }
}
