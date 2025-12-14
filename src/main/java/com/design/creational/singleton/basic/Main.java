package com.design.creational.singleton.basic;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection d1=DatabaseConnection.getInstance();
        DatabaseConnection d2=DatabaseConnection.getInstance();

        System.out.println(d1==d2);
    }
}
