package example;

import java.util.Scanner;

/*
Write a program to evenly divide pizzas.
Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.
 */
public class Solution08 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args){
        /*
        Ask for number of people, number of pizzas, and number of slices per pizza.
        Check that the number of slices per pizza is even.
        If not, ask for another input.
        Show the number of pieces of pizza every person gets.
        Display leftovers, if any.
         */
        Scanner people = new Scanner(System.in);
        Scanner pizza = new Scanner(System.in);
        Scanner slices = new Scanner(System.in);
        //ask for the number of people, how many pizzas, and how many slices per pizza.
        // store them into string variables.
        System.out.print("How many people?");
        String numpeople = people.nextLine();
        System.out.print("How many pizzas do you have?");
        String numpizza = pizza.nextLine();
        System.out.print("How many slices per pizza?");
        String numslice = slices.nextLine();
        //convert the strings into integers.
        int totalpeople = Integer.parseInt(numpeople);
        int totalpizza = Integer.parseInt(numpizza);
        int totalslice = Integer.parseInt(numslice);
        //call calculation class.
        Calculation mainsituation = new Calculation();
        mainsituation.evaluate(totalpeople, totalpizza, totalslice);

    }
}
