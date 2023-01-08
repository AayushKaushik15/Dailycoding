package Static;

public class StaticBlock {
	
	static int n1 = 5;
	static int n2;
	
	
	//will only run once, when the first object is create i.e. when the class is loaded for the first time
	static {										// static block
		System.out.println("I am a static method");
		
		n2 = n1 * 5;
	}
	
	public static void main(String [] args) {
		
		StaticBlock obj1 = new StaticBlock();
		System.out.println(StaticBlock.n1 + " " + StaticBlock.n2);
		
		n2 += 5;
		System.out.println(StaticBlock.n1 + " " + StaticBlock.n2);
		
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.n1 + " " + StaticBlock.n2);
		
		
		Show o1 = new Show(12, "Ayush");
		Show o2 = new Show(122, "shubham");
		Show o3 = new Show(192, "Mayank");
		
		
		System.out.println(o1.name + " " + o1.number);
		System.out.println(o2.name + " " + o2.number);
		System.out.println(o3.name + " " + o3.number);
		
	}
}

//example of upper "Static BLOCK"
class Show {
	
	int number;
	String name;
	
	public Show(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	static {
		System.out.println("I only run once when first obj is create");
	}
}
