package DATA_STRUCTURES;
import java.util.*;
class CQue2
{
    int cq[];
    int f,r;
    int size;
    CQue2(int s)
    {
        size=s;
        f=r=-1;
        cq=new int[size];
    }
    void insertcq(int data)
    {
        if((f==0 && r==(size-1)) || (f==(r+1)))
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
                if(r==(size-1))
                {
                    r=0;//wrap around r to the beginning
                }
                else
                {
                    r=r+1;
                }
            }
            cq[r]=data;
        }
    }
    void deletecq()
    {
        int val=cq[f];
        System.out.println("Element:"+val);
        if(f==-1 && r==-1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            if(f==(size-1) && f!=r)//wrapped around
            {
                f=0;
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
            if(f<=r)//not wrapped around
            {
                for(int i=f;i<=r;i++)
                {
                    System.out.println(cq[i]+" ");
                }
            }
            else
            {
                for(int i=f;i<size;i++)//when queue is wrapped around 
                {
                    System.out.println(cq[i]+" ");
                }
                for(int i=0;i<=r;i++)
                {
                    System.out.println(cq[i]+" ");
                }
            }
        }
    }
}