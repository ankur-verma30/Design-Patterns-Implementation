package com.design.creational.abstractfactory;

public class DarkCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("DarkCheckbox");
    }
}
