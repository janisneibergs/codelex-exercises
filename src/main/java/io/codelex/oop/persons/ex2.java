package io.codelex.oop.persons;

public class ex2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Jānis", "Neibergs", "1", 38, "grāmatvedis", "12.02.2009");
        employee.getInfo();

        Customer customer = new Customer("Jānis", "Neibergs", "CI123", 38);
        customer.setPurchaseCount(15);
        customer.getInfo();
    }
}
