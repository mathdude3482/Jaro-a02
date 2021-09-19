package solution;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//Create a tax calculator that handles multiple states and multiple counties within each state.
// The program prompts the user for the order amount and the state where the order will be shipped.
public class Solution20 {
    //constants and variables needed for the program.
    private static final Scanner in = new Scanner(System.in);
    static final String STATE1 = "Wisconsin";
    static final String STATE2 = "Illinois";
    private double orderamount;
    private String state;
    private String county;
    private double taxtotal;
    private double totalamount;
    private String output;
    //this will read the user's amount.
    private double readvalue(String prompt1){
        System.out.print(prompt1);
        return in.nextDouble();
    }
    //this will read the user's state.
    private String readstate(String prompt){
        System.out.print(prompt);
        return in.nextLine();
    }
    //this will read the user's county.
    private String readcounty(String prompt2){
        System.out.print(prompt2);
        return in.nextLine();
    }
    //this will calculate the tax (in dollars).
    private double taxcalculator(double orderamount, String state, String county) {
        String state2 = STATE1;
        double taxrate = 0;
        if (state.equals(state2) && county.equals("Eau Claire")){
            taxrate = ((orderamount * 5.0) /100.0) + ((orderamount * 0.5)/100.0);
        }
        else if(state.equals(state2) && county.equals("Dunn")){
            taxrate = ((orderamount * 5.0)/100.0) + ((orderamount * 0.4)/100.0);
        }
        else if(state.equals(state2)){
            taxrate = ((orderamount * 5.0)/100.0);
        }
        else if (state.equals(STATE2)){
            taxrate = ((orderamount * 8.00)/100.00);
        }
        return taxrate;
    }
    //this will calculate the total amount (in dollars).
    private double totalcalculate(double orderamount, double taxamount, String state){
        String state2 = STATE1;
        double amount = 0;
        if (state.equals(state2) || state.equals(STATE2)){
            amount = orderamount + taxamount;
        }
        else
            amount = orderamount;
        return amount;
    }
    //this will display the output.
    private String display(double taxamount, double total, String state){
        String result = "";
        DecimalFormat value = new DecimalFormat("0.00");
        value.setRoundingMode(RoundingMode.CEILING);
        String tax = value.format(taxamount);
        String total2 = value.format(total);
        if(state.equals(STATE1) || state.equals(STATE2)){
            result = "The tax is $" + tax + "." + '\n' + "The total is $" + total2 + ".";
        }
        else
            result = "The total is $" + total2 + ".";
        return result;
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution20 app = new Solution20();
        //ask user for inputs.
        app.orderamount = app.readvalue("What is the order amount?");
        Solution20.in.nextLine();
        app.state = app.readstate("What state do you live in?");
        if (app.state.equals(STATE1)){
            app.county = app.readcounty("What county do you live in?");
        }
        //call taxcalculator method.
        app.taxtotal = app.taxcalculator(app.orderamount, app.state, app.county);
        //call totalcalculate method.
        app.totalamount = app.totalcalculate(app.orderamount, app.taxtotal, app.state);
        //call display method.
        app.output = app.display(app.taxtotal, app.totalamount, app.state);
        //print the output.
        System.out.println(app.output);
    }
}