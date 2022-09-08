// class Mythread1 extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++)
//         System.out.println("hiiiiiiii");
//     }
// } 
// class Mythread2 extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++)
//         System.out.println("byeeee");
//     }
// } 

// public class _16Multi_threading {
//     public static void main(String[] args) {
//         Mythread1 t1=new Mythread1();
//         Mythread2 t2=new Mythread2();
//         t1.start();
//         t2.start();
//     }
// }


class m1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}


class m2 extends Thread{
    public void run(){
        for(int i=10;i<20;i++)
        System.out.println(i);
    }
}


public class _16Multi_threading{

    public static void main(String[] args) {
        m1 t1=new m1();
        m2 t2=new m2();
        t1.run();
        t2.run();
    }
}