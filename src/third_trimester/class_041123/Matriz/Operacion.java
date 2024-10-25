package third_trimester.class_041123.Matriz;

public enum Operacion {
    SUMA('+'),
    RESTA('-'),
    MULTIPLICACION('*'),
    DIVISION('/');
    private final char signo;
    Operacion(char signo){
        this.signo = signo;
    }
    public char getSigno(){
        return this.signo;
    }
}
