package third_trimester.Ej3al10.Diario;


public class Alarma {
    private DiaSemana dia;
    protected String hora;

    public Alarma(){}
    public Alarma(DiaSemana dia, String hora){
        if(hora!=null && dia!=null) {
            this.dia = dia;
            this.hora = hora;
        }
    }
    public DiaSemana getDia() {
        return this.dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        if(hora!=null){
            this.hora = hora;
        }
    }
}
