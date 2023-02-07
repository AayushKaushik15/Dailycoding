package DailyCoding.polymorphism;

public class Objectprint {
    public static void main(String [] args) {

        showCase obj1 = new showCase(1);
        System.out.println(obj1);   //you have to use toString method to achieve "obj1.number"
    }
}

class showCase {
    int number;

    public showCase(int number) {
        this.number = number;
    }
}