package solution;
//this class will take in the inputs (as numeric values) and calculate the total value.
public class Calculate {
    //pass in the parameters.
    public void calculateAmount(int principal, double rate, int year, int compound){
        final double totalValue;
        double interest = Math.pow((1+ (rate/100.0)/compound), (compound *year));
        totalValue = interest * principal;
        double roundedtotalvalue = Math.round(totalValue * 100.0) / 100.0;
        //round up to the nearest penny.
        if (roundedtotalvalue < totalValue){
            roundedtotalvalue += 0.01;
        }
        //call the Display class.
        Display mydisplay = new Display();
        mydisplay.displayoutput(principal, rate, year, compound, roundedtotalvalue);
    }
}