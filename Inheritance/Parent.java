package Inheritance;

public class Parent {
	
	public static void main(String[] args) {
		
	}
	
	int number;
	String name;
	
	public Parent () {
		this.name = "null";
		this.number = -1;
	}
	
	public Parent (int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	public Parent (Parent clone) {
		this.name = clone.name;
		this.number = clone.number;
	}
	
	public Parent (String typo) {
		this.name = typo;
		this.number = -1;
	}
	
	
	public void display () {
		System.out.println("My name is Simple method");
	}
	
	public static void scream () {
		System.out.println("Static method call");
	}
}
