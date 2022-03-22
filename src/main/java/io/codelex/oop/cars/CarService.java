package io.codelex.oop.cars;

import java.util.LinkedList;

public class CarService extends Car {
    LinkedList<LinkedList<String>> car = new LinkedList<LinkedList<String>>();
    LinkedList<String> manufacturers = new LinkedList<String>();

    public void addCar() {
        manufacturers.add(getName());
        manufacturers.add(getYearOfEstablishment());
        manufacturers.add(getCountry());
        manufacturers.add(getPrice());
        manufacturers.add(getModel());
        manufacturers.add(getYearOfManufacture());
        car.add(manufacturers);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "car=" + car +
                ", manufacturers=" + manufacturers +
                '}';
    }

    public void removeCar(String name) {
        if (car.equals(name)) {
            car.remove(name);
        }
    }

    public void carsList() {
        System.out.println(car.toString());
    }


}
