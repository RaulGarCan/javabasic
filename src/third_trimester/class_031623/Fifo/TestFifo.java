package third_trimester.class_031623.Fifo;

public class TestFifo {
    private Nodo fifo;
    private Nodo last;
    private class Nodo {
        int valor;
        Nodo siguiente;
        Nodo(int v){
            this.valor = v;
        }
    }
    public void add(int v){
        Nodo tmp = new Nodo(v);
        if (fifo==null){
            fifo = tmp;
            last = tmp;
            return;
        }
        last.siguiente = tmp;
        last = tmp;
    }
    public int get(){
        if(fifo==null){
            return -1;
        }
        Nodo tmp = fifo;
        fifo = fifo.siguiente;
        return tmp.valor;
    }
    @Override
    public String toString(){
        if (fifo==null){
            return "[]";
        }
        Nodo tmp = fifo;
        String result = "";
        while (tmp!=null){
            if (!result.isEmpty()){
                result+=", ";
            }
            result+=tmp.valor;
            tmp=tmp.siguiente;
        }
        return "["+result+"]";
    }
    public int getSize(){
        if(fifo==null){
            return 0;
        }
        int contador = 0;
        Nodo tmp = fifo;
        while (tmp!=null){
            contador++;
            tmp=tmp.siguiente;
        }
        return contador;
    }
}
