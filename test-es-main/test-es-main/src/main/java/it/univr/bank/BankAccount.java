package it.univr.bank;

public class BankAccount {

    int[] transactions;
    int lastMove;

    public BankAccount(){
        lastMove = 0;
        transactions = new int[1024];
    }

    public void deposit (int value){
        transactions[lastMove++] = value;
    }

    public void withdraw (int value){
        transactions[lastMove++] = -value;
    }

}
