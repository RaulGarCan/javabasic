package second_trimester.class_012523.carpetaA;

class ClaseCarpetaA1 {
    protected String nombreA1 = "Julian";
    public ClaseCarpetaA1(){
        System.out.println("Creando objeto ClaseCarpetaA1.");
    }
    public void prueba(){
        System.out.println("Probando");
    }
    public static void main(String[] args) {
        ClaseCarpetaA1 objetoClaseCarpetaA1 = new ClaseCarpetaA1();
        System.out.println(objetoClaseCarpetaA1.nombreA1);
        objetoClaseCarpetaA1.prueba();
    }
}
