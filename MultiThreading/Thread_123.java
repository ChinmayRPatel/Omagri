package MultiThreading;

// Java program to illustrate need
// of Synchronization
import java.io.*;

class Multithread
{
    private int i = 0;
    public void increment()
    {
        i++;
    }

    public int getValue()
    {
        return i;
    }
}

public class Thread_123
{
    public static void main (String[] args)
    {
        Multithread t = new Multithread();
        t.increment();
        Multithread t2 = new Multithread();
        t2.increment();
        Multithread t3 = new Multithread();
        t3.increment();
        System.out.println(t.getValue());
        System.out.println(t2.getValue());
        System.out.println(t3.getValue());
    }
}
