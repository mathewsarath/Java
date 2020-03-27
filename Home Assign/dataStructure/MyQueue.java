package dataStructure;
import java.util.Scanner;
public class MyQueue{
    Scanner sc=new Scanner(System.in);
    int queue[],max=0,fir=-1,las=-1,topValue=0;
    public MyQueue (int val){
        queue=new int[val];
        max= val;
    }
    public void enqueue()
{
    
    if( las%max+1!=fir)
    {
        if(fir==-1 )
    {
        fir=las=0;
        topValue=sc.nextInt();
        queue[las]=topValue;

    }
        else{
        topValue=sc.nextInt();
        queue[++las]=topValue;
    }
    }
    else
    System.out.println("Queue is full");
}
public void dequeue(){
    if(fir!=-1)
    {
        if(fir==las)
    {
        topValue=queue[fir];
        fir=las=-1;
    }
     else
     {
         topValue=queue[fir++];
     }
    }
    else
    {
        System.out.println("Queue is empty");
    }
}
} 
