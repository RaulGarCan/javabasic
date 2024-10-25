package second_trimester.class_012423;

public class MarcaPagina {
    /*
        Actividad de aplicación 7.11: escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para incrementar
        la página leída, para obtener información de la última página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.
     */
    int paginaLeida;
    String infoUltimaPagina = "Aún no has comenzado la lectura del libro";
    public MarcaPagina(){}
    public void incrementarPagina(){
        this.paginaLeida++;
        this.infoUltimaPagina = "La última página leída es la número: "+paginaLeida;
    }
    public void infoUltimaPagina(){
        System.out.println(this.infoUltimaPagina);
    }
    public static void main(String[] args) {
        MarcaPagina libro1 = new MarcaPagina();
        libro1.incrementarPagina();
        libro1.infoUltimaPagina();
    }
}
