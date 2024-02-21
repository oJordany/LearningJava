package chapter03;

import chapter03.Motor;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    boolean estaLigado = false;
    Motor motor = new Motor();

    // liga o carro
    void liga(){
        System.out.println("O carro está ligado");
        this.estaLigado = true;
    }

    // acelera uma certa quantidade
    void acelera(double quantidade){
        if (estaLigado)
            this.velocidadeAtual += quantidade;
        else
            System.out.println("Primeiro ligue o carro");
    }

    // devolve a marcha do carro
    int pegaMarcha() {
        if (!this.estaLigado || this.velocidadeAtual < 0)
            return -1;
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
            return 1;
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
            return 2;
        return 3;
    }
}
