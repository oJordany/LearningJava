package chapter04;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    Cliente(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        mudaCPF(cpf);
    }

    public void mudaCPF(String cpf){
        if (this.idade <= 60)
            validaCPF(cpf);
        
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    private void validaCPF(String cpf){
        // série de regras, aqui falha caso não seja válida
    }


}

