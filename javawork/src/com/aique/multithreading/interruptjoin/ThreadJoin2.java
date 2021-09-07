package com.aique.multithreading.interruptjoin;

public class ThreadJoin2 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        ThreadJoin2 t1=new ThreadJoin2();
        ThreadJoin2 t2=new ThreadJoin2();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());
        t1.start();
        t2.start();
        t1.setName("Soloman");
        System.out.println("After changing name of t1:"+t1.getName());
    }

}
