package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Random;

public class exercise6 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] myArray1 = new int[10];
        int[] myArray2 = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray1[i] = rd.nextInt(99) + 1;
        }

        System.arraycopy(myArray1, 0, myArray2, 0, 10);
        myArray1[myArray1.length - 1] = -7;

        System.out.println(Arrays.toString(myArray1));

        System.out.print(Arrays.toString(myArray2));

    }

}
