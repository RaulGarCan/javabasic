package third_trimester.class_032023;

public abstract class Figura{
    public String color;
    public void setColor(String color){
        this.color=color;
    }
    public abstract String getColor();
    public String toString(){
        return "Esta figura es de color " + color ;
    }
}

