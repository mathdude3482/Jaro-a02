package solution;



//this class will perform the appropriate conversion, based on if the state is "WI" or not.
public class Taxcalculator {
    //pass in two parameters: the state and the amount.
    public void calculate(String state, double amount) {
        double subtotal = amount;
          final double taxrate = (subtotal* 5.5) / 100.0;
            //call DisplayWI class.
            DisplayWI displayone = new DisplayWI();
            displayone.displayoutput(subtotal, taxrate, state);
    }
}