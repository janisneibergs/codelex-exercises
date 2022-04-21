package io.codelex.polymorphism.practice.exercise3;

public class Ex3 {
    public static void main(String[] args) {
        Student student = new Student(7.5);
        Employee employee = new Employee("Mechanic");

        student.setFirstName("Jānis");
        student.setLastName("Neibergs");
        student.setId(2);

        employee.setFirstName("Ieva");
        employee.setLastName("Nezinu");
        employee.setId(4);

        student.display();
        employee.display();
    }
}
