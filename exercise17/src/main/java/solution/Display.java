package solution;
//this class will print out the appropriate output.
public class Display {
    //take in one parameter: the BAC.
    public void displayoutput(double bac){
        System.out.printf("Your BAC is %.6f%n", bac);
        String result = (bac < 0.08) ? "It is legal for you to drive.": "It is not legal for you to drive.";
        System.out.println(result);
    }
}
