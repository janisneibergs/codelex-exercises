package io.codelex.arrays.exercises;

import java.util.Random;

public class exercise6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] myArray1 = new int[10];
        int[] myArray2 = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray1[i] = rd.nextInt(99)+1;


        }
//        for (int i = 0; i < 10; i++) {
//            myArray2[i] = myArray1[i];
//        } Iespēja pārkopēt ar for

        System.arraycopy(myArray1, 0, myArray2, 0, 10);
        myArray1[myArray1.length-1]= -7;
        for (int i = 0; i < 10; i++) {
            System.out.print(myArray1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(myArray2[i]+" ");
        }
    }

}
