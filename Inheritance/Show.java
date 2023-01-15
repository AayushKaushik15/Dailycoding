package Inheritance;

public class Show {
	public static void main(String[] args) {
		
		Child obj1 = new Child();
		
		System.out.println(obj1.name + " " + obj1.number + " " + obj1.naam);
		
		Child obj2 = new Child(25, "shashank", "ayush");
		obj2.display();
		Child.scream();
		System.out.println(obj2.name +  " " + obj2.number + " " + obj2.naam);
	}
}
