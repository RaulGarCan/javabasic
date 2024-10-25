package third_trimester.class_031623.Lifo;

public class TestLifo {
    private Nodo lifo = null;
    private class Nodo {
        private int valor;
        private Nodo siguiente;
        Nodo(int valor){
            this.valor = valor;
            this.siguiente = null;
        }
    }
    public void push(int valor){
        Nodo tmp = new Nodo(valor);
        tmp.siguiente = this.lifo;
        this.lifo = tmp;
    }
    public int pop(){
        if(this.lifo==null){
            return -1;
        }
        Nodo tmp = this.lifo;
        this.lifo = tmp.siguiente;
        tmp.siguiente = null;
        return tmp.valor;
    }
    @Override
    public String toString() {
        String result = "";
        Nodo tmp = this.lifo;
        while (tmp != null) {
            if (!result.isEmpty()) {
                result += ", ";
            }
            result += String.valueOf(tmp.valor);
            tmp = tmp.siguiente;
        }
        return "[ " + result + " ]";
    }

    public int getSize() {
        int size = 0;
        Nodo tmp = this.lifo;
        while (tmp != null) {
            size++;
            tmp = tmp.siguiente;
        }

        return size;
    }

    public boolean estaVacia() {
        return (this.lifo == null);
    }
}
