package chapter04;

import chapter04.Conta;

public class TestaConta {
    public static void main(String[] args){
        Data data1 = new Data(1, 1, 1900);
        Conta c1 = new Conta("Luiz", "Jordany", data1);
        // c1.saldo; ERRO
        System.out.println(c1.getSaldo());
        System.out.println(c1.getNumero());
        System.out.println(c1.getTitular());
        System.out.println(c1.getRendimento());
        System.out.println(c1.getDataDeVencimento());
        	
        Data data2 = new Data(2, 2, 2000);
        Conta c2 = new Conta("Luiz", "Jordany", data2);
        // c2.saldo; ERRO
        System.out.println(c2.getSaldo());
        System.out.println(c2.getNumero());
        System.out.println(c2.getTitular());
        System.out.println(c2.getRendimento());
        System.out.println(c2.getDataDeVencimento());

        System.out.println("\nIdentificador: " + Conta.getIdentificador());
    }
}
