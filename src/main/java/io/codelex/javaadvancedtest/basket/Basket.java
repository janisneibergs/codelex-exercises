package io.codelex.javaadvancedtest.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    T item;
    int size;
    List<T> basketInside = new ArrayList<T>();

    public Basket(T item, int size, List<T> basketInside) {
        this.item = item;
        this.size = size;
        this.basketInside = basketInside;
    }

    public void addToBasket(T item) {
        // check type of generics
        if (item.getClass() == basketInside.getClass()) {
            basketInside.add(item);
            size++;
        } else {
            System.out.println("Wrong item");
        }
    }

    public void removeFromBasket(T item) {
        if (item.getClass() == basketInside.getClass()) {
            basketInside.remove(item);
            size--;
        } else {
            System.out.println("Wrong item");
        }
    }


}
