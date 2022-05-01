package io.codelex.javaadvancedtest.bankcards;

public class MainCard {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("456789", "Janis", 234, 150);
        creditCard.addMoney(100);
        System.out.println(creditCard);
    }
}
