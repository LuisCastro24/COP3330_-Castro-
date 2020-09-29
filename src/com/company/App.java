package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }
        displayBmiStatistics(bmiData);
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        //displayBmiStatistics prints out the average BMI score of the data
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {

        //displayBmiinfo prints out a users BMI score and category using data contained in bodymassindex object
    }

    static boolean moreInput() {
        Scanner getUser = new Scanner(System.in);
        String userInput;
        System.out.println("Please press Y to continue, or N to stop");
        userInput = getUser.next();
        if (userInput.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    static double getUserHeight() {
        double height; //do{//body}while(condition);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your height in inches:");
        do {
            System.out.println("Please enter a number greater than 0.");
            height = sc.nextDouble();
            sc.nextLine();
        }
        while (height < 0);
        return height;

    }

    static double getUserWeight() {
        double weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds");
        do {
            System.out.println("Please enter a number greater than 0");
            weight = sc.nextDouble();
            sc.nextLine();
        }
        while (weight < 0);
        return weight;
    }
}

////
//// Call the Scanner's nextLine() method after reading in a numeric value to clear the input buffer. Failure to do this may result in your program terminating after one iteration.
////
//// It is very painful to write unit tests for console output, but it is possible. You are not required to do so, but you may find it helpful to explore this idea once your program appears to be working.

////Example structure:
////
//// COP3330_hollander
//// |--- hollander_p1
////   |--- src
////     |--- Class1.java
////     |--- Class2.java
////     |--- Application.java
//// |--- hollander_p2
////   |--- src
////     |--- Application.java
//// :
//// |--- hollander_pN
////   |--- src
////     |--- Class1.java
////
//
//        Create a BMI calculation program that reads a set of user’s weight and height (as imperial units), calculates and displays each user’s body mass index, and calculates and displays the average body mass index of all users. Additionally, display the BMI categories for each user from the National Heart Lung and Blood Institute:

//        Additional design constraints are as follows:
//
//        A class called `App` will be used as the application entry point for your program.
//
//        A class called `BodyMassIndex` will be used to calculate the BMI scores and categories.
//
//        A class called `BodyMassIndexTest` will be used to test the public methods of your BodyMassIndex class (This should be a JUnit 5 test class).




















