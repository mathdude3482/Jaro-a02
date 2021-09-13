package example;

public class Calculation {
    //pass in three parameters: the number of people,
    // the number of pizzas, and the number of slices per pizza.
    //9.9.21: A suggestion by the professor: the evaluate function should pass in integers, not strings.
    //in other words, convert the strings into integers before passing them in.
    public void evaluate(int people, int pizza, int slice) {
        //calculate the total number of slices.
        int totalslice = slice * pizza;
        //print out the information.
        System.out.printf("%d people with %d pizzas (%d slices) %n", people, pizza, totalslice);
        //determine how many slices each individual gets.
        int individualslice = totalslice / people;
        //print out how many slices an individual gets.
        System.out.println("Each individual gets " + individualslice + " pieces of pizza.");
        //determine if there is any leftover slices.
        int leftover = totalslice % people;
        //print out how many leftover slices there are.
        System.out.println("There are " + leftover + " leftover pieces.");

    }
}
