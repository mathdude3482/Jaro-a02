package solution;
//this class will determine if the user can drive.
public class Age {
    //pass in one parameter: the age.
    public void determine(int age){
        String result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}
