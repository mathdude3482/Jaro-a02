package solution;

import java.util.Scanner;

//Create a program that prompts for your weight, gender,
// total alcohol consumed (in ounces),
// and the amount of time since your last drink.
// Calculate your blood alcohol content (BAC) using the formula specified in the example.
public class Solution17 {
    public static final Scanner gender = new Scanner(System.in);
    public static final Scanner alcohol = new Scanner(System.in);
    public static final Scanner weight = new Scanner(System.in);
    public static final Scanner timealcohol = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        /*
        ask the user for gender, how much alcohol they had, their weight in pounds,
        and the amount of hours since their last drink.
        store the inputs into either integer or double values.
        call a BAC class that will calculate the BAC of the user.
        call a display class that will print out whether or not the user should drive based
        on their BAC.
         */
        System.out.print("Enter a 1 if you are male or a 2 if you are a female:");
        int gendertype = gender.nextInt();
        System.out.print("How many ounces of alcohol did you have?");
        int numalcohol = alcohol.nextInt();
        System.out.print("What is your weight, in pounds?");
        int pounds = weight.nextInt();
        System.out.print("How many hours has it been since your last drink?");
        int hours = timealcohol.nextInt();
        //call the BAC class.
        BAC user = new BAC();
        user.calculatebac(gendertype,numalcohol,pounds,hours);
    }
}
