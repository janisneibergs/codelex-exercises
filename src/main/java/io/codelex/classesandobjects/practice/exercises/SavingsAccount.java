package io.codelex.classesandobjects.practice.exercises;

public class SavingsAccount {
    private double annualInterestRate;
    private double startingBalance;
    private double sumWithdraw;
    private double sumDeposit;
    private double sumInterest;

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public double withdraw(double withdraw) {
        sumWithdraw += withdraw;
        return sumWithdraw;
    }

    public double deposit(double deposit) {
        sumDeposit += deposit;
        return sumDeposit;
    }

    public double addMonthlyInterest() {
        sumInterest = sumInterest + startingBalance * (getAnnualInterestRate() / 1200);
        return Math.round(sumInterest * 100) / 100;
    }

    public void print() {
        System.out.println("Total deposited: $" + sumDeposit);
        System.out.println("Total withdraw: $" + sumWithdraw);
        System.out.println("Interest earned: $" + (Math.round(sumInterest) * 100) / 100);
        System.out.println("Ending balance: $" + (startingBalance + (Math.round(sumInterest) * 100) / 100 + sumDeposit - sumWithdraw));
    }

}
