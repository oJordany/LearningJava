package chapter03;

import chapter03.Cliente;

public class Conta {
    private int numero = 9999;
    // String titular = "Client"; // Valores default
    double saldo = 0.0; // valores default
    Cliente titular = new Cliente();

    boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }   
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor){
        boolean sacou = this.saca(valor);
        if (sacou == false){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }


}
