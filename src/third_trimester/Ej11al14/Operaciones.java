package third_trimester.Ej11al14;

public class Operaciones {
    public static int nNaturales(int limite){
        if(limite==1){
            return limite;
        }
        return limite+nNaturales(limite-1);
    }
    public static int factorial(int numero){
        if(numero==1){
            return numero;
        }
        return numero*factorial( numero-1);
    }
    public static String Fibonacci(int nNumeros){
        return Fibo(nNumeros, 1, 1);
    }
    private static String Fibo(int nNumeros, int a, int b){
        if(nNumeros==1){
            return a+" ";
        }
        return a+" "+Fibo(nNumeros-1, b, a+b);
    }
    public static int sumaDigitos(String numero){
        if(numero.length()==1){
            return Integer.parseInt(numero);
        }
        return Integer.parseInt(String.valueOf(numero.charAt(0)))+sumaDigitos(numero.substring(1));
    }
}
