package io.codelex.oop.runners;

public enum Runner {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int level;

    Runner(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

}
