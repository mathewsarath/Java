import strManip.StringInput;
class Palindrome{
    Palindrome(String val)
    {
        int len=val.length();
        int i=0;
        for(i=0;i<=(len)/2;i++)
        {
           // System.out.println(val.charAt(i)+" "+val.charAt(len-1-i));
            if(val.charAt(i)!=val.charAt(len-1-i))
            {
              //  System.out.println('a');

                break;
            }
        }
        if(i==(len+1)/2)
        {
            System.out.println("String is a Palindrome");

        }
        else
        System.out.println("String is not a Palindrome");

    }
    public static void main(String[] args) {
        new Palindrome(StringInput.input());
    }
}