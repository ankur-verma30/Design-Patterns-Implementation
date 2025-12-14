package com.design.creational.singleton.prevention;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSafeSingleton {
    private static final ReflectionSafeSingleton instance=new ReflectionSafeSingleton();

    private ReflectionSafeSingleton(){
            if(instance!=null){
                throw new RuntimeException("Use getInstance() method to create object");
            }
    }

    public static ReflectionSafeSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ReflectionSafeSingleton instance1=ReflectionSafeSingleton.getInstance();

        Constructor<ReflectionSafeSingleton> constructor=ReflectionSafeSingleton.class
                .getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectionSafeSingleton instance2=constructor.newInstance();

        System.out.println(instance1==instance2);
    }
}
