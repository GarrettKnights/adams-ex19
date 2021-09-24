/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise19;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        double weight;
        int height;
        double BMI;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("What is your weight in pounds? ");
        //Scans input to weight
        weight = ScanWord.nextDouble();
        //Asks user for input
        System.out.println("What is your height in inches? ");
        //Scans input to height
        height = ScanWord.nextInt();
        //Calculates BMI
        BMI = (weight / (height * height)) * 703;

        //If underweight
        if (BMI <= 18.4) {
            System.out.println("Your BMI is " + BMI);
            System.out.println("You are underweight. You should see your doctor.");
        }
        //If ideal
        else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Your BMI is " + BMI);
            System.out.println("You are within the ideal weight range.");
        }
        //If overweight
        else if (BMI  >= 25.1) {
            System.out.println("Your BMI is " + BMI);
            System.out.println("You are overweight. You should see your doctor.");
        }
        //If non-valid entry
        else {
            System.out.println("Please enter a valid entry (only numeric)");
        }
    }
}