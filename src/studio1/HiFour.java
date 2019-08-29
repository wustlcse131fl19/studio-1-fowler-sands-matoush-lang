package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name1 = ap.nextString("What is the name of the first person?");
		String name2 = ap.nextString("What is the name of the second person?");
		String name3 = ap.nextString("What is the name of the third person?");
		String name4 = ap.nextString("What is the name of the fourth person?");


		System.out.println("Greetings " + name1 + ", " + name2 + ", "+ name3 + ", "+ name4 + "!" );
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
