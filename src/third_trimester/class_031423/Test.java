package third_trimester.class_031423;

class Test{
    private int dato;
    private static int datostatic=0;
    public void metodo(){
        this.datostatic++;
    }
    public static void metodostatic(){
        //this.datostatic++; //Error de compilación
        datostatic++;
    }
    public static void main(String[] args){
        //dato++; //Error de compilación
        datostatic++;
        metodostatic();
        //metodo(); //Error de compilación
    }
}
