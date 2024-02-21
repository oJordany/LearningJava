package chapter03;

import chapter03.Account;
import chapter03.Date;

public class TestAccount {
    public static void main(String[] args){
        Account c1 = new Account();
        c1.cardholderName = "Danilo";
        c1.balance = 100;

        Account c2 = new Account();
        c2.cardholderName = "Danilo";
        c2.balance = 100;

        System.out.println(c1.retrieveDataToPrinting());
        System.out.println();
        System.out.println(c2.retrieveDataToPrinting());
        
        System.out.println();
        if (c1 == c2)
            System.out.println("\033[1mIguais\033[m");
        else
            System.out.println("\033[1mDiferentes\033[m");

        System.out.println();

        Account c3 = c1;
        if (c1 == c3)
            System.out.println("\033[1mIguais\033[m");
        else
            System.out.println("\033[1mDiferentes\033[m");

        Date date = new Date();

        date.day = 28;
        date.month = 8;
        date.year = 2003;
        
        c1.openingDate = date;

        System.out.println("\n" + c1.retrieveDataToPrinting());
    }
}
