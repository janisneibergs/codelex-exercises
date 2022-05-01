package io.codelex.javaadvancedtest.bankcards;

public class CreditCard extends Card {
    public CreditCard(String number, String owner, int codeCCV, double balance) {
        super(number, owner, codeCCV, balance);
    }

    @Override
    public double addMoney(double moneyToAdd) {
        return super.addMoney(moneyToAdd);
    }

    @Override
    public double takeMoney(double moneyToTake) throws NotEnoughFundsException {

        if (super.takeMoney(moneyToTake) < 100) System.out.println("Warning: Low founds");
        return super.takeMoney(moneyToTake);
    }


}
