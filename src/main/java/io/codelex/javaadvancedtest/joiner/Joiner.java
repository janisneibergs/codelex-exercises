package io.codelex.javaadvancedtest.joiner;

import java.util.List;

public class Joiner<T> {
    public <T> void join(List<T> something, T seperator) {
        for (int i = 0; i < something.size() - 2; i++) {
            System.out.print(something.get(i).toString() + seperator.toString());
        }
        System.out.println(something.get(something.size() - 1).toString());
    }
}
