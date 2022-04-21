package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Brown");
        //TODO: Add 10 values to list
        System.out.println(colors);
        //TODO: Add new value at 5th position
        colors.add(4, "Olive");
        System.out.println(colors);
        //TODO: Change value at last position (Calculate last position programmatically)
        colors.set(colors.size() - 1, "Bronze");
        System.out.println(colors);
        //TODO: Sort your list in alphabetical order
        Collections.sort(colors);
        System.out.println(colors);
        //TODO: Check if your list contains "Foobar" element
        if (colors.contains("Foobar")) System.out.println("List contains");
        else System.out.println("Not containing ");
        //TODO: Print each element of list using loop

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

}
