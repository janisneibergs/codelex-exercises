package io.codelex.typesandvariables.Exercises;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int summ = 0;
        System.out.println("Cik skaitļus ievadīsiet");
        int numberCount = Integer.parseInt(myObj.nextLine());
        for(int i = 1; i<numberCount+1; i++){
            System.out.println("Ievadiet "+i+" skaitli");
            int number = Integer.parseInt(myObj.nextLine());
            summ = summ + number;

        }
        System.out.println(summ);
    }
}
