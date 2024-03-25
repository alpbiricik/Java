package firstSemesterAssignments;

import java.util.Scanner;

public class Hw3_Pro2_150122046 {
	// Alp Biricik 150122046
	/*This program runs a sequence of numbers and says you the which number 
	 * is at the position you entered as an integer.*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Please enter an integer number: ");
		int number = input.nextInt();
		int a1 = 0;
		int a2 = 1;
		int lastNumberOfSequence=0;
		
		for(int j = 1; j<= (number-2) ; j++) {
			
			lastNumberOfSequence = (a2 * 4) - a1;
			a1 = a2;
			a2 = lastNumberOfSequence;
		}
		if(number == 2)
			lastNumberOfSequence = 1;		
		
  System.out.println("In position " + number + ", the value is " + lastNumberOfSequence +".");
	}

}
