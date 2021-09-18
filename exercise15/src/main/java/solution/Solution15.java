package solution;

import java.util.Scanner;

//Create a simple program that validates user login credentials.
// The program must prompt the user for a username and password.
// The program should compare the password given by the user to a known password.
// If the password matches, the program should display Welcome!
// If it doesn’t match, the program should display I don’t know you.
public class Solution15 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
    /*
    hardcode a password.
    ask the user for a password.
    store the input into string variables.
    call a display class that will display the correct output based on if the password is right.
     */
        String passwordfinal = "abc$123";
        Scanner password = new Scanner(System.in);
        System.out.print("What is the password?");
        String password2 = password.nextLine();
        Display mydisplay = new Display();
        mydisplay.displayoutput(password2, passwordfinal);
    }
}
