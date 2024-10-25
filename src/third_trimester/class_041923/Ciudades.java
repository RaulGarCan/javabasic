package third_trimester.class_041923;

public class Ciudades {
    public static void getCiudad(String codigoPostal)
            throws CPException, NullPointerException {
        if (codigoPostal.length() != 5) {
            throw new CPException("El código postal debe tener longitud 5.");
        }
        if (codigoPostal == null) {
            throw new NullPointerException("El código postal no puede ser nulo.");
        }
        for (int i = 0; i < codigoPostal.length(); i++) {
            if (!Character.isDigit(codigoPostal.charAt(i))) {
                throw new CPException("El código postal debe tener sólo números.");
            }
        }
    }
}
