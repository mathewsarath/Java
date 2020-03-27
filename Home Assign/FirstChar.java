import strManip.*;
class FindChar{
    FindChar(String val)
    {

        int len=val.length(),flag=0;
        char ch1,ch2;

        for(int i=0;i<len;i++)
        {
            flag=0;
            ch1=val.charAt(i);
            for(int j=i+1;j<len;j++)
            {

                ch2=val.charAt(j);
                if(ch1==ch2 )
                {
                    flag++;
                    break;
                }
            }
            if(flag==0){
             System.out.println("First non repeating charecter is "+ch1);
             break;
                
            }
        }
    }
}
class FirstChar{
    public static void main(String[] args) {
        FindChar st=new FindChar(StringInput.input());
    }
}

                //