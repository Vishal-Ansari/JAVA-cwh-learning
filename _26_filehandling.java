

// import java.io.File;

// public class _26_filehandling {
//     public static void main(String[] args) {
//         File myfile= new File("filehandlingling.txt");
//         try{
//             myfile.createNewFile();}
//             catch(Exception e){
//                 System.out.println("cant create the file");
//             }
//     }
// }


import java.util.regex.*;  
public class _26_filehandling{  
public static void main(String args[]){  
//1st way  
Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("as");  
boolean b = m.matches();  
  
//2nd way  
boolean b2=Pattern.compile(".s").matcher("as").matches();  
  
//3rd way  
boolean b3 = Pattern.matches(".s", "as");  
  
System.out.println(b+" "+b2+" "+b3);  
}}  