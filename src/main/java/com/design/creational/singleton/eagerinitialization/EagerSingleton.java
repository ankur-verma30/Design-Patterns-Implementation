package com.design.creational.singleton.eagerinitialization;

public class EagerSingleton {
    private static final EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}

//Created at class loading time
// May create instance even if it is not required and remain unused