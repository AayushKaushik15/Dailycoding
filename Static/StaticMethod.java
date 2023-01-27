package Static;

public class StaticMethod {
	public static void main(String [] args) {
		
		showCase();
		
	}
	
	public void show () {    //simple non-static method
		
		System.out.println("Hi there I'm simple method");
		
		//showCase();			//but non - static method can contain static reference easily
	}
	
	public static void showCase () {
		
			//show();         //we can't make non-static method reference inside static method
		//because static method are not linked with classes so, they don't use class object to excute;
		
		System.out.println("I am Static method");
		 
		
		StaticMethod o1 = new StaticMethod(); //but we can create referance like that inside static method
		o1.show();
	}
}
