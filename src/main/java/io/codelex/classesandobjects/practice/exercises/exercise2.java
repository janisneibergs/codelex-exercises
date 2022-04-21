package io.codelex.classesandobjects.practice.exercises;


import java.util.Scanner;
class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startOdo, double endingOdo, double liters){
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double calculateConsumption(){
        double consu = (getEndKilometers() - getStartKilometers())/getLiters();
        return consu;
    }

    public boolean gasHog(){
        if(100/calculateConsumption()>15) return true;
        else return false;
    }

    public boolean economyCar(){
        if(100/calculateConsumption()<5) return true;
        else return false;
    }

    public void fillUp(double milage, double liters){
        milage = getStartKilometers()*0.62137;
    }
}

public class exercise2 {
    public static void main( String[] args )  {

        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;
        double startKilometers1, endKilometers1, liters1;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        System.out.print("Enter first reading: " );
        startKilometers1 = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers1 = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters1  = scan.nextDouble();

        Car car = new Car(startKilometers,endKilometers,liters);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );

        if(car.gasHog())System.out.println("A gas hog");
        else if(car.economyCar())System.out.println("Economy car");
        else System.out.println("Normal car");

        Car car1 = new Car(startKilometers1,endKilometers1,liters1);
        System.out.println( "Kilometers per liter are "  + car1.calculateConsumption() );

        if(car1.gasHog())System.out.println("A gas hog");
        else if(car1.economyCar())System.out.println("Economy car");
        else System.out.println("Normal car");

    }
}
