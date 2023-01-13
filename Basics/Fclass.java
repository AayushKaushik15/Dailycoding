package Basics;

public class Fclass {
	public static void main(String [] args) {
		
		
		Fclass o1 = new Fclass (12, "ayush");
		
		//System.out.println(o1);  
		// here it will print  "HashCode" value Basics.Fclass@5acf9800
		//know you have to use toString method to print constructor
		
		// you can print value by adding instance variable o1.name , o1.number   -->  o1 - reference variable  name --> instance variable
		
		
		System.out.println(o1);
		

		 
	}
	
	int number;
	String name;
	
	public Fclass (int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	public String toString () {					// using this method you no need to use o1.name 
												// now you can execute method only with the name of reference variable
		return name  + " " + number;
	}
}
