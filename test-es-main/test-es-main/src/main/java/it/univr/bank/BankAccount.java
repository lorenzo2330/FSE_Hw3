package it.univr.bank;

import java.util.ArrayList;

public class BankAccount {

    ArrayList<Integer> transactions;

    public BankAccount(){ transactions = new ArrayList<Integer>(); }

    public void deposit (int value){ transactions.add(value); }

    public void withdraw (int value){ transactions.add(-value); }

    public int balance(){
        int b = 0;
        for(int t : transactions){ b += t; }
        return b;
    }

}
