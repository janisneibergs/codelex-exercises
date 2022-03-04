package io.codelex.arrays.practice;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };
        int sum = 0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == 1245){
                sum++;

            }
        }
        if(sum > 0){

            System.out.println("Contains!");
        }else{
                System.out.println("Not containing!");
            }
        }
        /*
        fixme - check if contains number 1245 
        for (?) {
            ......
            System.out.println("Contains!");
        }
        */
    }

