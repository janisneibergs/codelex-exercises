package io.codelex.javaadvancedtest.bankcards;

public class DebitCard extends Card {
    public DebitCard(String number, String owner, int codeCCV, double balance) {
        super(number, owner, codeCCV, balance);
    }

    @Override
    public double addMoney(double moneyToAdd) {
        if (super.addMoney(moneyToAdd) > 10000) System.out.println("Warning: Too much money");
        return super.addMoney(moneyToAdd);
    }

    @Override
    public double takeMoney(double moneyToTake) throws NotEnoughFundsException {
        return super.takeMoney(moneyToTake);
    }
}
