package third_trimester.class_041123;

public enum TipoMadera {
    ROBLE ("Madera de Roble", "Castaño verdoso", 800),
    CAOBA ("Madera de Caoba", "Marrón oscuro", 770),
    NOGAL("Madera de Nogal", "Marrón rojizo", 820.23),
    CEREZO ("Madera de Cerezo", "Marrón cereza", 790.10),
    BOJ ("Madera de Boj", "Marrón negruzco", 675),
    PINO ( "Madera de Pino", "Marrón claro veteado", 575.00);
    //Campos tipo constante
    private final String nombreComercial; // Nombre de la madera
    private final String color; // Color de la madera
    private final double pesoEspecifico; // Peso específico de la madera
    TipoMadera(String nombreComercial, String color, double pesoEspecifico) {
        this.nombreComercial = nombreComercial;
        this.color = color;
        this.pesoEspecifico = pesoEspecifico;
    }
    //Métodos de la clase tipo Enum
    public String getNombreComercial() { return nombreComercial; }
    public String getColor() { return color; }
    public double getPesoEspecifico() { return pesoEspecifico; }

    @Override
    public String toString() {
        return this.getNombreComercial() + " es de color " + this.getColor() + " y peso específico " + this.getPesoEspecifico() + " kg/m3.";
    }
}
