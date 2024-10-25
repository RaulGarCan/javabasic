package third_trimester.class_032123;

public class Moto extends Vehiculo{
    private int velocidadMaxima = 50;
    private int nRuedas = 2;
    @Override
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    @Override
    public int nRuedas() {
        return this.nRuedas;
    }
}
