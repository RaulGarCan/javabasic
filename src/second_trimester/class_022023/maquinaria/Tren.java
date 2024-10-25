package second_trimester.class_022023.maquinaria;
import second_trimester.class_022023.personal.Maquinista;
import second_trimester.class_022023.personal.Mecanico;
import second_trimester.class_022023.personal.JefeEstacion;

import java.util.Arrays;

public class Tren {
    private Maquinista      miMaquinista;
    private Mecanico        miMecanico;
    private JefeEstacion    miJefeEstacion;
    private Locomotora      miLocomotora;
    private Vagon[]         miVagon;
    public Tren(Maquinista miMaquinista, Mecanico miMecanico, JefeEstacion miJefeEstacion, Locomotora miLocomotora, Vagon[] miVagon){
        setMiMaquinista(miMaquinista);
        setMiMecanico(miMecanico);
        setMiJefeEstacion(miJefeEstacion);
        setMiVagon(miVagon);
    }
    public Maquinista getMiMaquinista() {
        return miMaquinista;
    }

    public void setMiMaquinista(Maquinista miMaquinista) {
        this.miMaquinista = miMaquinista;
    }

    public Mecanico getMiMecanico() {
        return miMecanico;
    }

    public void setMiMecanico(Mecanico miMecanico) {
        this.miMecanico = miMecanico;
    }

    public JefeEstacion getMiJefeEstacion() {
        return miJefeEstacion;
    }

    public void setMiJefeEstacion(JefeEstacion miJefeEstacion) {
        this.miJefeEstacion = miJefeEstacion;
    }

    public Locomotora getMiLocomotora() {
        return miLocomotora;
    }

    public void setMiLocomotora(Locomotora miLocomotora) {
        this.miLocomotora = miLocomotora;
    }

    public Vagon[] getMiVagon() {
        return miVagon;
    }

    public void setMiVagon(Vagon[] miVagon) {
        this.miVagon = miVagon;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "miMaquinista=" + miMaquinista +
                ", miMecanico=" + miMecanico +
                ", miJefeEstacion=" + miJefeEstacion +
                ", miLocomotora=" + miLocomotora +
                ", miVagon=" + Arrays.toString(miVagon) +
                '}';
    }
}
