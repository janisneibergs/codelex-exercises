package io.codelex.javaadvancedtest.basket;

import java.util.List;

public class Mushroom<T> extends Basket {


    public Mushroom(Object item, int size, List basketInside) {
        super(item, size, basketInside);
    }

}
