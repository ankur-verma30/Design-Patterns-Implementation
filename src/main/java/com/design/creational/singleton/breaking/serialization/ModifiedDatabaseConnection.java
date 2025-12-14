package com.design.creational.singleton.breaking.serialization;

import java.io.Serializable;

public class ModifiedDatabaseConnection implements Serializable {
    private static final ModifiedDatabaseConnection instance=new ModifiedDatabaseConnection();

    private ModifiedDatabaseConnection(){
        System.out.println("Database connection created....");
    }

    public static ModifiedDatabaseConnection getInstance(){
        return instance;
    }
}
