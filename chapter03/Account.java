package chapter03;

import chapter03.Date;

public class Account {
    String cardholderName;
    int accountNumber;
    int agency;
    double balance;
    Date openingDate;

    boolean withdraw(double amount){
        if (amount < balance && amount > 0){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }

    double calculateYield(){
        return this.balance * 0.1;
    }

    String retrieveDataToPrinting(){
        return  "\033[1;32mCardholder Name\t|\t" + this.cardholderName + "\033[m" +
                "\n\033[1;31mAccount Number\t|\t" + this.accountNumber + "\033[m" +
                "\n\033[1;34mAgency\t\t|\t" + this.agency + "\033[m" +
                "\n\033[1;36mBalance\t\t|\t" + this.balance + "\033[m" +
                "\n\033[1;35mOpening Date\t|\t" + ( this.openingDate == null ? 
                                                    this.openingDate : 
                                                    this.openingDate.retriveDateToPrinting()) + "\033[m";
    }

}
