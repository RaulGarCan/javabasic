package extras;

import tipoEnum.TipoExposicion;

public class LugarExposicion {
    private TipoExposicion tipoExposicion;
    private String nombre;
    private String direccion;
    public LugarExposicion(TipoExposicion tipoExposicion, String nombre, String direccion){
        this.setTipoExposicion(tipoExposicion);
        this.setNombre(nombre);
        this.setDireccion(direccion);
    }
    public LugarExposicion(LugarExposicion origen){
        this.tipoExposicion=origen.tipoExposicion;
        this.nombre=origen.nombre;
        this.direccion=origen.direccion;
    }

    public TipoExposicion getTipoExposicion() {
        return tipoExposicion;
    }

    public void setTipoExposicion(TipoExposicion tipoExposicion) {
        this.tipoExposicion = tipoExposicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion.toUpperCase();
    }

    @Override
    public String toString() {
        return "Tipo de Exposicion: "+this.getTipoExposicion().name()+",Nombre: "+this.getNombre()+",Direccion: "+this.getDireccion();
    }
}
