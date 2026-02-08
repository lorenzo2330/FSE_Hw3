package it.univr.bank;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestBankAccount {

    @Test
    public void testEmpty(){BankAccount b = new BankAccount();}

    @Test
    public void testBalance(){
        BankAccount b = new BankAccount();
        assertEquals(0, b.balance());       //Test 1 (empty balance)
        
        b.deposit(10);
        assertEquals(10, b.balance());      //Test 2 (balance = 10)
        
        b.withdraw(8);
        assertEquals(2, b.balance());       //Test 3 (balance = 2)
    }
    
    @Test
    public void testBalance1000Iteration(){
        BankAccount b = new BankAccount();
        for(int i = 0; i < 1000; i++){ b.deposit(10); }
        for(int i = 0; i < 1000; i++){ b.withdraw(10); }
        assertEquals(0, b.balance());
    }


}
