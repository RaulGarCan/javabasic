package obras;

import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoMaterial;
import tipoEnum.TipoObra;

public class Escultura extends Obra {
    private TipoMaterial tipoMaterial;
    public Escultura(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoMaterial tipoMaterial){
        super(titulo, sinopsis, anioCreacion, autor);
        this.setTipoMaterial(tipoMaterial);
        this.setTipoObra(TipoObra.ESCULTURA);
    }
    public Escultura(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoMaterial tipoMaterial, LugarExposicion lugarExposicion){
        super(titulo, sinopsis, anioCreacion, autor,lugarExposicion);
        this.setTipoMaterial(tipoMaterial);
        this.setTipoObra(TipoObra.ESCULTURA);
    }
    public Escultura(Escultura origen){
        super(origen);
        this.tipoMaterial=origen.tipoMaterial;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return super.toString()+"Tipo de Material: "+this.getTipoMaterial();
    }
}
