package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        List<String> list = new ArrayList(List.of(array));
        list.forEach(x -> System.out.println(x));
        //todo - replace array with an ArrayList and print out the results

        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);
        //todo - replace array with a HashSet and print out the results

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        for (int i = 0; i < array.length; i++) {

            // And set roll no as key and the name as value
            hashMap.put(i, array[i]);
        }

        System.out.println(hashMap);
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
    }
}
