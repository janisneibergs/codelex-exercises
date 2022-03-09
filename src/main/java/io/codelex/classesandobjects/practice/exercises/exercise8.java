package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;

class SavingsAccount{
    private double moneyInAccount;
    private double annualInterestRate;
    private double accountToBeOpened;
    private static double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public static double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void subtractingTheAmountOfWithdrawal(double withdraw){ //Izņemtā nauda
          setBalance(getBalance()-withdraw);
    }

    public void addTheAmountOfDeposit(double deposited){ //Pievienotā nauda
            setBalance(getBalance()+deposited);
    }

    double addAmountOfMonthlyInterest(){
        double i = getAnnualInterestRate()/12*getBalance();
        return i;
    }
    void userInput(){
        Scanner input = new Scanner(System.in);
        double sumDeposit = 0;
        double sumWithdraw = 0;
        double balance = getBalance();
        System.out.println("How much money is in the account?: $"+ getBalance());

        System.out.print("Enter the annual interest rate: ");
        double rate = input.nextInt();
        setAnnualInterestRate(rate);
        System.out.print("How long has the account been opened? ");
        double open = input.nextInt();
        setAnnualInterestRate(open);
        for(int i = 0; i<open; i++) {
            System.out.print("Enter amount deposited for month "+(i+1)+": ");
            double deposit = input.nextInt();
            sumDeposit +=deposit;
            addTheAmountOfDeposit(deposit);
            System.out.print("Enter amount withdrawn for month "+(i+1)+": ");
            double withdraw = input.nextInt();
            sumWithdraw +=withdraw;
            subtractingTheAmountOfWithdrawal(withdraw);
            balance +=addAmountOfMonthlyInterest();
            setBalance(balance);

        }
        System.out.println("Total deposited: $"+sumDeposit);
        System.out.println("Total withdrawn: $"+sumWithdraw);
        System.out.println("Interest earned: $"+(getBalance()-sumDeposit-sumWithdraw));
        System.out.println("Ending balance: $"+(getBalance()));


    }
}
public class exercise8 {

    public static void main(String[] args) {
        SavingsAccount bank = new SavingsAccount(10000);
        bank.userInput();


    }
}
