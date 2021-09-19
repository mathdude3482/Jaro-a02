package solution;

import java.util.Scanner;

//Write a program that converts a number from 1 to 12 to the corresponding month.
// Prompt for a number and display the corresponding calendar month,
// with 1 being January and 12 being December.
// For any value outside that range, display an appropriate error message.
public class Solution21 {
    //variables needed for the program.
    private static final Scanner in = new Scanner(System.in);
    private int month;
    private String nameMonth;
    private String display;
//read in the number of the month.
    public int readMonth(String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }
    //determine the name of the month based on the number passed in.
    public String determineMonth(int num){
        String name = null;
        switch(num){
            case 1: name = "January";
                    break;
            case 2: name = "February";
                    break;
            case 3: name = "March";
                break;
            case 4: name = "April";
                break;
            case 5: name = "May";
                break;
            case 6: name = "June";
                break;
            case 7: name = "July";
                break;
            case 8: name = "August";
                break;
            case 9: name = "September";
                break;
            case 10: name = "October";
                break;
            case 11: name = "November";
                break;
            case 12: name = "December";
                break;
            default: name = "Invalid number. Enter a number from 1 to 12, inclusive.";
                break;
        }
        return name;
    }
    //display the appropriate output.
    public String displayMonth(int num2, String name2){
        if(num2 <= 0 || num2 >= 13){
            return name2;
        }
        return "The name of the month is " + name2 + ".";
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution21 app = new Solution21();
        //ask for the month.
        app.month = app.readMonth("Please enter the number of the month:");
        //Determine the name of the month.
        app.nameMonth = app.determineMonth(app.month);
        //print out the output.
        app.display = app.displayMonth(app.month, app.nameMonth);
        System.out.println(app.display);
    }
}
