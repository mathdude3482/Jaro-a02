package solution;

//this class will take calculate the area of the room in square feet.
public class Area {

    //create the string variables that will store the parameters.
    //pass in two parameters: the length and the width.
    public void calculation(int length, int width){
        //calculate the area.
        int area = length * width;
        //call the Conversion class.
        Conversion newArea = new Conversion();
        //print out the area in square feet and in square meters.
        System.out.println('\n' + "The area is " + '\n' + area + " square feet");
        newArea.convert(area);
    }
}
