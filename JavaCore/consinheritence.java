package JavaCore;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of JavaCore.Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of JavaCore.Derived with value of z as: " + z);
    }
}
public class consinheritence {
    public static void main(String[] args) {
        // JavaCore.Base1 b = new JavaCore.Base1();
        // JavaCore.Derived1 d = new JavaCore.Derived1();
        // JavaCore.Derived1 d = new JavaCore.Derived1(14, 9);
        // JavaCore.ChildOfDerived cd = new JavaCore.ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

