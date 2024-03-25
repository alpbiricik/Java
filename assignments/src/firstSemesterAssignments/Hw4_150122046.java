package firstSemesterAssignments;

import java.util.Scanner;

public class Hw4_150122046 {
	
	//Alp Biricik 150122046
	/* This program involves multiple methods and runs multiple 
	 * works for your choice. They are: changing cases, making encrypted codes, 
	   shows statistics, and counting occurrences. */
	
	public static String changeCase(String str) {
		Scanner input = new Scanner(System.in);
		char a = ' ';
		System.out.println("Please enter a string");
		String first = input.nextLine();
	 for(int i=0; i < first.length();i++) {
			if(Character.isUpperCase(first.charAt(i))) {
		    a = Character.toLowerCase(first.charAt(i));
			}
			else {
			a = Character.toUpperCase(first.charAt(i));
			}
			str += a ;
		}
	 return str;
	}
	
    public static int updateLetterCount(int count , String str) {
    	
    	for(int i=0 ; i < str.length() ; i++ ) {
    		if(('a'<=str.charAt(i)  && str.charAt(i) <= 'z') || ('A'<=str.charAt(i) && str.charAt(i)<='Z')) 
    			count++;
    	}
    	return count;		
    } 
    public static int updateWordCount(int count , String str) {
    	
    	for(int i=0 ; i < str.length() ; i++ ) {
    		String a = "";
    		 a += str.charAt(i);
    		if(a.equals(" ")) {
    			count++;
    		}
    	}
    	return count;
    }
    public static void printStat(int wordCount, int letterCount) {
    	System.out.println("The number of words: "+  wordCount );
    	System.out.println("The number of alphabetic letters: " + letterCount);
    }
    public static int countOccurences(String[] sentence, String word) {
    	int count = 0 ;
    	for(int k = 0 ; k < sentence.length ; k++) {
    		if((sentence[k]).equalsIgnoreCase(word)) {
    			count++;
    		}
    	}
	   return count;
    }
    public static String encryption(String str , int pattern) {
    	String source ="";	
    	int z =0;
    	int k ;
    	int x=0;
      for( k = 0 ; k< str.length(); k++) {
    	  if(str.charAt(k)!=' ') {
    		  source+= str.charAt(k);
    	  }
      }
      str = "";
      k= pattern*2 -2;
      for(int j = 0 ;j<pattern;j++) {
    	  x=j;
    	  for(; x<source.length() ;) {
          if(z!=0) {
    	  
    	  if(x<source.length())
    	  str+= source.charAt(x); 
    	  if(k>0)
    	  x+=k;
    	  else
    	  x+=z;
    	   
    	  
    	  if(x<source.length())
    	  str+= source.charAt(x);
    	  x+=z;
          }
          else {
        	  str+=source.charAt(x);
              x+=k;}
    	  }
    	  k-=2;
    	  z+=2;
      }
    	  
    	  
        return str;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String totalWords ="";
		
	for(int i = 1 ; i > 0 ; i++) {
		
	System.out.println("Menu: \n1. Change case\n2. Count occurrences\n3. Encryption\n4. Statistics\n5. Exit");

	System.out.print("Please select an option: ");
	int option = input.nextInt();
    
	 if(option == 1) {
		 String s = changeCase("");
		System.out.println(s);
		 totalWords += " " + s;
	  }
	 else if (option == 2) {
		 int x = 0;
		 int k = 0;
		 int j = 0;
		 System.out.print("Please enter an input sentence:");
		            input.nextLine();
		 String s = input.nextLine();
		           
		 for(j = 0 ; j< s.length(); j++) {
			 if( s.charAt(j)== ' ' || s.charAt(j)== '.' || s.charAt(j)== '?' || s.charAt(j)== '!') {
				 k++;	 
				 x=k;}
		 }
		 j=0;
		 String[] sentence = new String[x];
		 x =1;
		 for( k = 0 ;k < s.length();k++) {
            if(s.charAt(k)== ' ' || s.charAt(k)== '.' || s.charAt(k)== '?' || s.charAt(k)== '!') {
            	 if(s.charAt(k-1)==',') {
            		 x--;
				 sentence[j] = s.substring(x,k-1);
				 x = k+2;
				 j++;}
            	 else{
            		 x--;
            		 sentence[j] = s.substring(x,k);
    				 x = k+2;
    				 j++;
            	 }
			 }
			 
		 }
		 for(k = 0; k < sentence.length ; k++) {
			 totalWords += " " + sentence[k];
		 }
		 System.out.print("Please enter an input word: ");
		 String word = input.next();
		 totalWords += " "+ word;
		 System.out.println(word +" appears "+ countOccurences(sentence,word)+ " time(s) in this sentence.");
	 }
	 else if (option == 3) {
		 System.out.print("Please enter an input string:");
		              input.nextLine();
		 String str = input.nextLine();
		 totalWords += " " + str;
		 String source = "";
		 System.out.println("Enter an integer pattern: ");
		 int pattern = input.nextInt();
		 for(int k =0 ; k < str.length(); k ++) {
	     source += Character.toUpperCase(str.charAt(k));
		 }
		 System.out.println("Source: " + source );
		 System.out.println("Encrypted: " + encryption(source,pattern)); 
	 }
	 else if (option == 4) {
		 printStat(updateWordCount(0,totalWords),updateLetterCount(0, totalWords));
	 }
	 else if (option == 5) {
		 System.out.println("Program ends. Bye :)");
		 break;
	 }
	 else {
		 System.out.println("Invalid option!");
	 }
	}
 }
}
