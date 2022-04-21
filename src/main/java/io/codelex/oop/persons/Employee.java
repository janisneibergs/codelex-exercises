package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String iD, int age, String position, String startedWorking) {
        super(firstName, lastName, iD, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(startedWorking, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        ;
    }

    public Employee(String firstName, String lastName, String iD, int age, LocalDate of) {
        super(firstName, lastName, iD, age);
    }

    public int getWorkExperience() {
        return Year.now().getValue() - startedWorking.getYear();
    }

    @Override
    public void getInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " works as " + position + " for " + getWorkExperience() + " years.");
    }
}
