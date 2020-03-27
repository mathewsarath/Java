package strManip;
import java.util.Scanner;
 public class StringInput{
    //static String val;
     public static String input(){
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         return sc.nextLine();
     }
    }