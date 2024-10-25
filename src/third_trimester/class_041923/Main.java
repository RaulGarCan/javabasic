package third_trimester.class_041923;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Introduciendo código postal");
            //Ciudades.getCiudad("1");
            Ciudades.getCiudad(null);
            //Ciudades.getCiudad("1a2b3");
        } catch (CPException ex){
            System.out.println("Error: "+ex.getMessage());
        } catch (NullPointerException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
