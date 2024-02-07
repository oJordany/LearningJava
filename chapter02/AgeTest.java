package chapter02;

public class AgeTest {
    public static void main(String[] args){
        //imprime a idade
        int age = 20;
        System.out.println("O valor da idade eh: " + age);

        //gera uma idade no ano seguinte
        int ageInNextYear = ++age;

        //imprime a idade no ano que vem
        System.out.println("O valor da idade no ano que vem eh: " + ageInNextYear);
    }
}
