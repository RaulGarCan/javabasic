package third_trimester.Ej2Repaso;

public class InfoSec {
    /*
    La empresa InfoSec se encarga de realizar auditorías de seguridad a otras empresas, y
    necesita un programa que la ayude a llevar al día dichas auditorías. Toda auditoría tiene,
    como mínimo, los siguientes elementos: una empresa cliente, un tipo de auditoría, un
    teléfono de contacto, y un resultado de valoración. Escribe una clase que gestione estos
    elementos bajo las siguientes condiciones, y programando los siguientes métodos:

        ● El tipo de auditoría puede adscribirse únicamente a tres tipos: caja blanca, caja
        gris o caja negra.
        ● El teléfono de contacto sigue el formato internacional, con el prefijo nacional
        (+ y dos dígitos), y luego los 9 dígitos del número de teléfono.
        ● El resultado de la valoración es siempre negativo o positivo. No hay intermedio.
        ● Añade un constructor por defecto, uno con parámetros que obligue a que se
        cumplan todos los requisitos, y uno de copia.
        ● Añade getters y setters. Los setter también deberán obligar a que se cumplan las
        condiciones.
        ● Reescribe los métodos clone(), equals() y toString() para esta clase.
        ● Añade un método paraArchivar() que anuncie que la auditoría está lista para
        archivar si ha resultado positiva.

     */
    private String cliente;
    private TipoAuditoria tipoAuditoria;
    private String telefono;
    private boolean valoracion;
    private boolean estaArchivada;
    public InfoSec(){
        this.cliente="";
        this.tipoAuditoria=null;
        this.telefono="";
        this.valoracion=false;
        this.estaArchivada=false;
    }
    public InfoSec(String cliente, TipoAuditoria tipoAuditoria, String telefono, boolean valoracion, boolean estaArchivada){
        if(cliente!=null && tipoAuditoria!=null && telefono != null) {
            setCliente(cliente);
            setTipoAuditoria(tipoAuditoria);
            setTelefono(telefono);
            setValoracion(valoracion);
            this.estaArchivada=estaArchivada;
        }
    }
    public InfoSec(InfoSec origen){
        this.cliente = origen.cliente;
        this.tipoAuditoria = origen.tipoAuditoria;
        this.telefono = origen.telefono;
        this.valoracion = origen.valoracion;
        this.estaArchivada = origen.estaArchivada;
    }
    public void paraArchivar(){
        if(this.valoracion){
            this.estaArchivada=true;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public TipoAuditoria getTipoAuditoria() {
        return tipoAuditoria;
    }

    public void setTipoAuditoria(TipoAuditoria tipoAuditoria) {
        this.tipoAuditoria = tipoAuditoria;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono.length()==12){
            int contadorNumeros = 0;
            for (int i=1; i<telefono.length(); i++){
                if(Character.isDigit(telefono.charAt(i))){
                    contadorNumeros++;
                }
            }
            if(contadorNumeros==11 && telefono.charAt(0)=='+'){
                this.telefono=telefono;
            }
        }
    }

    public boolean isValoracion() {
        return valoracion;
    }

    public void setValoracion(boolean valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Cliente: "+this.cliente+"\nTipo Auditoria: "+this.tipoAuditoria+"\nTelefono: "+this.telefono+"\nValoracion: "+this.valoracion;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(!(obj instanceof InfoSec)){
            return false;
        }
        InfoSec i = (InfoSec) obj;
        if(i.cliente.equals(this.cliente) && i.tipoAuditoria.equals(this.tipoAuditoria) && i.telefono.equals(this.telefono) && i.valoracion==this.valoracion){
            return true;
        }
        return false;
    }

    @Override
    public Object clone(){
        return new InfoSec(this);
    }

    public boolean isEstaArchivada() {
        return estaArchivada;
    }

    public void setEstaArchivada(boolean estaArchivada) {
        this.estaArchivada = estaArchivada;
    }
}
