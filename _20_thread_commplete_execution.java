class newthr1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(i+" hiiii");
    }
}
class newthr2 extends Thread{
    public void run(){
        for(int i=10;i<20;i++)
        System.out.println(i+" byeee");
    }
}
class newthr3 extends Thread{
    public void run(){
        for(int i=20;i<30;i++)
        System.out.println(i+" whyyy");
    }
}


public class _20_thread_commplete_execution {
    public static void main(String[] args) {
        newthr1 t1=new newthr1();
        newthr2 t2=new newthr2();
        newthr3 t3=new newthr3();
     t1.start();
     try{t1.join();} catch(Exception e){System.out.println(e);}
     t2.start();
     try{t2.join();} catch(Exception e){System.out.println(e);}
     t3.start();
    }
    
}
