package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        //TODO: add 5 values to Set.
        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Brown");
        mySet.add("Green");
        //..

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!

        //TODO: iterate through all elements in set
        String[] element = mySet.toArray(new String[mySet.size()]);
        for (int i = 0; i < element.length; i++) {

            System.out.println(element[i]);
        }


        //TODO: remove all values from set
        HashSet set = new HashSet();
        set = (HashSet) set.clone();
        set.removeAll(set);
        System.out.println("Should be empty: " + set);

        //TODO: check if it is possible to add duplicated values
        if (!mySet.contains("Green")) mySet.add("Green");
        else System.out.println("Already in List");
        if (!mySet.contains("Green")) mySet.add("Orange");
        else System.out.println("Already in List");
        if (!mySet.contains("Green")) mySet.add("Green");
        else System.out.println("Already in List");
        if (!mySet.contains("Green")) mySet.add("Purple");

        System.out.println(mySet);
    }

}
