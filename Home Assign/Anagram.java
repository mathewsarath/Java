import strManip.*;
class Sort{
    StringBuffer st=new StringBuffer();
    String St;
    Sort(String val)
    {

        int len=val.length();
        char[] ch=new char[len];

        for(int i=0;i<len;i++)
        {
            ch[i]=val.charAt(i);
         }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
                //
            }
            st.append(ch[i]);
        }
        St=st.toString();

        }
    }
    class Anagram{
        public static void main(String[] args) {
            String s1=StringInput.input();
            String s2=StringInput.input();
            if(s1.length()==s2.length())
            {
                Sort S1=new Sort(s1);
                Sort S2=new Sort(s2);
                System.out.println(S1.st+" "+S2.st);
                //System.out.println(S1.st+" "+S2.st);
                //System.out.println(S1.St.equals(S2.St));
                //System.out.println(S1.st.length());
                //System.out.println(S2.st.length());
                if(S1.St.equals(S2.St))
                    {
                          //  System.out.println(S1.st+" "+S2.st);

                        System.out.println("strings are anagram");
                        return;
                    }
                
            }

            System.out.println("strings are not anagram");



        }
    }
