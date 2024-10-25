package gestor;

import obras.Obra;
import tipoEnum.TipoObra;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Catalogo {
    private static final String rutaResumen = "/home/tarde/Escritorio/Obras/resumen.txt";
    private ArrayList<Obra> catalogo;

    public Catalogo(){
        this.catalogo = new ArrayList<Obra>();
    }

    public boolean nuevaObra(Obra obra) {
        return this.catalogo.add(obra);
    }

    public boolean eliminarObra(Obra obra) {
        return this.catalogo.remove(obra);
    }

    private ArrayList<Obra> getCatalogo(TipoObra tipoObra){
        ArrayList<Obra> result = new ArrayList<Obra>();
        for(int i=0; i<this.catalogo.size(); i++){
            if(this.catalogo.get(i).getTipoObra()==tipoObra){
                result.add(this.catalogo.get(i));
            }
        }
        return result;
    }

    private boolean writeCatalogo(TipoObra tipoObra){
        try {
            FileWriter fw = new FileWriter(tipoObra.getRutaCompleta());
            for(int i=0; i<getCatalogo(tipoObra).size(); i++){
                fw.write(getCatalogo(tipoObra).get(i)+"\n");
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean guardarResumen(){
        try {
            FileWriter fw = new FileWriter(rutaResumen);
            fw.write("Nº LIBROS: "+getCatalogo(TipoObra.LIBRO).size());
            fw.write("Nº PELICULA: "+getCatalogo(TipoObra.PELICULA).size());
            fw.write("Nº SERIE: "+getCatalogo(TipoObra.SERIE).size());
            fw.write("Nº CUADRO: "+getCatalogo(TipoObra.CUADRO).size());
            fw.write("Nº ESCULTURA: "+getCatalogo(TipoObra.ESCULTURA).size());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean guardarInfo(){
        for(int i=0; i<TipoObra.values().length; i++){
            if(!(writeCatalogo(TipoObra.values()[i]))){
                return false;
            }
        }
        if(!guardarResumen()){
            return false;
        }
        return true;
    }
}
