/*
 * 8. (Opcional) Imprima a seguinte tabela usando fors encadeados:

    1
    2 4
    3 6 9
    4 8 12 16
    n n*2 n*3 .... n*n
 */

package chapter02;

public class Exercise8 {
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = i; j < i*i; j += i){
                System.out.print(j + " ");
            }
            System.out.println(i*i);
        }
    }
}
