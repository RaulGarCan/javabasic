package third_trimester.class_031323;
class Rectangulo{
    private int ancho;
    private int alto;
    private static int nRectangulos;
    Rectangulo(int ancho, int alto){
        this.setAncho(ancho);
        this.setAlto(alto);
        setnRectangulos(getnRectangulos() + 1);
    }

    public static int getnRectangulos() {
        return nRectangulos;
    }

    public static void setnRectangulos(int nRectangulos) {
        Rectangulo.nRectangulos = nRectangulos;
    }

    @Override
    public boolean equals(Object r){
        if ((this.getAncho() == ((Rectangulo) r).getAncho()) && (this.getAlto() == ((Rectangulo) r).getAlto())){
            return true;
        }
        return false;
    }
    public Rectangulo copiaRectangulo(){
        return new Rectangulo(this.getAncho(), this.getAlto());
    }
    public void aumentarAncho(){
        this.setAncho(this.getAncho() + 1);
    }
    public void aumentarAlto(){
        this.setAlto(this.getAlto() + 1);
    }
    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + getAncho() +
                ", alto=" + getAlto() +
                '}';
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
