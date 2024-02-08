/*
 * 6. (Opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
 */

package chapter02;

public class Exercise6 {
    public static void main(String[] args){
        int firstElement = 0;
        int secondElement = 1;
        int aux;
        System.out.println("Série de Fibonacci até passar de 100:");
        System.out.print("0, 1, ");
        while (firstElement + secondElement <= 100){
            aux = secondElement;
            secondElement = firstElement + secondElement;
            firstElement = aux;
            System.out.print(secondElement + ", ");
        }
        System.out.print(firstElement + secondElement);
    }
}

// OBS.: OUTRA SOLUÇÃO SERIA COM RECURSIVIDADE, PARA DIMINUIR O NÚMERO DE VARIÁVEIS
