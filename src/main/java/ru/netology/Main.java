package ru.netology;

import ru.netology.Accounts.Account;
import ru.netology.Accounts.CheckingAccount;
import ru.netology.Accounts.CreditAccount;
import ru.netology.Accounts.SavingsAccount;
import ru.netology.Clients.Clients;

public class Main {
    public static void main(String[] args) {
        Clients accEgor = new Clients("Egor", 3);

        Account acc1 = new CreditAccount("EgorCredit");
        Account acc2 = new CheckingAccount("EgorCheck");
        Account acc3 = new SavingsAccount("EgorSav", 5000L, 5000L);

        System.out.println(accEgor.newAccount(acc3));
        System.out.println(accEgor.newAccount(acc2));
        //System.out.println(accEgor.newAccount(acc1));
        System.out.println("_________________________");
        System.out.println(accEgor.pay(200L));
        //System.out.println(acc3.getBalance());

    }
}