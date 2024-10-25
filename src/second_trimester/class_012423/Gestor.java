package second_trimester.class_012423;

class Gestor {
    /*
        Actividad 7.5: existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de la que interesa guardar su nombre,
teléfono y el importe máximo autorizado con el que pueden operar. Con respecto a los gestores, existen las siguientes restricciones:
Un gestor tendrá siempre un nombre y un teléfono.
Si no se asigna, el importe máximo autorizado por operación será de 100000 euros.
Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo.
El nombre será público y el importe máximo solo será visible por clases vecinas.
Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.
     */

    private String nombre;
    private int telefono;
    private double importeMax;
    public Gestor(String nombre, int telefono){
        this.setNombre(nombre);
        this.telefono = telefono;
        this.setImporteMax(100000d);
    }
    public Gestor(String nombre, int telefono, double importeMax){
        this(nombre, telefono);
        this.setImporteMax(importeMax);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    double getImporteMax() {
        return importeMax;
    }

    public void setImporteMax(double importeMax) {
        this.importeMax = importeMax;
    }

    public void mostrarInformacion(){
        System.out.println(getNombre());
        System.out.println(getTelefono());
        System.out.println(getImporteMax()+"\n");
    }
}
