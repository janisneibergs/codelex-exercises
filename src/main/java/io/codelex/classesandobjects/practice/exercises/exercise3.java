package io.codelex.classesandobjects.practice.exercises;

class FuelGauge{

    private int liters;
    private int addFuel;
    private int burnFuel;

    public int getBurnFuel() {
        return burnFuel;
    }

    public void setBurnFuel(int burnFuel) {
        this.burnFuel = currentFuel()-(Odometer.getAddMiles()/10);
    }

    public int getAddFuel() {
        return addFuel;
    }

    public void setAddFuel(int addFuel) {
        this.addFuel = addFuel;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public int currentFuel(){
        if(getLiters()+getAddFuel()<70)
            return getLiters()+getAddFuel();
        else {
            setAddFuel(70 - getLiters());
            return 70;
        }
    }

    public int decrementFuel(){
        if(currentFuel()>0) {
            return currentFuel() - getBurnFuel();
        }else{
            return 0;
        }
    }

    public void travel(){
        Odometer.currentMiles();
    }
}

class Odometer {
    private static double miles;
    private static double addMiles;

    public static int getAddMiles() {
        return (int) addMiles;
    }

    public void setAddMiles(int addMiles) {
        this.addMiles = addMiles;
    }

    public static double getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public static double currentMiles(){
        return getMiles();
    }

    public double drive(){
        if(getMiles()+getAddMiles()<999.999){
            return getMiles()+getAddMiles();
        }else{
            return (1000 + getMiles()-getAddMiles());
        }
    }
}

public class exercise3 {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge();
        Odometer odo = new Odometer();

        gauge.setAddFuel(20);
        gauge.setLiters(30);
        gauge.setBurnFuel(10);

        odo.setAddMiles(1000);
        odo.setMiles(150);

        System.out.println(gauge.currentFuel());
        System.out.println(odo.drive());
    }
}
