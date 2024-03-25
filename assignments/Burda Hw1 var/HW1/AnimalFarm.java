package HW1;
import java.util.ArrayList;


public class AnimalFarm {
//Alp Biricik 150122046
/*This class is for the Animal Farm it has everything about the farm
	names, numbers, remove or add ...  */
 private ArrayList<Animal> animalList = new ArrayList<Animal>();
 private ArrayList<String> animalNames = new ArrayList<String>();
 private int CAPACITY;
 private static int numberOfAnimals = 0;
 
public AnimalFarm(int capacity) {
	this.CAPACITY = capacity;
}
public int getNumberOfAnimals() {
	return this.numberOfAnimals;
}
public boolean addAnimal(Animal animal)  {
	if(CAPACITY > animalList.size()) {
		
		
		animalList.add(animal);
		animalNames.add(animal.getName());
		numberOfAnimals++;
		return true;
		}
	
	else {
		return false;
	}
}
	

     void checkName(String name)throws IllegalNameException{
	if(animalNames.contains(name)) {
		throw new IllegalNameException("The name you are trying to give is already given");
	}
	else {
		System.out.println("You can give that name.");
	}
	
}

public ArrayList<Animal> getAnimalList() {
		return animalList;
	}
	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}
	public ArrayList<String> getAnimalNames() {
		return animalNames;
	}
	public void setAnimalNames(ArrayList<String> animalNames) {
		this.animalNames = animalNames;
	}
