package third_trimester.class_051123.Vehiculo;

public class Vehiculo {
    /*
        1. Implementa una clase Vehículo que tenga como atributos el número de ruedas, la
        velocidad actual y la velocidad máxima en kilómetros/hora, y la antigüedad. Añádele
        constructor por defecto, con parámetros y de copia, además de getters y setters para los
        atributos, y el método toString(). Además, todo Vehículo puede frenar y acelerar una
        determinada cantidad de kilómetros/hora cada vez. Finalmente, implementa las
        siguientes clases que hereden de Vehículo:

        ● Coche: puede ser de gasolina, gasoil, híbrido o eléctrico.
        ● Motocicleta: puede ser un ciclomotor o scooter.
        ● Barco: puede ser comercial o mercante.
        ● Modifica el método toString() para cada subclase.
     */
    private int nRuedas;
    private int velocidadActual;
    private int velocidadMax;
    private int antiguedad;
    public Vehiculo(){
        this.setnRuedas(0);
        this.velocidadMax=0;
        this.velocidadActual=0;
        this.antiguedad=0;
    }
    public Vehiculo(int nRuedas, int velocidadActual, int velocidadMax, int antiguedad){
        this.setnRuedas(nRuedas);
        this.setVelocidadMax(velocidadMax);
        this.setVelocidadActual(velocidadActual);
        this.setAntiguedad(antiguedad);
    }
    public Vehiculo(Vehiculo origen){
        this.nRuedas=origen.nRuedas;
        this.velocidadMax=origen.velocidadMax;
        this.velocidadActual=origen.velocidadActual;
        this.antiguedad=origen.antiguedad;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if(velocidadActual>this.velocidadMax){
            this.velocidadActual = this.velocidadMax;
        } else if(velocidadActual<0){
            this.velocidadActual=0;
        } else {
            this.velocidadActual=velocidadActual;
        }
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        if(velocidadMax<0){
            this.velocidadMax = 0;
        } else {
            this.velocidadMax=velocidadMax;
        }
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public void acelerar(int cantidadAcelerar){
        this.velocidadActual+=cantidadAcelerar;
        if(velocidadActual>velocidadMax){
            velocidadActual=velocidadMax;
        }
    }
    public void frenar(int cantidadFrenar){
        this.velocidadActual-=cantidadFrenar;
        if(velocidadActual<0){
            velocidadActual=0;
        }
    }

    @Override
    public String toString() {
        return "Número Ruedas: "+this.getnRuedas()+"\nAntigüedad: "+this.getAntiguedad()+"\nVelocidad Actual: "+this.getVelocidadActual()+"\nVelocidad Máxima: "+this.getVelocidadMax();
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }
}
