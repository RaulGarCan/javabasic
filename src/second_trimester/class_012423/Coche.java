package second_trimester.class_012423;

public class Coche {
    int cilindrada;
    String color;
    String marca;
    String modelo;
    public Coche(){
        this(0, "", "", "");
    }
    public Coche(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public Coche(int cilindrada, String color){
        this(cilindrada);
        this.color = color;
    }
    public Coche(int cilindrada, String color, String marca){
        this(cilindrada, color);
        this.marca = marca;
    }
    public Coche(int cilindrada, String color, String marca, String modelo){
        this.marca = marca;
        this.color = color;
        this.cilindrada = cilindrada;
        this.modelo = modelo;
    }
    public static void main(String[] args) {
        Coche bmw = new Coche(140,"negro","bmw","x1");
        System.out.println(bmw.cilindrada);
        System.out.println(bmw.color);
        System.out.println(bmw.marca);
        System.out.println(bmw.modelo);
        Coche audi = new Coche(180, "blanco", "audi", "a3");
    }
}
