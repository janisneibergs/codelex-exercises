package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0.00);

//        System.out.println("Initial state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);

        mattsAccount.withdrawal(100);

        myAccount.deposit(100);
        myAccount.transfer(mattsAccount, myAccount, 100);
        System.out.println("Matt's account balance is now: " + mattsAccount.balance());
        System.out.println("My account balance is now: " + myAccount.balance());


    }
}

