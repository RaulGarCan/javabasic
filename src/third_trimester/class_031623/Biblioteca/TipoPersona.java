package third_trimester.Biblioteca;

public enum TipoPersona {
    ESTUDIANTE(1),
    NOESTUDIANTE(3);
    int eurosPorDia;
    TipoPersona(int eurosPorDia){
        this.eurosPorDia=eurosPorDia;
    }

    public int getEurosPorDia() {
        return eurosPorDia;
    }
}
