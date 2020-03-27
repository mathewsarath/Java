package dataStructure;
import java.util.Scanner;
public class MyStack{
    Scanner sc=new Scanner(System.in);
    static int a=5;
    int[] stack;
    int top=-1,size=0;
    public int topValue=0;
    public MyStack(int val){
        stack=new int[val];
        size=val;

    }
    public void push(){
        
        if(top<size)
        {
         topValue=sc.nextInt();
         stack[++top]=topValue;
         System.out.println("value pushed.");
        }
        else
            System.out.println("Stack overflow");
        return;
    }
    public void pop()
    {
        if(top>-1)
        {
            System.out.println("value popped");
            topValue= stack[top--];
        }
        else
        {
            System.out.println("Stack underflow");
            top=-1;
        }
        return;

    }
}