package DATA_STRUCTURES;
import java.util.*;
class DQue3
{
    int dq[];
    int f,r;
    int size;
    DQue3(int s)
    {
        size=s;
        f=r=-1;
        dq=new int[size];
    }
    void insFront(int data)
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
                f=f-1;
            }
        }
        dq[f]=data;
    }
    int delFront()
    {
        if(f==-1 && r==-1)
        {
            return -999;
        }
        else
        {
            int val=dq[f];
            if(f==r)
            {
                f=r=-1;
            }
            else
            {
                f=f+1;
            }
            return val;
        }
    }
    void insRear(int data)
    {
        if((f==0 && r==size-1) || f==(r+1))
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
            }
            dq[r]=data;
        }
    }
    void delRear()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            int val=dq[r];
            System.out.println("Element:"+val);
            if(f==r)
            {
                f=r=-1;
            }
            else
            {
                if(r==0)
                {
                    r=size-1;
                }
                else
                {
                    r=r-1;
                }
            }
        }
    }
}