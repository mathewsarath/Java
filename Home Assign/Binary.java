import java.util.Scanner;
class Binary{
    static void search(int ar[],int val)
    {
        int fir=0,las=(ar.length)-1;
        int mid=(fir+las)/2;
        for(fir=0;fir<las;)
        {
            if(val<ar[mid])
                las=mid-1;
            else if(val>ar[mid])
                fir=mid+1;
            else
            {
                System.out.println("value is present at "+(mid+1));
                return;
            }
            mid=(fir+las)/2;
        }
        System.out.println("value is not present");

    }
    public static void main(String[] args) {
    int[] ar ={1,24,34,42,55,67,98,121,134,158,199};
    search (ar,98);
            }
}