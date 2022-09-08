
class MythreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(i+ "   hiiiiiiii");
    }
} 
class MythreadRunnable2 implements Runnable{
    public void run(){
        for(int i=10;i<20;i++)
        System.out.println(i+" byeeee");
    }
} 


public class _17Runnable_thread {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1= new MythreadRunnable1();
        Thread gun1= new Thread(bullet1);
        
        MythreadRunnable2 bullet2= new MythreadRunnable2();
        Thread gun2= new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
