package DATA_STRUCTURES;
import java.util.*;
class Stack3
{
    int m[];//array elements 
    int sp[];//stack elements 
    int cap;
    int top;//top most element of stack
    Stack3(int c)
    {
        cap=c;
        top=-1;
        m=new int[cap];
        sp=new int[cap];
    }
    void inputMarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 50 students");
        for(int i=0;i<cap;i++)
        {
            m[i]=sc.nextInt();
        }
        //sorting in ascending order
        int temp=0;
        for(int i=0;i<(cap-1);i++)
        {
            for(int j=0;j<(cap-i-1);j++)
            {
                if(m[j]>m[j+1])
                {
                    temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                }
            }
        }
        //pushing marks into the stack 
        for(int i=0;i<cap;i++)
        {
            pushMarks(m[i]);
        }
    }
    void pushMarks(int v)
    {
        if(top==(cap-1))
        {
            System.out.println("Not Possible");
        }
        else
        {
            top++;
            sp[top]=v;
        }
    }
    int popmarks()
    {
        if(top==-1)
        {
            return -999;
        }
        else
        {
            int v=sp[top];
            top--;
            return v;
        }
    }
}