package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Accounts.Account;
import ru.netology.Accounts.CheckingAccount;
import ru.netology.Accounts.CreditAccount;

public class bankAccounts {

    @Test
    public void testCheckAcc(){
        Account test = new CheckingAccount("test");
        int money = 500;
        int pay = 150;

        Assertions.assertEquals("test", test.getName());
        Assertions.assertEquals(0,test.getBalance());
        Assertions.assertFalse(test.pay(100));

        test.add(money);

        Assertions.assertEquals(money, test.getBalance());
        Assertions.assertTrue(test.pay(pay));
        Assertions.assertEquals(money - pay, test.getBalance());
        for (int i = 0; i < 2; i++){
            Assertions.assertTrue(test.pay(pay));
        }
        Assertions.assertFalse(test.pay(pay));
        Assertions.assertEquals(50, test.getBalance());
        System.out.println(test.add(0 - money) + "   " + test.getBalance() + "   <-  !!!BUG!!!"); //____!!!BUG!!!____
        Assertions.assertFalse(test.pay(pay));


    }

    @Test
    public void testCreditAcc(){
        Account test = new CreditAccount("test");

        Assertions.assertEquals("test", test.getName());
        Assertions.assertEquals(0,test.getBalance());
        Assertions.assertTrue(test.pay(100));
        Assertions.assertEquals(-100,test.getBalance());
        Assertions.assertFalse(test.add(500));

    }



}
