package solution;

import java.util.Scanner;

/*
Create a program that computes simple interest.
Prompt for the principal amount,
the rate as a percentage,
the time,
and display the amount accrued (principal + interest).
 */
public class Solution12 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args) {
        /*
        ask for the principal, the rate of interest (ROT), and the number of years.
        store these inputs into string variables.
        convert the string variables into either integers or double, depending on the variable.
        call calculate class, which has a CalculateAmount class that will calculate the total value of
        the investment.
        within calculate, call display, which will have a DisplayOutput class to display the output.
         */
        Scanner principal = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        Scanner year = new Scanner(System.in);
        //ask for the principal, ROT, and number of years. Store them into string variables.
        System.out.print("Enter the principal:");
        String principalamt = principal.nextLine();
        System.out.print("Enter the rate of interest:");
        String rateinterest = rate.nextLine();
        System.out.print("Enter the number of years:");
        String numyears = year.nextLine();
        //convert the strings into numeric values.
        double principalamount = Double.parseDouble(principalamt);
        double rateofinterest = Double.parseDouble(rateinterest);
        int numyear = Integer.parseInt(numyears);
        //call Calculate class.
        Calculate mycalculate = new Calculate();
        mycalculate.calculateAmount(principalamount, rateofinterest, numyear);
    }
}
