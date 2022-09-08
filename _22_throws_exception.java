
class negativeRadiusException extends Exception{

    public String getmessage(){
        return "Radius cant be negative"; 
    }
}

public class _22_throws_exception {

    public static double area(int r) throws negativeRadiusException{

        if(r<0){
            throw new negativeRadiusException();
        }

        double result=Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            // int c=divide(6,0);
            // System.out.println(c);
            double ar=area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}


