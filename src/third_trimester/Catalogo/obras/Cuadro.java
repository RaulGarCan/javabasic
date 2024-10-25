package obras;

import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoObra;
import tipoEnum.TipoPintura;

public class Cuadro extends Obra {
    private TipoPintura tipoPintura;
    private int largo;
    private int ancho;
    public Cuadro(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoPintura tipoPintura, int largo, int ancho){
        super(titulo, sinopsis, anioCreacion, autor);
        this.setTipoPintura(tipoPintura);
        this.setLargo(largo);
        this.setAncho(ancho);
        this.setTipoObra(TipoObra.CUADRO);
    }
    public Cuadro(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoPintura tipoPintura, int largo, int ancho, LugarExposicion lugarExposicion){
        super(titulo, sinopsis, anioCreacion, autor,lugarExposicion);
        this.setTipoPintura(tipoPintura);
        this.setLargo(largo);
        this.setAncho(ancho);
        this.setTipoObra(TipoObra.CUADRO);
    }
    public Cuadro(Cuadro origen){
        super(origen);
    }

    public TipoPintura getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(TipoPintura tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if(largo<0){
            this.largo=0;
        } else {
            this.largo=largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho<0){
            this.ancho=0;
        } else {
            this.ancho=ancho;
        }
    }

    @Override
    public String toString() {
        return super.toString()+",Tipo de Pintura: "+this.getTipoPintura()+",Largo: "+this.getLargo()+",Ancho: "+this.getAncho();
    }
}
