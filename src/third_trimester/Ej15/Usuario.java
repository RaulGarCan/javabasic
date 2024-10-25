package third_trimester.Ej15;

import java.time.LocalDate;

public class Usuario {
    private String nombre_usuario;
    private String contrasena;
    private String email;
    private LocalDate fecha_inscripcion;
    public Usuario(){
        this.nombre_usuario="";
        this.contrasena="";
        this.email="";
        this.fecha_inscripcion=null;
    }
    public Usuario(String nombre_usuario, String contrasena, String email, LocalDate fecha_inscripcion){
        this.setNombre_usuario(nombre_usuario);
        this.setContrasena(contrasena);
        this.setEmail(email);
        this.setFecha_inscripcion(fecha_inscripcion);
    }
    public Usuario(Usuario original){
        this.setNombre_usuario(original.getNombre_usuario());
        this.setContrasena(original.getContrasena());
        this.setEmail(original.getEmail());
        this.setFecha_inscripcion(original.getFecha_inscripcion());
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public boolean setNombre_usuario(String nombre_usuario) {
        for(int i=0; i<nombre_usuario.length(); i++){
            if(nombre_usuario.charAt(i)==' '){
                return false;
            }
        }
        this.nombre_usuario = nombre_usuario;
        return true;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean setContrasena(String contrasena) {
        boolean numero = false;
        boolean mayuscula = false;
        boolean caracter = true;
        for (int i=0; i<contrasena.length(); i++){
            if (Character.isDigit(contrasena.charAt(i))){
                numero=true;
            }
            if (Character.isUpperCase(contrasena.charAt(i))){
                mayuscula=true;
            }
            if (Character.isWhitespace(contrasena.charAt(i)) && contrasena.length()==1){
                caracter=false;
            }
        }
        if (numero && mayuscula && caracter){
            this.contrasena = contrasena;
            return true;
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        boolean arroba = false;
        boolean dominioFinal = false;
        String[] dominios = {"com", "net", "es"};
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i)=='@'){
                arroba=!arroba; // Controla que solo exista una @
            }
        }
        for (int j=0; j<dominios.length; j++){
            if (email.split("\\.")[2].equals(dominios[j])){
                dominioFinal=true;
            }
        }
        if (arroba && dominioFinal){
            this.email = email;
            return true;
        }
        return false;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
