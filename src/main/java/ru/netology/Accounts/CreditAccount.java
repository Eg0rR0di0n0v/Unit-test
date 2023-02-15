package ru.netology.Accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name) {
        super(name);
    }

    @Override
    public boolean getRequest(long amount) {
        return true;
    }

    @Override
    public boolean add(long add) {
        if (super.getBalance() + add > 0) {
            return false;
        } else {
            super.add(add);
        }
        return super.add(add);
    }
}