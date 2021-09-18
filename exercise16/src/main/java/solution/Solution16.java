package solution;

import java.util.Scanner;

//Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
// If the user is sixteen or older,
// then the program should display: You are old enough to legally drive.
// If the user is under sixteen,
// the program should display: You are not old enough to legally drive.
public class Solution16 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
        */
    /*
    ask for the user's age. Store it into a string variable.
    convert the string into int.
    call the Age class, which determines if you are old enough to drive.
     */
        Scanner myage = new Scanner(System.in);
        System.out.print("What is your age?");
        String age = myage.nextLine();
        int numage = Integer.parseInt(age);
        Age age1 = new Age();
        age1.determine(numage);
    }
}

