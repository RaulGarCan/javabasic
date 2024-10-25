package third_trimester.Ej16;

public class Direcciones {
    private String direccionMAC;
    private String direccionIP;
    public Direcciones(){
        this.direccionMAC="";
        this.direccionIP="";
    }
    public Direcciones(String direccionIP, String direccionMAC){
        this.setDireccionIP(direccionIP);
        this.setDireccionMAC(direccionMAC);
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public boolean setDireccionMAC(String direccionMAC) {
        String caracteres = "0123456789ABCDEF";
        int contador = 0;
        for (int i=0; i<direccionMAC.length(); i++){
            for (int j=0; j<direccionMAC.length(); j++){
                if (direccionMAC.charAt(i)==caracteres.charAt(j)){
                    contador++;
                }
            }
        }
        if (contador==direccionMAC.length() && direccionMAC.length()==12){
            this.direccionMAC = direccionMAC;
            return true;
        }
        return false;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean setDireccionIP(String direccionIP) {
        boolean nBloques = false;
        String[] bloques = direccionIP.split("\\.");
        if (bloques.length==4){
            nBloques = true;
        }
        for (int i=0; i<bloques.length; i++){
            if (Integer.parseInt(bloques[i])>=0 && Integer.parseInt(bloques[i])<=255){
                this.direccionIP = direccionIP;
                return true;
            }
        }
        return false;
    }
}
