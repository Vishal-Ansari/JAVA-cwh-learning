class mythr extends Thread{
    public mythr(String name){
        super(name);    
    }

    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(" 1  hiiiiiiii  "+ this.getName());
    }
}


public class _19Thread_priorities {
    public static void main(String[] args) {
        mythr t1=new mythr("Vishal");
        mythr t2=new mythr("Shariq");
        mythr t3=new mythr("Shadmani");
        mythr t4=new mythr("Rukaiyya");
        mythr t5=new mythr("Rukhsar");
        mythr t6=new mythr("Sonam");
        mythr t7=new mythr("Shabnam has max priority");

       t7.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
