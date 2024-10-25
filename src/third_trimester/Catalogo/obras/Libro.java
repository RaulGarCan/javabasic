package obras;

import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoEncuadernacion;
import tipoEnum.TipoObra;

public class Libro extends Obra {
    private int nPaginas;
    private TipoEncuadernacion tipoEncuadernacion;
    public Libro(String titulo, String sinopsis, int anioCreacion, Autor autor, int nPaginas, TipoEncuadernacion tipoEncuadernacion){
        super(titulo, sinopsis, anioCreacion, autor);
        this.setnPaginas(nPaginas);
        this.setTipoEncuadernacion(tipoEncuadernacion);
        this.setTipoObra(TipoObra.LIBRO);
    }
    public Libro(String titulo, String sinopsis, int anioCreacion, Autor autor, int nPaginas, TipoEncuadernacion tipoEncuadernacion, LugarExposicion lugarExposicion){
        super(titulo, sinopsis, anioCreacion, autor,lugarExposicion);
        this.setnPaginas(nPaginas);
        this.setTipoEncuadernacion(tipoEncuadernacion);
        this.setTipoObra(TipoObra.LIBRO);
    }
    public Libro(Libro origen){
        super(origen);
        this.nPaginas=origen.nPaginas;
        this.tipoEncuadernacion=origen.tipoEncuadernacion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        if(nPaginas<0){
            this.nPaginas=0;
        } else {
            this.nPaginas=nPaginas;
        }
    }

    public TipoEncuadernacion getTipoEncuadernacion() {
        return tipoEncuadernacion;
    }

    public void setTipoEncuadernacion(TipoEncuadernacion tipoEncuadernacion) {
        this.tipoEncuadernacion = tipoEncuadernacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Numero de Paginas: "+this.getnPaginas()+",Tipo de Encuadernacion: "+this.getTipoEncuadernacion().name();
    }
}
