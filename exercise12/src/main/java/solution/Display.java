package solution;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//this class will display the output.
public class Display {
    public void displayoutput(int year, double rate, double totalvalue){
        DecimalFormat value = new DecimalFormat("##.##");
        value.setRoundingMode(RoundingMode.CEILING);
        System.out.println("After " + year + " years at " + rate + "%, the investment will be worth $" + value.format(totalvalue) +".");
    }
}
