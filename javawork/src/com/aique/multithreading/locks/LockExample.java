package com.aique.multithreading.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    List<Integer> list = new ArrayList<>();
    LockExample o1 = new LockExample();
    Lock lock = new ReentrantLock();

    public void addMe(List<Integer> list, Integer i){
           lock.lock();
           i=i+10;
           list.add(i);///10 t1 t2 20
           System.out.println();
           lock.unlock();

    }
    //unsafe (Thread safety is not considered)

    public static void main(String[] args) {


    }


}
