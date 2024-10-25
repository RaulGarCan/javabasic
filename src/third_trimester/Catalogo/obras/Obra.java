package obras;

import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoObra;

import java.time.LocalDate;

public class Obra {
    private static int maxSinopsis = 500;
    private String titulo;
    private String sinopsis;
    private int anioCreacion;
    private TipoObra tipoObra;
    private Autor autor;
    private LugarExposicion lugarExposicion;
    public Obra(String titulo, String sinopsis, int anioCreacion, Autor autor){
        this.setTitulo(titulo);
        this.setSinopsis(sinopsis);
        this.setAnioCreacion(anioCreacion);
        this.setAutor(autor);
    }
    public Obra(String titulo, String sinopsis, int anioCreacion, Autor autor, LugarExposicion lugarExposicion){
        this.setTitulo(titulo);
        this.setSinopsis(sinopsis);
        this.setAnioCreacion(anioCreacion);
        this.setAutor(autor);
        this.setLugarExposicion(lugarExposicion);
    }
    public Obra(Obra origen){
        this.titulo=origen.titulo;
        this.sinopsis=origen.sinopsis;
        this.anioCreacion=origen.anioCreacion;
        this.tipoObra=origen.tipoObra;
        this.autor=origen.autor;
        this.setTipoObra(origen.getTipoObra());
    }
    public Boolean estaExpuesta() {
        return getLugarExposicion()!=null;
    }

    protected void setTipoObra(TipoObra tipoObra) {
        //Este método no hay que tocar su especifiación
        this.tipoObra=tipoObra;
    }

    public TipoObra getTipoObra() {
        //Este método no hay que tocar su especifiación
        return this.tipoObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        sinopsis=sinopsis.toUpperCase();
        if(sinopsis.length()>500) {
            this.sinopsis = sinopsis.substring(0, maxSinopsis-1);
        } else {
            this.sinopsis = sinopsis;
        }
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        if(anioCreacion> LocalDate.now().getYear()){
            this.anioCreacion=0;
        } else {
            this.anioCreacion=anioCreacion;
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public LugarExposicion getLugarExposicion() {
        return lugarExposicion;
    }

    public void setLugarExposicion(LugarExposicion lugarExposicion) {
        this.lugarExposicion = lugarExposicion;
    }

    @Override
    public String toString() {
        return "Titulo: "+this.getTitulo()+",Sinopsis: "+this.getSinopsis()+",Año de Creacion: "+this.getAnioCreacion()+",Tipo de Obra: "+this.getTipoObra().name()+",Autor: {"+this.getAutor().toString()+"},Lugar de Exposicion: {"+this.getLugarExposicion()+"}";
    }
}
