package solution;

import java.util.Scanner;

//Create a program to calculate the body mass index (BMI) for a person
// using the person’s height in inches and weight in pounds.
// The program should prompt the user for weight and height.
public class Solution19 {
    private static final Scanner in = new Scanner(System.in);
    private int weight;
    private int height;
    private double bmi;
    private String output;
    //this method will ask the user for the appropriate input.
    private int readvalue(String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }
    //this method will calculate the BMI of the user.
    private float calculateBMI(long height, long weight){

        return ((float)(weight / (double)(height * height))) * 703;
    }
    //this method will display the appropriate output.
    private String displayBMI(double bmi){
        String result;
        if ((bmi >= 18.5) && (bmi <= 25.0)){
            result = "You are within the ideal weight range.";
        }
        else if (bmi < 18.5){
            result = "You are underweight. You should see your doctor.";
        }
        else
            result = "You are overweight. You should see your doctor.";
        return result;
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution19 app = new Solution19();
        //call readvalue method to input height and weight.
        app.height = app.readvalue("Enter your height in inches: ");
        app.weight = app.readvalue("Enter your weight in pounds: ");
        //call calculateBMI method to calculate the BMI.
        app.bmi = app.calculateBMI(app.height, app.weight);
        System.out.printf("Your BMI is %.1f.%n",app.bmi);
        //call displayBMI method to display the output.
        app.output = app.displayBMI(app.bmi);
        System.out.println(app.output);
    }
}
