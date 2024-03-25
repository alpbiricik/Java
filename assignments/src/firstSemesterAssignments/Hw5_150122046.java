package firstSemesterAssignments;

import java.util.Scanner;

public class Hw5_150122046 {
	//Alp Biricik 150122046
	/*This program runs a code designer. You input a string
      that involves numbers and this program firstly convert the string 
      to the binary then update the code according to neighbors of
      the first code and that continues for how many times you want.*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to our program");
		for(int y = 0 ; y > -1 ;y++) {
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		             
		int x = 0 ;
		int k = 1 ;
		 for(int j = 0 ; j< str.length() ; j++) {
			 if(str.charAt(j) == '-')
				 k++;
		 }
		int[] numbers = new int[k] ;
		int[][] table = new int [k][k];
		int[][] newTable = new int[k][k];
		int z = 0 ;
		for(int j = 0 ; j< str.length() ; j++) {
			if(str.charAt(j) == '-' ) {
			  numbers[z] = Integer.parseInt(str.substring(x, j));	
			  x = j+1;
			  z++;
			}
			else if (j == str.length()-1) {
				numbers[z] = Integer.parseInt(str.substring(x));
			}
		}
		for( x = 0 ; x < numbers.length ;x++) {
		if(numbers[x] >= Math.pow(2, k)) {
			System.out.println("The number " + numbers[x] + " cannot be represented with "+k+"x"+k+" array");
			x++;
			break;
		      }
		}
		if(numbers[x-1] >= Math.pow(2,k)) 
			continue;

		for(int j = 0 ;  j<numbers.length; j++ ) {
				table[j] = convertDecToB(numbers[j], numbers.length);
		}
		System.out.print("Enter a number of steps: ");
		int steps = input.nextInt();
		
	      printTable(table);
	      
	      for(int i = 1 ; i <= steps ; i++) {
	    	  newTable= updateTable(table, newTable);
	    	  System.out.println("It is converted to the following table after " + i 
	    			  +". step:");
	    	  printTable(newTable);
	    	  
	    	  for(int a = 0 ; a < newTable.length ; a++) {
	    		  for(int b = 0 ; b < newTable.length ; b++ ) {
	    			  table[a][b] = newTable[a][b];
	    		  }
	    		  
	    	  }
	      }
	      System.out.print("The decimal value for the second table after " + steps + 
	    		  " steps: ");
	      for( int a  = 0 ; a<newTable.length-1; a++) {
	    	  System.out.print(convertBinToDec(newTable[a]) + "-");
	      }
	        System.out.print(convertBinToDec(newTable[newTable.length-1]));
	      break;
		}
	}
	public static int[] convertDecToB(int number , int size) {
		int[] binary = new int[size];
		for(int i = 0 ,  j = binary.length-1  ; 0 <= j && i < binary.length ; j-- ,i++) {
			
				 if( number >= Math.pow(2, j)) {
					 binary[i] = 1 ;
					 number %= Math.pow(2, j);
				 }
				 else
					 binary[i] = 0 ;
		}
		return binary;	
	}
	public static void printTable(int[][]table) {
		for(int x = 0 , j = 0 ; x< table.length+1; x++ ,j++ ) {
			System.out.print("-");
		for(int k = 0 ; k < table.length ; k ++) {
			System.out.print("----");
	              }
		  System.out.println();
		  if(j< table.length) {
		  System.out.print("|");
		  
		  for(int k = 0 ; k < table.length;k++) {
			  System.out.print( " "+table[j][k]+ " " + "|");
		  }
		 }
		  System.out.println();
	        }
	     }
	public static int[][] updateTable(int[][] table, int[][] newTable){
		int count = 0 ;
		for(int i = 0 ;i < table.length ; i ++) {
		   for(int j = 0 ; j < table.length ; j++) {
			  if(i == 0 && j== 0 ) {
				if(table[i][j] == 1) {
					if(table[i][j+1] == 1)
						count++;
					if(table[i+1][j]== 1)
						count++;
					if(table[i+1][j+1] == 1)
						count++;
					if(count == 3 || count == 2 )
						newTable[i][j] = 1;
						else
							newTable[i][j] = 0;
					}
				else {
					if(table[i][j+1] == 1)
						count++;
					if(table[i+1][j]== 1)
						count++;
					if(table[i+1][j+1]== 1)
						count++;
					if(count == 3 )
					newTable[i][j] = 1;
					else
						newTable[i][j] = 0;
					}
			}
			  else if (i == 0 && j == table.length-1) {
				  if(table[i][j] == 1) {
						if(table[i][j-1] == 1)
							count++;
						if(table[i+1][j]== 1)
							count++;
						if(table[i+1][j-1] == 1)
							count++;
						if(count == 3 || count == 2 )
							newTable[i][j] = 1;
							else
								newTable[i][j] = 0;
				  }
				  else {
						if(table[i][j-1] == 1)
							count++;
						if(table[i+1][j]== 1)
							count++;
						if(table[i+1][j-1]== 1)
							count++;
						if(count == 3 )
						newTable[i][j] = 1;
						else
							newTable[i][j] = 0;
						}
				   }
			  else if (i == table.length-1 && j == table.length-1) {
				  if(table[i][j] == 1) {
						if(table[i][j-1] == 1)
							count++;
						if(table[i-1][j]== 1)
							count++;
						if(table[i-1][j-1] == 1)
							count++;
						if(count == 3 || count == 2 )
							newTable[i][j] = 1;
							else
								newTable[i][j] = 0;
				  }
				  else {
						if(table[i][j-1] == 1)
							count++;
						if(table[i-1][j]== 1)
							count++;
						if(table[i-1][j-1]== 1)
							count++;
						if(count == 3 )
						newTable[i][j] = 1;
						else
							newTable[i][j] = 0;
						}
				  }
			  else if ( i == table.length-1 && j == 0) {
				  if(table[i][j] == 1) {
						if(table[i][j+1] == 1)
							count++;
						if(table[i-1][j]== 1)
							count++;
						if(table[i-1][j+1] == 1)
							count++;
						if(count == 3 || count == 2 )
							newTable[i][j] = 1;
							else
								newTable[i][j] = 0;
				  }
				  else {
						if(table[i][j+1] == 1)
							count++;
						if(table[i-1][j]== 1)
							count++;
						if(table[i-1][j+1]== 1)
							count++;
						if(count == 3 )
						newTable[i][j] = 1;
						else
							newTable[i][j] = 0;
						}
			  }
			  else if (i == 0 && (j!= 0 || j != table.length-1)) {
				  if(table[i][j] == 1) {
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if(count == 2 || count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
			  }
				  else {
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if( count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;  
				  }
			 }
			  else if (i == table.length-1 && (j!= 0 || j != table.length-1)) {
				  if(table[i][j] == 1) {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i-1][j+1] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(count == 2 || count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
				  }
				  else {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i-1][j+1] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if( count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
				  }
			  }
			  else if (j == 0 && (i!= 0 || i != table.length-1)) {
				  if(table[i][j] == 1) {
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i-1][j+1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if(count == 2 || count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
				  }
				  else {
					  if(table[i-1][j] == 1)
						  count++;
					  
					  if(table[i-1][j+1] == 1)
						  count++;
					  
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if( count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;    
				  }
			  }
			  else if (j == table.length-1 && (i != 0 ||  i != table.length-1)) {
				  if(table[i][j] == 1) {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(count == 2 || count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
				  }
				  else {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if( count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;    
				  }			  
			  }
			  else {
				  if(table[i][j] == 1) {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i-1][j+1] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if(count == 2 || count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;
				  }
				  else {
					  if(table[i-1][j-1]==1)
						  count++;
					  if(table[i-1][j] == 1)
						  count++;
					  if(table[i-1][j+1] == 1)
						  count++;
					  if(table[i][j-1] == 1)
						  count++;
					  if(table[i][j+1] == 1)
						  count++;
					  if(table[i+1][j-1] == 1)
						  count++;
					  if(table[i+1][j] == 1)
						  count++;
					  if(table[i+1][j+1] == 1)
						  count++;
					  if( count == 3 )
						  newTable[i][j] = 1 ;
					  else
						  newTable[i][j] = 0;  
				  }  
			  }
			  count = 0 ;  
			}
		}
		return newTable;
	}

     public static int convertBinToDec(int[] number) {
    	 int x =0;
    	 for(int i = number.length-1 , k = 0 ; i >= 0; i--, k++) {
    		 x += number[k]*Math.pow(2, i);
    	 }
    	 return x ;
     }
}

