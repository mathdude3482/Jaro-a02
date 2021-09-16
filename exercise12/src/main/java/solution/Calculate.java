package solution;
//this class will take in the inputs (as numeric values) and calculate the total value.
public class Calculate {
    //pass in the parameters.
    public void calculateAmount(double principal, double rate, int year){
        final double totalvalue;
        totalvalue = ((principal) * (1 + ((rate/100.0)*year)));
        double roundedtotalvalue = Math.round(totalvalue * 100.0) / 100.0;
        //round up to the nearest penny.
        //call the Display class.
        Display mydisplay = new Display();
        mydisplay.displayoutput(year, rate, roundedtotalvalue);
    }
}
