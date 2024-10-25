package third_trimester.Ej1Repaso;

public class Veterinaria {
    /*
    La clínica veterinaria Furball quiere automatizar los datos de todos los animales que
    pasan por la clínica. Siempre toman, como mínimo, los siguientes datos: nombre de la
    mascota, nombre del dueño, tipo de animal y el historial clínico. También quieren
    aprovechar para llevar un recuento de los perros y gatos que van pasando para hacer
    una estadística. Escribe una clase bajo las siguientes condiciones:

            ● El nombre de la mascota siempre se escribe todo en mayúsculas.
            ● El nombre del dueño se escribe sin espacios.
            ● El historial clínico no puede exceder los 500 caracteres.
            ● El tipo de animal solo puede ser perro, gato, o exótico.
            ● El recuento de perros y gatos se lleva a cabo por separado y se hace a nivel de
            toda la clínica.
            ● Añade un constructor por defecto, uno con parámetros que obligue a que se
            cumplan todos los requisitos, y uno de copia.
            ● Añade getters y setters. Los setter también deberán obligar a que se cumplan las
            condiciones.
            ● Reescribe los métodos clone(), equals() y toString() para esta clase.

     */
    private String nombreMascota;
    private String nombreDuenio;
    private String historialClinico;
    private Animales tipoAnimal;
    private static int recuentoTotal = 0;
    public Veterinaria(){
        nombreMascota="";
        nombreDuenio="";
        historialClinico="";
        tipoAnimal=null;
        recuentoTotal++;
    }
    public Veterinaria(String nombreMascota, String nombreDuenio, String historialClinico, Animales tipoAnimal) {
        if(nombreMascota!=null && nombreDuenio!=null && historialClinico!=null && tipoAnimal!=null) {
            setNombreMascota(nombreMascota);
            setNombreDuenio(nombreDuenio);
            setHistorialClinico(historialClinico);
            setTipoAnimal(tipoAnimal);
            recuentoTotal++;
        }
    }
    public Veterinaria(Veterinaria origen){
        if(origen!=null) {
            this.nombreMascota = origen.nombreMascota;
            this.nombreDuenio = origen.nombreDuenio;
            this.historialClinico = origen.historialClinico;
            this.tipoAnimal = origen.tipoAnimal;
            recuentoTotal++;
        }
    }

    public static int getRecuentoTotal() {
        return recuentoTotal;
    }

    public static void setRecuentoTotal(int recuentoTotal) {
        Veterinaria.recuentoTotal = recuentoTotal;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota.toUpperCase();
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio.replaceAll(" ", "");
    }

    public String getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(String historialClinico) {
        if(historialClinico.length()>500) {
            this.historialClinico = historialClinico.substring(0, 499);
        } else {
            this.historialClinico = historialClinico;
        }
    }

    public Animales getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(Animales tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public boolean equals(Object obj) {
        Veterinaria v = (Veterinaria) obj;
        if (v.historialClinico.equals(this.historialClinico) && v.nombreDuenio.equals(this.nombreDuenio) && v.nombreMascota.equals(this.nombreMascota) && v.tipoAnimal==this.tipoAnimal){
            return true;
        }
        return false;
    }

    @Override
    public Veterinaria clone() {
        return new Veterinaria(this);
    }

    @Override
    public String toString() {
        return "Nombre de la Mascota: "+nombreMascota+"\nNombre del Dueño: "+nombreDuenio+"\nHistorial clínico: "+historialClinico+"\nTipo de animal: "+tipoAnimal;
    }
}
