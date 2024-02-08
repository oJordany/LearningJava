/*
 * 7. (Opcional) Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:

    Se x é par, x = x / 2;
    Se x é impar, x = 3 * x + 1;
    Imprime x;
    O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:

    40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

    Imprimindo sem pular linha

    Um detalhe importante é que uma quebra de linha é impressa toda vez que chamamos println. Para não pular uma linha, usamos o código a seguir:

              System.out.print(variavel);
 */

package chapter02;

public class Exercise7 {
    public static void main(String[] args){
        int x = 13;
        while (x != 1){
            x = (x % 2 == 0) ? (x / 2) : (3 * x + 1);
            System.out.print(x != 1 ? x + " -> " : x);
        }
    }
}
