package io.codelex.exceptions;

public class Exercise2 {

    public static void main(String[] args) {
        methodA(25, 5);

    }

    public static void methodC(int number, int div) throws ArithmeticException {
        try {
            System.out.println(number + " / " + div + " = " + number / div);
            System.out.println("Method C ");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }
    }

    public static void methodB(int number, int div) throws ArithmeticException {
        try {
            methodC(number, div);
            System.out.println("Method B ");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }
    }

    public static void methodA(int number, int div) throws ArithmeticException {
        try {
            methodB(number, div);
            System.out.println("Method A ");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }
    }
}
