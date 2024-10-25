package third_trimester.class_051223;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    /*
        En un puerto se alquilan amarres para barcos de distinto tipo. Para cada ALQUILER se guarda el
        cliente, las fechas inicial y final de alquiler, la posición del amarre y el barco que lo ocupará.

        Un CLIENTE tendrá sus datos de nombre, DNI y teléfono de contacto.

        Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.

        Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial
        y final) por un módulo función de cada barco (obtenido simplemente multiplicando por 10 los
        metros de eslora) y por un valor fijo (50€ en la actualidad).

        ALQUILER = DIAS * MODULO * COSTE

        Sin embargo, ahora se pretende diferenciar la información de algunos tipos de barcos:

             En veleros el número de mástiles.
             Embarcaciones deportivas a motor la potencia en CV.
             En yates de lujo la potencia del motor y el número de camarotes.

        El módulo de los barcos de un tipo especial se obtiene como:

             En el caso de los veleros sumando al módulo normal el número de mástiles por 10.
             En embarcaciones deportivas a motor sumando al módulo normal la potencia en CV.
             Y para yates de lujo sumando al módulo la potencia en CV más dos veces el número de
            camarotes.

        Diseñar el diagrama de clases y sus relaciones, con detalle de atributos y métodos necesarios.
        Programar en Java los métodos que permitan calcular el alquiler de cualquier tipo de barco.
     */
    private final int COSTEAMARRE = 50;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posAmarre;
    private Barco barco;

    public Alquiler(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, int posAmarre, Barco barco){
        this.cliente=cliente;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.posAmarre=posAmarre;
        this.barco=barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public double calcularAlquiler(){
        return 2d+((double) ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin))*(this.barco.getModulo())*COSTEAMARRE;
    }
}
