package solution;

import java.util.Scanner;

//Write a simple program to compute the tax on an order amount.
// The program should prompt for the order amount and the state.
// The program should display the subtotal, tax, and total for Wisconsin residents
// but display just the total for non-residents.
public class Solution14 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args) {
        /*
        Ask for the order amount and the state. Store these into string variables.
        Convert the order amount to a double.
        Call the Taxcalculator class, which has a calculate method that will differ based on if the
        state is "WI" or not.
        Call the appropriate display class that will display the output based on if the state is "WI"
        or not.
         */
        Scanner order = new Scanner(System.in);
        Scanner place = new Scanner(System.in);
        //ask for the order amount and the state and store them into string variables.
        System.out.print("What is the order amount?");
        String orderamt = order.nextLine();
        System.out.print("What is the state?");
        String state = place.nextLine();
        //convert orderamt into a double.
        double orderamount = Double.parseDouble(orderamt);
        //call the Taxcalculator class.
        Taxcalculator me = new Taxcalculator();
        me.calculate(state, orderamount);
    }
}
