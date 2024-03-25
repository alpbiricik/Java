package firstSemesterAssignments;

import java.util.Scanner;

public class Hw3_Pro1_150122046 {
	//Alp Biricik 150122046
	/*This program runs a image printer program 
	 * If you enter a number and one of these characters('s','n','b') it
	 * will print the images for the number of times you entered.
	 */

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome the image printer program");
     
    String enteredSequence = input.next();
    String result = "";
    
    for(int i =0; i <enteredSequence.length() ; i++){
    	
    char a = enteredSequence.charAt(i);
    if('1'<= a  && a<='9') {
    	char z = enteredSequence.charAt(i+1);
    	int k = a - '0' ;
    	switch(z) {
    	case'b':
    		while(k > 1) {
        	result +=  " ";
    		k--;}
        	break;
        case'n':
        	while(k > 1) {
        	result+= "\n" ;
        	k--;}
        	break;
        case's':while(k > 1) {
        	result +="*";
        	k--;}
            break;
    	}	
    }
    switch(a) {
    
    case'b':
    	result += " ";
    	break;
    case'n':
    	result+= "\n" ;
    	break;
    case's':
    	result +="*";
        break;
               }
            }
    
    System.out.println(result);
	 }	
   }
   
    
  

	

