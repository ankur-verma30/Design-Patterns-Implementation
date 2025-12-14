package com.design.creational.singleton.breaking.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationBreaker {
    public static void main(String[] args)  throws Exception{
        ModifiedDatabaseConnection instance1=ModifiedDatabaseConnection.getInstance();

        // Serialization
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("obj.ser"));
        oos.writeObject(instance1);
        oos.close();

        // Deserialization
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj.ser"));
        ModifiedDatabaseConnection instance2=(ModifiedDatabaseConnection) ois.readObject();
        ois.close();

        System.out.println(instance1==instance2); // ❌ false

    }
}
