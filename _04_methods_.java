public class _04_methods_ {
    static int logic(int x,int y){// static function are able to be calledd directly in man without creating object.
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

public static void main(String[] args){

// methods_ obj= new methods_() // if we dont use static then this is the methode to call function creating object.
// int c=obj.logic(3,6);

    int c;
    c=logic(2,3);
    int c1;
    c1=logic(4,1);

    System.out.println(c);
    System.out.println(c1);
}
    
}
