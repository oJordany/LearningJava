/*
    Exercícios: Variáveis e tipos primitivos

    Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
 */

package chapter02;

public class PrimitiveTypesExercise {
    public static void main(String[] args){
        double totalExpense;
        double januaryExpense = 15000.00;
        double februaryExpense = 23000.00;
        double marchExpense = 17000.00;

        totalExpense = januaryExpense + februaryExpense + marchExpense;

        System.out.printf("A despesa total foi de: R$%.2f%n" , totalExpense);

        double averageMonthlyExpenses = totalExpense/3;

        System.out.printf("A média mensal de gastos foi de: R$%.2f%n", averageMonthlyExpenses);
    }
}
