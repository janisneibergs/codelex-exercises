package io.codelex.arithmetic.exercises;

public class exercise8 {
    static void salary(double basePay, double hoursWorked){
        if(basePay < 8 || hoursWorked > 60){
            System.out.println("error");
        }else if(hoursWorked > 40){
            System.out.println(basePay*40+((hoursWorked-40)*basePay*1.5));
        }else{
            System.out.println(basePay*hoursWorked);
        }

    }
    public static void main(String[] args) {
        double employee1BasePay = 7.50;
        double employee2BasePay = 8.20;
        double employee3BasePay = 10.00;
        double employee1HoursWorked = 35;
        double employee2HoursWorked = 47;
        double employee3HoursWorked = 73;
        salary(employee1BasePay, employee1HoursWorked);
        salary(employee2BasePay, employee2HoursWorked);
        salary(employee3BasePay, employee3HoursWorked);


    }
}
