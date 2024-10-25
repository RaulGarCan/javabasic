package third_trimester.class_051223;

import java.time.LocalDate;

public class Velero extends Barco{
    private int nMastiles;

    public Velero(String matricula, double eslora, LocalDate anioFabricacion, int nMastiles){
        super(matricula, eslora, anioFabricacion);
        this.nMastiles = nMastiles;
    }
    @Override
    public double getModulo() {
        return super.getModulo()+10*this.nMastiles;
    }
}
