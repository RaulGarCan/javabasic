package third_trimester.Ej16;
public class Dispositivo {
    private String codigo_identificacion;
    private String departamento;
    private Direcciones direcciones;

    public Dispositivo(){
        this.codigo_identificacion="";
        this.departamento=null;
        this.direcciones=null;
    }
    public Dispositivo(String codigo_identificacion, String departamento, Direcciones direcciones){
        this.setCodigo_identificacion(codigo_identificacion);
        this.setDepartamento(departamento);
        this.setDirecciones(direcciones);
    }
    public Dispositivo(Dispositivo original){
        this.codigo_identificacion=original.codigo_identificacion;
        this.departamento=original.departamento;
        this.direcciones=original.direcciones;
    }

    public String getCodigo_identificacion() {
        return codigo_identificacion;
    }

    public boolean setCodigo_identificacion(String codigo_identificacion) {
        for (int i=0; i<codigo_identificacion.length(); i++){
            if(codigo_identificacion.charAt(i)==departamento.charAt(0)){
                this.codigo_identificacion = codigo_identificacion;
                return true;
            }
        }
        return false;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean setDepartamento(String departamento) {
        String[] departamentos = {"informática", "comercio", "administración"};
        for (int i=0; i<departamento.length(); i++){
            if (departamento.equals(departamentos[i])){
                this.departamento = departamento;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "codigo_identificacion: "+codigo_identificacion+"\ndepartamento: "+departamento+"\ndireccionIP: "+direcciones.getDireccionIP()+"\ndireccionMAC: "+direcciones.getDireccionMAC();
    }
    public Dispositivo clone(Dispositivo original){
        return new Dispositivo(original);
    }

    public Direcciones getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direcciones direcciones) {
        this.direcciones = direcciones;
    }
}
