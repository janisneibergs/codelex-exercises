package io.codelex.loops.exercises;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of figure: ");
        int count = input.nextInt();
    for(int s=0; s<count; s++) {
        for (int i = 1; i <= count*8; i++) {
            int line = s*4-1;
            if(i<count*4-line) {
                System.out.print("/");
            }else if(i>count*4+line+1){
                System.out.print("\\");
            }else{
                System.out.print("*");
            }

        }
        System.out.println();
    }
    }
}
