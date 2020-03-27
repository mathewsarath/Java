class TwinPrime{
    static void twinPrime(){
        int[] prime=new int[100];
        int k=-1;
        for(int i=2;i<=100;i++)
        {
            int count=0;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                 count++;
            }
            if(count==1)
             prime[++k]=i;
        }
        for(int i=0;i<k;i++)
         if(prime[i+1]-prime[i]==2)
            System.out.println("("+prime[i]+","+prime[i+1]+")");
    }
    public static void main(String[] args) {
        twinPrime();
}
}