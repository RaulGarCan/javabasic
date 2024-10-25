import extras.Actor;
import extras.Autor;
import extras.LugarExposicion;
import gestor.Catalogo;
import obras.*;
import tipoEnum.*;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static Catalogo catalogo = new Catalogo();

    public static void main(String[] args) {
	    // write your code here
        Actor antonioBanderas = new Actor("Antonio Banderas", LocalDate.of(1960, Month.AUGUST, 10),57);
        Actor kirkDouglas = new Actor("Kirk Douglas",LocalDate.of(1916, Month.DECEMBER, 9), LocalDate.of(2020, Month.FEBRUARY, 5),80);
        Actor galGadotVarsano = new Actor("Gal Gadot Varsano", LocalDate.of(1985, Month.APRIL, 30), 17);

        Autor pedroAlmodovar = new Autor("Pedro Almodóvar", LocalDate.of(1949,Month.SEPTEMBER, 25));
        LugarExposicion bibliotecaCeuta = new LugarExposicion(TipoExposicion.BIBLIOTECA, "Biblioteca de Ceuta", "");
        Libro lasCosasDelQuerer = new Libro("Las cosas del querer","", 1979,pedroAlmodovar, 530,TipoEncuadernacion.CUERO,bibliotecaCeuta);
        Libro mujeresLocas = new Libro("Mujeres locas", "", 1997,pedroAlmodovar,290,TipoEncuadernacion.CARTON,bibliotecaCeuta);

        Autor georgeTMiller = new Autor("George T. Miller", LocalDate.of(1943, Month.NOVEMBER, 28));
        Pelicula elHombreDeRioNevado = new Pelicula("El hombre de Río Nevado","",1982 , georgeTMiller, TipoFormato.MM8, 104);
        Actor[] actores1 = new Actor[]{kirkDouglas};
        elHombreDeRioNevado.setActores(actores1);

        LugarExposicion netflix = new LugarExposicion(TipoExposicion.PLATAFORMA, "Netflix", "");
        Actor[] actores2 = new Actor[]{galGadotVarsano, antonioBanderas};
        Pelicula laMujerMaravilla = new Pelicula("La mujer maravilla","",2007,georgeTMiller,TipoFormato.DVD,97);
        laMujerMaravilla.setActores(actores2);

        Actor[] actores3 = new Actor[]{antonioBanderas,kirkDouglas};
        Serie anhqv = new Serie("Aquí no hay quién viva","",1998,pedroAlmodovar,TipoFormato.DVD,35,10,netflix);
        anhqv.setActores(actores3);

        Autor pabloRuizPicasso = new Autor("Pablo Ruíz Picasso",LocalDate.of(1881,Month.OCTOBER,25));
        LugarExposicion museoMalaga = new LugarExposicion(TipoExposicion.MUSEO,"Museo de Málaga","");
        Cuadro guernica = new Cuadro("Guernica","",1937,pabloRuizPicasso, TipoPintura.OLEO,349,777,museoMalaga);

        LugarExposicion marquesDeCaceres = new LugarExposicion(TipoExposicion.SALAPRIVADA,"Colección privada del Marqués de Cáceres","");
        Escultura naturalezaMuertaConGuitarra = new Escultura("Naturaleza muerta con Guitarra","",1913,pabloRuizPicasso, TipoMaterial.BRONCE,marquesDeCaceres);

        /*
        catalogo.nuevaObra(lasCosasDelQuerer);
        catalogo.nuevaObra(mujeresLocas);
        catalogo.nuevaObra(elHombreDeRioNevado);
        catalogo.nuevaObra(laMujerMaravilla);
        catalogo.nuevaObra(anhqv);
        catalogo.nuevaObra(guernica);
        catalogo.nuevaObra(naturalezaMuertaConGuitarra);

        catalogo.guardarInfo();
        */
        System.out.println(anhqv);

        pedroAlmodovar.setNumeroObras(TipoObra.LIBRO, 2);
        System.out.println(pedroAlmodovar.getNumeroObras(TipoObra.LIBRO));
    }
}
