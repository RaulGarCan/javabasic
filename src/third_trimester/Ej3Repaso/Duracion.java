package third_trimester.Ej3Repaso;

public enum Duracion {
    MIN60(100),
    MIN120(140),
    MIN150(200);
    int aforoMaximo;
    Duracion(int aforoMaximo){
        this.aforoMaximo=aforoMaximo;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }
}
