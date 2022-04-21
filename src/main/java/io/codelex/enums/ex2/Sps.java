package io.codelex.enums.ex2;

import java.util.Random;

public enum Sps {

    SCISSORS("s"),
    PAPER("p"),
    STONE("t");

    String key;

    Sps(String key) {

        this.key = key;

    }

    public Sps getRandomValue() {

        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
