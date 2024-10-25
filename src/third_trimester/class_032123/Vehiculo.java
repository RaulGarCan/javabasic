package third_trimester.class_032123;

public abstract class Vehiculo{
    private int peso;
    public void setPeso(int p){
        peso=p;
    }
    public abstract int getVelocidadMaxima();
    public abstract int nRuedas();
}
