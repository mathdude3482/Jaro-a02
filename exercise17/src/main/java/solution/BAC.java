package solution;
//this class will calculate the BAC of an individual.
public class BAC {
    //pass in 4 parameters: the number representing the gender, the amount of alcohol, the weight, and the hours.
    public void calculatebac(int gender, int alcohol, int weight, int hours){
        final double ratio;
        //determine ratio based on gender.
        if (gender == 1){
            ratio = 0.73;
        }
        else {
            ratio = 0.66;
        }
        final double bac;
        bac = ((alcohol * 5.14 / weight * ratio) - (0.015 * hours));
        //call display class.
        Display output = new Display();
        output.displayoutput(bac);
    }
}
