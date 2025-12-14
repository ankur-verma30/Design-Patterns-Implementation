package com.design.creational.singleton.basic;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection(){
        System.out.println("Database connection created....");
    }

    public static DatabaseConnection getInstance(){
        if(instance==null){
            instance=new DatabaseConnection();
        }
        return instance;
    }
}
