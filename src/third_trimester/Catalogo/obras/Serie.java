package obras;

import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoFormato;
import tipoEnum.TipoObra;

public class Serie extends Pelicula {
    private int temporadas;
    public Serie(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoFormato tipoFormato, int duracion, int temporadas){
        super(titulo, sinopsis, anioCreacion, autor, tipoFormato, duracion);
        this.setTemporadas(temporadas);
        this.setTipoObra(TipoObra.SERIE);
    }
    public Serie(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoFormato tipoFormato, int duracion, int temporadas, LugarExposicion lugarExposicion){
        super(titulo, sinopsis, anioCreacion, autor, tipoFormato, duracion,lugarExposicion);
        this.setTemporadas(temporadas);
        this.setTipoObra(TipoObra.SERIE);
    }
    public Serie(Serie origen){
        super(origen);
        this.temporadas=origen.temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if(temporadas<1){
            this.temporadas=1;
        } else {
            this.temporadas=temporadas;
        }
    }

    @Override
    public String toString() {
        return super.toString()+",Temporadas: "+this.getTemporadas();
    }
}
