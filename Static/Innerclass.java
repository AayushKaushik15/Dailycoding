package Static;

public class Innerclass {

	//1. we have to declare inner class as "static" because if we don't do that 
	// toh hume inner class k object banana pade ga pr wo inner class phele se kisi or pr 
	// dependent hai toh static jaruri hai
	
	 static class InnerDisplay {
		int number;
		String name;
		public InnerDisplay(int number, String name) {
			super();
			this.number = number;
			this.name = name;
		}
		
	}
	
	public static void main (String [] args) {
		
		InnerDisplay obj1 = new InnerDisplay(123, "ayush");
		System.out.println(obj1.name + " " + obj1.number);
	}
}

//if we dont use static inner class

/*Note :- No enclosing instance of type Innerclass is accessible. 
 * Must qualify the allocation with an enclosing instance of type Innerclass 
 * (e.g. x.new A() where x is an instance of Innerclass).  */