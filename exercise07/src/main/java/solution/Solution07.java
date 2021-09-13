package solution;

import java.util.Scanner;

//Create a program that calculates the area of a room.
// Prompt the user for the length and width of the room in feet.
// Then display the area in both square feet and square meters.
public class Solution07 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args){
        /*
        ask for the length and the width of the room in feet.
        print out the dimensions as specified.
        Take the two strings and convert them into integers.
        Take the integers and multiply them to find the area.
        Take the result and convert it to square feet using
        the formula provided in the example.
         */
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        //ask for the length and width of the room
        System.out.print("What is the length of the room in feet?");
        String length = input1.nextLine();
        System.out.print("What is the width of the room in feet?");
        String width = input2.nextLine();
        //print out the dimensions.
        System.out.printf("You entered dimensions of %s feet by %s feet.", length, width);
        //convert the strings to integers.
        int length2 = Integer.parseInt(length);
        int width2 = Integer.parseInt(width);
        //call Area class to perform calculations.
        Area room = new Area();
        //print out the area.
       room.calculation(length2, width2);
    }
}
