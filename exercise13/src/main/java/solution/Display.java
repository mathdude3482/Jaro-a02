package solution;

import java.text.DecimalFormat;

//this class will display the output.
public class Display {
    public void displayoutput(int principal, double rate, int year, int compound, double rounded){
        DecimalFormat value = new DecimalFormat("##.##");
        System.out.println("$" + principal + " invested at " + rate + "%" + " for " + year + " years compounded " + compound + " times per year is $" + value.format(rounded) + ".");
    }
}
