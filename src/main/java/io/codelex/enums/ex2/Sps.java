package io.codelex.enums.ex2;

public enum Sps {
    SCISSORS("s"),
    PAPER("p"),
    STONE("t");

    public final String key;

    private Sps(String key) {
        this.key = key;
    }
}
