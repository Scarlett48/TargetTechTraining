package com.aique.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

    public static void main(String[] args) {
        MathTask t1 = new MathTask(10,20,2000);
        MathTask t2 = new MathTask(20,40,4000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer>  ft1= executorService.submit(t1);
        Future<Integer>  ft2= executorService.submit(t2);

        while (true){
            try {
                if (ft1.isDone()) {
                    System.out.println("Ft1 value" + ft1.get());
                }
                if (ft2.isDone()) {
                    System.out.println("Ft2 is doing something");
                    System.out.println("Ft2 value" + ft2.get());
                }
                if(ft1.isDone() && ft2.isDone()){
                    System.out.println("Both tasks done.....");
                    executorService.shutdown();
                    return;
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

class MathTask implements Callable{
     int a;
     int b;
     int sleepTime;

    public MathTask(int a, int b, int sleep){
        this.a=a;
        this.b=b;
        this.sleepTime =sleep;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(sleepTime);
        return a*b;
    }


}