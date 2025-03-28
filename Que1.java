package DATA_STRUCTURES;
import java.util.*;
class Que1
{
    int q[];
    int f,r,size;
    Que1(int s)
    {
        size=s;
        f=r=-1;
    }
    void insertQue(int data)
    {
        if(r==(size-1))
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if(f==-1 && r==-1)
            {
                f=r=0;
            }
            else
            {
                r=r+1;
                q[r]=data;
            }
        }
    }
    void deleteQue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            int val=q[f];
            System.out.println("Element:"+val);
            if(f==r)
            {
                f=r=-1;
            }
            else
            {
                f=f+1;
            }
        }
    }
    void display()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            for(int i=f;i<r;i++)
            {
                System.out.print(q[i]+" ");
            }
        }
    }
}