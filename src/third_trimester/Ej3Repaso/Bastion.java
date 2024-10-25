package third_trimester.Ej3Repaso;

import third_trimester.Ej4Repaso.Espectaculo;

import java.util.Objects;

public class Bastion {
    /*
    El teatro Bastión desea automatizar el sistema con el que gestiona sus espectáculos.
    Cada espectáculo tiene una compañía promotora, un artista asociado, una duración del
    espectáculo y un aforo límite. Escribe una clase bajo las siguientes condiciones:

        ● El nombre de la compañía promotora va sin espacios.
        ● El nombre del artista asociado incluye las dos primeras letras de la compañía
        promotora al final de su entrada.
        ● Existen tres tipos de espectáculos: de 60 minutos, de 120 minutos y de 150
        minutos. Cualquier otra duración no está permitida por el teatro.
        ● El aforo límite va ligado al tipo de espectáculo: el de 60 minutos tiene como
        máximo 100 butacas, el de 120 tiene 140, y el de 150 tiene 200.
        ● Añade un constructor por defecto, uno con parámetros que obligue a que se
        cumplan todos los requisitos, y uno de copia.
        ● Añade getters y setters. Los setter también deberán obligar a que se cumplan las
        condiciones.
        ● Reescribe los métodos clone(), equals() y toString() para esta clase.
     */
    private String promotora;
    private String artista;
    private Duracion duracion;
    private Espectaculo espectaculo;
    private int aforo;
    public Bastion(){
        this.promotora = "";
        this.artista = "";
        this.duracion = null;
        this.aforo = 0;
    }
    public Bastion(String promotora, String artista, Duracion duracion, int aforo, Espectaculo espectaculo){
        this.setPromotora(promotora);
        this.setArtista(artista);
        this.setDuracion(duracion);
        this.setAforo(aforo);
        this.setEspectaculo(espectaculo);
    }
    public Bastion(Bastion origen){
        this.aforo = origen.aforo;
        this.artista = origen.artista;
        this.duracion = origen.duracion;
        this.promotora = origen.promotora;
        this.espectaculo = origen.espectaculo;
    }

    public String getPromotora() {
        return promotora;
    }

    public void setPromotora(String promotora) {
        this.promotora = promotora.replaceAll(" ", "");
    }

    public String getArtista() {
        if(promotora!=null) {
            return artista + this.promotora.substring(0, 2);
        }
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public void setDuracion(Duracion duracion) {
        this.duracion = duracion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if(aforo<=this.duracion.aforoMaximo){
            this.aforo = aforo;
        }
    }

    @Override
    public String toString() {
        return "Promotora: "+this.promotora+"\nArtista: "+this.getArtista()+"\nDuracion: "+this.duracion+"\nAforo: "+this.aforo+"\n\nEspectaculo:\n"+this.espectaculo.toString();
    }

    @Override
    protected Object clone(){
        return new Bastion(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Bastion)) return false;
        Bastion bastion = (Bastion) o;
        return aforo == bastion.aforo && Objects.equals(promotora, bastion.promotora) && Objects.equals(artista, bastion.artista) && duracion == bastion.duracion;
    }

    public Espectaculo getEspectaculo() {
        return espectaculo;
    }

    public void setEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }
}
