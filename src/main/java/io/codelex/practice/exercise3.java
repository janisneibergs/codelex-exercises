package io.codelex.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DatePeriod {
    private LocalDate firstStart;
    private LocalDate firstEnd;
    private LocalDate secondStart;
    private LocalDate secondEnd;
    private LocalDate intersectionStart;
    private LocalDate intersectionEnd;

    public DatePeriod(String firstStart, String firstEnd, String secondStart, String secondEnd) {
        this.firstStart = LocalDate.parse(firstStart, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        this.firstEnd = LocalDate.parse(firstEnd, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        this.secondStart = LocalDate.parse(secondStart, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        this.secondEnd = LocalDate.parse(secondEnd, DateTimeFormatter.ofPattern("d.MM.yyyy"));
    }

    private void kautkas() {

    }

    private void checkIntersection() {
        if (firstStart.isAfter(secondStart) && secondEnd.isAfter(firstEnd)) {
            System.out.println(firstStart + " -> " + firstEnd);
        } else if (firstStart.isAfter(secondStart) && secondEnd.isBefore(firstEnd) && firstStart.isBefore(secondEnd)) {
            System.out.println(firstStart + " -> " + secondEnd);
        } else if (firstStart.isBefore(secondStart) && secondEnd.isBefore(firstEnd) && firstEnd.isAfter(secondEnd)) {
            System.out.println(secondStart + " -> " + secondEnd);
        } else if (firstStart.isAfter(secondStart) && secondEnd.isAfter(firstEnd) && firstStart.isAfter(secondStart)) {
            System.out.println(firstStart + " -> " + firstEnd);
        } else if (firstEnd.isBefore(secondStart) || secondEnd.isBefore(firstStart)) {
            System.out.println("No intersection!!!");
        }

    }

    public void intersection() {
        checkIntersection();
    }
}

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start date one \"dd.MM.yyyy\" ");
        String start1 = input.nextLine();
        System.out.println("Enter end date one \"dd.MM.yyyy\" ");
        String end1 = input.nextLine();

        System.out.println("Enter start date two \"dd.MM.yyyy\" ");
        String start2 = input.nextLine();
        System.out.println("Enter end date two \"dd.MM.yyyy\" ");
        String end2 = input.nextLine();

        DatePeriod inter = new DatePeriod(start1, end1, start2, end2);
        inter.intersection();

    }
}
