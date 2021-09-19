package solution;

import java.util.Scanner;

//Write a program that asks for three numbers.
// Check first to see that all numbers are different.
// If they’re not different, then exit the program.
// Otherwise, display the largest number of the three.
public class Solution22 {
    private static final Scanner in = new Scanner(System.in);
    private int num1;
    private int num2;
    private int num3;
    private int largenum;
    private String display;
    //this method will read the number given by the user.
    public int readnum (String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }
    //this method will compare the three inputs.
    public int comparenum(int first, int second, int third){
        int large = 0;
        //if the three numbers are equal, return 0 to indicate they are the same.
        if ((first == second) && (second == third)){
            return 0;
        }
        else{
            //compare the values.
            if((first > second && first > third) || (first == second && first > third) || (first > second && first == third)){
                large = first;
            }
            else if ((second > first && second > third)  || (second > first && second == third)){
                large = second;
            }
            else
                large = third;
        }
        return large;
    }
    //display the correct output.
    public String displayoutput(int largenumber){
        String result = null;
        //if there is no difference between the three numbers:
        if(largenumber == 0){
            result = "";
        }
        else
            result = "The largest number is " + largenumber +".";
        return result;
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution
         *  Copyright 2021 James Jaro
         */
        Solution22 app = new Solution22();
        //call readnum method to read the three inputs.
        app.num1 = app.readnum("Enter the first number: ");
        app.num2 = app.readnum("Enter the second number: ");
        app.num3 = app.readnum("Enter the third number: ");
        //call comparenum method to compare the three inputs. Return the largest number.
        app.largenum = app.comparenum(app.num1, app.num2, app.num3);
       //call displayoutput method.
        app.display = app.displayoutput(app.largenum);
        //print the result.
        System.out.println(app.display);

    }
}
