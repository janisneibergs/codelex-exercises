package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalBonuses) {
        totalSales = totalBonuses;
    }

    public double pay() {
        double payment = super.pay() + totalSales;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Social Security Number: " + socialSecurityNumber + "\n";
        result += "Total sales: " + totalSales + "\n";
        return result;
    }


}
