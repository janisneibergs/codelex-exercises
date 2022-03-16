package io.codelex.practice;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class exercise2 {
    public int day;
    public int month;
    public int year;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start date \"dd.MM.yyyy\" ");
        String start = input.nextLine();
        System.out.println("Enter end date \"MM.yyyy\" ");
        String end = input.nextLine();
        end = "01." + end;

        LocalDate launchDate = LocalDate.parse(start, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        LocalDate restartMonth = LocalDate.parse(end, DateTimeFormatter.ofPattern("d.MM.yyyy"));

        long daysBetween = DAYS.between(launchDate, restartMonth);
        if (launchDate.isBefore(restartMonth)) {
            for (int i = 0; i < daysBetween / 7; i++) {
                launchDate = launchDate.plusDays(14);
                if (launchDate.getMonth().equals(restartMonth.getMonth())) {
                    System.out.println(launchDate);
                }
            }
        } else {
            for (int i = 0; i < daysBetween / -7; i++) {
                launchDate = launchDate.minusDays(14);
                if (launchDate.getMonth().equals(restartMonth.getMonth())) {
                    System.out.println(launchDate);
                }
            }
        }
    }


}
