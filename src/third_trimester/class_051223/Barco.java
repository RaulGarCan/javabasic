package third_trimester.class_051223;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Barco {
    private String matricula;
    private double eslora;
    private LocalDate anioFabricacion;
    public Barco(String matricula, double eslora, LocalDate anioFabricacion){
        this.matricula=matricula;
        this.eslora=eslora;
        this.anioFabricacion=anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return (int) ChronoUnit.YEARS.between(this.anioFabricacion, LocalDate.now());
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getModulo(){
        return this.getEslora()*10;
    }
}
