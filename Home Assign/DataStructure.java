import dataStructure.*;
import java.util.Scanner;
import java.util.Stack;

class DataStructure{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
         MyStack st;
         MyQueue qu;
         int op=0;
         int j=1,k=1;
         //System.out.println(st.a);
         while(j==1){
        System.out.println("1.Stack 2.Queue");
        op=sc.nextInt();
        System.out.println(op);
        if(op==1)
        {
            System.out.println("Enter the size of stack");
            st=new MyStack(sc.nextInt());
            k=1;
            while(k==1)

            {
                System.out.println("1.Push 2.Pop 3.Show value  4.Back");
            op=sc.nextInt();                
               if(op==1)
                {
                    st.push();
                }
               else if(op==2)
               {
                   st.pop();
               }
               else if(op==3)
                System.out.println(st.topValue);
               else
               {
                   k=2;
               }
            }     

   
        }
        else if(op==2)
        {                System.out.println("Enter the size of queue");
        qu=new MyQueue(sc.nextInt());

            System.out.println("1.New Queue 2.Enqueue 3.Dequeue 4.Back");

            op=sc.nextInt();
            k=1;
            while(k==1)
            {
                if(op==2)
                {
                    qu.enqueue();
                }
               else if(op==3)
               {
                   qu.dequeue();
               }
               else
               {
                   k=2;
               }

        }
    }
    }
}
}