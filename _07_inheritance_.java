

class Base1{
    Base1(){
        System.out.println("i am a constructor of base class");
    }
    Base1(int x){
        System.out.println("i am a overloaded contructoe of base class and value of x is "+ x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        // super(3);// to call the constructor with argument we use super
        System.out.println("i am constructor of derived class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am constructor of derived class with value of y as "+y);
    }

}
class childofDerived extends Derived1{
    childofDerived(){
        System.out.println("i am a constructor of childof derived class");
    }
    childofDerived(int x,int y, int z){
        super(x,y);
        System.out.println("i am a constructor of childof derived class with value of z as "+z);
    }
}

public class _07_inheritance_ {

    public static void main(String[] args) {
        // Derived1 d1= new Derived1();
        // Derived1 d1= new Derived1(4,9);
        // childofDerived c1=new childofDerived();
        childofDerived c1=new childofDerived(1,2,3);
    }
}
