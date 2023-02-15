package ru.netology.Clients;

import ru.netology.Accounts.Account;

public class Clients {
    private final Account[] clientAccount;

    public Clients(String name, int maxAccounts) {
        clientAccount = new Account[maxAccounts];
    }


    public boolean newAccount(Account account) {
        for (int i = 0; i < clientAccount.length; i++) {
            if (clientAccount[i] == null) {
                clientAccount[i] = account;
                return true;
            }
        }
        System.out.println("There are no places to add a new account!");
        return false;
    }

    public boolean pay(long amount) {
        for (Account account : clientAccount) {
            if (account == null) {
                continue;
            }
            if (account.getRequest(amount)) {
                return account.pay(amount);
            }
        }
        return false;
    }
}

