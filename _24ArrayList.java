 import java.util.*;
public class _24ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l2.add(100);
        l2.add(200);

        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(6);
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
