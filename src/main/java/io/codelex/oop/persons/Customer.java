package io.codelex.oop.persons;

public class Customer extends Person {
    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String iD, int age) {
        super(firstName, lastName, iD, age);
        this.customerId = iD;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public void getInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " Id " + customerId + " purchased " + getPurchaseCount() + " items.");

    }
}
