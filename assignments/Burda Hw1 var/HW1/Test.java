package HW1;

import java.util.Scanner;

public class Test {
	//Alp Biricik
		//This class is a test class for AnimalFarm
	public static void main(String[] args) throws IllegalNameException  {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Welcome to the animal farm simulation program! \n"
			+ "Please enter the capacity of the animal farm: ");
	 AnimalFarm animalFarm = new AnimalFarm(input.nextInt());
	 while(true) {
	 System.out.print("0- Exit the program \n"
	 		+ "1 - Add animal \n"
	 		+ "2 - Remove animal \n"
	 		+ "3 - Search animal \n"
	 		+ "4 - Sort animals \n"
	 		+ "5 - Calculate next year's population estimate \n"
	 		+ "6 - Print all animal's movements \n"
	 		+ "7 - Print all animal's eating habits \n"
	 		+ "8 - Print report \n"
	 		+ "Please enter your choice:");
	  int choice = input.nextInt();
	   if(choice == 0)
		   System.exit(0);
	   else if(choice == 1) {
		   System.out.print("1- Chicken \n"
		   		+ "2 - Donkey \n"
		   		+ "3 - Horse \n"
		   		+ "4 - Pig \n"
		   		+ "5 - Raven \n"
		   		+ "6 - Sheep \n"
		   		+ "Select animal type: ");
		   int animalType = input.nextInt();
		   System.out.println("Enter the name: ");
		   String name = input.next();
		   try {
		   animalFarm.checkName(name);
		   }
		   catch(IllegalNameException e) {
			   System.out.println("There is " + e );
			   System.out.println("The name you are trying to give is already given. \n"
			   		+ "Please try again."); 
			   continue;
		   }
		   System.out.println("Enter the age: ");
		   int age = input.nextInt();
		   
		   if(animalType==1) {
			   Chicken chicken = new Chicken(name,age);
			   animalFarm.addAnimal(chicken);
		   }
		   else if(animalType==2) {
			 Donkey donkey =  new Donkey(name,age);
			 animalFarm.addAnimal(donkey);
		   }
		   else if(animalType==3) {
	          Horse horse =   new Horse(name,age);
	          animalFarm.addAnimal(horse);
           }
		   else if(animalType==4) {
	          Pig pig =  new Pig(name,age);
	          animalFarm.addAnimal(pig);
           }         
		   else if(animalType==5) {
	           Raven raven = new Raven(name,age);
	           animalFarm.addAnimal(raven);
           }
		   else if(animalType==6) {
	          Sheep sheep =  new Sheep(name,age);
	          animalFarm.addAnimal(sheep);
           }	   
}	   
	   else if(choice == 2) {
		   System.out.println("Enter the name of the animal you want to remove: ");
		   String name = input.next();
		   animalFarm.removeAnimal(name);
	   }
		   
	   else if(choice == 3) {
		   System.out.println("1 - Search based on name \n"
				   + "2 - Search based on age");
		   int searchChoice = input.nextInt();
           if(searchChoice == 1) {
        	   System.out.println("Enter the name: ");
        	   String name = input.next();
        	   animalFarm.searchBasedOnName(name);
           }
           else if (searchChoice == 2 ) {
        	   System.out.println("Enter the age: ");
        	   int age = input.nextInt();
        	   animalFarm.searchBasedOnAge(age);
           }
		   
	   }
		   
	   else if(choice == 4) {
		   System.out.println("1 - Sort based on name \n"
		   		+ "2 - Sort based on leg number \n"
		   		+ "3 - Sort based on age \n"
		   		+ "4 - Sort based on additon date ");
		   int sortChoice = input.nextInt();
		   if(sortChoice == 1) {
			   animalFarm.sortAlphabetically();
		   }
		   else if(sortChoice == 2) {
			   animalFarm.sortBasedOnLegNumber();
			   
		   }
           else if(sortChoice == 3) {
			   animalFarm.sortBasedOnAge();
		   }

           else if(sortChoice == 4) {
        	   animalFarm.printAllAnimals();
           }

	   }
		   
	   else if(choice == 5) 
		   System.out.println(animalFarm.nextYearPopulationForecast()); 
	   
	   else if(choice == 6)
		   animalFarm.animalMovements();
		   
	   else if(choice == 7)
		   animalFarm.eatingHabits() ;
	   else if(choice == 8) {
		   System.out.print("Enter the file name: ");
	     String fileName = input.next();
		   animalFarm.printReport(fileName);
	   }
	}
	 
	

 }
	
}

