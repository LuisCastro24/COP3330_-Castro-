package com.company;

import java.util.Scanner;

public class BodyMassIndex {
    private double Height;
    private double Weight;
    private String bmiCategory;
    private static double bmiResult;
    Scanner input = new Scanner(System.in);


    public BodyMassIndex(double height, double weight) {
        this.Height = height;
        this.Weight = weight;
    }


    static String displayBmiCategory(BodyMassIndex bmi) {
        String bmiCategory = "";
        if (bmiResult < 18.5) {
            //print statement
            bmiCategory = "underWeight";
        }
        else if (bmiResult <= 18.5 && bmiResult >= 24.9) {
            bmiCategory = "normalWeight";
        }
        else if ((bmiResult >= 25 && bmiResult <= 29.9)) {
            bmiCategory = ("overWeight");
        }
        else if (bmiResult >= 30) {
            bmiCategory = "obese";
        }
        //        Normal weight = 18.5–24.9
//        Overweight = 25–29.9
//        Obesity = BMI of 30 or greater


return bmiCategory;
    }

    static double calculateBmi(double height, double weight) {
        //String bmiCategory;
        double bmi;

        bmi = 703 * weight / (height * height);
        //bmi formula = 703 * pounds / inches ^2
return bmi;


    }
}
//bodymassIndex class contains a public method to calculate a BMI based on height and weight




