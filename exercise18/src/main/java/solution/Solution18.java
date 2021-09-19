package solution;

import java.util.Scanner;

//Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
// Prompt for the starting temperature.
// The program should prompt for the type of conversion and then perform the conversion.
public class Solution18 {
    private static final Scanner in = new Scanner(System.in);
    private int temp;
    private int calculate;
    private boolean truthvalue;
    private String output;
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution18 app = new Solution18();
        //ask for which method to use by calling the ask class.
        String mychoice = app.ask("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        //print out the choice.
        System.out.println("Your choice: " + mychoice);
        // call a check function for mychoice to make sure input is 'C', 'c', 'F', or 'f'.
        app.truthvalue = app.check(mychoice);
        //if the value is true, run the program as normal.
        if (app.truthvalue)
        {
            //if the user wants to convert from celsius to fahrenheit:
            if (mychoice.equals("F") || mychoice.equals("f")){
                //give the temperature in celsius.
                app.temp = app.temperatureF("Please enter the temperature" +
                        " in Celsius:");
                //call the convertToF method.
                app.calculate = app.convertToF(app.temp);
                //call the displayF method.
                app.output = app.displayF(app.calculate);
                System.out.println(app.output);
            }
            else{
                //give the temperature in Fahrenheit.
                app.temp = app.temperatureC("Please enter the temperature " +
                        "in Fahrenheit:");
                app.calculate = app.convertToC(app.temp);
                //call the displayC
                app.output = app.displayC(app.calculate);
                System.out.println(app.output);
            }
        }
    }
    //this method will ask for how an individual wants to convert the temperature.
    private String ask(String choice){
        //ask for how the user wants to convert the temperature.
        System.out.println(choice);
        return in.nextLine();
    }

    //this method will check the input to make sure it is correct.
    private boolean check(String input){
        boolean value;
        if (input.equals("F") || input.equals("f") || input.equals("C") || input.equals("c")){
            value = true;
        }
        else
            value = false;
        return value;
    }

    //this method will run if the user wants to convert from celsius to Fahrenheit.
    private int temperatureF(String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }

    //this method will run if the user wants to convert from Fahrenheit to celsius .
    private int temperatureC(String prompt2){
        System.out.println(prompt2);
        return in.nextInt();
    }
    //this method will convert Celsius to Fahrenheit.
    private int convertToF(int temperature){
        return ((temperature * 9) / 5) + 32;
    }
    //this method will convert Fahrenheit to Celsius.
    private int convertToC(int temperature2){
        int evaluate = temperature2 - 32;
        int calculate2 = evaluate * 5;
        return calculate2/9;
    }
    //display output for Fahrenheit.
    private String displayF(int temperature){
        return ("The temperature in Fahrenheit is " + temperature + ".");
    }
    //display output for Celsius.
    private String displayC(int temperature){
        return ("The temperature in Celsius is " + temperature + ".");
    }
}
