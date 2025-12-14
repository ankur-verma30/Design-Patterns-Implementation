package com.design.creational.singleton.prevention;

public class MultiThreadingPreventionUsingSynchronizedMethod {
    private static MultiThreadingPreventionUsingSynchronizedMethod instance;

    private MultiThreadingPreventionUsingSynchronizedMethod(){

    }

    public static  synchronized  MultiThreadingPreventionUsingSynchronizedMethod getInstance(){
        if(instance==null){
                    instance=new MultiThreadingPreventionUsingSynchronizedMethod();
                }
        return instance;
    }
}
// Slower due to synchronization overhead
