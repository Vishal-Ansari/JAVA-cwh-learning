import java.util.Scanner;

public class _03_get_using_scanner {
    public static void main(String[] args) {
        System.out.println(" scan the number "); 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number 1:  ");
        int a=sc.nextInt();
        System.out.print("enter the number 2:  ");
        int b=sc.nextInt();
        System.out.println("the sum of numbers is "+(a+b));

        System.out.print("enter the number b1: ");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

        System.out.print("enter the string 1: ");
        String str=sc.nextLine();
        System.out.println(str);
        System.out.print("enter the string 2: ");
        String str2=sc.nextLine();
        System.out.println(str2);

    }
}
