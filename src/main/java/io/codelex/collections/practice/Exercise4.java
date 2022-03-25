package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<String>();
        while (true) {
            Scanner name = new Scanner(System.in);

            System.out.print("Enter name: ");
            String nameEntered = name.nextLine();
            list.add(String.valueOf(nameEntered));
            if (nameEntered == "") {
                break;
            }
        }
        ArrayList<String> newList = new ArrayList<>(list);
        System.out.print("Unique name list contains: ");
        for (int i = 0; i < newList.size(); i++) System.out.print(newList.get(i) + " ");

    }
}
