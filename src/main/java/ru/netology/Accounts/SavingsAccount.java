package ru.netology.Accounts;

public class SavingsAccount extends Account {
    long minBalance;

    public void setMinBalance(long minBalance) {
        this.minBalance = minBalance;
    }

    public long getMinBalance() {
        return minBalance;
    }

    public SavingsAccount(String name, long balance, long minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    public SavingsAccount(String name, long minBalance) {
        this(name, 0L, minBalance);
    }

    @Override
    public boolean getRequest(long amount) {
        return minBalance <= (getBalance() - amount);
    }

    @Override
    public boolean pay(long pay) {
        boolean flag = true;
        if (minBalance <= (getBalance() - pay)) {
            super.pay(pay);
        } else {
            flag = false;
        }
        return flag;
    }

}
