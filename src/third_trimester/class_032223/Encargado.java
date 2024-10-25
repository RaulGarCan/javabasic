package third_trimester.class_032223;

public class Encargado extends Empleado{
    @Override
    public int getSueldo(){
        return (int)(super.getSueldo()*1.1);
    }
    private String puesto;
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return this.puesto;
    }
}