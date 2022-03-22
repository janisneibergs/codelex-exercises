package io.codelex.oop.cars;

import java.util.LinkedList;
import java.util.Objects;

public class Car extends Manufacturer {

    private String name;
    private String model;
    private String price;
    private String yearOfManufacture;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(yearOfManufacture, car.yearOfManufacture) && Objects.equals(manufacturers, car.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, model, price, yearOfManufacture, manufacturers);
    }

    LinkedList manufacturers = new LinkedList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }


}
