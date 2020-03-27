import strManip.StringInput;
class Password{
    Password(String val){
    escape:
      if(val.length()>10)
        {
            int count=0;
            for (int i=0;i<val.length();i++)
            {
                char ch=val.charAt(i);
                if( Character.isLetter(ch))
                    continue;
                else if (Character.isDigit(ch))
                    count++;
                else{
                    System.out.println("invalid password");
                    break escape;
                }

            }
            if(count<2)
            System.out.println("invalid password");
            else
            System.out.println("valid password");


        }
         else
         System.out.println("invalid password");
 

    }
    public static void main(String[] args) {
        final Password s = new Password(StringInput.input());
        
    }
}