public int getCAPACITY() {
	return CAPACITY;
}
public void setCAPACITY(int cAPACITY) {
	CAPACITY = cAPACITY;
}
public static void setNumberOfAnimals(int numberOfAnimals) {
	AnimalFarm.numberOfAnimals = numberOfAnimals;
}
public boolean removeAnimal(String name) {
	if(animalNames.contains(name)) {
	animalNames.remove(name);
	for(int i = 0 ; i < animalList.size() ; i++) {
		if(animalList.get(i).getName().equals(name)) {
			numberOfAnimals--;
			if(animalList.get(i) instanceof Chicken) {
			    ((Chicken) animalList.get(i)).decrementCount();
				animalList.remove(i);
			return true;
			}
			else if(animalList.get(i) instanceof Donkey) {
				((Donkey) animalList.get(i)).decrementCount();
				animalList.remove(i);
			return true;
			}
			else if(animalList.get(i) instanceof Horse) {
				((Horse) animalList.get(i)).decrementCount();
				animalList.remove(i);
			return true;
			}
			else if(animalList.get(i) instanceof Pig) {
				((Pig) animalList.get(i)).decrementCount();
				animalList.remove(i);
			return true;
			}
			else if(animalList.get(i) instanceof Raven) {
				((Raven) animalList.get(i)).decrementCount();
				animalList.remove(i);
			return true;
			}
			else
				((Sheep) animalList.get(i)).decrementCount();
			animalList.remove(i);
		return true;
		}
	}
	    return false;
	}
	else {
		return false;
	}
	
}
public void printAllAnimalGreetings() {
	for(Animal s : animalList) {
		s.sayGreeting();
	}
	
}
public void printOneAnimalGreeting(Animal animal) {
	animal.sayGreeting();
	
}
public void printAllAnimalNames() {
	for(String s : animalNames) {
		System.out.println(s);
	}
	
}
public void printOneAnimalName(Animal animal) {
	animal.getName();
	
}
public void printAllAnimals() {
	for(Animal s : animalList) {
		System.out.println(s.toString());
	}
}
public int nextYearPopulationForecast() {
	int a = 0 ;
	int b = 0 ; 
	for(Animal s :animalList) {
		a += ((s.getNumberOfOffsprings()) * (s.getPregnancyPerYear()));
        b++;	
	}
	return a+b;
}
public void animalMovements() {
	for(Animal s :animalList) {
		if(s instanceof Mammal) {
			((Mammal) s).walk();
		}
		else {
			((Bird) s).fly();
		}
	}
	
}
public void eatingHabits() {
	for(Animal s :animalList) {
		if(s instanceof Mammal) {
			((Mammal) s).herbivore();;
		}
		else {
			((Bird) s).omnivore();;
		}
	}
}
public void sortAlphabetically() {
	String[] list = new String[animalNames.size()];	
	
	String temp ="";
	int z = 0;
	for(String k : animalNames) {
		list[z] = k ;
		z++;
	}
          for(int i = 0 ; i< list.length; i++) {
        	  for(int j = 0 ; j < list.length; j++) {
        		  if(list[i].compareTo(list[j])<0)   
                  {  
                      temp = list[i];  
                      list[i] = list[j];  
                      list[j] = temp;  
                   } 
        		  }
        	  }
          for(int i = 0 ;i<list.length; i++) {
        	  System.out.println("My name is " + list[i]);
          }
          
}
public void sortBasedOnLegNumber() {
   
  Animal[] tempList = new Animal[animalList.size()];
  Animal animalTemp;
  
	for(int i = 0 ; i < animalList.size(); i++) {
		tempList[i] = animalList.get(i);
	}
	for(int i = 0 ; i < animalList.size(); i++) {
		for(int j = 0 ; j < animalList.size(); j++) {
		     if(tempList[i].getLegNumber()<tempList[j].getLegNumber() && j<i) {
		    	 animalTemp =tempList[i];
		    	 tempList[i] = tempList[j];
		    	 tempList[j] =animalTemp;
		     }
		}
	}
	for(int i = 0 ; i <tempList.length; i ++) {
	System.out.println(tempList[i] +" has " + tempList[i].getLegNumber() + "legs.");
	}
   
   
}
public void sortBasedOnAge() {
	Animal[] list = new Animal[animalList.size()];
	Animal temp;
	for(int i = 0 ; i < list.length; i++) {
		list[i] = animalList.get(i);
	}
	for(int i = 0 ; i < list.length; i++) {
	 for(int j =0 ; j < list.length ; j++) {
		 if(list[i].getAge()< list[j].getAge()&& j<i) {
			 temp = list[i];
			 list[i] = list[j];
			 list[j] = temp;
		 }
	 }
	}
	for(int i = 0 ; i < list.length ;i++) {
		System.out.println(list[i] + " is " + list[i].getAge() +" years old.");
	}
	
}
public void searchBasedOnName(String name) {
	for(Animal s : animalList) {
		if(s.getName().equals(name)) {
		System.out.println("My name is " +s.getName()+"!");
		System.out.println("I am " + s.getAge()+ " years old!");
		System.out.println("I have " + s.getLegNumber() + " legs!");
		
		}
	}
	
}
public void searchBasedOnAge(int age) {
	for(Animal s : animalList) {
		if(s.getAge() == age) {
			System.out.println("My name is " +s.getName()+"!");
			System.out.println("I am " + s.getAge()+ " years old!");
			System.out.println("I have " + s.getLegNumber() + " legs!");
		}
	}
}
public void printReport(String fileName) {
	System.out.println("We have a total of " + getNumberOfAnimals()+ " animals in the farm. \n");
	
	for(Animal k : animalList) {
		
		if(Chicken.class.isInstance(k)) {
		 System.out.println("  *" + Chicken.getCount()+ " of them are Chicken. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Chicken.class.isInstance(s)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
		  }
		   break; }
}
	for(Animal k : animalList) {
	  if(Donkey.class.isInstance(k)){
		 System.out.println("  *" + Donkey.getCount()+ " of them are Donkey. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Donkey.class.isInstance(s)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
			   
	 }
   break; }
	}
	for(Animal k : animalList) {
	  if(Horse.class.isInstance(k)){
		 System.out.println("  *" + Horse.getCount()+ " of them are Horse. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Horse.class.isInstance(k)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
			   
	 }
   break; }
}
	for(Animal k : animalList) {
	  if(Pig.class.isInstance(k)){
		 System.out.println("  *" + Pig.getCount()+ " of them are Pig. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Pig.class.isInstance(s)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
			   
	 }
		   break;}
	  
}
	for(Animal k : animalList) {
	  if(Raven.class.isInstance(k)){
		 System.out.println("  *" + Raven.getCount()+ " of them are Raven. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Raven.class.isInstance(s)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
		   } 
		   break;}
}
	  for(Animal k : animalList) {
	  if(Sheep.class.isInstance(k)){
		 System.out.println("  *" + Sheep.getCount()+ " of them are Sheep. Those are: ");
		 System.out.println("     Name           Age           Leg Number");
		   for(Animal s : animalList) {
			   if(Sheep.class.isInstance(s)) {
				   System.out.print("     "+ s.getName());
				   for(int i = 0 ; i <11 - (s.getName().length()-4); i++) {
				   System.out.print(" ");
			   }
				   System.out.print(s.getAge());
				   int z = 0;
				   if(s.getAge()<10)
					   z=1;
				   else if(s.getAge()<100)
					   z=2;
				   else if(s.getAge()<1000)
					   z=3;
				   for(int i = 0 ; i <11 -(z-3); i++) {
					   System.out.print(" ");
				   }
				   System.out.print(s.getLegNumber());
				   System.out.println();
		   }
		 }
		   break;}
   }



 
}
}
