package third_trimester.Ahorcado;
public class Muñeco {
    //En esta propiedad guardaremos el estado actual del ahorcado.
    private NivelFallos numFallos = NivelFallos.INICIO;

    public boolean estaAhorcado() {
        //Devolverá true cuando el jugador esté ahorcado, en otro caso false
        if(this.numFallos.name().equals(NivelFallos.AHORCADO.name())){
            return true;
        }
        return false;
    }

    public void nextEstado() {
        //Este método lo usaremos para pasar al siguiente estado, si estamos en
        //INICIO --> SOGA
        //SOGA --> CABEZA
        //CABEZA --> CUERPO
        // ....
        this.numFallos=NivelFallos.values()[this.numFallos.ordinal()+1];
    }

    @Override
    public String toString() {
        //Imprimirá el estado de la horca.
        return this.numFallos.toString();
    }
}
