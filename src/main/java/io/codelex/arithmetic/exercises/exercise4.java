package io.codelex.arithmetic.exercises;

public class exercise4 {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int factorial = 1;
        for(int s=start; s<=end; s++){
            factorial *= s;
        }
        System.out.println(factorial);
    }
}
