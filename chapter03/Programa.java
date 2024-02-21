package chapter03;

import chapter03.Conta;
import chapter03.Carro;

public class Programa {
    public static void main(String[] args){
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular.nome = "Jordany";
        minhaConta.saldo = 710.00;
        
        // Dois atributos que estão soltos lá na classe, por isso dá de acessar aqui
        System.out.println("\033[35mTitular: \t\033[m" + minhaConta.titular.nome);
        System.out.printf("\033[36mSaldo:\033[m \t\tR$%.2f%n" , minhaConta.saldo);

        // Sacando 300 reais
        boolean sacou = minhaConta.saca(300);
        System.out.println("\033[31mApós tentativa \033[1m" + sacou + "\033[0;31m de sacar R$300,00\033[m");
        System.out.printf("\033[36mSaldo:\033[m \t\tR$%.2f%n" , minhaConta.saldo);
        
        // Depositando 1800 reais
        minhaConta.deposita(1800);
        System.out.println("\033[31mApós depositar R$1800,00\033[m");
        System.out.printf("\033[36mSaldo:\033[m \t\tR$%.2f%n" , minhaConta.saldo);

        // Criando referências que apontam para o mesmo objeto
        Conta c1 = new Conta();
        c1.saldo = 300.00;
        c1.titular.nome = "Drake";

        Conta c2 = c1;
        // c1 e c2 são referências

        System.out.println("\nTeste Referências que apontam para o mesmo objeto");
        System.out.printf("c1:\nTitular: %s | Saldo %.2f%n", c1.titular.nome, c1.saldo);
        System.out.printf("c2:\nTitular: %s | Saldo %.2f%n", c2.titular.nome, c2.saldo);


        // Comparando objetos
        Conta c3 = new Conta();
        c3.titular.nome = "Speed";
        c3.saldo = 1000;

        Conta c4 = new Conta();
        c4.titular.nome = "Speed";
        c4.saldo = 1000;
        
        System.out.println("Comparando c3 == c4 : " + (c3 == c4));
        // Isso dá false, pois são duas referências que apontam para objetos diferentes

        System.out.println("Comparando c1 == c2 : " + (c1 == c2));
        // Aqui já é diferente, vai dar true, pois as referências apontam para o mesmo objeto

        //Usando o método transfere()
        System.out.println("Transferindo 1000 reais da conta c4 para minhaConta");
        c4.transferePara(minhaConta, 1000);
        System.out.printf("minhaConta:\nTitular: %s | Saldo %.2f%n", minhaConta.titular.nome, minhaConta.saldo);
        System.out.printf("c4:\nTitular: %s | Saldo %.2f%n", c4.titular.nome, c4.saldo);

        // Testando a classe carro
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        // liga o carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
}
