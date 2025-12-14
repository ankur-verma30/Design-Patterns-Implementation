package com.design.creational.singleton.prevention;

public class MultiThreadingPreventionUsingDoubleLocking {
    private static MultiThreadingPreventionUsingDoubleLocking instance;

    private MultiThreadingPreventionUsingDoubleLocking(){}

    public static MultiThreadingPreventionUsingDoubleLocking getInstance(){
        if(instance==null){
            synchronized (MultiThreadingPreventionUsingDoubleLocking.class){
                if(instance==null){
                    instance=new MultiThreadingPreventionUsingDoubleLocking();
                }
            }
        }
        return instance;
    }
}
