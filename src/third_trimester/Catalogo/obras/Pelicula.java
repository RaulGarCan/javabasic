package obras;

import extras.Actor;
import extras.Autor;
import extras.LugarExposicion;
import tipoEnum.TipoFormato;
import tipoEnum.TipoObra;

import java.util.Arrays;

public class Pelicula extends Obra {
    private TipoFormato tipoFormato;
    private int duracion;
    private Actor[] actores;
    public Pelicula(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoFormato tipoFormato, int duracion){
        super(titulo, sinopsis, anioCreacion, autor);
        this.setTipoFormato(tipoFormato);
        this.setDuracion(duracion);
        this.setTipoObra(TipoObra.PELICULA);
    }
    public Pelicula(String titulo, String sinopsis, int anioCreacion, Autor autor, TipoFormato tipoFormato, int duracion, LugarExposicion lugarExposicion){
        super(titulo, sinopsis, anioCreacion, autor,lugarExposicion);
        this.setTipoFormato(tipoFormato);
        this.setDuracion(duracion);
        this.setTipoObra(TipoObra.PELICULA);
    }
    public Pelicula(Pelicula origen){
        super(origen);
        this.duracion=origen.duracion;
        this.tipoFormato=origen.tipoFormato;
        this.setActores(origen.actores);
    }

    public TipoFormato getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(TipoFormato tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Actor[] getActores() {
        return this.actores;
    }

    public void setActores(Actor[] actores) {
        this.actores=new Actor[actores.length];
        for(int i=0; i<actores.length; i++){
            this.actores[i]=new Actor(actores[i]);
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += super.toString()+",Tipo de Formato: "+this.getTipoFormato()+",Duracion: "+this.getDuracion()+",Actores: {";
        for(int i=0; i<this.getActores().length; i++){
            result+=getActores()[i]+" ";
        }
        result += "}";
        return result;
    }
}
