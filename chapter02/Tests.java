package chapter02;

public class Tests {
    public static void main(String[] args){
        /*
        System.out.println("Tentando dividir um numero inteiro por 0: " + 1/0);
        Resultado:
            	Exception in thread "main" java.lang.ArithmeticException: / by zero
                	at chapter02.Tests.main(Tests.java:5)
         */
        System.out.println("Tentado dividir um numero inteiro por 0.0: " + 1/0.0);
        // Resultado dá infinito -> Tentado dividir um numero inteiro por 0.0: Infinity
    }
}
