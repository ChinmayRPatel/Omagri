package CollectionPrograms;
/*package whatever //do not write package name here */

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=10;i>3;i--){
            pq.add(i);
        }
        System.out.println(pq);
    }
}

