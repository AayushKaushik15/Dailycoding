package DailyCoding.polymorphism;

public class Numbers {
    public static void main(String [] args) {

        Numbers obj1 = new Numbers();
        System.out.println(obj1.sum(123, 213));

    }

    double sum (double a, int b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
}
