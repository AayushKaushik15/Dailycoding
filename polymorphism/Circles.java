package DailyCoding.polymorphism;

public class Circles extends Shapes{
    //this will run when object of circle is created
    // hence it is Overriding the parent method

    @Override // this is called annotation
    void area() {
        System.out.println("area is pie * r * r");
    }
}
