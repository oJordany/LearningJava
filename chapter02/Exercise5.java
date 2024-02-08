/*
 * 5. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos até 20, 30 e 40. Em um determinado momento, além de esse cálculo demorar, começará a mostrar respostas completamente erradas. Por quê?
 * Mude de int para long a fim de ver alguma mudança.
 */

package chapter02;

public class Exercise5 {
    public static void main(String[] args){
        long fatorial = 1;
        for (int n = 1; n <= 30; n++){
            System.out.print("O fatorial de " + n + " é ");
            for (int i = n; i >= 1; i--){
                fatorial *= i;
                System.out.print((i != 1) ? (i + " . ") : (i + " = ") );
            }
            System.out.println(fatorial);
            fatorial = 1;
        }
    }
}
