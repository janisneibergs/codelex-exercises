package io.codelex.classesandobjects.practice.videostore;


import java.util.ArrayList;
import java.util.Hashtable;

public class VideoStore {


    ArrayList<String> checkOutList = new ArrayList<>();
    Hashtable<String, Integer> store = new Hashtable<>();

    public void addVideo(String name, int rating) {

        store.put(name, rating);

    }

    public void doCheckout(String name) {
        if (store.contains(name)) {
            checkOutList.add(name);
            store.remove(name);
        }
    }

    public void doReturn(String name, int rating) {
        if (checkOutList.contains(name)) {

            int avgRating = (rating + store.get(name)) / 2;
            store.put(name, avgRating);
            checkOutList.remove(name);

        }
    }

    public void listInventory() {
        System.out.println(store.entrySet());

    }

}
