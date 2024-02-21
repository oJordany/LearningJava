package chapter04;

public class Data{
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia){
        if (dia > 0 && dia <= 31){
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if (mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }

    public void setAno(int ano){
        if (ano >= 1582){
            this.ano = ano;
        }
    }

    public String getData(){
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}