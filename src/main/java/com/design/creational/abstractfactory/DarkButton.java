package com.design.creational.abstractfactory;

public class DarkButton implements Button{
    @Override
    public void paint() {
        System.out.println("DarkButton");
    }
}
