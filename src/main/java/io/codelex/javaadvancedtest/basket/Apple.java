package io.codelex.javaadvancedtest.basket;

import java.util.List;

public class Apple<T> extends Basket {
    public Apple(Object item, int size, List basketInside) {
        super(item, size, basketInside);
    }

}
