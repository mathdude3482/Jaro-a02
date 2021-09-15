package example;
//this class will convert the euro to dollars using the given exchange rate.
public class Conversion {
    //take in two parameters: the amount of euros and the rate.
    public void convert(int euro, double rate){
        //perform the conversion.
         final double dollars;
         dollars = euro * rate;
         double roundeddollars = Math.round(dollars*100)/100.0;
         if (roundeddollars < dollars){
             roundeddollars += 0.01;
         }
         //call display class.
        Display mydisplay = new Display();
        mydisplay.output(euro, rate, roundeddollars);
    }
}
