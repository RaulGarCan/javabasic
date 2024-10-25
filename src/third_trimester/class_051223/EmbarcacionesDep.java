package third_trimester.class_051223;

import java.time.LocalDate;

public class EmbarcacionesDep extends Barco {
    private int potencia;
    public EmbarcacionesDep(String matricula, double eslora, LocalDate anioFabricacion, int potencia){
        super(matricula, eslora, anioFabricacion);
        this.potencia=potencia;
    }
    @Override
    public double getModulo() {
        return super.getModulo()+this.potencia;
    }
}
