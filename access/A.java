package DailyCoding.access;

public class A {
    private int num;                //hiding all kind of services is known as Encapsulation
    public String name;
    protected int [] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
    public String toString () {
        return num + " " + name + " " + arr[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
