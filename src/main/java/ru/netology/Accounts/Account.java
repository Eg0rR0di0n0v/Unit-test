package ru.netology.Accounts;

public class Account {
    private final String name;
    private long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name) {
        this(name, 0L);
    }

    public Account() {
        this("No_Name", 0L);
    }


    public boolean pay(long pay) {
        /*        boolean flag = false;
         *      if (pay <= balance) {
         *          balance -= pay;
         *           flag = true;
         *           //System.out.println("Funds debited " + pay);
         *       } else {
         *           //System.out.println("!!!Insufficient funds!!!");
         *           flag = false;
         *       }
         *       return flag;
         */
        balance -= pay;
        return true;
    }

    public boolean add(long add) {
        boolean flag = true;
        balance += add;
        //System.out.println("Balance is replenished " + add);
        return flag;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public boolean getRequest(long amount) {
        return balance > amount;
    }

}
