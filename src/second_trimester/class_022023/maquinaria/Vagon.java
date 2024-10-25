package second_trimester.class_022023.maquinaria;

public class Vagon {
    private String numeroIdentificativo;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;
    public Vagon(String numeroIdentificativo, double cargaMaxima, double cargaActual, String tipoMercancia){
        setNumeroIdentificativo(numeroIdentificativo);
        setCargaMaxima(cargaMaxima);
        setCargaActual(cargaActual);
        setTipoMercancia(tipoMercancia);
    }
    public String getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public void setNumeroIdentificativo(String numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "numeroIdentificativo='" + numeroIdentificativo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", cargaActual=" + cargaActual +
                ", tipoMercancia='" + tipoMercancia + '\'' +
                '}';
    }
}
