package io.codelex.testmape;

public class testfails {


    public static void main(String[] args) {
        int lineStart = 1;

        for (int line = 0; line < 10; line++) {

            for (int i = lineStart; i < lineStart+11; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("CozaLoza ");
                } else if (i % 3 == 0) {
                    System.out.print("Coza ");
                } else if (i % 5 == 0) {
                    System.out.print("Loza ");
                } else if (i % 7 == 0) {
                    System.out.print("Woza ");
                } else {
                    System.out.print(i + " ");
                }
            }
            lineStart = lineStart+10+1;
            System.out.print("\n");
        }
    }
}
