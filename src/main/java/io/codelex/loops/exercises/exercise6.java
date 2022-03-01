package io.codelex.loops.exercises;

public class exercise6 {
    public static void main(String[] args) {
        int lineStart = 1;

        for (int line = 0; line < 5; line++) {

            for (int i = lineStart; i < lineStart+20; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");

                } else {
                    System.out.print(i + " ");
                }
            }
            lineStart = lineStart+20;
            System.out.print("\n");
        }
    }
}
