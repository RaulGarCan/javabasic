package third_trimester.Ej1Repaso;

public class Main {
    public static void main(String[] args) {
        Veterinaria prueba = new Veterinaria("nombremascota", "Nombre del duenio", "historial", Animales.PERRO);
        System.out.println("\n"+prueba);
        System.out.println("\n"+prueba.clone());
        System.out.println("\n"+prueba.equals(prueba.clone()));
        System.out.println("\n"+Veterinaria.getRecuentoTotal());
    }
}
