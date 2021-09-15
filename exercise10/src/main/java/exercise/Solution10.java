package exercise;

import java.util.Scanner;

/*
Create a simple self-checkout system.
Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total,
and then print out the subtotal, tax amount, and total
 */
public class Solution10 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        /*
        Ask for the prices and quantities of three items.
        Store the inputs into string variables.
        Call tax class which will convert strings into integers and do calculations.
        Call Display class which will display the subtotal, the tax, and the total in dollars.
         */
        Scanner price1 = new Scanner(System.in);
        Scanner quantity1 = new Scanner(System.in);
        Scanner price2 = new Scanner(System.in);
        Scanner quantity2 = new Scanner(System.in);
        Scanner price3 = new Scanner(System.in);
        Scanner quantity3 = new Scanner(System.in);
        //ask for the inputs and store them into strings.
        System.out.print("Enter the price of item 1: ");
        String firstprice = price1.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String firstquantity = quantity1.nextLine();
        System.out.print("Enter the price of item 2: ");
        String secondprice = price2.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String secondquantity = quantity2.nextLine();
        System.out.print("Enter the price of item 3: ");
        String thirdprice = price3.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String thirdquantity = quantity3.nextLine();
        //call tax class.
        Tax myTax = new Tax();
        myTax.calculation(firstprice, firstquantity, secondprice, secondquantity, thirdprice, thirdquantity);
    }
}
