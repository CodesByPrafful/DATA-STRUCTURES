package DATA_STRUCTURES;
import java.util.*;
class PrintJobs
{
    int job[];
    int newjob,capacity,front,rear;
    PrintJobs()
    {
        capacity=20;
        front=rear=-1;
        job=new int[capacity];
    }
    void addJob()
    {
        if(rear==(capacity-1))
        {
            System.out.println("PrintJob is Full");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                front=rear=0;
            }
            else
            {
                rear=rear+1;
            }
            job[rear]=newjob;
        }
    }
    void removeJob()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("PrintJob is Empty.");
        }
        else
        {
            int val=job[front];
            System.out.println("Job Available:"+val);
            if(front==rear)
            {
                front=rear=-1;
            }
            else
            {
                front=front+1;
            }
        }
    }
}