package third_trimester.Naviera;

public class BarcoNormal extends Barco {
    private int limiteCoches;
    public BarcoNormal(int capacidad, int velocidad,int limiteCoches){
        super(capacidad, velocidad);
        this.limiteCoches=limiteCoches;
    }
}
