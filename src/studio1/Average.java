package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextInt("Give me a number.");
        double n2 = ap.nextInt("Give me another number.");

        System.out.println("The average of the two numbers is: " + ((n1 + n2)/2));
    }
}
