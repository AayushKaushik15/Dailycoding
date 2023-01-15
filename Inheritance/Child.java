package Inheritance;

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		
	}
	
	String naam; 
	
	public Child () {
		this.naam = "Ayush";
	}

	public Child(int number, String name, String naam) {
		super(number, name);
		this.naam = naam;
		// TODO Auto-generated constructor stub
	}


	//super class invoke parent class constructors and methods

	
	
	
}
