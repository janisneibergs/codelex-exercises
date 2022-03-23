package io.codelex.exceptions;

public class Exercise2 {

    public static void main(String[] args) {
        methodA(25, 0);

    }

    public static void methodA(int number, int div) throws ArithmeticException {
        try {
            System.out.println(number + " / " + div + " = " + number / div);
        } catch (ArithmeticException e) {
            methodB();
        }
    }

    public static void methodB() throws ArithmeticException {
        methodC();
    }

    public static void methodC() throws ArithmeticException {
        System.out.println("You can't divide by 0");
    }
}
