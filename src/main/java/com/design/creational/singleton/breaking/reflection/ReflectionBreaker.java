package com.design.creational.singleton.breaking.reflection;

import com.design.creational.singleton.basic.DatabaseConnection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreaker  {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        DatabaseConnection instance1=DatabaseConnection.getInstance();

        Constructor<DatabaseConnection> constructor=DatabaseConnection.class
                .getDeclaredConstructor();
        constructor.setAccessible(true);
        DatabaseConnection instance2=constructor.newInstance();

        System.out.println(instance1==instance2); //false
    }
}

//Even though the singleton pattern ensures only one instance, but through reflection we can create a new instances.
