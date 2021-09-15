package example;

import java.util.Scanner;

/*
Write a program that converts currency.
Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
Print out the new amount in U.S. dollars.
 */
public class Solution11 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    /*
    ask for how much money in euros an individual has, along with the current exchange rate.
    store the inputs into strings.
    call a conversion class that will convert the euros into dollars.
    call a display class to display the output.
     */
    public static void main(String[] args) {
        Scanner euro = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        //prompt the user for the amount of euros and the exchange rate.
        // Store these inputs into strings.
        System.out.print("How many euros are you exchanging?");
        String euros = euro.nextLine();
        System.out.print("What is the exchange rate?");
        String rates = rate.nextLine();
        //convert euros and rates into an integer and a double respectively.
        int euroamount = Integer.parseInt(euros);
        double ratesamount = Double.parseDouble(rates);
        //call conversion class.
        Conversion myconvert = new Conversion();
        myconvert.convert(euroamount, ratesamount);
    }
}
