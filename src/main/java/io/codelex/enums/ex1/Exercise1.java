package io.codelex.enums.ex1;

public class Exercise1 {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;

        switch (dir) {
            case NORTH:
                System.out.println("North:up:0");
            case SOUTH:
                System.out.println("South:down:1");
            case EAST:
                System.out.println("East:right:2");
            case WEST:
                System.out.println("West:left:3");
        }
    }
}
