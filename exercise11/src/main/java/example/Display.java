package example;
//display the output.
public class Display {
    public void output(int euro, double rate, double dollar){
        //display output.
        System.out.printf("%d euros at a exchange rate of %.4f is %n $%.2f U.S. dollars.", euro, rate, dollar);
    }
}
