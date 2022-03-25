package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;


    public PhoneDirectory() {
        data = new TreeMap<String, String>();
    }

    private String find(String name) {
        return data.get(name);
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        data.put(name, number);
    }

    public void print() {
        for (Map.Entry<String, String> entry : data.entrySet())
            System.out.println(entry.getKey() + ":  " + entry.getValue());
    }

}


