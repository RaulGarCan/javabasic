package third_trimester.Ej1.Mates;

public class Potenciar {
    int potencia(int base, int exponente){
        int result = 1;
        for(int i = 0; i<exponente; i++){
            result*=base;
        }
        return result;
    }
}
