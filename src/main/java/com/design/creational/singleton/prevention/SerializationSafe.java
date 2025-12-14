package com.design.creational.singleton.prevention;

public class SerializationSafe {
    private static final SerializationSafe instance=new SerializationSafe();

    private SerializationSafe(){

    }

    public static SerializationSafe getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
