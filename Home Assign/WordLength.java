import strManip.StringInput;
class WordLength{
     WordLength(String val ){
        int count=0;
        StringBuffer cntStr=new StringBuffer(val+" ");
        for (int i=1;i<cntStr.length();i++)
        {
            char ch=cntStr.charAt(i);
            if(ch ==' ')
                count++;
            
             
        }
        System.out.println("Number of words="+count);


        
    }
    public static void main(final String[] args) {
        int i=1;
        while(i==1)
            new WordLength(StringInput.input());

   }
}