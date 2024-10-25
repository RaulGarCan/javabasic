package third_trimester.class_031323;
class Main{ //¿Qué condicional se ejecutará?
    public static void metodo(Rectangulo r){
        r.setAncho(r.getAncho()+1);
        r.setAlto(r.getAlto()+1);
        r = new Rectangulo(7, 19);
    }
    public static void main(String[] args) {
        //Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r1 = new Rectangulo(7,5);
        Rectangulo r2 = new Rectangulo(5,7);
        Rectangulo r3 = r1;
        //Rectangulo r3 = r1.copiaRectangulo();
        //r1.aumentarAncho();
        //r1.aumentarAlto();
        if(r1.equals(r2)){
            System.out.println("r1 es equal a r2");
        }
        if(r1.equals(r3)){
            System.out.println("r1 es equal a r3");
        }/*
        if(r1.equals(r2)){
            System.out.println("r1 es equal a r2");
        }
        if(r2.equals(r3)){
            System.out.println("r2 es equal a r3");
        }*/

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("Número de rectángulos: "+Rectangulo.getnRectangulos());

        System.out.println(r1.getAncho()+" "+ r1.getAlto());
        metodo(r1);
        System.out.println(r1.getAncho()+" "+ r1.getAlto());
    }
}
