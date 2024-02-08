/*
 * 2. Imprima a soma de 1 até 1000.
 */

package chapter02;

public class Exercise2 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println("O valor da soma de 1 até 1000 é: " + sum);
    }
}
