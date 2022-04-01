package io.codelex.javaadvancedtest.bankcards;

public class NotEnoughFundsException extends Throwable {
    public NotEnoughFundsException(String s) {
        super("Sorry not enough founds");
    }
}
