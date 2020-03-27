import strManip.StringInput;
class RevWord{
    RevWord(String val)
    {
        StringBuffer rev=new StringBuffer();
        int len=val.length();
        for(int i=len-1;i>=0;i--)
        {
            rev.append(val.charAt(i));
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        new RevWord(StringInput.input());
    }
}