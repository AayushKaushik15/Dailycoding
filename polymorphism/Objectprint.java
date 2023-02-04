package DailyCoding.polymorphism;

public class Objectprint {
    public static void main(String [] args) {

        showCase obj1 = new showCase(1);
        System.out.println(obj1);
    }
}

class showCase {
    int number;

    public showCase(int number) {
        this.number = number;
    }
}