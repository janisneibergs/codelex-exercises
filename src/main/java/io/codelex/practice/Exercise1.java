package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;


public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int workDays = 0;
        
        System.out.println("Enter start date \"dd.MM.yyyy\" ");
        String start = input.nextLine();
        System.out.println("Enter end date \"dd.MM.yyyy\" ");
        String end = input.nextLine();

        LocalDate date1 = LocalDate.parse(start, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        LocalDate date2 = LocalDate.parse(end, DateTimeFormatter.ofPattern("d.MM.yyyy"));
        System.out.println(date1.getDayOfWeek());
        long daysBetween = DAYS.between(date1, date2);
        for (int i = 0; i <= daysBetween; i++) {
            if (isWeekend(date1)) {
                date1 = date1.plusDays(1);
            } else {
                workDays++;
                date1 = date1.plusDays(1);
            }
        }
        System.out.println(workDays * 8);
    }

    public static boolean isWeekend(LocalDate date) {
        if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return true;
        } else {
            return false;
        }
    }
}
