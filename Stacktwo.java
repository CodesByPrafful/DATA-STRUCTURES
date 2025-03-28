package DATA_STRUCTURES;
import java.util.*;
class Stacktwo
{
    char ch[];
    int capacity;
    int top;
    Stacktwo(int cap)
    {
        capacity=cap;
        top=-1;
        ch=new char[capacity];
    }
    void pushchar(char v)
    {
        if(top==(capacity-1))
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            ch[top]=v;
        }
    }
    char popchar()
    {
        if(top==-1)
        {
            return '\\';
        }
        else
        {
            char c=ch[top];
            top--;
            return c;
        }
    }
}