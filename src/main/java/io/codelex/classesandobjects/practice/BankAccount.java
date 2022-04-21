package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        //todo
    }

    public final void withdraw(double amount) {
        //todo
    }

    public String toString(){
        System.out.println(name + ",  $"+balance);

        return null;
    }

    public static void main(String[] args) {
        BankAccount benben = new BankAccount();
        benben.name = "Benson";
        benben.balance = 17.25;
        benben.toString();

    }

}
