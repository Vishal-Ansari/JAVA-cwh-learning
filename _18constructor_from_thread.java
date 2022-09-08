class mythr1 extends Thread{
    public mythr1(String name){
        super(name);    
    }

    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(" 1  hiiiiiiii");
    }
}
class mythr2 extends Thread{
    public mythr2(String name){
        super(name);    
    }

    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(" 2 byeee");
    }
}


public class _18constructor_from_thread {
    public static void main(String[] args) {
        mythr1 t1=new mythr1("Vishal");
        mythr2 t2=new mythr2("Ansari");
        t1.start();
        System.out.println("the id of the thread1 is "+t1.getName());
        t2.start();
        System.out.println("the id of the thread2 is "+t2.getId());
    }
}
