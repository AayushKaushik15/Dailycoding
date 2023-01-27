package Dailycoding.Inheritance;

public class Show {
    public static void main(String[] args) {

//        Child obj1 = new Child();
//        obj1.display();         //simple method
//        Child.scream();         // static method
//        System.out.println(obj1.name + " " + obj1.number + " " + obj1.naam);
//
//        Parent obj2 = new Child(25, "ayush", "shashank");
//
//        System.out.println(obj2.name + " " + obj2.number);  //it can't access obj2.naam beacuse naam variable is in child class
        // but here you can acces those instance variables which are available in Parent class
        //Because the reference variable of object is type Parent class;

        //NOTE THAT
//        there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. child class
        // hence, you should have access to naam variable
        // this also means, that the ones you are trying to access should be initilized
        //but here, when the object itself if of type parent class, how will you call the child class variables
        //this is why error
//        Child ob4 = new Parent (23, "Ayush");


        Childtwo obj = new Childtwo();
        System.out.println(obj.number);
    }
}

