package io.codelex.exceptions;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput("");
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (Exception e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput(String s) throws Exception {
        double d = Double.parseDouble(s);

        if (d < 0) {
            throw new NonPositiveNumberException("Input is less than 0");
        }
        return d;

    }

    static class NonPositiveNumberException extends Exception {
        public NonPositiveNumberException(String str) {
            super(str);
        }
    }
}

