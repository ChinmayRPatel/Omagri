package MultiThreading.ThreadPool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
    private String name;
    public Task(String s){
        name = s;
    }
    @Override
    public void run() {
        try{
            SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
            for(int i=0; i<=5 ; i++){
                if (i==0){
                    Date d = new Date();
                    System.out.println("Initialization time name = "+ name + " = "+ ft.format(d));
                }else{
                    Date d = new Date();
                    System.out.println("Executing time fr tak name = "+ name +" = "+ ft.format(d)+" i = "+i);
                }
                Thread.sleep(3000);
            }
            System.out.println(name + " is completed ");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
