package io.codelex.oop.cars;

public class EX3 {
    public static void main(String[] args) {
        CarService car = new CarService();

        car.setName("WV");
        car.setCountry("Germany");
        car.setYearOfEstablishment("1800");
        car.setModel("Golf");
        car.setPrice("2000");
        car.setYearOfManufacture("2005");
        car.addCar();


        car.setName("WV");
        car.setCountry("Germany");
        car.setYearOfEstablishment("1800");
        car.setModel("Golf2");
        car.setPrice("2000");
        car.setYearOfManufacture("2005");
        car.addCar();

        System.out.println(car.toString());


    }
}
