package third_trimester.class_051223;

import java.time.LocalDate;

public class Yates extends EmbarcacionesDep {
    private int nCamarotes;
    public Yates(String matricula, double eslora, LocalDate anioFabricacion, int potencia, int nCamarotes){
        super(matricula, eslora, anioFabricacion, potencia);
        this.nCamarotes=nCamarotes;
    }
    @Override
    public double getModulo() {
        return super.getModulo()+2*this.nCamarotes;
    }
}
