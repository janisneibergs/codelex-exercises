package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i=2, n;
        int result = 1;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int s = 1; s<=n; s++){
           result *=i;
        }
        System.out.println(result);

    }

}
