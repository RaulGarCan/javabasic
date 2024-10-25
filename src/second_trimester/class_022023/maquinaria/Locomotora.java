package second_trimester.class_022023.maquinaria;
import second_trimester.class_022023.personal.Mecanico;
public class Locomotora {
    private String matricula;
    private double potencia;
    private String antiguedad;
    private Mecanico miMecanico;
    public Locomotora(String matricula, double potencia, String antiguedad, Mecanico miMecanico){
        setMatricula(matricula);
        setPotencia(potencia);
        setAntiguedad(antiguedad);
        setMiMecanico(miMecanico);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mecanico getMiMecanico() {
        return miMecanico;
    }

    public void setMiMecanico(Mecanico miMecanico) {
        this.miMecanico = miMecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", antiguedad='" + antiguedad + '\'' +
                ", miMecanico=" + miMecanico +
                '}';
    }
}
