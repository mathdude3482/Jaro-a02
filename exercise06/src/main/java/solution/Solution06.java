package solution;

//Create a program that determines how many years you have left until retirement
// and the year you can retire.
// It should prompt for your current age and the age you want to retire
// and display the output.

import java.util.Scanner;


public class Solution06 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args) {
        /*
         Ask for age.
         ask for what age the individual wants to retire.
         call the age class that contains the calculation method.
         print out the result.
         */
        Scanner currentage = new Scanner(System.in);
        Scanner retiredage = new Scanner(System.in);
        //ask for the age and store them into strings.
        System.out.print("What is your current age?");
        String current = currentage.nextLine();
        System.out.print("At what age would you like to retire?");
        String retire = retiredage.nextLine();
        // convert the strings into integers that can be used for calculations.
        int agecurrent = Integer.parseInt(current);
        int ageretired = Integer.parseInt(retire);
        //call age class that will print the output.
        Age individual = new Age();
        individual.calculation(agecurrent, ageretired);
    }
}
