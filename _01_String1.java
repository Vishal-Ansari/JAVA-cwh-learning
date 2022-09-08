import java.util.Scanner;

public class _01_String1 {
    public static void main(String[] args)
    {
        // String name= new String("halwa khana h kya");
        // System.out.println(name);
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the string:  ");
        // String st=sc.nextLine();
        // System.out.println("the entered string is : "+ st);

        // int value=st.length();
        // System.out.println("the length od string is: " +value);
        // String low=st.toUpperCase();
        // System.out.println("string is converted to upper case: "+low);

        String nonTrimmed= "        helloooo     ";
        System.out.println(nonTrimmed);
        String trimmed=nonTrimmed.trim();
        System.out.println(trimmed);
        System.out.println(trimmed.substring(2));
        System.out.println(trimmed.substring(2,5));
        System.out.println(trimmed.replace('h','y'));
        System.out.println(trimmed.replace("o", "vi"));
    }
}
