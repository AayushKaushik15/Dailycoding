package Basics;

public class Main {
	
	
	// classes :- classes are the logical construct
			// 	- classes are just template 
	
	// objects :- Objects are real world entity 
			//  - Objects declare using "NEW" keyword
			//  - use for dynamic memory allocation
	
	public static void main(String [] main) {    // this is first main java method you have to declare this method for code execution
		
		Show obj1 = new Show (123, "Ayush");
		
		// #Note -------------------------
		// Show - class name 
		// obj1 - reference variable of class data type
		// new - new keyword help to create object which store in heap memory
		// show () -  special function name constructor
	}
}

class Show {				//class
	
	int number;
							//instance variable inside the class but outside the method
	String name;
	
	Show (int number, String name) {   // Constructor are the special function which automatically create when class declare 
		
		this.name = name;   // this keyword invoke current class instance variable
			
		this.number = number;   // use of dot operator is to link referance variable to instance variable
	}
	
}
