package Inheritance;

public class Show {
	public static void main(String[] args) {
		
		Child obj1 = new Child();
		
		System.out.println(obj1.name + " " + obj1.number + " " + obj1.naam);
		
		Child obj2 = new Child(25, "shashank", "ayush");
		obj2.display();
		Child.scream();
		System.out.println(obj2.name +  " " + obj2.number + " " + obj2.naam);
		
		
		Main ob3 = new Child(123, "ayush", "shashank");
        System.out.println(ob3.name + " " + ob3.number);

        //NOTE THAT
//        there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. child class
        // hence, you should have access to naam variable
        // this also means, that the ones you are trying to access should be initilized
        //but here, when the object itself if of type parent class, how will you call the child class variables
        //this is why error
//        Child ob4 = new Main(23, "Ayush");
	}
}
