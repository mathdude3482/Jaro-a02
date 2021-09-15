package exercise;

//this class will take in the string inputs
// and convert them into integers so that it can do the calculation method.
public class Tax {
    //pass in six parameters: the three prices and the three quantities.
    public void calculation(String firstprice,String firstquantity, String secondprice, String secondquantity, String thirdprice, String thirdquantity){
        //set the parameters to their respective strings.
        String price1 = firstprice;
        String quantity1 = firstquantity;
        String price2 = secondprice;
        String quantity2 = secondquantity;
        String price3 = thirdprice;
        String quantity3 = thirdquantity;
        //convert the strings into integers.
        int prices1 = Integer.parseInt(price1);
        int prices2 = Integer.parseInt(price2);
        int prices3 = Integer.parseInt(price3);
        int quantities1 = Integer.parseInt(quantity1);
        int quantities2 = Integer.parseInt(quantity2);
        int quantities3 = Integer.parseInt(quantity3);
        //calculate the subtotal, the tax, and the total.
        double subtotal = ((double)(prices1 * quantities1) + (prices2 * quantities2) + (prices3 * quantities3));
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        //call Display class.
        Display myDisplay = new Display();
        myDisplay.displayoutput(subtotal, tax, total);
    }
}
