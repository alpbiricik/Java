package firstSemesterAssignments;

import java.util.Locale;
import java.util.Scanner;

public class Pro3_150122046 {
 public static void main(String []args) {
		
		// Alp Biricik 150122046
		/* This program is for the private pension system you can enter your 
		 * informations and get a result for your retirement salary
		*/
     Scanner input = new Scanner(System.in);
     input.useLocale(Locale.US) ;
     
      System.out.print("Please enter your monthly slary: ");
     double salary = input.nextDouble() ;
     
     System.out.print("Please enter portion of your salary to be saved: ") ; 
     double savedSalaryRate = input.nextDouble() / 100 ;
     
     System.out.print("Please enter your monthly interest rate: ");
     double interestRate = input.nextDouble() / 100;
     
     System.out.print("Please enter your government support rate: ");
     double governmentSupport = input.nextDouble()/ 100;
     double savedSalary = salary * savedSalaryRate ;
     
     double first = savedSalary * (1 + governmentSupport ) * (1 + interestRate ) ;
     System.out.println("After the first month, account value is " + (int) (first * 100) / 100.0 + " TL" );
     
     double second = (first + savedSalary * (1+governmentSupport)) * (1 + interestRate);
     System.out.println("After the second month, account value is " + (int) (second * 100) / 100.0 + " TL");
     
     double third = (second + savedSalary * (1+governmentSupport)) * (1 + interestRate);
     System.out.println("After the third month, account value is " + (int) (third * 100) / 100.0 + " TL");
     
     double fourth = ((third + savedSalary * (1+governmentSupport)) * (1 + interestRate))   ;
     System.out.println("After the fourth month, account value is " + (int) (fourth * 100) / 100.0 +  "TL") ;
     
     double fifth = (fourth + savedSalary * (1+governmentSupport)) * (1 + interestRate);
     System.out.println("After the fifth month, account value is " + (int) (fifth * 100) / 100.0 + " TL");
     
     double sixth = (fifth + savedSalary * (1+governmentSupport)) * (1 + interestRate);
     System.out.println("After the sixth month, account value is " + (int) (sixth * 100) / 100.0 + " TL");
     
     double totalSavedSalary = savedSalary * 6 ;
     System.out.println(" In total, you saved " + totalSavedSalary  + " TL and your total profit is " + (int)((sixth - totalSavedSalary )* 100 ) / 100.0 + " TL");
     
      input.close() ;
          }
}
