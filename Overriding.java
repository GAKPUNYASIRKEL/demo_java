class A {
    void print(){
        System.out.println("Print A");
    }
}

class B extends A {
    @Override
    void print(){
        System.out.println("Print B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();

        objectA.print();
        objectB.print();
    }
}
