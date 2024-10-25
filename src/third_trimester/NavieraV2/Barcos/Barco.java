package third_trimester.NavieraV2.Barcos;

public class Barco {
    private int capacidad;
    private int velocidad;
    public Barco(int capacidad, int velocidad){
        this.capacidad=capacidad;
        this.velocidad=velocidad;
    }
    public Barco(Barco origen){
        this.capacidad=origen.capacidad;
        this.velocidad=origen.velocidad;
    }

    protected int getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Barco)) return false;
        Barco barco = (Barco) o;
        return capacidad == barco.capacidad && velocidad == barco.velocidad;
    }
}
