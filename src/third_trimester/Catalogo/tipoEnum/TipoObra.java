package tipoEnum;

public enum TipoObra {
    LIBRO("libros.txt"),
    PELICULA("peliculas.txt"),
    SERIE("series.txt"),
    CUADRO("cuadros.txt"),
    ESCULTURA("esculturas.txt");

    //.....
    private static String ruta = "/home/tarde/Escritorio/Obras/";
    private String nombreArchivo;
    TipoObra(String nombreArchivo){
        this.nombreArchivo=nombreArchivo;
    }
    public String getRutaCompleta(){
        return ruta+this.nombreArchivo;
    }
}
