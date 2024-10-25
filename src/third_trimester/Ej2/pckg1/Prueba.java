package third_trimester.Ej2.pckg1;

public class Prueba {
    private int n1;
    protected int n2;
    public Prueba(){}
    public Prueba(int n1, int n2){
        this.setN1(n1);
        this.setN2(n2);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    void printTest(){
        third_trimester.Ej2.pckg1.Test test = new third_trimester.Ej2.pckg1.Test();
        //System.out.println(test.c1); // No se puede acceder a él por la visibilidad private
        System.out.println(test.getC2()); // Para solucionarlo podemos utilizar los getter y setter del atributo
        System.out.println(test.c2);
    }
    void otroTest(){
        third_trimester.Ej2.pckg2.Test test = new third_trimester.Ej2.pckg2.Test();
        //System.out.println(test.c1); // No se puede por la visibilidad private
        //System.out.println(test.c2); // No se puede por la visibilidad protected al estar fuera del paquete
        // Para solucionarlo podemos utilizar los getter y setter de los atributos
        System.out.println(test.getC1());
        System.out.println(test.getC2());
    }
}
