import java.util.*;

public class _25_LInkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l2.add(100);
        l2.add(200);

        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(6); 
        l1.addFirst(543);
        l1.addLast(666);
        l1.add(0,10);
        l1.add(0,12);


        l1.addAll(l2);

        // l1.clear();

        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        l1.set(1,43);

        for(int i=0;i<l1.size();i++)
        System.out.print(l1.get(i)+", ");
    }
}
