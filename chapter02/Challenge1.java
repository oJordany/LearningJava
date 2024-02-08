/* 
 * 1. Faça o exercício da série de Fibonacci usando apenas duas variáveis.
 */

package chapter02;

public class Challenge1{
    public static void main(String[] args){
        int elementNumber = 1;
        while(fib(elementNumber) <= 100){
            System.out.print(fib(elementNumber) + ", ");
            elementNumber++;
        }
        System.out.println(fib(elementNumber));
    }

    protected static int fib(int x){
        if (x == 1)
            return 0;
        else if (x == 2)
            return 1;
        else
            return (fib(x-1) + fib(x-2));
    }
}