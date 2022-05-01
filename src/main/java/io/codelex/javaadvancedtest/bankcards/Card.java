package io.codelex.javaadvancedtest.bankcards;

public abstract class Card {

    private String number;
    private String owner;
    private int codeCCV;
    private double balance;

    public Card(String number, String owner, int codeCCV, double balance) {
        this.number = number;
        this.owner = owner;
        this.codeCCV = codeCCV;
        this.balance = balance;
    }

    public double addMoney(double moneyToAdd) {
        balance += moneyToAdd;
        return balance;
    }

    public double takeMoney(double moneyToTake) throws NotEnoughFundsException {
        try {
            if (balance > moneyToTake) balance -= moneyToTake;
        } catch (Exception e) {
            throw new NotEnoughFundsException("Access denied - You must be at least 18 years old.");
        }
        return balance;
    }


}
