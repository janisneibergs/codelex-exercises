package io.codelex.arithmetic.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class exercise9 {
    public static void main(String[] args) {
        //BigDecimal weightMetric = new BigDecimal(85);
        //BigDecimal heightMetric = new BigDecimal(180);
       // BigDecimal weightPounds = weightMetric.multiply(BigDecimal.valueOf(2.2046));
       // BigDecimal heightInches = heightMetric.divide(BigDecimal.valueOf(2.54));
       // BigDecimal bmi =
        double weightMetric = 85;
        double heightMetric = 180;
        double weightPounds = weightMetric *2.2046;
        double heightInches = heightMetric/2.54;
        double bmi = weightPounds*703/(heightInches*heightInches);
        BigDecimal roundedBmi = new BigDecimal(bmi);
        roundedBmi = roundedBmi.setScale(1, RoundingMode.HALF_UP);
        if(bmi < 18.5){
            System.out.println("You are underweight. Your bmi is "+roundedBmi);
        }else if(bmi >= 18.5 && bmi<= 25){
            System.out.println("Your weight is optimal. Your BMI is "+roundedBmi);
        }else{
            System.out.println("You are overweight. Your BMI is "+roundedBmi);
        }

    }
}
