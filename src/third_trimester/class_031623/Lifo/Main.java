package third_trimester.class_031623.Lifo;

public class Main {
    public static void main(String[] args) {
        TestLifo p = new TestLifo();

        System.out.println("Está Vacia: " + p.estaVacia() );
        p.push(7);

        System.out.println(p.toString());
        p.push(3);
        System.out.println(p.toString());
        p.push(9);
        System.out.println(p.toString());

        System.out.println("Tamaño: " + p.getSize() );

        System.out.println("Elemento: " + p.pop() );
        System.out.println(p.toString());
        System.out.println("Elemento: " + p.pop() );
        System.out.println(p.toString());
        System.out.println("Tamaño: " + p.getSize() );
    }
}
