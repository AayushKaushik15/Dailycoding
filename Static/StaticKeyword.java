package Static;

public class StaticKeyword {
	public static void main(String [] main) {
		
		//static keywords are not linked with classes
		//they are apart from classes
		// they don't need objects to run 
		//"main" method is static because if you can run any method 
		// then you have to make an object of main class before run any other class object 
		
		//this help for memory management
		//static are run at compile time
		
		StaticKeyword obj1 = new StaticKeyword(123, "Acer");
		StaticKeyword obj2 = new StaticKeyword(895, "Hp");
		
		System.out.println(StaticKeyword.population);  //here we can call static "keyword" with the name of class not object
		System.out.println(StaticKeyword.population);	// we can say static are class level not object level
		
		System.out.println(obj1.name + " " + obj1.number);
		System.out.println(obj2.name + " " + obj2.number);

		
	}
	
	int number;
	String name;
	
	static double population;				//static keyword use
	
	public StaticKeyword (int number, String name) {
		this.name = name;
		this.number = number;
		
		StaticKeyword.population += 1;
	}
}
