package solution;

import java.util.Scanner;

//Create a program that walks the user through troubleshooting issues with a car.
//Use the decision tree in webcourses to help design the program.
public class Solution23 {
    private static final Scanner in = new Scanner(System.in);
    private String result;
    //ask the questions in order. each question will be a function, and each question
    //will call the appropriate question based on the answer.
    public String silentcar(){
        System.out.print("Is the car silent when you turn the key?");
        if (in.nextLine().equals("y"))
            return battery();
        else
            return noise();
    }
    public String battery(){
        System.out.print("Are the battery terminals corroded?");
        if (in.nextLine().equals("y"))
            return "Clean terminals and try starting again.";
        else
            return "Replace cables and try again.";
    }
    public String noise(){
        System.out.print("Does the car make a slicking noise?");
        if (in.nextLine().equals("y"))
            return "replace the battery.";
        else
            return crank();
    }
    public String crank(){
        System.out.print("Does the car crank up but fail to start?");
        if (in.nextLine().equals("y"))
            return "Check spark plug connections.";
        else
            return engine();
    }
    public String engine(){
        System.out.print("Does the engine start and then die?");
        if (in.nextLine().equals("y"))
            return fuel();
        else
            return "This should not be possible.";
    }
    public String fuel(){
        System.out.print("Does your car have fuel injection?");
        if (in.nextLine().equals("y"))
            return "Get it in for service.";
        else
            return "Check to ensure the choke is opening and closing.";
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution23 app = new Solution23();
        System.out.println("Please enter y for yes and n for no.");
        //call the first question, which will call all subsequent questions in order.
        app.result = app.silentcar();
        //print the result.
        System.out.println(app.result);
    }
}
