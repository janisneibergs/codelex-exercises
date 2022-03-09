package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;
class Date {
    private static int month;
    private static int day;
    private static int year;



    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public static int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int trueDay() {
        if (getDay() > 0 && getDay() < 32) {
            if (getMonth() == 2 || getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) {
                if (getDay() < 31) {
                    if (getMonth() == 2 && getYear() % 4 == 0 && getDay() == 28) {
                        return getDay();
                    } else if (getMonth() == 2 && getYear() % 4 != 0 && getDay() == 29) {
                        return getDay();
                    } else if (getMonth() == 2) {
                        return 0;
                    }else
                    return getDay();
                }else return getDay();
            }else
            return getDay();
        }else
        return getDay();
    }

    public static int trueMonth(){
        if(getMonth() < 13 && getMonth()>0){
            return getMonth();
        }else{
            return 0;
        }
    }

    public static void displayDate(){
        if(trueDay()!=0 && trueMonth()!=0){
            System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
        }else{
            System.out.println("Wrong date!!");
        }
    }
}

public class exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.print("Enter Day ");
        day = scan.nextInt();

        System.out.print("Enter Month ");
        month = scan.nextInt();

        System.out.print("Enter Year ");
        year = scan.nextInt();

        Date date = new Date(month, day, year);
        Date.displayDate();
    }
}
