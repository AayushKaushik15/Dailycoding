package Basics;

public class Singleton {
	
	// only one object is allowed that's known singleton classes
	
	private Singleton () {
		
	}
	
	private static Singleton instance;
	
	public static Singleton getInstance () {
		
		// check whether 1 obj only is created or not
		
		if (instance == null) {
			instance = new Singleton ();
		} 
		
		return instance;
	}
}


//it give access to only one object