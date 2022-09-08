interface sampleInterface{
    void meth1();
    void meth2();
}
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class Mysample implements childInterface{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
}

public class _09_inheritance_in_interface {
    public static void main(String[] args) {
        Mysample obj=new Mysample();
        obj.meth1(); 
        obj.meth2(); 
        obj.meth3(); 
        obj.meth4(); 
    }
}
