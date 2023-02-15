package ru.netology.Accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name) {
        super(name);
    }

    @Override
    public boolean pay(long pay) {
        boolean flag = true;
        if ((getBalance() - pay) >= 0) {
            super.pay(pay);
        } else {
            flag = false;
        }
        return flag;
    }
}
