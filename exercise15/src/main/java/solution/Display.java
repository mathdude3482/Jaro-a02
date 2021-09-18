package solution;
//this class will print out the correct output based on if the password is correct.
public class Display {
    //pass in two parameters: the user-input password and the hardcode password.
    public void displayoutput(String password1, String password2){
        String result;
        if (password1.equals(password2)){
            result = "Welcome!";
        }
        else{
            result = "I don't know you.";
        }
        System.out.println(result);
    }
}
