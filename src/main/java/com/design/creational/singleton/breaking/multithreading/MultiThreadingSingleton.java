package com.design.creational.singleton.breaking.multithreading;

public class MultiThreadingSingleton {
    private static MultiThreadingSingleton instance;

    private MultiThreadingSingleton(){}

    public static MultiThreadingSingleton getInstance(){
        if(instance==null){
            try { Thread.sleep(100); } catch (Exception e) {}
            instance=new MultiThreadingSingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
    Runnable task=()->{
        MultiThreadingSingleton instance=MultiThreadingSingleton.getInstance();
        System.out.println(System.identityHashCode(instance));
    };

    Thread t1=new Thread(task);
    Thread t2=new Thread(task);

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    }
}
