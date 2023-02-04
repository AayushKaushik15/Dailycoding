package DailyCoding.Inheritance;

public class Child extends Parent{
	
	public static void main(String[] args) {

//		Child o1 = new Child();

	}
	
	String naam; 
	
	public Child () {
//		super();
		this.naam = "Ayush";

	}

	public Child(int number, String name, String naam) {
		super(number, name);  //invoke parent class constructor
		this.naam = naam;
		super.display();      //invoke parent class simple method
	}

	public Child (Child clone){
		super(clone);
		this.name = name;
	}

	public void show () {
		System.out.println();
	}

	//super class invoke parent class constructors, method in the child class using super.then name of method and
	// super(name,number) for constructor



	/*Note that  :-
	* you dont need to call static method in child class because static is dependent on Class not objects
	*
	* you can just say Child.screm*/
	
	
	
}
