package third_trimester.Ej2.pckg1;

public class Test {
    private char c1;
    protected char c2;
    public Test(){}
    public Test(char c1, char c2){
        this.setC2(c1);
        this.setC2(c2);
    }

    public char getC1() {
        return c1;
    }

    public void setC1(char c1) {
        this.c1 = c1;
    }

    public char getC2() {
        return c2;
    }

    public void setC2(char c2) {
        this.c2 = c2;
    }
    void printPrueba(){
        third_trimester.Ej2.pckg1.Prueba prueba = new third_trimester.Ej2.pckg1.Prueba();
        //System.out.println(prueba.n1); // No se puede acceder a él por la visibilidad private
        System.out.println(prueba.getN1()); // Para solucionarlo podemos utilizar los getter y setter del atributo
        System.out.println(prueba.n2);
    }
    void otraPrueba(){
        third_trimester.Ej2.pckg2.Prueba prueba = new third_trimester.Ej2.pckg2.Prueba();
        //System.out.println(prueba.n1); // No se puede acceder por la visibilidad privada
        //System.out.println(prueba.n2); // No se puede acceder por la visibilidad protected al estar fuera del paquete
        // Para solucionarlo podemos utilizar los getter y setter de los atributos
        System.out.println(prueba.getN1());
        System.out.println(prueba.getN2());
    }
}
