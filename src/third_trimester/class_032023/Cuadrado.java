package third_trimester.class_032023;

public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(String color, int lado){
        this.setColor(color);
        this.lado = lado;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getPerimetro(){
        return (lado*4);
    }
    public int getArea(){
        return (lado*lado);
    }
    public String toString(){
        return "Este cuadrado mide " + lado + " y es de color " + this.getColor();
    }
}
