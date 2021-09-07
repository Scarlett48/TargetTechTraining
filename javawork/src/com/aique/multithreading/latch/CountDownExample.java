package com.aique.multithreading.latch;

import java.util.concurrent.CountDownLatch;

 class MyApp implements Runnable{
   private String name;
   private CountDownLatch countDownLatch;

   public MyApp(String name, CountDownLatch countDownLatch){
       this.name=name;
       this.countDownLatch=countDownLatch;
   }

    @Override
    public void run() {
        try {
            System.out.println(name +" Ready To Run....");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countDownLatch.countDown();
    }
}

public class  CountDownExample{

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Thread a1 = new Thread(new MyApp("A1",countDownLatch));
        Thread a2 = new Thread(new MyApp("A2",countDownLatch));
        Thread a3 = new Thread(new MyApp("A3",countDownLatch));

        a1.start();
        a2.start();
        a3.start();

        try {
            countDownLatch.await();
            System.out.println("Applications are ready to go boom.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}