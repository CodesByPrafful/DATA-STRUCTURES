package DATA_STRUCTURES;
import java.util.*;
class Stack1
{
    int size,sp;
    int stack[];
    Stack1(int s)
    {
        size=s;
        sp=-1;
        stack=new int[size];
    }
    void push(int v)
    {
        if(sp==(size-1))
        {
            System.out.println("Overflow");
        }
        else
        {
            sp++;
            stack[sp]=v;
        }
    }
    void pop()
    {
        if(sp==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
            int val=stack[sp];
            System.out.println("Element:"+val);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
            for(int i=0;i<size;i++)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
/*Output:
 * Overflow
1
2
3
4
5
Element:5
Element:4
Element:3
Element:2
Element:1
Underflow
 */