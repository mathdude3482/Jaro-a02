package exercise;

//this class will perform the calculation method.
public class Room {
    //the conversion factor as specified by the restriction in this exercise.
    static final double GALLON_ROOM = 350.0;
    //pass in two parameters: the length and the width strings.
    public void calculation (String lengthRoom, String widthRoom){
        //set the lengths and widths to their respective strings.
        String length = lengthRoom;
        String width = widthRoom;
        //convert the strings into integers for the calculations.
        int length1 = Integer.parseInt(length);
        int width1 = Integer.parseInt(width);
        //calculate the area.
        int area = length1 * width1;
        //determine how many gallons you need.
        int gallon = ((int)(Math.ceil(area / GALLON_ROOM)));
        //call display class.
        Display finaloutput = new Display();
        finaloutput.displayoutput(area, gallon);
    }
}
