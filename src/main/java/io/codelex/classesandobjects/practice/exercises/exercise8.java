package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;


public class exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = input.nextDouble();
        SavingsAccount savings = new SavingsAccount(balance);
        System.out.println("Enter the annual interest rate: ");
        double rate = input.nextDouble();
        savings.setAnnualInterestRate(rate);
        System.out.println("How long has the account been opened? ");
        double time = input.nextDouble();
        for (int i = 0; i < time; i++) {
            System.out.println("Enter amount deposited for month: " + (i + 1) + " ");
            double deposit = input.nextDouble();
            savings.deposit(deposit);
            System.out.println("Enter amount withdrawn for " + (i + 1) + " ");
            double withdraw = input.nextDouble();
            savings.withdraw(withdraw);
            savings.addMonthlyInterest();
        }

        savings.print();


    }
}
