package firstSemesterAssignments;

import java.util.Scanner;

public class Hw3_Pro3_150122046 {
	 //Alp Biricik 150122046
     /*This program runs a image maker it 
      * works by your input string and turn 
      * into a a image and print that.
      */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word= "";
		while(!word.equals("QUIT")) {
			
				System.out.println("Please enter a string");
				 word = input.next();
				 if(word.equals("QUIT")) {
					 System.out.println("OK. Good bye :-)");
					 break;
				 }
				 
				int k = word.length();
				int i , z= 0;
				int y = 0;
			
			for(int j = word.length(); j>0 ; j-- ) {
				
				String left ="";
				String right = "";
				
				z = y;
				for(i = 0; i <= j-1; i++){
					
					left += word.charAt(i);
					
					right += word.charAt(z);
						
					if(i == j-1) {
						System.out.print(left);
						while(i+1 <k){
							System.out.print("  ");
							i++;}
						System.out.print(right);
						System.out.println();
					  }
				z++;
			}
				y++;
			   }
			y = word.length()-2;
			z = word.length()-1;
			for(int j = 0 ; j < word.length();j++) {
			String left = "";
			String right = "";
			for(i = 0; i <= j ; i++) {
				
				right += word.charAt(z);
				left += word.charAt(i);
				z++;
			}
			  z = y;	
			  y--;
				System.out.print(left);
				while(i<k) {
					System.out.print("  ");
					i++;
				}
				System.out.print(right);
				System.out.println();
			}
				
		}
		}
	}


