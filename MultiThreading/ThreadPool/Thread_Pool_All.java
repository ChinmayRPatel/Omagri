package MultiThreading.ThreadPool;

import exceptions.FileNotFound.CustomFileException;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Thread_Pool_All {

            public static void main(String[] args) {
                ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 5000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
                for (int i = 1; i <= 10; i++) {
                    int finalI = i;
                    executor.submit(() -> {
                        try {
                            Thread.sleep(1000);
                            System.out.println("Task is processed by thread = " + Thread.currentThread().getName() + " and i = " + finalI);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
                }

                executor.shutdown();
            }



}