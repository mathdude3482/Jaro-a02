package solution;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//this class will only be used if the state is "WI".
public class DisplayWI {
    //pass in the subtotal, the tax, and the state. The output changes based on state.
    public void displayoutput(double subtotal, double taxrate, String state) {
      //round the values up to the nearest penny.
        DecimalFormat value = new DecimalFormat("##.00");
        value.setRoundingMode(RoundingMode.CEILING);
        String subtotalamt = value.format(subtotal);
        String tax = value.format(taxrate);
        double finaltax = Double.parseDouble(tax);
        double finalsubtotal = Double.parseDouble(subtotalamt);
        //calculate the total.
        double total = finalsubtotal + finaltax;
        String result = "The total is $" + finalsubtotal + ".";
        if (state.equals("WI")){
            result = "the subtotal is $"+finalsubtotal+ "."+'\n'+"The tax is $"+finaltax+"."+'\n'+ "The total is $"+total+"." ;
        }
        System.out.println(result);
    }
}
