package exercise;

import java.util.Scanner;

/*
Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.
Remember, you can’t buy a partial gallon of paint.
You must round up to the next whole gallon.
 */
public class Solution09 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        /*
        ask for length and width.
        store the strings length and width into string variables.
        call an outside class to do calculation.
        Within the outside class, call another class that prints the output.
         */
        Scanner length = new Scanner(System.in);
        Scanner width = new Scanner(System.in);
        //ask for the length and width and store them into strings.
        System.out.print("What is the length of the room?");
        String lengthRoom = length.nextLine();
        System.out.print("What is the width of the room?");
        String widthRoom = width.nextLine();
        //call room class that will perform calculation.
        Room myRoom = new Room();
        myRoom.calculation(lengthRoom,widthRoom);
    }
}
