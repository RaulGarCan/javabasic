package third_trimester.class_032023;

public class Triangulo extends Figura{
    private int base;
    private int altura;
    public Triangulo(String color, int base, int altura){
        this.setColor(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getPerimetro(){
        return (base*3);
    }
    public int getArea(){
        return (base*altura);
    }
    public String toString(){
        return "Este triangulo tiene una base de " + base +" y una altura de "+altura+ " y es de color " + this.getColor();
    }
}
