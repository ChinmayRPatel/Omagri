package MultiThreading.Synchronization;

public class Counter {

    private  int count=0;

    public synchronized void increament(){
//        synchronized (this){
//        ******** this block used to just synchronize some data only them use this particular sunchronise
//        }
            count++;
    }
    public  int getCount(){
        return count;
    }

}
