package firstSemesterAssignments;

import java.util.Scanner;

public class Pro2_150122046 {
	
	     // Alp Biricik 150122046 
		// This program calculates your number of eggs are how many gross , how many dozen and how many eggs left.

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in) ;
			
			System.out.println("Please enter total number of your eggs ");
			
			int totalEggs = input.nextInt() ;
			
			int gross = totalEggs / 144	;
			
			int leftEggs = (totalEggs % 144) % 12;
			
			int dozen = (totalEggs % 144) / 12 ;
			
			
			
			System.out.println("The amount of your eggs are " +gross +" gross , " +dozen +" dozen and "+ leftEggs+ ".");
			
		   input.close();
		}
}


