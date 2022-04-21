package io.codelex.oop.computers;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String battery) {
        this.battery = battery;
    }

    public Laptop(String procesor, String ram, String garphicsCard, String company, String model, String battery) {
        super(procesor, ram, garphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    void printLaptop() {
        System.out.println(super.getModel() + " " + super.getProcesor() + " " + getBattery());
    }
}
