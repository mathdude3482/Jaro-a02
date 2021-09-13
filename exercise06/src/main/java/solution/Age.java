package solution;


import java.time.LocalDate;

//this class will calculate the amount of years an individual
//has left before retiring at a certain age.
//The class will also take the current year and calculate what year an individual can retire.
public class Age{
    //pass in two parameters, current age and desired retired age.
    public void calculation(int agecurrent, int ageretired){

        //calculate how many years an individual has left before he or she can retire.
        int yearsLeft = ageretired - agecurrent;
        //print out how many years an individual has left before retirement.
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        //get the current year.
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int yearNow = currentYear;
        //calculate the year of retirement.
        int retireYear = yearNow + yearsLeft;
        //print out the year of retirement.
        System.out.println("It's " + yearNow + ", so you can retire in " + retireYear + ".");

    }

}
