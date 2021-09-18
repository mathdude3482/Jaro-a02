package solution;
/*
Write a program to compute the value of an investment compounded over time.
The program should ask for the starting amount,
the number of years to invest, the interest rate,
and the number of periods per year to compound.
 */

import java.util.Scanner;

public class Solution13 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args) {
        /*
        ask for the principal, the rate of interest (ROT),
        the number of periods per compound,
        and the number of years.
        store these inputs into string variables.
        convert the string variables into either integers or double, depending on the variable.
        call calculate class, which has a CalculateAmount class that will calculate the total value of
        the investment.
        within calculate, call display, which will have a DisplayOutput class to display the output.
         */
        Scanner principal = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        Scanner compound = new Scanner(System.in);
        Scanner year = new Scanner(System.in);
        //ask for the principal, ROT, number of periods per compound,
        // and number of years. Store them into string variables.
        System.out.print("What is the principal?");
        String principalamt = principal.nextLine();
        System.out.print("What is the rate?");
        String rateinterest = rate.nextLine();
        System.out.print("What is the number of years?");
        String numyears = year.nextLine();
        System.out.print("What is the number of times the interest is compounded per year?");
        String numcompound = compound.nextLine();
        //convert the strings into numeric values.
        int principalamount = Integer.parseInt(principalamt);
        double rateofinterest = Double.parseDouble(rateinterest);
        int numyear = Integer.parseInt(numyears);
        int totalcompound = Integer.parseInt(numcompound);
        //call Calculate class.
        Calculate mycalculate = new Calculate();
        mycalculate.calculateAmount(principalamount, rateofinterest, numyear, totalcompound);
    }
}
