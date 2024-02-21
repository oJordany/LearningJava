package chapter04;

import chapter04.Cliente;
import chapter04.Data;

public class Conta {
    private static int identificador = 0;
    private int numero = 9999;
    // String titular = "Client"; // Valores default
    private double saldo = 0.0; // valores default
    private double limite;
    private Data dataDeVencimento;
    private Cliente titular;

    Conta(){
        this.titular = new Cliente("Name", "Last Name");
        this.numero = ++Conta.identificador;
    }

    Conta(String nomeDoCliente, String sobrenomeDoCliente, Data data){
        System.out.println("construindo uma conta");
        this.titular = new Cliente(nomeDoCliente, sobrenomeDoCliente);
        this.numero = ++Conta.identificador;
        this.dataDeVencimento = data;
    }

    public static int getIdentificador(){
        return Conta.identificador;
    }

    public double getSaldo(){
        return this.saldo + this.limite;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return this.titular.getNome() + " " + this.titular.getSobrenome();
    }
    
    // Verificar o uso do const e do construtor de cópia
    public void setTitular(Cliente cliente){
        this.titular = cliente;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getDataDeVencimento(){
        return this.dataDeVencimento.getData();
    }

    public double getRendimento(){
        return this.saldo * 0.1;
    }

    public boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }   
    }

    public void deposita(double quantidade){
        this.saldo += quantidade > 0 ? quantidade : 0;
    }

    public boolean transferePara(Conta destino, double valor){
        boolean sacou = this.saca(valor);
        if (sacou == false){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }



}
