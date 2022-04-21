package io.codelex.oop.parcels;

public interface Validatable {

    default boolean validate() {
        return false;
    }
}
