package third_trimester.class_032023;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Cuadrado("rojo",10);
        figuras[1] = new Circulo("amarillo",5);
        figuras[2] = new Triangulo("azul",15,20);
        for(int i=0; i<figuras.length; i++){
            System.out.println(figuras[i].getColor());
        }
    }
}
