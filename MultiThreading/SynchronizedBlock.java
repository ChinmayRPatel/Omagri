package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlock {
    String name="";
    int count =0;
    public void geekName(String name, List<String> list){
        synchronized (this){
            this.name = name;
            count++;
        }
        list.add(name);
    }

    public static void main(String[] args) {
        SynchronizedBlock t1 = new SynchronizedBlock();
        List<String> lst=new ArrayList<>();
        t1.geekName("Alok", lst);
        System.out.println(t1.name);
    }
}
