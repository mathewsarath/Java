import strManip.*;
class AsciiRange{
    AsciiRange(String val){
        int fir= val.charAt(0);

        int las=val.charAt(1);
        StringBuffer op=new StringBuffer();
       for (int i=fir ;i!=las+1;i++)
       {
           if((i-fir )%20==0)
            op.append('\n');
           op.append((char)i+" ");
       }
       System.out.println(op);
    }

    public static void main(String[] args) {
        final AsciiRange s = new AsciiRange(StringInput.input());

    }
}