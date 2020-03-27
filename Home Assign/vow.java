//import java.util.Scanner;
import strManip.StringInput;
/*class StringInput{
    //static String val;
     static String input(){
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         return sc.nextLine();
     }

 }*/

 class Str {
     String val;

     Str(String val) {
         this.val = val;
     }

     void countVowel() {
         int count = 0;
         String temp = val.toLowerCase();
         for (int i = 0; i < temp.length(); i++) {
             char ch = temp.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u')
                 count++;
         }
         System.out.println("Number of vowels=" + count);
     }

 }

 class vow {
     public static void main(final String[] args) {
         final Str s = new Str(StringInput.input());
        s.countVowel();

    }
}