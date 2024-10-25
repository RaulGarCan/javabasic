package third_trimester.class_032023;

public class Circulo extends Figura{
    private int radio;
    public Circulo(String color, int radio){
        this.setColor(color);
        this.radio=radio;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public double getArea(){
        return (Math.PI*radio*radio);
    }
    public String toString(){
        return "Este círculo mide " + radio+ " de radio" + " y es de color " + this.getColor();
    }
}
