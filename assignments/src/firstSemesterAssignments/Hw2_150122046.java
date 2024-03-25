package firstSemesterAssignments;

import java.util.Scanner;

public class Hw2_150122046 {

	public static void main(String[] args) {
		/* Alp Biricik 150122046
		 * This program runs a basic calculator that can be used in base 2 to 10
		 */
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the base of the number system between 2 and 10.");
	    int numberSystem = input.nextInt() ;
	 
		System.out.print("Please enter 2 numbers: ");
		
		String number1 = input.next() ;
		String number2 = input.next() ;
		
		int k = (number1.length() -1 ) ;
	    int m = (number2.length() -1) ;
	    int c = 0;
	    int b = 0;
	    int n = 0;
	     
	    	while (k >= 0 && m >= 0) {
	    c +=  (number1.charAt(k)-'0') * (Math.pow(numberSystem, n)) ;
	    b +=  (number2.charAt(m)-'0') * (Math.pow(numberSystem, n)) ;
	   
	     n++; k--; m--;    
	    	}
	    	
	    System.out.println("Please select the operation you want to do('a' is for addition , 's' is for subtraction ," +
	   	     " 'm' is for multiplication , 'd' is for division");
	   	    char operation = input.next().charAt(0);
	   	    
	   	    int result = 0 ;
	   	    switch(operation) {
	   	  case'a': 
	   		 
	   		 result = (c + b);   	   
	   	    break;
	   	  case's':
	   	        if(c>=b) {
	   	    result = (c-b)  ; }
	   	   	else {
	   	    result = (b-c);}
	   	  break;
	   	  
	   	  case'm':
	   	     result = (c * b) ; 
	   	  break;
	   	  
	   	  case'd':
	   		  if(c>=b) {
	   			 result = (c / b); }
	   			 else {
	   				 result = (b / c) ;
	   			 }
	   	  break;
	   	    }
	   	String finalresult = " " ;
	   	  while( result >= numberSystem ) {
	   		  
	   	 
	   	finalresult += (result % numberSystem) ;
	   	  result /= numberSystem ; 
	  }
	   	  finalresult+= result ;
	   	  
	   	  for(int i = (finalresult.length()-1); i>=0 ; i--)
	   			  System.out.print(finalresult.charAt(i));
   System.out.print("is result of the operation."); }
  }

